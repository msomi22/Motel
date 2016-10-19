package com.gmail.murithi.mugambi.dennis.bean.users;

import com.gmail.murithi.mugambi.dennis.bean.ComonBean;

public class Users extends ComonBean {

	private String employeeId;
	private String userName;
	private String password;

	public Users() {

		employeeId= "";
		userName= "";
		password= "";	

	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("Users [ ");
		builder.append("getUuid() = ");
		builder.append(getUuid());
		builder.append(", employeeId = ");
		builder.append(employeeId);
		builder.append(", userName = ");
		builder.append(userName);
		builder.append(", password = ");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -4431465519466618021L;
}

