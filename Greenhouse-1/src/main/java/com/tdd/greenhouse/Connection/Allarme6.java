package com.tdd.greenhouse.Connection;

public class Allarme6 extends Allarme{
	protected Allarme6(int idAmb)
	{
		super(idAmb);
		mex="Attuatore di irradianza mal funzionante";
	}
	protected Allarme6(int idAmb,float delta)
	{
		super(idAmb);
		mex="Attuatore di irradianza mal funzionante, l'irradianza attuale dista "+delta+" W/mq da quella target";
	}
}
