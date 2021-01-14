package com.tdd.greenhouse.Connection;


public class Allarme5 extends Allarme{
	protected Allarme5(int idAmb)
	{
		super(idAmb);
		mex="Attuatore di umidit� mal funzionante";
	}
	protected Allarme5(int idAmb,float delta)
	{
		super(idAmb);
		mex="Attuatore di umidit� mal funzionante, l'umidit� del suolo attuale dista "+delta+" % da quella target";
	}
}
