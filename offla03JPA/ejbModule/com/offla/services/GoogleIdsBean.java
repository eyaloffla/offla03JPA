package com.offla.services;



import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.offla.entities.CellarixTxn;
import com.offla.entities.GoogleIds;



@Stateless
@Local(IGoogleService.class)
public class GoogleIdsBean implements IGoogleService {
	
	
	
	@PersistenceContext(unitName = "offla02JPA")
	private EntityManager entityManager;

	
	
	@Override
    public GoogleIds create(GoogleIds g) {
        this.entityManager.persist(g);
        return g;
    }
	
	@SuppressWarnings("unchecked")
	public List<GoogleIds> getAllGoogleIds(){
		
		String q = "SELECT g from " + GoogleIds.class.getName() + " g";
		Query query = entityManager.createQuery(q);
		List<GoogleIds> googleTokens = query.getResultList();
		return googleTokens;
	}
	
	
//
//    @Override
//    public T read(PK id) {
//        return this.entityManager.find(entityClass, id);
//    }
//
//    @Override
//    public T update(T t) {
//        return this.entityManager.merge(t);
//    }
//
//    @Override
//    public void delete(T t) {
//        t = this.entityManager.merge(t);
//        this.entityManager.remove(t);
//    }
    
   
}
