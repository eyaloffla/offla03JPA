package com.offla.services;

import javax.ejb.Local;


@Local
public interface IAppfr1Service {
	
	boolean isPersonInDB(long id);

}
