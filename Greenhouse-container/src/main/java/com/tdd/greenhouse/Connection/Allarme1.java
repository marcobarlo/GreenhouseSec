package com.tdd.greenhouse.Connection;

public class Allarme1 extends Allarme{
	protected Allarme1(int idAmb)
	{
		super(idAmb);
		mex="Sensore di temperatura mal funzionante";
	}
	
	@Override
	public int getSensoreMalfunzionante()
	{
		return 1;
	}
}
