/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package com.tdd.greenhouse.model;

import org.orm.*;
import org.orm.cfg.JDBCConnectionSetting;
import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class GreenhousePersistentManager extends PersistentManager {
	private static final String PROJECT_NAME = "Greenhouse";
	private static PersistentManager _instance = null;
	private static SessionType _sessionType = SessionType.THREAD_BASE;
	private static int _timeToAlive = 60000;
	private static JDBCConnectionSetting _connectionSetting = null;
	private static Properties _extraProperties = null;
	private static String _configurationFile = null;
	
	private GreenhousePersistentManager() throws PersistentException {
		super(_connectionSetting, _sessionType, _timeToAlive, new String[] {}, _extraProperties, _configurationFile);
		setFlushMode(FlushMode.AUTO);
	}
	
	public String getProjectName() {
		return PROJECT_NAME;
	}
	
	public static synchronized final PersistentManager instance() throws PersistentException {
		if (_instance == null) {
			Configuration cfg = new Configuration().configure("ormmapping/Greenhouse.cfg.xml");
			_connectionSetting = new JDBCConnectionSetting();
			_connectionSetting.setConnectionURL("jdbc:mariadb://"+System.getenv("MARIADB")+"/greenhouse?autoReconnect=true&amp;useUniCode=true&amp;characterEncoding=UTF-8&amp;useSSL=true&amp;verifyServerCertificate=true&amp;requireSSL=true");
			_connectionSetting.setDatabaseName("greenhouse");
			_connectionSetting.setDialect("org.hibernate.dialect.MySQL5Dialect");
			_connectionSetting.setUserName("ServerGH");
			_connectionSetting.setDriverClass("org.mariadb.jdbc.Driver");
			/*JPasswordField pf3 = new JPasswordField(24);
			int okCxl = JOptionPane.showConfirmDialog(null, pf3, "Inserisci password per il database!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			String passwordDB=null;
			if (okCxl == JOptionPane.OK_OPTION) 
				passwordDB = new String(pf3.getPassword());
			else
		    	System.exit(1);*/
			String passwordDB=System.getenv("DBPASS");
			
			_connectionSetting.setPassword(passwordDB);
			_instance = new GreenhousePersistentManager();	
		}
		
		return _instance;
	}
	
	public void disposePersistentManager() throws PersistentException {
		_instance = null;
		super.disposePersistentManager();
	}
	
	public static void setSessionType(SessionType sessionType) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set session type after create PersistentManager instance");
		}
		else {
			_sessionType = sessionType;
		}
		
	}
	
	public static void setAppBaseSessionTimeToAlive(int timeInMs) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set session time to alive after create PersistentManager instance");
		}
		else {
			_timeToAlive = timeInMs;
		}
		
	}
	
	public static void setJDBCConnectionSetting(JDBCConnectionSetting aConnectionSetting) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set connection setting after create PersistentManager instance");
		}
		else {
			_connectionSetting = aConnectionSetting;
			_connectionSetting = new JDBCConnectionSetting();
			_connectionSetting.setConnectionURL("jdbc:mariadb://localhost/greenhouse?autoReconnect=true&amp;useUniCode=true&amp;characterEncoding=UTF-8&amp;useSSL=true&amp;verifyServerCertificate=true&amp;requireSSL=true");
			_connectionSetting.setDatabaseName("greemhouse");
			_connectionSetting.setDialect("org.hibernate.dialect.MySQL5Dialect");
			_connectionSetting.setUserName("ServerGH");
			_connectionSetting.setDriverClass("org.mariadb.jdbc.Driver");
			System.out.println(_connectionSetting.getPassword());
			_connectionSetting.setPassword("password");
			System.out.println(_connectionSetting.getPassword());
		}
		
	}
	
	public static void setHibernateProperties(Properties aProperties) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set hibernate properties after create PersistentManager instance");
		}
		else {
			_extraProperties = aProperties;
		}
		
	}
	
	public static void setConfigurationFile(String aConfigurationFile) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set configuration file after create PersistentManager instance");
		}
		else {
			_configurationFile = aConfigurationFile;
		}
		
	}
	
	public static void saveJDBCConnectionSetting() {
		PersistentManager.saveJDBCConnectionSetting(PROJECT_NAME, _connectionSetting);
	}
}
