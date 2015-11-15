package com.offla.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity implementation class for Entity: GoogleIds
 *
 */
@Entity
@XmlRootElement  
@Table(name="Google_Ids")
public class GoogleIds implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public GoogleIds() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	private String androidDeviceKey;


	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column
	public String getAndroidDeviceKey() {
		return androidDeviceKey;
	}
	public void setAndroidDeviceKey(String androidDeviceKey) {
		this.androidDeviceKey = androidDeviceKey;
	}
	
	
   
}
