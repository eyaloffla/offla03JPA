package com.offla.services;

import java.util.List;

import javax.ejb.Local;

import com.offla.entities.CellarixTxn;

@Local
public interface ICellarixTxnLocal {
	
	String message();
	
	List<CellarixTxn> getAllCellarixTxn();

}
