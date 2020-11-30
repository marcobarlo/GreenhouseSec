package com.tdd.greenhouse.Business_Logic;

import com.tdd.greenhouse.model.Impiegato;

public class ControllerUtenti {
	private static String session;
	protected static String login(String mail, String pass)
	{
		session = Impiegato.login(mail,pass);
		return session;
	}
	protected static String getSessionRole() {
		return session;
	}
	protected static void logOut() {
		session=null;
	}
}