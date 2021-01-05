/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;

import org.orm.*;

import com.tdd.greenhouse.model.*;

public class CreateGreenhouseData {
	public void createTestData() throws PersistentException {
		for(int i=0 ; i < 15 ; i++)
		{
		PersistentTransaction t = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession().beginTransaction();
		try {
//			com.tdd.greenhouse.model.Sezione lcom.tdd.greenhouseModelSezione = com.tdd.greenhouse.model.Sezione.createSezione();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : aree, 
//			lcom.tdd.greenhouseModelSezione.save();
//			com.tdd.greenhouse.model.AreaColtivata lcom.tdd.greenhouseModelAreaColtivata = com.tdd.greenhouse.model.AreaColtivata.createAreaColtivata();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ambiente, sezione, estensione, posizione, fila
//			lcom.tdd.greenhouseModelAreaColtivata.save();
//			com.tdd.greenhouse.model.Coltivazione lcom.tdd.greenhouseModelColtivazione = com.tdd.greenhouse.model.Coltivazione.createColtivazione();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : impiegato, descrizione
//			lcom.tdd.greenhouseModelColtivazione.save();
//			com.tdd.greenhouse.model.Ambiente lcom.tdd.greenhouseModelAmbiente = com.tdd.greenhouse.model.Ambiente.createAmbiente();
			// Initialize the properties of the persistent object here
//			lcom.tdd.greenhouseModelAmbiente.save();
//			com.tdd.greenhouse.model.Impiegato lcom.tdd.greenhouseModelImpiegato = com.tdd.greenhouse.model.Impiegato.createImpiegato();
			// Initialize the properties of the persistent object here
//			lcom.tdd.greenhouseModelImpiegato.save();
//			com.tdd.greenhouse.model.DescrizioneColtivazione lcom.tdd.greenhouseModelDescrizioneColtivazione = com.tdd.greenhouse.model.DescrizioneColtivazione.createDescrizioneColtivazione();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : coltivazioni
//			lcom.tdd.greenhouseModelDescrizioneColtivazione.save();
			Sezione sez1;
			if(i<5)
				sez1 = Sezione.createSezione();
			else
				sez1 = Sezione.getSezioneByORMID(i%5+1);
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : aree, 
			AreaColtivata a1 = AreaColtivata.createAreaColtivata();
			a1.setPosizione(i);
			a1.setFila(1);
			a1.setEstensione((float) 32.4*(i+1)/5);
			a1.setSezione(sez1);
			a1.setTipo_di_terreno("abbastanza fertile");
			
			AreaColtivata a2 = AreaColtivata.createAreaColtivata();
			a2.setPosizione(i);
			a2.setFila(2);
			a2.setEstensione((float) 45.9*(i+1)/4);
			a2.setSezione(sez1);
			a2.setTipo_di_terreno("poco fertile, buono per i cactus");
			
			Ambiente amb1 = Ambiente.createAmbiente();
			amb1.setIrradianzaTarget((float) 7.8*(i+1)/5);
			amb1.setTemperaturaTarget((float) 23.3*(i+1)/5);
			amb1.setUmiditaSuoloTarget(78*(i+1)/5);
			amb1.setSogliaTemp((float)1.5*(i+1)/4);
			amb1.setSogliaUmi((float)4.1*(i+1)/4);
			amb1.setSogliaIrr((float)1503.2*(i+1)/4);
			
			Ambiente amb2 = Ambiente.createAmbiente();
			amb2.setSogliaTemp((float)1.5);
			amb2.setSogliaUmi((float)4.1);
			amb2.setSogliaIrr((float)1503.2);
			amb2.setIrradianzaTarget((float) 9.5*(i+1)/5);
			amb2.setTemperaturaTarget((float) 30.1*(i+1)/5);
			amb2.setUmiditaSuoloTarget(60*i/5);
			DescrizioneColtivazione d1;
			DescrizioneColtivazione d2;
			if(i==0)
			{
				d1 = DescrizioneColtivazione.createDescrizioneColtivazione();
				d1.setDescrizione("ci sono dei bei pomodori succosi, qua si fa una grande passata");
				d1.setTipo("pomodori");
				d2 = DescrizioneColtivazione.createDescrizioneColtivazione();
				d2.setDescrizione("che fico, ho piantato dei fichi");
				d2.setTipo("fichi");
			}
			else
			{
				d1 = DescrizioneColtivazione.getDescrizioneColtivazioneByORMID(1);	
				d2 = DescrizioneColtivazione.getDescrizioneColtivazioneByORMID(2);
			}
			

			
			Impiegato i1 = Impiegato.createImpiegato();
			i1.setEmail("mariorossi@unina.it");
			i1.setPassword(encrypt("password"));
			i1.setRuolo("direttore");
			Impiegato i2 = Impiegato.createImpiegato();
			i2.setEmail("marcobarlo@hotmail.it");
			i2.setPassword(encrypt("password"));
			i2.setRuolo("agronomo");
			Impiegato i3 = Impiegato.createImpiegato();
			i3.setEmail("ravens@unina.it");
			i3.setPassword(encrypt("password"));
			i3.setRuolo("responsabile_software");
			Impiegato i4 = Impiegato.createImpiegato();
			i4.setEmail("amarchetta@hotmail.it");
			i4.setPassword(encrypt("password"));
			i4.setRuolo("operaio");
			
			
			//sez1.aree.add(a1);
			//sez1.aree.add(a2);
			
			
			if(i<5)
				sez1.save();

			
			if(i==0)
			{
				i1.save();
				i2.save();
				i3.save();
				i4.save();
				d1.save();
				d2.save();
			}

			a1.save();
			a2.save();
			amb1.save();
			amb2.save();

			t.commit();
			//t.rollback();
			PersistentTransaction t1 = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession().beginTransaction();
			try {

				Coltivazione c1 = Coltivazione.createColtivazione();
				c1.setArea(a1);
				c1.setData_prossima_operazione(new Date());
				
				Coltivazione c2 = Coltivazione.createColtivazione();
				c2.setArea(a2);
				c2.setData_prossima_operazione(new Date());
			
				c1.setDescrizione(d1);
				c2.setDescrizione(d2);

				c1.setAmbiente(amb1);
				c2.setAmbiente(amb2);
				
				c1.save();
				c2.save();

				
				t1.commit();
				prova.creaColt(c1.getSezione(), c1.getID(), c1.getID());
				prova.creaColt(c2.getSezione(), c2.getID(), c2.getID());
				//t1.rollback();

			}
			catch (Exception e) {
				//t1.rollback();
			}

		}
		catch (Exception e) {
			t.rollback();
		}
	
		}
	}
	
	public static void main(String[] args) {
		try {
			CreateGreenhouseData createGreenhouseData = new CreateGreenhouseData();
			try {
				createGreenhouseData.createTestData();
			}
			finally {
				com.tdd.greenhouse.model.GreenhousePersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
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