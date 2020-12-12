package com.tdd.greenhouse;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import com.tdd.greenhouse.Connection.Connection;
import com.tdd.greenhouse.UI.Main_Frame;

import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.File;
import java.util.Properties;

public class Main {

	public static void main(String[] args) 
	{
	    Properties systemProps = System.getProperties();
	    systemProps.put("javax.net.ssl.keyStorePassword","password");
	    systemProps.put("javax.net.ssl.keyStore","D:\\greenhouseSSD\\mysql-cert\\keystoreser.jks");
	    systemProps.put("javax.net.ssl.trustStore", "D:\\greenhouseSSD\\mysql-cert\\keystoreser.jks");
	    systemProps.put("javax.net.ssl.trustStorePassword","password");
	    System.setProperties(systemProps);
		/*try {
			Process process = new ProcessBuilder("D:\\Programmi\\mosquitto\\mosquitto.exe", "-v").start();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/

		//read config file
		NodeList nList = null;
		String host=null;
		String clientID=null;
		Document doc=readConfig();
		host =doc.getElementsByTagName("brokerHost").item(0).getTextContent();
		nList = doc.getElementsByTagName("device");	
		clientID = doc.getElementsByTagName("clientID").item(0).getTextContent();
		//startup the connection with broker
		Connection conn = Connection.getInstance();
		conn.startup(host, clientID);
		
		//send config packets
		sendConfig(nList, conn);
		
		//start UI
		try{
			Main_Frame frame = new Main_Frame();
			frame.setVisible(true);
		} catch (Exception e)
		{e.printStackTrace();}
	}
	
	private static Document readConfig()
	{
		try {
			File fXmlFile = new File("config.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
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
				
				//System.out.println("Main : ID : " + id + "- mac :"+ mac);
				Configurazione c = new Configurazione(id, mac, sez);
				conn.sendSetUp(c);
			}
		}
	}
	private static Integer parseInt(Element eElement, String name) {
		try {return Integer.parseInt(eElement.getElementsByTagName(name).item(0).getTextContent().replaceAll(" ", ""));}
		catch(NumberFormatException e)
		{e.printStackTrace(); System.out.println("File di configurazione errato!!!!"); return null;}
	}
	public static void shutdown()
	{
		Connection.getInstance().shutdown();
	}
}
