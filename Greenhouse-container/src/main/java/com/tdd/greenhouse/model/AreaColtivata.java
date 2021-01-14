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
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class AreaColtivata {
	public AreaColtivata() {
	}
	
	public static AreaColtivata loadAreaColtivataByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadAreaColtivataByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AreaColtivata getAreaColtivataByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return getAreaColtivataByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AreaColtivata loadAreaColtivataByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadAreaColtivataByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AreaColtivata getAreaColtivataByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return getAreaColtivataByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AreaColtivata loadAreaColtivataByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (AreaColtivata) session.load(com.tdd.greenhouse.model.AreaColtivata.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AreaColtivata getAreaColtivataByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (AreaColtivata) session.get(com.tdd.greenhouse.model.AreaColtivata.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AreaColtivata loadAreaColtivataByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (AreaColtivata) session.load(com.tdd.greenhouse.model.AreaColtivata.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AreaColtivata getAreaColtivataByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (AreaColtivata) session.get(com.tdd.greenhouse.model.AreaColtivata.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAreaColtivata(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return queryAreaColtivata(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAreaColtivata(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return queryAreaColtivata(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AreaColtivata[] listAreaColtivataByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return listAreaColtivataByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AreaColtivata[] listAreaColtivataByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return listAreaColtivataByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAreaColtivata(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.AreaColtivata as AreaColtivata");
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
	
	public static List queryAreaColtivata(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.AreaColtivata as AreaColtivata");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("AreaColtivata", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AreaColtivata[] listAreaColtivataByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAreaColtivata(session, condition, orderBy);
			return (AreaColtivata[]) list.toArray(new AreaColtivata[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AreaColtivata[] listAreaColtivataByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAreaColtivata(session, condition, orderBy, lockMode);
			return (AreaColtivata[]) list.toArray(new AreaColtivata[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AreaColtivata loadAreaColtivataByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadAreaColtivataByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AreaColtivata loadAreaColtivataByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadAreaColtivataByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AreaColtivata loadAreaColtivataByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		AreaColtivata[] areaColtivatas = listAreaColtivataByQuery(session, condition, orderBy);
		if (areaColtivatas != null && areaColtivatas.length > 0)
			return areaColtivatas[0];
		else
			return null;
	}
	
	public static AreaColtivata loadAreaColtivataByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		AreaColtivata[] areaColtivatas = listAreaColtivataByQuery(session, condition, orderBy, lockMode);
		if (areaColtivatas != null && areaColtivatas.length > 0)
			return areaColtivatas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAreaColtivataByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return iterateAreaColtivataByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAreaColtivataByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return iterateAreaColtivataByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAreaColtivataByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.AreaColtivata as AreaColtivata");
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
	
	public static java.util.Iterator iterateAreaColtivataByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.AreaColtivata as AreaColtivata");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("AreaColtivata", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AreaColtivata loadAreaColtivataByCriteria(AreaColtivataCriteria areaColtivataCriteria) {
		AreaColtivata[] areaColtivatas = listAreaColtivataByCriteria(areaColtivataCriteria);
		if(areaColtivatas == null || areaColtivatas.length == 0) {
			return null;
		}
		return areaColtivatas[0];
	}
	
	public static AreaColtivata[] listAreaColtivataByCriteria(AreaColtivataCriteria areaColtivataCriteria) {
		return areaColtivataCriteria.listAreaColtivata();
	}
	
	public static AreaColtivata createAreaColtivata() {
		return new com.tdd.greenhouse.model.AreaColtivata();
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
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			if(getColtivazione() != null) {
				getColtivazione().setArea(null);
			}
			
			if(getSezione() != null) {
				getSezione().aree.remove(this);
			}
			
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			if(getColtivazione() != null) {
				getColtivazione().setArea(null);
			}
			
			if(getSezione() != null) {
				getSezione().aree.remove(this);
			}
			
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == com.tdd.greenhouse.model.ORMConstants.KEY_AREACOLTIVATA_COLTIVAZIONE) {
			this.coltivazione = (com.tdd.greenhouse.model.Coltivazione) owner;
		}
		
		else if (key == com.tdd.greenhouse.model.ORMConstants.KEY_AREACOLTIVATA_SEZIONE) {
			this.sezione = (com.tdd.greenhouse.model.Sezione) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private com.tdd.greenhouse.model.Coltivazione coltivazione;
	
	private com.tdd.greenhouse.model.Sezione sezione;
	
	private int fila;
	
	private int posizione;
	
	private float estensione;
	
	private String tipo_di_terreno;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setFila(int value) {
		this.fila = value;
	}
	
	public int getFila() {
		return fila;
	}
	
	public void setPosizione(int value) {
		this.posizione = value;
	}
	
	public int getPosizione() {
		return posizione;
	}
	
	public void setEstensione(float value) {
		this.estensione = value;
	}
	
	public float getEstensione() {
		return estensione;
	}
	
	public void setTipo_di_terreno(String value) {
		this.tipo_di_terreno = value;
	}
	
	public String getTipo_di_terreno() {
		return tipo_di_terreno;
	}
	
	public void setColtivazione(com.tdd.greenhouse.model.Coltivazione value) {
		if (this.coltivazione != value) {
			com.tdd.greenhouse.model.Coltivazione lcoltivazione = this.coltivazione;
			this.coltivazione = value;
			if (value != null) {
				coltivazione.setArea(this);
			}
			if (lcoltivazione != null && lcoltivazione.getArea() == this) {
				lcoltivazione.setArea(null);
			}
		}
	}
	
	public com.tdd.greenhouse.model.Coltivazione getColtivazione() {
		return coltivazione;
	}
	
	public void setSezione(com.tdd.greenhouse.model.Sezione value) {
		if (sezione != null) {
			sezione.aree.remove(this);
		}
		if (value != null) {
			value.aree.add(this);
		}
	}
	
	public com.tdd.greenhouse.model.Sezione getSezione() {
		return sezione;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Sezione(com.tdd.greenhouse.model.Sezione value) {
		this.sezione = value;
	}
	
	private com.tdd.greenhouse.model.Sezione getORM_Sezione() {
		return sezione;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
	public Integer ricercaColtivazione(String tipo) 
	{	
		//un'area coltivata non necessariamente ha una coltivazione posta
		if (this.coltivazione != null)
		{
			//se l'utente ha ricercato per tipo filtro anche per tale campo lo verifico, altrimenti aggiungo la coltivazione a prescindere
			if (tipo != null) 
			{
				String t = coltivazione.getTipo();
				if (t.equals(tipo)) 
				{
					//aggiungo la coltivazione al Set
					return this.coltivazione.getID();
				}
			}
			else
			{
				return this.coltivazione.getID();
			}
			
		}
		return null;
	}
	public int getSezioneID()
	{
		return sezione.getID();
	}
	
}
