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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AreaColtivataCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression coltivazioneId;
	public final AssociationExpression coltivazione;
	public final IntegerExpression sezioneId;
	public final AssociationExpression sezione;
	public final IntegerExpression fila;
	public final IntegerExpression posizione;
	public final FloatExpression estensione;
	public final StringExpression tipo_di_terreno;
	
	public AreaColtivataCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		coltivazioneId = new IntegerExpression("coltivazione.ID", this);
		coltivazione = new AssociationExpression("coltivazione", this);
		sezioneId = new IntegerExpression("sezione.ID", this);
		sezione = new AssociationExpression("sezione", this);
		fila = new IntegerExpression("fila", this);
		posizione = new IntegerExpression("posizione", this);
		estensione = new FloatExpression("estensione", this);
		tipo_di_terreno = new StringExpression("tipo_di_terreno", this);
	}
	
	public AreaColtivataCriteria(PersistentSession session) {
		this(session.createCriteria(AreaColtivata.class));
	}
	
	public AreaColtivataCriteria() throws PersistentException {
		this(com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession());
	}
	
	public ColtivazioneCriteria createColtivazioneCriteria() {
		return new ColtivazioneCriteria(createCriteria("coltivazione"));
	}
	
	public SezioneCriteria createSezioneCriteria() {
		return new SezioneCriteria(createCriteria("sezione"));
	}
	
	public AreaColtivata uniqueAreaColtivata() {
		return (AreaColtivata) super.uniqueResult();
	}
	
	public AreaColtivata[] listAreaColtivata() {
		java.util.List list = super.list();
		return (AreaColtivata[]) list.toArray(new AreaColtivata[list.size()]);
	}
}

