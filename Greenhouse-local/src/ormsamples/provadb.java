package ormsamples;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;

import org.orm.PersistentException;

import com.tdd.greenhouse.model.*;

public class provadb {
	public static void main(String[] args) throws PersistentException {
		/*Sezione sez1[];
		SezioneCriteria sezcrit;
		sezcrit = new SezioneCriteria();
		sez1 = sezcrit.listSezione();
		System.out.println(sez1.length);
		for(Sezione sezion: sez1)
		{
			System.out.println("Sezione con aree " + sezion.aree.size());	
			Iterator<AreaColtivata> itr =sezion.aree.getIterator();
			while(itr.hasNext())
			{
				AreaColtivata a=itr.next();
				System.out.println("Area " + a.getFila() + a.getPosizione());	
				Coltivazione c= a.getColtivazione();
				if(c != null)
				{
					System.out.println("Coltivazione con id: "+c.getID());
					DescrizioneColtivazione d = c.getDescrizioneColtivazione();
					System.out.println(d.getTipo());
				}
			}
		}

		Coltivazione colt = Coltivazione.getColtivazioneByORMID(1);
		DescrizioneColtivazione descr = colt.getDescrizioneColtivazione();
		if(descr == null) {
			System.out.println("a saj a mammt?");
		}
		else {
			System.out.println(descr.getID());
			System.out.println(descr.getTipo());
			System.out.println(descr.getDescrizione());
		}
		Sezione sez = Sezione.getSezioneByORMID(8);
		System.out.println(sez.aree.size());*/
		System.out.println(encrypt("password"));
		System.out.println(encrypt("password").length());
		
		
	}
	
	protected static String encrypt(String pass)
	{
		MessageDigest digest;
		String encr;
		try {
			digest = MessageDigest.getInstance("SHA-256");
			byte[] encodedhash = digest.digest(
			pass.getBytes(StandardCharsets.UTF_8));
			encr = bytesToHex(encodedhash);
		}catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return encr;
	}
	private static String bytesToHex(byte[] hash) {
	    StringBuffer hexString = new StringBuffer();
	    for (int i = 0; i < hash.length; i++) {
	    String hex = Integer.toHexString(0xff & hash[i]);
	    if(hex.length() == 1) hexString.append('0');
	        hexString.append(hex);
	    }
	    return hexString.toString();
	}
}
