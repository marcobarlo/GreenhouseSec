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

public class Ambiente {
	public Ambiente() {
	}
	
	public static Ambiente loadAmbienteByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadAmbienteByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ambiente getAmbienteByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return getAmbienteByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ambiente loadAmbienteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadAmbienteByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ambiente getAmbienteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return getAmbienteByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ambiente loadAmbienteByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Ambiente) session.load(com.tdd.greenhouse.model.Ambiente.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ambiente getAmbienteByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Ambiente) session.get(com.tdd.greenhouse.model.Ambiente.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ambiente loadAmbienteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Ambiente) session.load(com.tdd.greenhouse.model.Ambiente.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ambiente getAmbienteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Ambiente) session.get(com.tdd.greenhouse.model.Ambiente.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAmbiente(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return queryAmbiente(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAmbiente(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return queryAmbiente(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ambiente[] listAmbienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return listAmbienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ambiente[] listAmbienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return listAmbienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAmbiente(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.Ambiente as Ambiente");
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
	
	public static List queryAmbiente(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.Ambiente as Ambiente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Ambiente", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ambiente[] listAmbienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAmbiente(session, condition, orderBy);
			return (Ambiente[]) list.toArray(new Ambiente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ambiente[] listAmbienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAmbiente(session, condition, orderBy, lockMode);
			return (Ambiente[]) list.toArray(new Ambiente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ambiente loadAmbienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadAmbienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ambiente loadAmbienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return loadAmbienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ambiente loadAmbienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Ambiente[] ambientes = listAmbienteByQuery(session, condition, orderBy);
		if (ambientes != null && ambientes.length > 0)
			return ambientes[0];
		else
			return null;
	}
	
	public static Ambiente loadAmbienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Ambiente[] ambientes = listAmbienteByQuery(session, condition, orderBy, lockMode);
		if (ambientes != null && ambientes.length > 0)
			return ambientes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAmbienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return iterateAmbienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAmbienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession();
			return iterateAmbienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAmbienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.Ambiente as Ambiente");
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
	
	public static java.util.Iterator iterateAmbienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.tdd.greenhouse.model.Ambiente as Ambiente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Ambiente", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ambiente loadAmbienteByCriteria(AmbienteCriteria ambienteCriteria) {
		Ambiente[] ambientes = listAmbienteByCriteria(ambienteCriteria);
		if(ambientes == null || ambientes.length == 0) {
			return null;
		}
		return ambientes[0];
	}
	
	public static Ambiente[] listAmbienteByCriteria(AmbienteCriteria ambienteCriteria) {
		return ambienteCriteria.listAmbiente();
	}
	
	public static Ambiente createAmbiente() {
		return new com.tdd.greenhouse.model.Ambiente();
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
	
	private float temperaturaTarget;
	
	private float irradianzaTarget;
	
	private float umiditaSuoloTarget;
	
	private float sogliaTemp;
	
	private float sogliaIrr;
	
	private float sogliaUmi;
	
	private AmbienteAttuale ambienteAttuale;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTemperaturaTarget(float value) {
		this.temperaturaTarget = value;
	}
	
	public float getTemperaturaTarget() {
		return temperaturaTarget;
	}
	
	public void setIrradianzaTarget(float value) {
		this.irradianzaTarget = value;
	}
	
	public float getIrradianzaTarget() {
		return irradianzaTarget;
	}
	
	public void setUmiditaSuoloTarget(float value) {
		this.umiditaSuoloTarget = value;
	}
	
	public float getUmiditaSuoloTarget() {
		return umiditaSuoloTarget;
	}
	
	public void setSogliaTemp(float value) {
		this.sogliaTemp = value;
	}
	
	public float getSogliaTemp() {
		return sogliaTemp;
	}
	
	public void setSogliaIrr(float value) {
		this.sogliaIrr = value;
	}
	
	public float getSogliaIrr() {
		return sogliaIrr;
	}
	
	public void setSogliaUmi(float value) {
		this.sogliaUmi = value;
	}
	
	public float getSogliaUmi() {
		return sogliaUmi;
	}
	
	public synchronized void  modificaAmbienteAttuale(float temperatura, float umidita, float irradianza) {
		if(ambienteAttuale == null)
			ambienteAttuale = new AmbienteAttuale(this);
		ambienteAttuale.setParametriAttuali(temperatura, umidita, irradianza);
	}
	
	public boolean modificaAmbiente(float temperatura, float umidita, float irradianza) {
		this.setTemperaturaTarget(temperatura);
		this.setUmiditaSuoloTarget(umidita);
		this.setIrradianzaTarget(irradianza);
		try {
			PersistentTransaction sess = GreenhousePersistentManager.instance().getSession().beginTransaction();
			this.save();
			sess.commit();
		} catch (PersistentException e) {
			return false;
		}
		return true;
	}
	
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
