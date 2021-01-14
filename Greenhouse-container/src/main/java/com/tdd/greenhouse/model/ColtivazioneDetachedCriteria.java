/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package com.tdd.greenhouse.model;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ColtivazioneDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression ambienteId;
	public final AssociationExpression ambiente;
	public final IntegerExpression descrizioneId;
	public final AssociationExpression descrizione;
	public final StringExpression stato;
	public final DateExpression data_prossima_operazione;
	public final IntegerExpression areaId;
	public final AssociationExpression area;
	public final CollectionExpression impiegati;
	
	public ColtivazioneDetachedCriteria() {
		super(com.tdd.greenhouse.model.Coltivazione.class, com.tdd.greenhouse.model.ColtivazioneCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		ambienteId = new IntegerExpression("ambiente.attribute", this.getDetachedCriteria());
		ambiente = new AssociationExpression("ambiente", this.getDetachedCriteria());
		descrizioneId = new IntegerExpression("descrizione.ID", this.getDetachedCriteria());
		descrizione = new AssociationExpression("descrizione", this.getDetachedCriteria());
		stato = new StringExpression("stato", this.getDetachedCriteria());
		data_prossima_operazione = new DateExpression("data_prossima_operazione", this.getDetachedCriteria());
		areaId = new IntegerExpression("area.ID", this.getDetachedCriteria());
		area = new AssociationExpression("area", this.getDetachedCriteria());
		impiegati = new CollectionExpression("ORM_Impiegati", this.getDetachedCriteria());
	}
	
	public ColtivazioneDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.tdd.greenhouse.model.ColtivazioneCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		ambienteId = new IntegerExpression("ambiente.attribute", this.getDetachedCriteria());
		ambiente = new AssociationExpression("ambiente", this.getDetachedCriteria());
		descrizioneId = new IntegerExpression("descrizione.ID", this.getDetachedCriteria());
		descrizione = new AssociationExpression("descrizione", this.getDetachedCriteria());
		stato = new StringExpression("stato", this.getDetachedCriteria());
		data_prossima_operazione = new DateExpression("data_prossima_operazione", this.getDetachedCriteria());
		areaId = new IntegerExpression("area.ID", this.getDetachedCriteria());
		area = new AssociationExpression("area", this.getDetachedCriteria());
		impiegati = new CollectionExpression("ORM_Impiegati", this.getDetachedCriteria());
	}
	
	public AmbienteDetachedCriteria createAmbienteCriteria() {
		return new AmbienteDetachedCriteria(createCriteria("ambiente"));
	}
	
	public DescrizioneColtivazioneDetachedCriteria createDescrizioneCriteria() {
		return new DescrizioneColtivazioneDetachedCriteria(createCriteria("descrizione"));
	}
	
	public AreaColtivataDetachedCriteria createAreaCriteria() {
		return new AreaColtivataDetachedCriteria(createCriteria("area"));
	}
	
	public com.tdd.greenhouse.model.ImpiegatoDetachedCriteria createImpiegatiCriteria() {
		return new com.tdd.greenhouse.model.ImpiegatoDetachedCriteria(createCriteria("ORM_Impiegati"));
	}
	
	public Coltivazione uniqueColtivazione(PersistentSession session) {
		return (Coltivazione) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Coltivazione[] listColtivazione(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Coltivazione[]) list.toArray(new Coltivazione[list.size()]);
	}
}

