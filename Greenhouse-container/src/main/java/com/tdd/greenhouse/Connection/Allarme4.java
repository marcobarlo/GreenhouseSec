package com.tdd.greenhouse.Connection;


public class Allarme4 extends Allarme{
	protected Allarme4(int idAmb)
	{
		super(idAmb);
		mex="Attuatore di temperatura mal funzionante";
	}
	protected Allarme4(int idAmb,float delta)
	{
		super(idAmb);
		mex="Attuatore di temperatura mal funzionante, la temperatura attuale dista "+delta+" �C da quella target";
	}
	
}
