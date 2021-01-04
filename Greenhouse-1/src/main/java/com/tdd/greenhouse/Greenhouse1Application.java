package com.tdd.greenhouse;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.tdd.greenhouse.Connection.Connection;

@SpringBootApplication
public class Greenhouse1Application 
{

	public static void main(String[] args) 
	{	
		JPasswordField pf = new JPasswordField();
		int okCxl = JOptionPane.showConfirmDialog(null, pf, "Inserisci password per avviare il software!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		String password=null;
		if (okCxl == JOptionPane.OK_OPTION) 
		  password = new String(pf.getPassword());
		else
	    	System.exit(1);
		
		CipherInputStream cis = null;
		//decritto il file di configurazione
		try
		{
			PBEKeySpec pbeKeySpec = new PBEKeySpec(password.toCharArray());
			SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndTripleDES");
			SecretKey secretKey = secretKeyFactory.generateSecret(pbeKeySpec);
				//leggo il sale
			FileInputStream fis = new FileInputStream("configEnc.xml");
			byte[] salt = new byte[8];
			fis.read(salt);
				//inizializzo il cifrario col sale e 100 iteraz
			PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(salt, 100);
			Cipher cipher = Cipher.getInstance("PBEWithMD5AndTripleDES");
			cipher.init(Cipher.DECRYPT_MODE, secretKey, pbeParameterSpec);
			cis = new CipherInputStream(fis,cipher);
		}catch (Exception e) {e.printStackTrace(); System.out.println("Impossibile aprire il file di configurazione!");System.exit(1);}
		
		Properties systemProps = System.getProperties();
	    System.setProperty("javax.net.ssl.keyStore","D:\\greenhouseSSD\\keystores\\keystore"); 
	    System.setProperty("javax.net.ssl.keyStorePassword","password");
	    System.setProperty("javax.net.ssl.trustStore","D:\\greenhouseSSD\\keystores\\truststore"); 
	    System.setProperty("javax.net.ssl.trustStorePassword","password");
	    System.setProperties(systemProps);
		
		
		SpringApplication.run(Greenhouse1Application.class, args);
		NodeList nList = null;
		String host=null;
		String clientID=null;
		Document doc=readConfig(cis);
		try {cis.close();} catch (IOException e) {e.printStackTrace();}
		host =doc.getElementsByTagName("brokerHost").item(0).getTextContent();
		nList = doc.getElementsByTagName("device");	
		clientID = doc.getElementsByTagName("clientID").item(0).getTextContent();
		//startup the connection with broker
		Connection conn = Connection.getInstance();
		conn.startup(host, clientID);
		
		//send config packets
		sendConfig(nList, conn);
		
		//checkpoint
		System.out.println("...startup finished!");
	}
	
	private static Document readConfig(CipherInputStream fis)
	{
		try {
			//File fXmlFile = new File("config.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fis);
			//Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
			return doc;
	    	} 
		catch (Exception e) 
	    {e.printStackTrace();
	    System.out.println("Errore nella lettura del file di configurazione!");
	    return null;}
	}
	
	private static void sendConfig(NodeList nList,Connection conn)
	{
		for (int i = 0; i < nList.getLength(); i++) 
		{
			Node nNode = nList.item(i);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) 
			{
				Element eElement = (Element) nNode;
				int id=0,sez=0;
				
				id=  parseInt(eElement, "ID");
				sez= parseInt(eElement, "sezione");
				
				String mac =eElement.getElementsByTagName("mac").item(0).getTextContent();
				mac=mac.replaceAll(":", "").replaceAll("-", "");
				
				System.out.println("Sending : ID : " + id + "- mac :"+ mac);
				Configurazione c = new Configurazione(id, mac, sez);
				conn.sendSetUp(c);
			}
		}
	}
	
	private static Integer parseInt(Element eElement, String name) 
	{
		try {return Integer.parseInt(eElement.getElementsByTagName(name).item(0).getTextContent().replaceAll(" ", ""));}
		catch(NumberFormatException e)
		{e.printStackTrace(); System.out.println("File di configurazione errato!!!!"); return null;}
	}
	
	public static void shutdown()
	{
		Connection.getInstance().shutdown();
	}

}
