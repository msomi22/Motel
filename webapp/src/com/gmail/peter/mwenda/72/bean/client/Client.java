package com.gmail.murithi.mugambi.dennis.bean.client;

import com.gmail.murithi.mugambi.dennis.bean.Person;
/**
 * 
 * @author peter
 *
 */
public class Client extends Person {
	
	
	private String county;

	public Client() {
		county = "";
	}

	/**
	 * @return
	 */
	public String getCounty() {
		return county;
	}

	/**
	 * @param county 
	 */
	public void setCounty(String county) {
		this.county = county;
	}
	
	/** 
	 * @see java.lang.Object#toString()
	 */
	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("Client [");
		builder.append("getUuid() = ");
		builder.append(getUuid());
		builder.append(", getName() = ");
		builder.append(getName());
		builder.append(", getIdNumber() = ");//National ID Number,Passport Number
		builder.append(getIdNumber());
		builder.append(", county = ");
		builder.append(county);
		builder.append(", getPhoneNumber() = ");
		builder.append(getPhoneNumber());
		builder.append(", getEmail() = ");
		builder.append(getEmail());
		builder.append("]");
		return builder.toString(); 
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 6800668284430384168L;
}
