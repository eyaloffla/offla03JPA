package com.offla.services;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.offla.entities.IPWhite;

@Stateless
@Local(IIPWhiteListService.class)
public class IPWhiteListBean implements IIPWhiteListService{
	
	
	@PersistenceContext(unitName = "offla02JPA")
	private EntityManager entityManager;
	
	

	@Override
	public boolean isIPAproved(String ip) {
		boolean result = false;
		 
		Query query = entityManager.createQuery("select ip.ip from IPWhite ip where ip.ip=:ip").setParameter("ip", ip);
		List<String> list = query.getResultList();
		if(null != list & list.size()>0){
			result = true;
		}
		return result;
	}

}
