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

public class DescrizioneColtivazione {
	public DescrizioneColtivazione() {
	}
	
	public static DescrizioneColtivazione loadDescrizioneColtivazioneByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadDescrizioneColtivazioneByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneColtivazione getDescrizioneColtivazioneByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return getDescrizioneColtivazioneByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneColtivazione loadDescrizioneColtivazioneByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadDescrizioneColtivazioneByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneColtivazione getDescrizioneColtivazioneByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return getDescrizioneColtivazioneByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneColtivazione loadDescrizioneColtivazioneByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (DescrizioneColtivazione) session.load(com.tdd.greenhouse.model.DescrizioneColtivazione.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneColtivazione getDescrizioneColtivazioneByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (DescrizioneColtivazione) session.get(com.tdd.greenhouse.model.DescrizioneColtivazione.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneColtivazione loadDescrizioneColtivazioneByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (DescrizioneColtivazione) session.load(com.tdd.greenhouse.model.DescrizioneColtivazione.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneColtivazione getDescrizioneColtivazioneByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (DescrizioneColtivazione) session.get(com.tdd.greenhouse.model.DescrizioneColtivazione.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDescrizioneColtivazione(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return queryDescrizioneColtivazione(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDescrizioneColtivazione(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return queryDescrizioneColtivazione(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneColtivazione[] listDescrizioneColtivazioneByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return listDescrizioneColtivazioneByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneColtivazione[] listDescrizioneColtivazioneByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return listDescrizioneColtivazioneByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDescrizioneColtivazione(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.DescrizioneColtivazione as DescrizioneColtivazione");
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
	
	public static List queryDescrizioneColtivazione(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.DescrizioneColtivazione as DescrizioneColtivazione");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DescrizioneColtivazione", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneColtivazione[] listDescrizioneColtivazioneByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDescrizioneColtivazione(session, condition, orderBy);
			return (DescrizioneColtivazione[]) list.toArray(new DescrizioneColtivazione[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneColtivazione[] listDescrizioneColtivazioneByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDescrizioneColtivazione(session, condition, orderBy, lockMode);
			return (DescrizioneColtivazione[]) list.toArray(new DescrizioneColtivazione[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneColtivazione loadDescrizioneColtivazioneByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadDescrizioneColtivazioneByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneColtivazione loadDescrizioneColtivazioneByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadDescrizioneColtivazioneByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneColtivazione loadDescrizioneColtivazioneByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		DescrizioneColtivazione[] descrizioneColtivaziones = listDescrizioneColtivazioneByQuery(session, condition, orderBy);
		if (descrizioneColtivaziones != null && descrizioneColtivaziones.length > 0)
			return descrizioneColtivaziones[0];
		else
			return null;
	}
	
	public static DescrizioneColtivazione loadDescrizioneColtivazioneByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		DescrizioneColtivazione[] descrizioneColtivaziones = listDescrizioneColtivazioneByQuery(session, condition, orderBy, lockMode);
		if (descrizioneColtivaziones != null && descrizioneColtivaziones.length > 0)
			return descrizioneColtivaziones[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDescrizioneColtivazioneByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return iterateDescrizioneColtivazioneByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDescrizioneColtivazioneByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return iterateDescrizioneColtivazioneByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDescrizioneColtivazioneByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.DescrizioneColtivazione as DescrizioneColtivazione");
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
	
	public static java.util.Iterator iterateDescrizioneColtivazioneByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.DescrizioneColtivazione as DescrizioneColtivazione");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DescrizioneColtivazione", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneColtivazione loadDescrizioneColtivazioneByCriteria(DescrizioneColtivazioneCriteria descrizioneColtivazioneCriteria) {
		DescrizioneColtivazione[] descrizioneColtivaziones = listDescrizioneColtivazioneByCriteria(descrizioneColtivazioneCriteria);
		if(descrizioneColtivaziones == null || descrizioneColtivaziones.length == 0) {
			return null;
		}
		return descrizioneColtivaziones[0];
	}
	
	public static DescrizioneColtivazione[] listDescrizioneColtivazioneByCriteria(DescrizioneColtivazioneCriteria descrizioneColtivazioneCriteria) {
		return descrizioneColtivazioneCriteria.listDescrizioneColtivazione();
	}
	
	public static DescrizioneColtivazione createDescrizioneColtivazione() {
		return new com.tdd.greenhouse.model.DescrizioneColtivazione();
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
			com.tdd.greenhouse.model.Coltivazione[] lColtivazionis = coltivazioni.toArray();
			for(int i = 0; i < lColtivazionis.length; i++) {
				lColtivazionis[i].setDescrizione(null);
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
			com.tdd.greenhouse.model.Coltivazione[] lColtivazionis = coltivazioni.toArray();
			for(int i = 0; i < lColtivazionis.length; i++) {
				lColtivazionis[i].setDescrizione(null);
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
	
	private java.util.Set this_getSet (int key) {
		if (key == com.tdd.greenhouse.model.ORMConstants.KEY_DESCRIZIONECOLTIVAZIONE_COLTIVAZIONI) {
			return ORM_coltivazioni;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private String tipo;
	
	private String descrizione;
	
	private java.util.Set ORM_coltivazioni = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTipo(String value) {
		this.tipo = value;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setDescrizione(String value) {
		this.descrizione = value;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	private void setORM_Coltivazioni(java.util.Set value) {
		this.ORM_coltivazioni = value;
	}
	
	private java.util.Set getORM_Coltivazioni() {
		return ORM_coltivazioni;
	}
	
	public final com.tdd.greenhouse.model.ColtivazioneSetCollection coltivazioni = new com.tdd.greenhouse.model.ColtivazioneSetCollection(this, _ormAdapter, com.tdd.greenhouse.model.ORMConstants.KEY_DESCRIZIONECOLTIVAZIONE_COLTIVAZIONI, com.tdd.greenhouse.model.ORMConstants.KEY_COLTIVAZIONE_DESCRIZIONE, com.tdd.greenhouse.model.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void ricercaColtivazione() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
