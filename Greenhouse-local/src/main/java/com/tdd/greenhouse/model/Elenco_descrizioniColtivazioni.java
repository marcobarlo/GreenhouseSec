package com.tdd.greenhouse.model;

import java.util.*;

public class Elenco_descrizioniColtivazioni {

	List<DescrizioneColtivazione> descrizioni_coltivazioni;
	private static Elenco_descrizioniColtivazioni instance = null;

	/**
	 * 
	 * @param nome
	 */
	public Coltivazione[] ricercaColtivazione(String nome) {
		// TODO - implement Elenco_coltivazioni.ricercaColtivazione
		throw new UnsupportedOperationException();
	}

	public static Elenco_descrizioniColtivazioni getInstance() {
		if (instance == null)
			instance = new Elenco_descrizioniColtivazioni();
		return instance;
	}

	private Elenco_descrizioniColtivazioni() {
		// TODO - implement Elenco_coltivazioni.Elenco_coltivazioni
		throw new UnsupportedOperationException();
	}

}