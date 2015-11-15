package com.offla.services;


import java.util.List;

import javax.ejb.Local;
import com.offla.entities.GoogleIds;


@Local
public interface IGoogleService {
	
	GoogleIds create(GoogleIds t);
	List<GoogleIds> getAllGoogleIds();
	
   /* T read(PK id);
    T update(T t);
    void delete(T t);
    */
}
