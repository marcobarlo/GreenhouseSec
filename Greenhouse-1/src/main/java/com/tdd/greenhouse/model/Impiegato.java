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

import com.tdd.greenhouse.Encryption_Utils.Encryption;

import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Impiegato {
	public Impiegato() {
	}
	
	public static Impiegato loadImpiegatoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadImpiegatoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Impiegato getImpiegatoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return getImpiegatoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Impiegato loadImpiegatoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadImpiegatoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Impiegato getImpiegatoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return getImpiegatoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Impiegato loadImpiegatoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Impiegato) session.load(com.tdd.greenhouse.model.Impiegato.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Impiegato getImpiegatoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Impiegato) session.get(com.tdd.greenhouse.model.Impiegato.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Impiegato loadImpiegatoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Impiegato) session.load(com.tdd.greenhouse.model.Impiegato.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Impiegato getImpiegatoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Impiegato) session.get(com.tdd.greenhouse.model.Impiegato.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryImpiegato(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return queryImpiegato(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryImpiegato(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return queryImpiegato(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Impiegato[] listImpiegatoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return listImpiegatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Impiegato[] listImpiegatoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return listImpiegatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryImpiegato(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.Impiegato as Impiegato");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryImpiegato(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.Impiegato as Impiegato");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Impiegato", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Impiegato[] listImpiegatoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryImpiegato(session, condition, orderBy);
			return (Impiegato[]) list.toArray(new Impiegato[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Impiegato[] listImpiegatoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryImpiegato(session, condition, orderBy, lockMode);
			return (Impiegato[]) list.toArray(new Impiegato[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Impiegato loadImpiegatoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadImpiegatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Impiegato loadImpiegatoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadImpiegatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Impiegato loadImpiegatoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Impiegato[] impiegatos = listImpiegatoByQuery(session, condition, orderBy);
		if (impiegatos != null && impiegatos.length > 0)
			return impiegatos[0];
		else
			return null;
	}
	
	public static Impiegato loadImpiegatoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Impiegato[] impiegatos = listImpiegatoByQuery(session, condition, orderBy, lockMode);
		if (impiegatos != null && impiegatos.length > 0)
			return impiegatos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateImpiegatoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return iterateImpiegatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateImpiegatoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return iterateImpiegatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateImpiegatoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.Impiegato as Impiegato");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateImpiegatoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.Impiegato as Impiegato");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Impiegato", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Impiegato loadImpiegatoByCriteria(ImpiegatoCriteria impiegatoCriteria) {
		Impiegato[] impiegatos = listImpiegatoByCriteria(impiegatoCriteria);
		if(impiegatos == null || impiegatos.length == 0) {
			return null;
		}
		return impiegatos[0];
	}
	
	public static Impiegato[] listImpiegatoByCriteria(ImpiegatoCriteria impiegatoCriteria) {
		return impiegatoCriteria.listImpiegato();
	}
	
	public static Impiegato createImpiegato() {
		return new com.tdd.greenhouse.model.Impiegato();
	}
	
	public boolean save() throws PersistentException {
		try {
			com.tdd.greenhouse.model.GreenhousePersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			com.tdd.greenhouse.model.GreenhousePersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	private int ID;
	
	private String email;
	
	private String password;
	
	private String ruolo;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setRuolo(String value) {
		this.ruolo = value;
	}
	
	public String getRuolo() {
		return ruolo;
	}
	
	public static String login(String mail, String password) {
		try {
			ImpiegatoCriteria crit=new ImpiegatoCriteria();
			crit.email.eq(mail);
			Impiegato[] imp=crit.listImpiegato();
			String hash;
			if(imp.length>0)
			{
				hash=imp[0].getPassword();
				if(Encryption.checkPassword(password, hash))
					return imp[0].getRuolo();
				else
					return null;
			}
			else 
				return null;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
