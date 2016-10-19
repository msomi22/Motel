package com.gmail.murithi.mugambi.dennis.bean;

import java.io.Serializable;
import java.util.UUID;

public class ComonBean implements Serializable {
	
	
	private String uuid;

	public ComonBean() {
		uuid = UUID.randomUUID().toString();		
		}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 642078558468816781L;
}
