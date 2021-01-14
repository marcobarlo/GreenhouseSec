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

public class ImpiegatoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression email;
	public final StringExpression password;
	public final StringExpression ruolo;
	
	public ImpiegatoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		email = new StringExpression("email", this);
		password = new StringExpression("password", this);
		ruolo = new StringExpression("ruolo", this);
	}
	
	public ImpiegatoCriteria(PersistentSession session) {
		this(session.createCriteria(Impiegato.class));
	}
	
	public ImpiegatoCriteria() throws PersistentException {
		this(com.tdd.greenhouse.model.GreenhousePersistentManager.instance().getSession());
	}
	
	public Impiegato uniqueImpiegato() {
		return (Impiegato) super.uniqueResult();
	}
	
	public Impiegato[] listImpiegato() {
		java.util.List list = super.list();
		return (Impiegato[]) list.toArray(new Impiegato[list.size()]);
	}
}

