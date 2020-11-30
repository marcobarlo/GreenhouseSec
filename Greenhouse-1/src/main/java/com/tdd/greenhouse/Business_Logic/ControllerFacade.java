package com.tdd.greenhouse.Business_Logic;

import java.util.List;

public class ControllerFacade {

	/**
	 * 
	 * @param nome
	 * @param sezione
	 * @param posizione
	 * @param fila
	 */
	public static List<ColtivazioneBusiness> ricercaColtivazione(String nome, int sezione, int posizione, int fila) {
		return ControllerColtivazioni.ricercaColtivazione(nome, sezione, posizione, fila);
}

	/**
	 * 
	 * @param coltivaz
	 * @param temp
	 * @param irradianza
	 * @param umdita
	 */
	public static boolean modificaAmbiente(int id, Float temperatura, Float umidita, Float irradianza) {
			return ControllerParametriAmbientali.modificaAmbiente(id, temperatura, umidita, irradianza);
	}

	/**
	 * 
	 * @param idColtivazione 
	 */
	public static DettagliBusiness getDettagliColtivazione(int idColtivazione) {
			return ControllerColtivazioni.getDettagliColtivazione(idColtivazione);
	}

	public static void modificaAmbienteAttuale(int id, float temperatura, float umidita, float irradianza) {
		ControllerParametriAmbientali.modificaAmbienteAttuale(id, temperatura, umidita, irradianza);
		
	}
	
	public static DettagliBusiness getParametriAmbiente(int idAmbiente)
	{
		return ControllerParametriAmbientali.getParametriAmbiente(idAmbiente);
	}

	public static void sendClosedMex(int idAmbiente, int sez)
	{
		ControllerParametriAmbientali.sendClosedMex(idAmbiente,sez);
	}
	
	public static void sendAllarme(int code,int idAmbiente)
	{
		ControllerParametriAmbientali.sendAllarme(code,idAmbiente);
	}
	public static void sendAllarme(int code,int idAmbiente, float delta)
	{
		ControllerParametriAmbientali.sendAllarme(code,idAmbiente,delta);
	}
	public static String login(String mail, String pass)
	{
		return ControllerUtenti.login(mail,pass);
	}
	public static String getSessionRole()
	{
		return ControllerUtenti.getSessionRole();
	}

	public static void logOut() {
		ControllerUtenti.logOut();
	}

}