package com.tdd.greenhouse.Connection;

import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MqttDefaultFilePersistence;

import com.tdd.greenhouse.Business_Logic.ControllerFacade;

import com.tdd.greenhouse.Configurazione;


public class Connection{

	private static Connection instance = null;
	private MqttClient client;
	private Semaphore sem;
	private int idToAck;
	private Connection(){}
	public void startup(String broker, String clientId)
	{
		sem= new Semaphore(0);
		//setup mqtt client
        MqttDefaultFilePersistence dataStore = new MqttDefaultFilePersistence(System.getProperty("java.io.tmpdir") + "/" + clientId);
        try {
            client = new MqttClient(broker, clientId, dataStore);
            MqttConnectOptions connOpts = new MqttConnectOptions();
            connOpts.setAutomaticReconnect(true);
            connOpts.setCleanSession(true);
            System.out.println("Connecting to broker: "+broker + " ...");
            client.connect(connOpts);
            System.out.println("Connected!");
    	    MqttCallback callback = new MqttCallback() {
    	        
    	        @Override
    	        public void messageArrived(String topic, MqttMessage message) throws Exception 
    	        {
    	            if(topic.equals("GH/Dati")) 
    	            	callback_data(message);
    	            else if(topic.equals("GH/Errore"))
    	            	callback_error(message);
    	            else if(topic.equals("GH/Ack"))
    	        		callbackAck(message);
    	            else if(topic.equals("GH/LastWill"))
    	            	callbackLastWill(message);
    	        }

    	        @Override
    	        public void deliveryComplete(IMqttDeliveryToken token) {}
    	        
    	        @Override
    	        public void connectionLost(Throwable cause) {
    				System.out.println(cause.getMessage());
    	            cause.printStackTrace();
    	            System.exit(1);
    	        }
    	    };
    	    
    		client.setCallback(callback);
    		client.subscribe("GH/Dati");
    		client.subscribe("GH/Errore");
    		client.subscribe("GH/Ack");
    		client.subscribe("GH/LastWill");
    		
        } catch(MqttException me) 
        {
            System.out.println("reason "+me.getReasonCode());
            System.out.println("msg "+me.getMessage());
            System.out.println("loc "+me.getLocalizedMessage());
            System.out.println("cause "+me.getCause());
            System.out.println("excep "+me);
            me.printStackTrace();
            System.exit(1);
        }
	}

	public boolean sendSetUp(Configurazione c) 
	{
        String topic= "GH/SetUp";
        int qos= 1;
        ByteBuffer buf = ByteBuffer.allocate(4+6+4+24);	//4 id 6 mac 4 sezionew 24 parametri float
        String mac= c.getMac();
        buf=buf.put(hexStringToByteArray(mac)).putInt(c.getId()).putInt(c.getSezione()).putFloat(c.getTempTarget()).putFloat(c.getUmiTarget()).putFloat(
        		c.getIrrTarget()).putFloat(c.getsogliaTemp()).putFloat(c.getsogliaUmi()).putFloat(c.getsogliaIrr());
        MqttMessage message = new MqttMessage();
        message.setQos(qos);
        message.setPayload(buf.array());
        try {client.publish(topic, message);} 
        catch (MqttPersistenceException e) 
        {return false;} 
        catch (MqttException e) 
        {return false;}
        //System.out.println("Message published!");
		return true;
	}
	
	public boolean richiediParametriAmbientali(int id, int sez) 
	{
        String topic= "GH/"+sez+"/cmd/STROBS";
        int qos= 1;
        byte[] bytes = ByteBuffer.allocate(4).putInt(id).array();
        MqttMessage message = new MqttMessage(bytes);
        message.setQos(qos);
        message.setPayload(bytes);
        try {client.publish(topic, message);} 
        catch (MqttPersistenceException e) 
        {return false;} 
        catch (MqttException e) 
        {return false;}
        //System.out.println("Message published");
		return true;
	}
	
	public synchronized boolean modificaAmbiente(int id, float temperatura, float umidita, float irradianza, int sez)
	{
        String topic= "GH/"+sez+"/cmd/Mod";
        int qos= 1;
        ByteBuffer buf = ByteBuffer.allocate(4+4+4+4);
        buf=buf.putInt(id).putFloat(temperatura).putFloat(umidita).putFloat(irradianza);
        MqttMessage message = new MqttMessage(buf.array());
        message.setQos(qos);
        message.setPayload(buf.array());
        idToAck = id;
        boolean acked;
        try {
        	client.publish(topic, message);
			acked=sem.tryAcquire(1, TimeUnit.SECONDS);	
        } 
        catch (MqttPersistenceException e) 
        {return false;} 
        catch (MqttException e) 
        {return false;}
        catch (InterruptedException e) 
        {return false;}
        //System.out.println("Message published");
        return acked;
	}
	
	public boolean sendStop(int id, int sez)
	{
        String topic= "GH/"+sez+"/cmd/STPOBS";
        int qos= 1;
        ByteBuffer buf = ByteBuffer.allocate(4);
        buf=buf.putInt(id);
        MqttMessage message = new MqttMessage(buf.array());
        message.setQos(qos);
        message.setPayload(buf.array());
        try {client.publish(topic, message);} 
        catch (MqttPersistenceException e) 
        {return false;} 
        catch (MqttException e) 
        {return false;}
        //System.out.println("Message published");
		return true;
	}
	
	
	public static Connection getInstance() 
	{
		if (instance == null)
			instance = new Connection();
		return instance;
	}
	public void shutdown()
	{
		try {
			client.disconnect();
		} catch (MqttException me) {
            System.out.println("reason "+me.getReasonCode());
            System.out.println("msg "+me.getMessage());
            System.out.println("loc "+me.getLocalizedMessage());
            System.out.println("cause "+me.getCause());
            System.out.println("excep "+me);
            me.printStackTrace();
            System.exit(1);
		}
	}
	private void callback_error(MqttMessage message) {
		byte[] payload = message.getPayload();
		ByteBuffer b = ByteBuffer.wrap(payload);
		int id = b.getInt();
		int code =b.getInt();
		Float delta=null;
		if(b.hasRemaining())
			delta = b.getFloat();
		if(delta==null)
			ControllerFacade.sendAllarme(code,id);
		else
			ControllerFacade.sendAllarme(code,id,delta);
	}

	private void callback_data(MqttMessage message) {
		//comunica al controller l'aggiornamento dell'ambiente attuale
		byte[] payload = message.getPayload();
		ByteBuffer b = ByteBuffer.wrap(payload);
		int id = b.getInt();
		float temperatura = b.getFloat();
		float umidita = b.getFloat();
		float irradianza = b.getFloat();
		ControllerFacade.modificaAmbienteAttuale(id,temperatura,umidita,irradianza);
	}
	

	private void callbackAck(MqttMessage message) {
		//controlla se l'ack viene dal controllore interrogato, se s� sblocca il thread
		byte[] payload = message.getPayload();
		ByteBuffer b = ByteBuffer.wrap(payload);
		int id = b.getInt();
		if(id == idToAck)
			sem.release();
	}

	private static byte[] hexStringToByteArray(String s) 
	{
		int len = s.length();
		byte[] data = new byte[len / 2];
		for (int i = 0; i < len; i += 2) 
		{
			data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i+1), 16));
		}
		return data;
	}
	
	private void callbackLastWill(MqttMessage message) {
		byte[] payload = message.getPayload();
		String idString = new String(payload);
		int id;
		try{id = Integer.parseInt(idString);}
		catch(NumberFormatException e)
		{id = -1;}
		if(id!= -1)
			ControllerFacade.sendAllarme(0,id);
	}

}