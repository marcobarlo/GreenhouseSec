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

public class DescrizioneColtivazioneCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression tipo;
	public final StringExpression descrizione;
	public final CollectionExpression coltivazioni;
	
	public DescrizioneColtivazioneCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		tipo = new StringExpression("tipo", this);
		descrizione = new StringExpression("descrizione", this);
		coltivazioni = new CollectionExpression("ORM_Coltivazioni", this);
	}
	
	public DescrizioneColtivazioneCriteria(PersistentSession session) {
		this(session.createCriteria(DescrizioneColtivazione.class));
	}
	
	public DescrizioneColtivazioneCriteria() throws PersistentException {
		this(com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession());
	}
	
	public com.tdd.greenhouse.model.ColtivazioneCriteria createColtivazioniCriteria() {
		return new com.tdd.greenhouse.model.ColtivazioneCriteria(createCriteria("ORM_Coltivazioni"));
	}
	
	public DescrizioneColtivazione uniqueDescrizioneColtivazione() {
		return (DescrizioneColtivazione) super.uniqueResult();
	}
	
	public DescrizioneColtivazione[] listDescrizioneColtivazione() {
		java.util.List list = super.list();
		return (DescrizioneColtivazione[]) list.toArray(new DescrizioneColtivazione[list.size()]);
	}
}

