package com.tdd.greenhouse.Connection;


public class Allarme2 extends Allarme{
	protected Allarme2(int idAmb)
	{
		super(idAmb);
		mex="Sensore di umidit� mal funzionante";
	}
	
	@Override
	public int getSensoreMalfunzionante()
	{
		return 2;
	}
}
