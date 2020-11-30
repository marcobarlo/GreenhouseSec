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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Sezione {
	public Sezione() {
		
	}
	
	public static Sezione loadSezioneByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadSezioneByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sezione getSezioneByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return getSezioneByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sezione loadSezioneByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadSezioneByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sezione getSezioneByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return getSezioneByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sezione loadSezioneByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Sezione) session.load(com.tdd.greenhouse.model.Sezione.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sezione getSezioneByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Sezione) session.get(com.tdd.greenhouse.model.Sezione.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sezione loadSezioneByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Sezione) session.load(com.tdd.greenhouse.model.Sezione.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sezione getSezioneByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Sezione) session.get(com.tdd.greenhouse.model.Sezione.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySezione(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return querySezione(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySezione(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return querySezione(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sezione[] listSezioneByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return listSezioneByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sezione[] listSezioneByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return listSezioneByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySezione(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.Sezione as Sezione");
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
	
	public static List querySezione(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.Sezione as Sezione");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Sezione", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sezione[] listSezioneByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySezione(session, condition, orderBy);
			return (Sezione[]) list.toArray(new Sezione[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sezione[] listSezioneByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySezione(session, condition, orderBy, lockMode);
			return (Sezione[]) list.toArray(new Sezione[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sezione loadSezioneByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadSezioneByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sezione loadSezioneByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadSezioneByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sezione loadSezioneByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Sezione[] seziones = listSezioneByQuery(session, condition, orderBy);
		if (seziones != null && seziones.length > 0)
			return seziones[0];
		else
			return null;
	}
	
	public static Sezione loadSezioneByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Sezione[] seziones = listSezioneByQuery(session, condition, orderBy, lockMode);
		if (seziones != null && seziones.length > 0)
			return seziones[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSezioneByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return iterateSezioneByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSezioneByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return iterateSezioneByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSezioneByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.Sezione as Sezione");
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
	
	public static java.util.Iterator iterateSezioneByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.Sezione as Sezione");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Sezione", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sezione loadSezioneByCriteria(SezioneCriteria sezioneCriteria) {
		Sezione[] seziones = listSezioneByCriteria(sezioneCriteria);
		if(seziones == null || seziones.length == 0) {
			return null;
		}
		return seziones[0];
	}
	
	public static Sezione[] listSezioneByCriteria(SezioneCriteria sezioneCriteria) {
		return sezioneCriteria.listSezione();
	}
	
	public static Sezione createSezione() {
		return new com.tdd.greenhouse.model.Sezione();
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
			com.tdd.greenhouse.model.AreaColtivata[] lArees = aree.toArray();
			for(int i = 0; i < lArees.length; i++) {
				lArees[i].setSezione(null);
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
			com.tdd.greenhouse.model.AreaColtivata[] lArees = aree.toArray();
			for(int i = 0; i < lArees.length; i++) {
				lArees[i].setSezione(null);
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
		if (key == com.tdd.greenhouse.model.ORMConstants.KEY_SEZIONE_AREE) {
			return ORM_aree;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private java.util.Set ORM_aree = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	} 
	private void setORM_Aree(java.util.Set value) {
		this.ORM_aree = value;
	}
	
	private java.util.Set getORM_Aree() {
		return ORM_aree;
	}
	
	public final com.tdd.greenhouse.model.AreaColtivataSetCollection aree = new com.tdd.greenhouse.model.AreaColtivataSetCollection(this, _ormAdapter, com.tdd.greenhouse.model.ORMConstants.KEY_SEZIONE_AREE, com.tdd.greenhouse.model.ORMConstants.KEY_AREACOLTIVATA_SEZIONE, com.tdd.greenhouse.model.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private Set <com.tdd.greenhouse.model.AreaColtivata> getAreeColtivate(int posizione, int fila) {
		//TODO: Implement Method
		Set<AreaColtivata> aree_filtrate = new HashSet<AreaColtivata>();
		//Area_Coltivata[] aree_filtrate;
		if (fila != -1)
		{
			Iterator<AreaColtivata> itr = aree.getIterator();
			if(posizione != -1)
			{
				//for(Area_Coltivata a : aree)
				while(itr.hasNext())
				{
					AreaColtivata a= itr.next();
					if(a.getFila()==fila && a.getPosizione()==posizione)
						aree_filtrate.add(a);
				}
			}
			else
			{
				while(itr.hasNext())
				{
					AreaColtivata a = itr.next();
					if(a.getFila()==fila)
						aree_filtrate.add(a);
				}
			}	
		}
		else
		{
			Iterator<AreaColtivata> itr = aree.getIterator();
			while(itr.hasNext())
				aree_filtrate.add(itr.next());
		}

		return aree_filtrate;
		//throw new UnsupportedOperationException();
	}
	
	public AreaColtivataSetCollection getAreeColtivate()
	{
		if(aree == null)
		{
			//fai la query
			AreaColtivataCriteria acrit;
			AreaColtivata a[];
			try 
			{
				acrit = new AreaColtivataCriteria();
				acrit.add(Restrictions.eq("sezione", this.ID));
				a = acrit.listAreaColtivata();
				for(AreaColtivata ar : a)
					aree.add(ar);
			} 
			catch (PersistentException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return aree;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}

	public List<Integer> ricercaColtivazione(String tipo, int posizione, int fila) 
	{
		//get aree coltivate
		List<Integer> l= new ArrayList<Integer>();
		Set<AreaColtivata> aree_colt = this.getAreeColtivate(posizione, fila);
		//per ogni area coltivata prendi la coltivazione se rispetta i criteri
		for(AreaColtivata a : aree_colt) 
		{
			Integer id = a.ricercaColtivazione(tipo);
			if(id!=null)
			{
				l.add(id);
			}
		}
		return l;
	}
	
}
