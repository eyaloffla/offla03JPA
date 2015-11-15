package com.offla.services;

import java.util.List;

import javax.ejb.Remote;

import com.offla.entities.CellarixTxn;

@Remote
public interface ICellarixTxnRemote {
	
	String message();
	
	List<CellarixTxn> getAllCellarixTxn();

}
