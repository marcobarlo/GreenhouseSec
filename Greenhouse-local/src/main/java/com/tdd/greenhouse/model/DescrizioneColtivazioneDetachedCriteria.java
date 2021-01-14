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

public class DescrizioneColtivazioneDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression tipo;
	public final StringExpression descrizione;
	public final CollectionExpression coltivazioni;
	
	public DescrizioneColtivazioneDetachedCriteria() {
		super(com.tdd.greenhouse.model.DescrizioneColtivazione.class, com.tdd.greenhouse.model.DescrizioneColtivazioneCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		descrizione = new StringExpression("descrizione", this.getDetachedCriteria());
		coltivazioni = new CollectionExpression("ORM_Coltivazioni", this.getDetachedCriteria());
	}
	
	public DescrizioneColtivazioneDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.tdd.greenhouse.model.DescrizioneColtivazioneCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		descrizione = new StringExpression("descrizione", this.getDetachedCriteria());
		coltivazioni = new CollectionExpression("ORM_Coltivazioni", this.getDetachedCriteria());
	}
	
	public com.tdd.greenhouse.model.ColtivazioneDetachedCriteria createColtivazioniCriteria() {
		return new com.tdd.greenhouse.model.ColtivazioneDetachedCriteria(createCriteria("ORM_Coltivazioni"));
	}
	
	public DescrizioneColtivazione uniqueDescrizioneColtivazione(PersistentSession session) {
		return (DescrizioneColtivazione) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public DescrizioneColtivazione[] listDescrizioneColtivazione(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (DescrizioneColtivazione[]) list.toArray(new DescrizioneColtivazione[list.size()]);
	}
}

