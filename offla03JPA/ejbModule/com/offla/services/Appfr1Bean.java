package com.offla.services;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.offla.entities.Appfr1;

@Stateless
@Local(IAppfr1Service.class)
public class Appfr1Bean implements IAppfr1Service{
	
	@PersistenceContext(unitName = "offla02JPA")
	private EntityManager entityManager;



	@Override
	public boolean isPersonInDB(Integer id) {
		boolean result = false;
		Appfr1 a = getAppfr1ById(id);
		if(a != null){
			result = true;
		}
		
		return result;
	}
	
    private Appfr1 getAppfr1ById(Integer id) {
		
		return entityManager.find(Appfr1.class, id);
	}

}
