package com.tdd.greenhouse.Connection;

public class MexAggiornaParametri 
{
	int id;
	float temp, umi, irr;
	public MexAggiornaParametri(int idAmb,float t, float u, float i)
	{
		temp=t;
		umi= u;
		irr= i;
		id=idAmb;
	}
	public float getTemp() {
		return temp;
	}
	public float getUmi() {
		return umi;
	}
	public float getIrr() {
		return irr;
	}
	public int getId() {
		return id;
	}
	
}
