package com.offla.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.offla.entities.CellarixTxn;

@Stateless
public class CellarixTxnBean implements ICellarixTxnLocal, ICellarixTxnRemote{
	
	@PersistenceContext(unitName = "offla02JPA")
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<CellarixTxn> getAllCellarixTxn(){
		
		String q = "SELECT c from " + CellarixTxn.class.getName() + " c";
		Query query = entityManager.createQuery(q);
		List<CellarixTxn> projects = query.getResultList();
		return projects;
	}
	
    @Override
	public String message(){
		return "Hello from JPA";
	}
}
