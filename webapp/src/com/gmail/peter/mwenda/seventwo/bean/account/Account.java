/**
 * 
 */
package com.gmail.peter.mwenda.seventwo.bean.account;

import com.gmail.peter.mwenda.seventwo.bean.ComonBean;

/**
 * @author peter
 *
 */
public class Account extends ComonBean{

	private String motelname;
	private String mobile;
	private String email;
	private String address;
	private String town;

	/**
	 * 
	 */
	public Account() {
		motelname = "";
		mobile = "";
		email = "";
		address = "";
		town = "";
	}
	
	public String getMotelname() {
		return motelname;
	}

	public void setMotelname(String motelname) {
		this.motelname = motelname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String toString(){
		StringBuilder builder= new StringBuilder();
		builder.append("Account [");
		builder.append("getUuid() = ");
		builder.append(getUuid());
		builder.append(", motelname = ");
		builder.append(motelname);
		builder.append(", mobile = ");
		builder.append(mobile);
		builder.append(", email = ");
		builder.append(email);
		builder.append(", address = ");
		builder.append(address);
		builder.append(", town = ");
		builder.append(town);
		builder.append("]");

		return builder.toString();
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -7259129981182406658L;
}
