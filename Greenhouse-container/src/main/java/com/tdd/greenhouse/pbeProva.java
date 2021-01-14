package com.tdd.greenhouse;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Random;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

public class pbeProva 
{
	public static void main(String[] args) 
	{
		try {
			FileInputStream fis = new FileInputStream("config.xml");
			FileOutputStream fos = new FileOutputStream("configEnc.xml");
	
			String password = "password";
		//gemerazopme della key	
			PBEKeySpec pbeKeySpec = new PBEKeySpec(password.toCharArray());
			SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndTripleDES");
			SecretKey secretKey = secretKeyFactory.generateSecret(pbeKeySpec);
		//generazione del salt
			byte[] salt = new byte[8];
			SecureRandom random = SecureRandom.getInstance("SHA1PRNG", "SUN");
			random.nextBytes(salt);
			//PBEKeySpec pbeKeySpec = new PBEKeySpec(password.toCharArray(),salt,100);
			//SecretKey secretKey = secretKeyFactory.generateSecret(pbeKeySpec);
			
			//based on pkcs5
			PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(salt, 100);	//i parametri non sono strettamente necessari
			Cipher cipher = Cipher.getInstance("PBEWithMD5AndTripleDES");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey, pbeParameterSpec);
			fos.write(salt);
		//scrittura del file criptato
			byte[] input = new byte[64];
			int bytesRead;
			while ((bytesRead = fis.read(input)) != -1) {
				byte[] output = cipher.update(input, 0, bytesRead);
				if (output != null)
					fos.write(output);
			}
			byte[] output = cipher.doFinal();
			if (output != null)
				fos.write(output);
	
			fis.close();
			fos.flush();
			fos.close();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchProviderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidAlgorithmParameterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
