package com.offla.services;


import javax.ejb.Local;


@Local
public interface IIPWhiteListService {
	
	boolean isIPAproved(String ip);

}
