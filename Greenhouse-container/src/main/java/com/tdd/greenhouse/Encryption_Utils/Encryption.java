package com.tdd.greenhouse.Encryption_Utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encryption {
	
	public static boolean checkPassword(String password, String hash)
	{
		MessageDigest digest;
		String encr;
		try {
			digest = MessageDigest.getInstance("SHA-256");
			byte[] encodedhash = digest.digest(
			password.getBytes(StandardCharsets.UTF_8));
			encr = bytesToHex(encodedhash);
			if(encr.equals(hash))
				return true;
			else
				return false;
		}catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return false;
		}
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
