package com.tdd.greenhouse.Connection;

public class AllarmeFactory {

	public static Allarme buildAllarme(int code, int idAmb)
	{
		switch(code)
		{
		case 0:
			return new AllarmeDisconnessione(idAmb);
		case 1:
			return new Allarme1(idAmb);
		case 2:
    		return new Allarme2(idAmb);
    	case 3:
    		return new Allarme3(idAmb);
    	case 4:
    		return new Allarme4(idAmb);
    	case 5:
    		return new Allarme5(idAmb);
    	case 6:
    		return new Allarme6(idAmb);
    	default: return new AllarmeGenerico(idAmb);
		}
	}
	public static Allarme buildAllarme(int code, int idAmb, float delta)
	{
		switch(code)
		{
			case 4:
				return new Allarme4(idAmb,delta);
			case 5:
				return new Allarme5(idAmb,delta);
			case 6:
				return new Allarme6(idAmb,delta);
		 	default: return new AllarmeGenerico(idAmb);
		}
	}
}
