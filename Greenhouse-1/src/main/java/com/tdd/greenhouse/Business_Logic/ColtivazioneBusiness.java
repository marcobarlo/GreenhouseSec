package com.tdd.greenhouse.Business_Logic;

import java.util.*;

public class ColtivazioneBusiness implements Comparator<ColtivazioneBusiness> {
	private int ID_coltivazione;
	private int sezione;
	private int fila;
	private int posizione;
	private String tipo;
	private String stato;
	private Date data_prossima_op;
	
	
	public ColtivazioneBusiness() 
	{
		
	}
	
	public int compare(ColtivazioneBusiness a, ColtivazioneBusiness b)
	{
		return a.ID_coltivazione - b.ID_coltivazione;
	}
	
	public ColtivazioneBusiness(int ID_colt, int sezione, int fila, int posizione, String tipo, String stato, Date data) 
	{
		this.ID_coltivazione = ID_colt;
		this.sezione = sezione;
		this.fila = fila;
		this.posizione= posizione;
		this.tipo = tipo;
		this.stato = stato;
		this.data_prossima_op = data;
	}
	
	public int getSezione() {
		return sezione;
	}

	public void setSezione(int sezione) {
		this.sezione = sezione;
	}

	public int getID_coltivazione() {
		return ID_coltivazione;
	}

	public void setID_coltivazione(int iD_coltivazione) {
		ID_coltivazione = iD_coltivazione;
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
}