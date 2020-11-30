package com.tdd.greenhouse;

import com.tdd.greenhouse.Business_Logic.ControllerFacade;
import com.tdd.greenhouse.Business_Logic.DettagliBusiness;

public class Configurazione {
	private int id;
	private String mac;
	private int sezione;
	private float sogliaTemp;
	private float sogliaUmi;
	private float sogliaIrr;
	private float tempTarget;
	private float umiTarget;
	private float irrTarget;

	public Configurazione(int id, String mac,int sez)
	{
		this.id=id;
		this.mac= mac;
		this.sezione= sez;
		DettagliBusiness dett =ControllerFacade.getParametriAmbiente(id);
		if(dett != null)
		{
			this.tempTarget = dett.getTemperatura_target();
			this.umiTarget = dett.getUmidita_target();
			this.irrTarget = dett.getIrradianza_target();
			this.sogliaIrr = dett.getSogliaIrr();
			this.sogliaTemp= dett.getSogliaTemp();
			this.sogliaUmi = dett.getSogliaUmi();
		}
	}
	public float getSogliaTemp() {
		return sogliaTemp;
	}

	public void setSogliaTemp(float sogliaTemp) {
		this.sogliaTemp = sogliaTemp;
	}

	public float getSogliaUmi() {
		return sogliaUmi;
	}

	public void setSogliaUmi(float sogliaUmi) {
		this.sogliaUmi = sogliaUmi;
	}

	public float getSogliaIrr() {
		return sogliaIrr;
	}

	public void setSogliaIrr(float sogliaIrr) {
		this.sogliaIrr = sogliaIrr;
	}
	
	public int getId() {
		return id;
	}
	public String getMac() {
		return mac;
	}
	public int getSezione() {
		return sezione;
	}
	public float getsogliaTemp() {
		return sogliaTemp;
	}
	public float getsogliaUmi() {
		return sogliaUmi;
	}
	public float getsogliaIrr() {
		return sogliaIrr;
	}
	public float getTempTarget() {
		return tempTarget;
	}

	public float getUmiTarget() {
		return umiTarget;
	}

	public float getIrrTarget() {
		return irrTarget;
	}
}
