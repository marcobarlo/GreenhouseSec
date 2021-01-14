package com.tdd.greenhouse.Connection;


public class Allarme3 extends Allarme{
	protected Allarme3(int idAmb)
	{
		super(idAmb);
		mex="Sensore di irradianza mal funzionante";
	}
	
	@Override
	public int getSensoreMalfunzionante()
	{
		return 3;
	}
}
