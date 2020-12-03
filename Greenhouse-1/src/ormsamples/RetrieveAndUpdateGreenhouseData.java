/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateGreenhouseData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession().beginTransaction();
		try {
			com.tdd.greenhouse.model.Sezione lcom.tdd.greenhouseModelSezione = com.tdd.greenhouse.model.Sezione.loadSezioneByQuery(null, null);
			// Update the properties of the persistent object
			lcom.tdd.greenhouseModelSezione.save();
			com.tdd.greenhouse.model.AreaColtivata lcom.tdd.greenhouseModelAreaColtivata = com.tdd.greenhouse.model.AreaColtivata.loadAreaColtivataByQuery(null, null);
			// Update the properties of the persistent object
			lcom.tdd.greenhouseModelAreaColtivata.save();
			com.tdd.greenhouse.model.Coltivazione lcom.tdd.greenhouseModelColtivazione = com.tdd.greenhouse.model.Coltivazione.loadColtivazioneByQuery(null, null);
			// Update the properties of the persistent object
			lcom.tdd.greenhouseModelColtivazione.save();
			com.tdd.greenhouse.model.DescrizioneColtivazione lcom.tdd.greenhouseModelDescrizioneColtivazione = com.tdd.greenhouse.model.DescrizioneColtivazione.loadDescrizioneColtivazioneByQuery(null, null);
			// Update the properties of the persistent object
			lcom.tdd.greenhouseModelDescrizioneColtivazione.save();
			com.tdd.greenhouse.model.Impiegato lcom.tdd.greenhouseModelImpiegato = com.tdd.greenhouse.model.Impiegato.loadImpiegatoByQuery(null, null);
			// Update the properties of the persistent object
			lcom.tdd.greenhouseModelImpiegato.save();
			com.tdd.greenhouse.model.Ambiente lcom.tdd.greenhouseModelAmbiente = com.tdd.greenhouse.model.Ambiente.loadAmbienteByQuery(null, null);
			// Update the properties of the persistent object
			lcom.tdd.greenhouseModelAmbiente.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Sezione by SezioneCriteria");
		com.tdd.greenhouse.model.SezioneCriteria lcom.tdd.greenhouseModelSezioneCriteria = new com.tdd.greenhouse.model.SezioneCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcom.tdd.greenhouseModelSezioneCriteria.ID.eq();
		System.out.println(lcom.tdd.greenhouseModelSezioneCriteria.uniqueSezione());
		
		System.out.println("Retrieving AreaColtivata by AreaColtivataCriteria");
		com.tdd.greenhouse.model.AreaColtivataCriteria lcom.tdd.greenhouseModelAreaColtivataCriteria = new com.tdd.greenhouse.model.AreaColtivataCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcom.tdd.greenhouseModelAreaColtivataCriteria.ID.eq();
		System.out.println(lcom.tdd.greenhouseModelAreaColtivataCriteria.uniqueAreaColtivata());
		
		System.out.println("Retrieving Coltivazione by ColtivazioneCriteria");
		com.tdd.greenhouse.model.ColtivazioneCriteria lcom.tdd.greenhouseModelColtivazioneCriteria = new com.tdd.greenhouse.model.ColtivazioneCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcom.tdd.greenhouseModelColtivazioneCriteria.ID.eq();
		System.out.println(lcom.tdd.greenhouseModelColtivazioneCriteria.uniqueColtivazione());
		
		System.out.println("Retrieving DescrizioneColtivazione by DescrizioneColtivazioneCriteria");
		com.tdd.greenhouse.model.DescrizioneColtivazioneCriteria lcom.tdd.greenhouseModelDescrizioneColtivazioneCriteria = new com.tdd.greenhouse.model.DescrizioneColtivazioneCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcom.tdd.greenhouseModelDescrizioneColtivazioneCriteria.ID.eq();
		System.out.println(lcom.tdd.greenhouseModelDescrizioneColtivazioneCriteria.uniqueDescrizioneColtivazione());
		
		System.out.println("Retrieving Impiegato by ImpiegatoCriteria");
		com.tdd.greenhouse.model.ImpiegatoCriteria lcom.tdd.greenhouseModelImpiegatoCriteria = new com.tdd.greenhouse.model.ImpiegatoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcom.tdd.greenhouseModelImpiegatoCriteria.ID.eq();
		System.out.println(lcom.tdd.greenhouseModelImpiegatoCriteria.uniqueImpiegato());
		
		System.out.println("Retrieving Ambiente by AmbienteCriteria");
		com.tdd.greenhouse.model.AmbienteCriteria lcom.tdd.greenhouseModelAmbienteCriteria = new com.tdd.greenhouse.model.AmbienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcom.tdd.greenhouseModelAmbienteCriteria.ID.eq();
		System.out.println(lcom.tdd.greenhouseModelAmbienteCriteria.uniqueAmbiente());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateGreenhouseData retrieveAndUpdateGreenhouseData = new RetrieveAndUpdateGreenhouseData();
			try {
				retrieveAndUpdateGreenhouseData.retrieveAndUpdateTestData();
				//retrieveAndUpdateGreenhouseData.retrieveByCriteria();
			}
			finally {
				com.tdd.greenhouse.model.GreenhousePersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
