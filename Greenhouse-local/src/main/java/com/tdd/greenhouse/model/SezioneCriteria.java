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

public class SezioneCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression aree;
	
	public SezioneCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		aree = new CollectionExpression("ORM_Aree", this);
	}
	
	public SezioneCriteria(PersistentSession session) {
		this(session.createCriteria(Sezione.class));
	}
	
	public SezioneCriteria() throws PersistentException {
		this(com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession());
	}
	
	public com.tdd.greenhouse.model.AreaColtivataCriteria createAreeCriteria() {
		return new com.tdd.greenhouse.model.AreaColtivataCriteria(createCriteria("ORM_Aree"));
	}
	
	public Sezione uniqueSezione() {
		return (Sezione) super.uniqueResult();
	}
	
	public Sezione[] listSezione() {
		java.util.List list = super.list();
		return (Sezione[]) list.toArray(new Sezione[list.size()]);
	}
}

