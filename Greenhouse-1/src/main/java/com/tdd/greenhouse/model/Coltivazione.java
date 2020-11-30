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
import org.hibernate.criterion.Restrictions;
import org.hibernate.LockMode;
import java.util.List;

public class Coltivazione {
	public Coltivazione() {
	}
	
	public static Coltivazione loadColtivazioneByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadColtivazioneByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coltivazione getColtivazioneByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return getColtivazioneByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coltivazione loadColtivazioneByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadColtivazioneByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coltivazione getColtivazioneByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return getColtivazioneByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coltivazione loadColtivazioneByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Coltivazione) session.load(com.tdd.greenhouse.model.Coltivazione.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coltivazione getColtivazioneByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Coltivazione) session.get(com.tdd.greenhouse.model.Coltivazione.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coltivazione loadColtivazioneByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Coltivazione) session.load(com.tdd.greenhouse.model.Coltivazione.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coltivazione getColtivazioneByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Coltivazione) session.get(com.tdd.greenhouse.model.Coltivazione.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryColtivazione(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return queryColtivazione(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryColtivazione(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return queryColtivazione(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coltivazione[] listColtivazioneByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return listColtivazioneByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coltivazione[] listColtivazioneByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return listColtivazioneByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryColtivazione(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.Coltivazione as Coltivazione");
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
	
	public static List queryColtivazione(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.Coltivazione as Coltivazione");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Coltivazione", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coltivazione[] listColtivazioneByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryColtivazione(session, condition, orderBy);
			return (Coltivazione[]) list.toArray(new Coltivazione[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coltivazione[] listColtivazioneByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryColtivazione(session, condition, orderBy, lockMode);
			return (Coltivazione[]) list.toArray(new Coltivazione[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coltivazione loadColtivazioneByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadColtivazioneByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coltivazione loadColtivazioneByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadColtivazioneByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coltivazione loadColtivazioneByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Coltivazione[] coltivaziones = listColtivazioneByQuery(session, condition, orderBy);
		if (coltivaziones != null && coltivaziones.length > 0)
			return coltivaziones[0];
		else
			return null;
	}
	
	public static Coltivazione loadColtivazioneByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Coltivazione[] coltivaziones = listColtivazioneByQuery(session, condition, orderBy, lockMode);
		if (coltivaziones != null && coltivaziones.length > 0)
			return coltivaziones[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateColtivazioneByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return iterateColtivazioneByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateColtivazioneByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return iterateColtivazioneByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateColtivazioneByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.Coltivazione as Coltivazione");
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
	
	public static java.util.Iterator iterateColtivazioneByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.Coltivazione as Coltivazione");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Coltivazione", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Coltivazione loadColtivazioneByCriteria(ColtivazioneCriteria coltivazioneCriteria) {
		Coltivazione[] coltivaziones = listColtivazioneByCriteria(coltivazioneCriteria);
		if(coltivaziones == null || coltivaziones.length == 0) {
			return null;
		}
		return coltivaziones[0];
	}
	
	public static Coltivazione[] listColtivazioneByCriteria(ColtivazioneCriteria coltivazioneCriteria) {
		return coltivazioneCriteria.listColtivazione();
	}
	
	public static Coltivazione createColtivazione() {
		return new com.tdd.greenhouse.model.Coltivazione();
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
			if(getDescrizioneColtivazione() != null) {
				getDescrizioneColtivazione().coltivazioni.remove(this);
			}
			
			if(getArea() != null) {
				getArea().setColtivazione(null);
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
			if(getDescrizioneColtivazione() != null) {
				getDescrizioneColtivazione().coltivazioni.remove(this);
			}
			
			if(getArea() != null) {
				getArea().setColtivazione(null);
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
		if (key == com.tdd.greenhouse.model.ORMConstants.KEY_COLTIVAZIONE_IMPIEGATI) {
			return ORM_impiegati;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == com.tdd.greenhouse.model.ORMConstants.KEY_COLTIVAZIONE_AREA) {
			this.area = (com.tdd.greenhouse.model.AreaColtivata) owner;
		}
		
		else if (key == com.tdd.greenhouse.model.ORMConstants.KEY_COLTIVAZIONE_AMBIENTE) {
			this.ambiente = (com.tdd.greenhouse.model.Ambiente) owner;
		}
		
		else if (key == com.tdd.greenhouse.model.ORMConstants.KEY_COLTIVAZIONE_DESCRIZIONE) {
			this.descrizione = (com.tdd.greenhouse.model.DescrizioneColtivazione) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private com.tdd.greenhouse.model.Ambiente ambiente;
	
	private com.tdd.greenhouse.model.DescrizioneColtivazione descrizione;
	
	private String stato;
	
	private java.util.Date data_prossima_operazione;
	
	private com.tdd.greenhouse.model.AreaColtivata area;
	
	private java.util.Set ORM_impiegati = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setStato(String value) {
		this.stato = value;
	}
	
	public String getStato() {
		return stato;
	}
	
	public void setData_prossima_operazione(java.util.Date value) {
		this.data_prossima_operazione = value;
	}
	
	public java.util.Date getData_prossima_operazione() {
		return data_prossima_operazione;
	}
	
	public void setArea(com.tdd.greenhouse.model.AreaColtivata value) {
		if (this.area != value) {
			com.tdd.greenhouse.model.AreaColtivata larea = this.area;
			this.area = value;
			if (value != null) {
				area.setColtivazione(this);
			}
			if (larea != null && larea.getColtivazione() == this) {
				larea.setColtivazione(null);
			}
		}
	}
	
	public com.tdd.greenhouse.model.AreaColtivata getArea() {
		return area;
	}
	
	public void setAmbiente(com.tdd.greenhouse.model.Ambiente value) {
		this.ambiente = value;
	}
	
	public com.tdd.greenhouse.model.Ambiente getAmbiente() {
		return ambiente;
	}
	
	private void setORM_Impiegati(java.util.Set value) {
		this.ORM_impiegati = value;
	}
	
	private java.util.Set getORM_Impiegati() {
		return ORM_impiegati;
	}
	
	public final com.tdd.greenhouse.model.ImpiegatoSetCollection impiegati = new com.tdd.greenhouse.model.ImpiegatoSetCollection(this, _ormAdapter, com.tdd.greenhouse.model.ORMConstants.KEY_COLTIVAZIONE_IMPIEGATI, com.tdd.greenhouse.model.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setDescrizione(com.tdd.greenhouse.model.DescrizioneColtivazione value) {
		if (descrizione != null) {
			descrizione.coltivazioni.remove(this);
		}
		if (value != null) {
			value.coltivazioni.add(this);
		}
	}
	
	public com.tdd.greenhouse.model.DescrizioneColtivazione getDescrizioneColtivazione() {
		return descrizione;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Descrizione(com.tdd.greenhouse.model.DescrizioneColtivazione value) {
		this.descrizione = value;
	}
	
	private com.tdd.greenhouse.model.DescrizioneColtivazione getORM_Descrizione() {
		return descrizione;
	}
	
	public com.tdd.greenhouse.model.AreaColtivata getAreaColtivata() {
		return this.area;
	}
	
	public boolean modificaAmbiente(Float temperatura, Float umidita, Float irradianza) {
		return this.ambiente.modificaAmbiente(temperatura, umidita, irradianza);
	}
	
	public String getTipo() {
		return this.descrizione.getTipo();
	}
	
	public float getUmiditaTarget() {
		return this.ambiente.getUmiditaSuoloTarget();
	}
	
	public float getIrradianzaTarget() {
		return this.ambiente.getIrradianzaTarget();
	}
	
	public float getTemperaturaTarget() {
		return this.ambiente.getTemperaturaTarget();
	}
	
	public int getIDAmbiente() {
		return this.ambiente.getID();
	}
	
	public int getSezione() {
		return this.area.getSezioneID();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}

	public int getFila() {
		return area.getFila();
	}

	public int getPosizione() {
		return this.area.getPosizione();
	}
	
	public String getDescrizione()
	{
		return this.descrizione.getDescrizione();
	}
	
	public static Coltivazione[] getColtivazioneByAmbienteID(int idAmbiente) throws PersistentException
	{
		ColtivazioneCriteria crit = new ColtivazioneCriteria();
		crit.add(Restrictions.eq("ambiente.id", idAmbiente));
		Coltivazione[] colt= crit.listColtivazione();
		return colt;
	}
}
