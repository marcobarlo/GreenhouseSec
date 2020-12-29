package com.tdd.greenhouse.Business_Logic;

import org.greenrobot.eventbus.EventBus;
import org.orm.PersistentException;

import com.tdd.greenhouse.Connection.*;
import com.tdd.greenhouse.model.Ambiente;
import com.tdd.greenhouse.model.Coltivazione;

public class ControllerParametriAmbientali {

	/**
	 * 
	 * @param coltivaz
	 * @param temp
	 * @param irradianza
	 * @param umdita
	 */
	protected static boolean modificaAmbiente(int id, Float temperatura, Float umidita, Float irradianza) {
		Coltivazione c;
		
		try {			
			if(temperatura == null || umidita == null || irradianza == null)
			{
				DettagliBusiness dbus = ControllerColtivazioni.getDettagliBusiness(id);
				if(temperatura == null)
					temperatura = dbus.getTemperatura_target();
				if(umidita == null)
					umidita = dbus.getUmidita_target();
				if(irradianza == null)
					irradianza = dbus.getIrradianza_target();
			}
			c = Coltivazione.getColtivazioneByORMID(id);
			int sez= c.getSezione();
			Connection conn = Connection.getInstance();
			if(conn.modificaAmbiente(c.getIDAmbiente(), temperatura, umidita, irradianza,sez)) 
			{
				return c.modificaAmbiente(temperatura, umidita, irradianza);
			}
			else return false;
			
		} catch (PersistentException e) {
			return false;
		}
	}
	
	protected static boolean modificaAmbiente(int id,int ids, Float temperatura, Float umidita, Float irradianza) {
		Coltivazione c;
		
		try {			
			if(temperatura == null || umidita == null || irradianza == null)
			{
				DettagliBusiness dbus = ControllerColtivazioni.getDettagliBusiness(id,ids);
				if(dbus!=null)
				{
					if(temperatura == null)
						temperatura = dbus.getTemperatura_target();
					if(umidita == null)
						umidita = dbus.getUmidita_target();
					if(irradianza == null)
						irradianza = dbus.getIrradianza_target();
				}
			}
			c = Coltivazione.getColtivazioneByORMID(id);
			int sez= c.getSezione();
			if(sez == ids)
			{
				Connection conn = Connection.getInstance();
				if(conn.modificaAmbiente(c.getIDAmbiente(), temperatura, umidita, irradianza,sez)) 
				{
					return c.modificaAmbiente(temperatura, umidita, irradianza);
				}
				else return false;
			}
			else return false;	
		} catch (PersistentException e) {
			return false;
		}
	}

	protected static void modificaAmbienteAttuale(int id, float temperatura, float umidita, float irradianza) {
		Ambiente amb;
		try {
			amb = Ambiente.getAmbienteByORMID(id);
			if(amb !=null)
				amb.modificaAmbienteAttuale(temperatura, umidita, irradianza);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	protected static DettagliBusiness getParametriAmbiente(int idAmbiente)
	{
		DettagliBusiness b;
		try {
			Ambiente a= Ambiente.getAmbienteByORMID(idAmbiente);
			if(a != null)
			{
				b=new DettagliBusiness(null, a.getTemperaturaTarget(),a.getUmiditaSuoloTarget(), a.getIrradianzaTarget(),a.getID());
				b.setSogliaTemp(a.getSogliaTemp());
				b.setSogliaIrr(a.getSogliaIrr());
				b.setSogliaUmi(a.getSogliaUmi());
				return b;
			}else
				return null;
		} catch (PersistentException e) {
			e.printStackTrace();	
			return null;
		}
	}
	
	protected static void sendClosedMex(int idAmbiente, int sez)
	{
		Connection conn= Connection.getInstance();
		if(!conn.sendStop(idAmbiente, sez))
			System.out.println("Errore nell'invio del messaggio di stop!!");
	}

	protected static void sendAllarme(int code,int idAmbiente)
	{
		Allarme m = AllarmeFactory.buildAllarme(code, idAmbiente);
		sendAllarmeHelper(idAmbiente, m);
	}
	
	protected static void sendAllarme(int code,int idAmbiente, float delta)
	{
		Allarme m = AllarmeFactory.buildAllarme(code, idAmbiente,delta);
		sendAllarmeHelper(idAmbiente, m);
	}
	
	private static void sendAllarmeHelper(int idAmbiente, Allarme m) {
		try {
			Coltivazione[] colt = Coltivazione.getColtivazioneByAmbienteID(idAmbiente);
			if(colt.length>0)
			{
				int idSez =colt[0].getSezione();
				int idColt =colt[0].getID();
				String tipo = colt[0].getTipo();
				m.setTipoColtivazione(tipo);
				m.setIdSez(idSez);
				m.setIdColt(idColt);
				EventBus.getDefault().post(m);	
			}
			else
				System.out.println("Allarmi provenienti da ambienti non trovati nel database, probabile inconsistenza!!!");
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}