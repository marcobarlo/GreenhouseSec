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

public class AreaColtivataDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression coltivazioneId;
	public final AssociationExpression coltivazione;
	public final IntegerExpression sezioneId;
	public final AssociationExpression sezione;
	public final IntegerExpression fila;
	public final IntegerExpression posizione;
	public final FloatExpression estensione;
	public final StringExpression tipo_di_terreno;
	
	public AreaColtivataDetachedCriteria() {
		super(com.tdd.greenhouse.model.AreaColtivata.class, com.tdd.greenhouse.model.AreaColtivataCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		coltivazioneId = new IntegerExpression("coltivazione.ID", this.getDetachedCriteria());
		coltivazione = new AssociationExpression("coltivazione", this.getDetachedCriteria());
		sezioneId = new IntegerExpression("sezione.ID", this.getDetachedCriteria());
		sezione = new AssociationExpression("sezione", this.getDetachedCriteria());
		fila = new IntegerExpression("fila", this.getDetachedCriteria());
		posizione = new IntegerExpression("posizione", this.getDetachedCriteria());
		estensione = new FloatExpression("estensione", this.getDetachedCriteria());
		tipo_di_terreno = new StringExpression("tipo_di_terreno", this.getDetachedCriteria());
	}
	
	public AreaColtivataDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.tdd.greenhouse.model.AreaColtivataCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		coltivazioneId = new IntegerExpression("coltivazione.ID", this.getDetachedCriteria());
		coltivazione = new AssociationExpression("coltivazione", this.getDetachedCriteria());
		sezioneId = new IntegerExpression("sezione.ID", this.getDetachedCriteria());
		sezione = new AssociationExpression("sezione", this.getDetachedCriteria());
		fila = new IntegerExpression("fila", this.getDetachedCriteria());
		posizione = new IntegerExpression("posizione", this.getDetachedCriteria());
		estensione = new FloatExpression("estensione", this.getDetachedCriteria());
		tipo_di_terreno = new StringExpression("tipo_di_terreno", this.getDetachedCriteria());
	}
	
	public ColtivazioneDetachedCriteria createColtivazioneCriteria() {
		return new ColtivazioneDetachedCriteria(createCriteria("coltivazione"));
	}
	
	public SezioneDetachedCriteria createSezioneCriteria() {
		return new SezioneDetachedCriteria(createCriteria("sezione"));
	}
	
	public AreaColtivata uniqueAreaColtivata(PersistentSession session) {
		return (AreaColtivata) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public AreaColtivata[] listAreaColtivata(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (AreaColtivata[]) list.toArray(new AreaColtivata[list.size()]);
	}
}

