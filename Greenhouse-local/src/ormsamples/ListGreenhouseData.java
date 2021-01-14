/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListGreenhouseData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Sezione...");
		com.tdd.greenhouse.model.Sezione[] com.tdd.greenhouseModelSeziones = com.tdd.greenhouse.model.Sezione.listSezioneByQuery(null, null);
		int length = Math.min(com.tdd.greenhouseModelSeziones.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(com.tdd.greenhouseModelSeziones[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing AreaColtivata...");
		com.tdd.greenhouse.model.AreaColtivata[] com.tdd.greenhouseModelAreaColtivatas = com.tdd.greenhouse.model.AreaColtivata.listAreaColtivataByQuery(null, null);
		length = Math.min(com.tdd.greenhouseModelAreaColtivatas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(com.tdd.greenhouseModelAreaColtivatas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Coltivazione...");
		com.tdd.greenhouse.model.Coltivazione[] com.tdd.greenhouseModelColtivaziones = com.tdd.greenhouse.model.Coltivazione.listColtivazioneByQuery(null, null);
		length = Math.min(com.tdd.greenhouseModelColtivaziones.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(com.tdd.greenhouseModelColtivaziones[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing DescrizioneColtivazione...");
		com.tdd.greenhouse.model.DescrizioneColtivazione[] com.tdd.greenhouseModelDescrizioneColtivaziones = com.tdd.greenhouse.model.DescrizioneColtivazione.listDescrizioneColtivazioneByQuery(null, null);
		length = Math.min(com.tdd.greenhouseModelDescrizioneColtivaziones.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(com.tdd.greenhouseModelDescrizioneColtivaziones[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Impiegato...");
		com.tdd.greenhouse.model.Impiegato[] com.tdd.greenhouseModelImpiegatos = com.tdd.greenhouse.model.Impiegato.listImpiegatoByQuery(null, null);
		length = Math.min(com.tdd.greenhouseModelImpiegatos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(com.tdd.greenhouseModelImpiegatos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Ambiente...");
		com.tdd.greenhouse.model.Ambiente[] com.tdd.greenhouseModelAmbientes = com.tdd.greenhouse.model.Ambiente.listAmbienteByQuery(null, null);
		length = Math.min(com.tdd.greenhouseModelAmbientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(com.tdd.greenhouseModelAmbientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Sezione by Criteria...");
		com.tdd.greenhouse.model.SezioneCriteria lcom.tdd.greenhouseModelSezioneCriteria = new com.tdd.greenhouse.model.SezioneCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcom.tdd.greenhouseModelSezioneCriteria.ID.eq();
		lcom.tdd.greenhouseModelSezioneCriteria.setMaxResults(ROW_COUNT);
		com.tdd.greenhouse.model.Sezione[] com.tdd.greenhouseModelSeziones = lcom.tdd.greenhouseModelSezioneCriteria.listSezione();
		int length =com.tdd.greenhouseModelSeziones== null ? 0 : Math.min(com.tdd.greenhouseModelSeziones.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(com.tdd.greenhouseModelSeziones[i]);
		}
		System.out.println(length + " Sezione record(s) retrieved."); 
		
		System.out.println("Listing AreaColtivata by Criteria...");
		com.tdd.greenhouse.model.AreaColtivataCriteria lcom.tdd.greenhouseModelAreaColtivataCriteria = new com.tdd.greenhouse.model.AreaColtivataCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcom.tdd.greenhouseModelAreaColtivataCriteria.ID.eq();
		lcom.tdd.greenhouseModelAreaColtivataCriteria.setMaxResults(ROW_COUNT);
		com.tdd.greenhouse.model.AreaColtivata[] com.tdd.greenhouseModelAreaColtivatas = lcom.tdd.greenhouseModelAreaColtivataCriteria.listAreaColtivata();
		length =com.tdd.greenhouseModelAreaColtivatas== null ? 0 : Math.min(com.tdd.greenhouseModelAreaColtivatas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(com.tdd.greenhouseModelAreaColtivatas[i]);
		}
		System.out.println(length + " AreaColtivata record(s) retrieved."); 
		
		System.out.println("Listing Coltivazione by Criteria...");
		com.tdd.greenhouse.model.ColtivazioneCriteria lcom.tdd.greenhouseModelColtivazioneCriteria = new com.tdd.greenhouse.model.ColtivazioneCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcom.tdd.greenhouseModelColtivazioneCriteria.ID.eq();
		lcom.tdd.greenhouseModelColtivazioneCriteria.setMaxResults(ROW_COUNT);
		com.tdd.greenhouse.model.Coltivazione[] com.tdd.greenhouseModelColtivaziones = lcom.tdd.greenhouseModelColtivazioneCriteria.listColtivazione();
		length =com.tdd.greenhouseModelColtivaziones== null ? 0 : Math.min(com.tdd.greenhouseModelColtivaziones.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(com.tdd.greenhouseModelColtivaziones[i]);
		}
		System.out.println(length + " Coltivazione record(s) retrieved."); 
		
		System.out.println("Listing DescrizioneColtivazione by Criteria...");
		com.tdd.greenhouse.model.DescrizioneColtivazioneCriteria lcom.tdd.greenhouseModelDescrizioneColtivazioneCriteria = new com.tdd.greenhouse.model.DescrizioneColtivazioneCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcom.tdd.greenhouseModelDescrizioneColtivazioneCriteria.ID.eq();
		lcom.tdd.greenhouseModelDescrizioneColtivazioneCriteria.setMaxResults(ROW_COUNT);
		com.tdd.greenhouse.model.DescrizioneColtivazione[] com.tdd.greenhouseModelDescrizioneColtivaziones = lcom.tdd.greenhouseModelDescrizioneColtivazioneCriteria.listDescrizioneColtivazione();
		length =com.tdd.greenhouseModelDescrizioneColtivaziones== null ? 0 : Math.min(com.tdd.greenhouseModelDescrizioneColtivaziones.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(com.tdd.greenhouseModelDescrizioneColtivaziones[i]);
		}
		System.out.println(length + " DescrizioneColtivazione record(s) retrieved."); 
		
		System.out.println("Listing Impiegato by Criteria...");
		com.tdd.greenhouse.model.ImpiegatoCriteria lcom.tdd.greenhouseModelImpiegatoCriteria = new com.tdd.greenhouse.model.ImpiegatoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcom.tdd.greenhouseModelImpiegatoCriteria.ID.eq();
		lcom.tdd.greenhouseModelImpiegatoCriteria.setMaxResults(ROW_COUNT);
		com.tdd.greenhouse.model.Impiegato[] com.tdd.greenhouseModelImpiegatos = lcom.tdd.greenhouseModelImpiegatoCriteria.listImpiegato();
		length =com.tdd.greenhouseModelImpiegatos== null ? 0 : Math.min(com.tdd.greenhouseModelImpiegatos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(com.tdd.greenhouseModelImpiegatos[i]);
		}
		System.out.println(length + " Impiegato record(s) retrieved."); 
		
		System.out.println("Listing Ambiente by Criteria...");
		com.tdd.greenhouse.model.AmbienteCriteria lcom.tdd.greenhouseModelAmbienteCriteria = new com.tdd.greenhouse.model.AmbienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcom.tdd.greenhouseModelAmbienteCriteria.ID.eq();
		lcom.tdd.greenhouseModelAmbienteCriteria.setMaxResults(ROW_COUNT);
		com.tdd.greenhouse.model.Ambiente[] com.tdd.greenhouseModelAmbientes = lcom.tdd.greenhouseModelAmbienteCriteria.listAmbiente();
		length =com.tdd.greenhouseModelAmbientes== null ? 0 : Math.min(com.tdd.greenhouseModelAmbientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(com.tdd.greenhouseModelAmbientes[i]);
		}
		System.out.println(length + " Ambiente record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListGreenhouseData listGreenhouseData = new ListGreenhouseData();
			try {
				listGreenhouseData.listTestData();
				//listGreenhouseData.listByCriteria();
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
