package com.tdd.greenhouse;

public class ParamsPut {
	private float temperatura;
	private float umidita;
	private float irradianza;
	public ParamsPut() {};
	public ParamsPut(float t, float u, float i)
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
