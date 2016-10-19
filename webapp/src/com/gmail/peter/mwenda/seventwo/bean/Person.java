package com.gmail.peter.mwenda.seventwo.bean;

public class Person extends ComonBean{

	
	private String idNumber;
	private String name;
	private String phoneNumber;
	private String email;
	private String status;

	public Person() {
		idNumber = "";
		name = "";
		phoneNumber = "";
		email = "";
		status = "";

	}

	public String getIdNumber(){
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -3657847314548705515L;
}
