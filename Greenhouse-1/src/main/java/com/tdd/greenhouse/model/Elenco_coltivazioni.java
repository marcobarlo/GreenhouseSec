package com.tdd.greenhouse.model;

import java.util.*;

public class Elenco_coltivazioni {

	List<DescrizioneColtivazione> descrizioni_coltivazioni;
	private static Elenco_coltivazioni instance = null;

	/**
	 * 
	 * @param nome
	 */
	public Coltivazione[] ricercaColtivazione(String nome) {
		// TODO - implement Elenco_coltivazioni.ricercaColtivazione
		throw new UnsupportedOperationException();
	}

	public static Elenco_coltivazioni getInstance() {
		if (instance == null)
			instance = new Elenco_coltivazioni();
		return instance;
	}

	private Elenco_coltivazioni() {
		// TODO - implement Elenco_coltivazioni.Elenco_coltivazioni
		throw new UnsupportedOperationException();
	}

}