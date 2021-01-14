package com.tdd.greenhouse;

import java.util.Date;

import com.tdd.greenhouse.Business_Logic.ColtivazioneBusiness;
import com.tdd.greenhouse.Business_Logic.DettagliBusiness;

public class ReturnGetColtivazione 
{
	public int getID_coltivazione() {
		return ID_coltivazione;
	}
	public void setID_coltivazione(int iD_coltivazione) {
		ID_coltivazione = iD_coltivazione;
	}
	public int getSezione() {
		return sezione;
	}
	public void setSezione(int sezione) {
		this.sezione = sezione;
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getPosizione() {
		return posizione;
	}
	public void setPosizione(int posizione) {
		this.posizione = posizione;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}
	public Date getData_prossima_op() {
		return data_prossima_op;
	}
	public void setData_prossima_op(Date data_prossima_op) {
		this.data_prossima_op = data_prossima_op;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public float getTemperatura_target() {
		return temperatura_target;
	}
	public void setTemperatura_target(float temperatura_target) {
		this.temperatura_target = temperatura_target;
	}
	public float getUmidita_target() {
		return umidita_target;
	}
	public void setUmidita_target(float umidita_target) {
		this.umidita_target = umidita_target;
	}
	public float getIrradianza_target() {
		return irradianza_target;
	}
	public void setIrradianza_target(float irradianza_target) {
		this.irradianza_target = irradianza_target;
	}
	public int getIdAmbiente() {
		return idAmbiente;
	}
	public void setIdAmbiente(int idAmbiente) {
		this.idAmbiente = idAmbiente;
	}
	public float getSogliaTemp() {
		return sogliaTemp;
	}
	public void setSogliaTemp(float sogliaTemp) {
		this.sogliaTemp = sogliaTemp;
	}
	public float getSogliaIrr() {
		return sogliaIrr;
	}
	public void setSogliaIrr(float sogliaIrr) {
		this.sogliaIrr = sogliaIrr;
	}
	public float getSogliaUmi() {
		return sogliaUmi;
	}
	public void setSogliaUmi(float sogliaUmi) {
		this.sogliaUmi = sogliaUmi;
	}
	private int ID_coltivazione;
	private int sezione;
	private int fila;
	private int posizione;
	private String tipo;
	private String stato;
	private Date data_prossima_op;
	private String descrizione;
	private float temperatura_target;
	private float umidita_target;
	private float irradianza_target;
	private int idAmbiente;
	private float sogliaTemp, sogliaIrr,sogliaUmi;
	ReturnGetColtivazione(DettagliBusiness d, ColtivazioneBusiness c)
	{
		ID_coltivazione = c.getID_coltivazione();
		sezione = c.getSezione();
		fila = c.getFila();
		posizione = c.getPosizione();
		tipo = c.getTipo();
		stato = c.getStato();
		data_prossima_op = c.getData_prossima_op();
		descrizione = d.getDescrizione();
		this.temperatura_target = d.getTemperatura_target();
		this.umidita_target = d.getUmidita_target();
		this.irradianza_target = d.getIrradianza_target();
		this.idAmbiente= d.getIdAmbiente();
		this.sogliaTemp = d.getSogliaTemp();
		this.sogliaIrr = d.getIrradianza_target();
		this.sogliaUmi = d.getSogliaUmi();
	}
}
