package com.tdd.greenhouse;

import java.io.File;

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
		SpringApplication.run(Greenhouse1Application.class, args);
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
		
		//checkpoint
		System.out.println("...startup finished!");
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
