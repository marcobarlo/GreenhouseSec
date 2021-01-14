package com.tdd.greenhouse.model;

import java.util.*;

import org.orm.PersistentException;

public class Serra {

	public List<Sezione> sezioni;
	Elenco_descrizioniColtivazioni elenco_coltivazioni;
	private static Serra instance = null;

	private Serra() {
		Sezione sez[];
		SezioneCriteria sezcrit;
		try 
		{
			sezcrit = new SezioneCriteria();
			sez = sezcrit.listSezione();
			sezioni = Arrays.asList(sez);
		} 
		catch (PersistentException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static Serra getInstance() {
		if (instance == null)
			instance = new Serra();
		return instance;
	}
	
	public Sezione getSezione(int sezione) {
			return sezioni.get(sezione);
	}

	public Elenco_descrizioniColtivazioni getElencoColtivazioni() {
		return elenco_coltivazioni;
	}

	public Sezione getSezioneByID(int sezioneID) {
		for(Sezione s: sezioni)
		{
			if(s.getID()==sezioneID)
			{
				return s;
			}
		}
		return null;
	}

	public List<Integer> ricercaColtivazione(String tipo, int sezione, int posizione, int fila) 
	{
		List<Integer> colts = new ArrayList<Integer>();
		if (sezione != -1)
		{
			Sezione sez = this.getSezioneByID(sezione);
			if(sez != null)
			{
				colts= sez.ricercaColtivazione(tipo,posizione,fila);		
			}
		}
		else 
		{
			for(Sezione sez:this.sezioni)
				colts.addAll(sez.ricercaColtivazione(tipo,posizione,fila));
		}
		return colts;
	}
}