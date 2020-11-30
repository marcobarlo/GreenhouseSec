package com.tdd.greenhouse.Connection;

public class AllarmeDisconnessione extends Allarme {
	protected AllarmeDisconnessione(int idAmb)
	{
		super(idAmb);
		mex="Controllore dell'ambiente "+ idAmb+ " disconnesso, controllare";
	}
}
