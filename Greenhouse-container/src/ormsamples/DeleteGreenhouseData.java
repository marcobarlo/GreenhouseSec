/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteGreenhouseData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession().beginTransaction();
		try {
			com.tdd.greenhouse.model.Sezione lcom.tdd.greenhouseModelSezione = com.tdd.greenhouse.model.Sezione.loadSezioneByQuery(null, null);
			lcom.tdd.greenhouseModelSezione.delete();
			com.tdd.greenhouse.model.AreaColtivata lcom.tdd.greenhouseModelAreaColtivata = com.tdd.greenhouse.model.AreaColtivata.loadAreaColtivataByQuery(null, null);
			lcom.tdd.greenhouseModelAreaColtivata.delete();
			com.tdd.greenhouse.model.Coltivazione lcom.tdd.greenhouseModelColtivazione = com.tdd.greenhouse.model.Coltivazione.loadColtivazioneByQuery(null, null);
			lcom.tdd.greenhouseModelColtivazione.delete();
			com.tdd.greenhouse.model.DescrizioneColtivazione lcom.tdd.greenhouseModelDescrizioneColtivazione = com.tdd.greenhouse.model.DescrizioneColtivazione.loadDescrizioneColtivazioneByQuery(null, null);
			lcom.tdd.greenhouseModelDescrizioneColtivazione.delete();
			com.tdd.greenhouse.model.Impiegato lcom.tdd.greenhouseModelImpiegato = com.tdd.greenhouse.model.Impiegato.loadImpiegatoByQuery(null, null);
			lcom.tdd.greenhouseModelImpiegato.delete();
			com.tdd.greenhouse.model.Ambiente lcom.tdd.greenhouseModelAmbiente = com.tdd.greenhouse.model.Ambiente.loadAmbienteByQuery(null, null);
			lcom.tdd.greenhouseModelAmbiente.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteGreenhouseData deleteGreenhouseData = new DeleteGreenhouseData();
			try {
				deleteGreenhouseData.deleteTestData();
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
