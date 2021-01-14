package com.tdd.greenhouse.model;

import org.greenrobot.eventbus.EventBus;

import com.tdd.greenhouse.Connection.MexAggiornaParametri;

public class AmbienteAttuale {
	@SuppressWarnings("unused")
	private float umiditaAttuale;
	@SuppressWarnings("unused")
	private float temperaturaAttuale;
	@SuppressWarnings("unused")
	private float irradianzaAttuale;
	private Ambiente ambiente;
/*	public float getUmiditaAttuale() {
		return umiditaAttuale;
	}
	public void setUmiditaAttuale(float umiditaAttuale) {
		this.umiditaAttuale = umiditaAttuale;
	}
	public float getTemperaturaAttuale() {
		return temperaturaAttuale;
	}
	public void setTemperaturaAttuale(float temperaturaAttuale) {
		this.temperaturaAttuale = temperaturaAttuale;
	}
	public float getIrradianzaAttuale() {
		return irradianzaAttuale;
	}
	public void setIrradianzaAttuale(float irradianzaAttuale) {
		this.irradianzaAttuale = irradianzaAttuale;
	}*/
	
	public AmbienteAttuale(Ambiente a)
	{	
		ambiente= a;
	}
	public AmbienteAttuale(Ambiente a, float temperatura, float umidita, float irradianza)
	{
		ambiente=a;
		temperaturaAttuale = temperatura;
		umiditaAttuale = umidita;
		irradianzaAttuale = irradianza;
	}
	public void setParametriAttuali(float temperatura, float umidita, float irradianza) 
	{
		temperaturaAttuale = temperatura;
		umiditaAttuale = umidita;
		irradianzaAttuale = irradianza;
		//System.out.println("invio aggiornamento per ID "+ambiente.getID());
		EventBus.getDefault().post(new MexAggiornaParametri(ambiente.getID(),temperatura,umidita,irradianza));
	}
}
