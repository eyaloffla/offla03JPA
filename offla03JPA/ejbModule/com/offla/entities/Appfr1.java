package com.offla.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="\"appfr1\"")
public class Appfr1 implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	private Long lkp;

	public Long getLkp() {
		return lkp;
	}

	public void setLkp(Long lkp) {
		this.lkp = lkp;
	}
	

	

}
