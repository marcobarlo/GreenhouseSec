package com.tdd.greenhouse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ParamsPut {
	private Float temperatura;
	private Float umidita;
	private Float irradianza;
	public ParamsPut() {};
	public ParamsPut(Float t, Float u, Float i)
	{
		temperatura = t;
		umidita = u;
		irradianza = i;
	}
	
	public float getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	public float getUmidita() {
		return umidita;
	}
	public void setUmidita(float umidita) {
		this.umidita = umidita;
	}
	public float getIrradianza() {
		return irradianza;
	}
	public void setIrradianza(float irradianza) {
		this.irradianza = irradianza;
	}
	
}
