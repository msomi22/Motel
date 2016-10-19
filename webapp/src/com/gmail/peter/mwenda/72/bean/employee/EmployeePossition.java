package com.gmail.murithi.mugambi.dennis.bean.employee;

import com.gmail.murithi.mugambi.dennis.bean.ComonBean;

public class EmployeePossition extends ComonBean {
	
	private String possitionId;
	private String employeeId;



	public EmployeePossition() {
		
		possitionId = "";
		employeeId = "";

	}


	public String getPossitionId() {
		return possitionId;
	}


	public void setPossitionId(String possitionId) {
		this.possitionId = possitionId;
	}

	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeePossition [");
		builder.append("getUuid() = ");
		builder.append(getUuid());
		builder.append(", possitionId = ");
		builder.append(possitionId);
		builder.append(", employeeId = ");
		builder.append(employeeId);
		builder.append("]");
		return builder.toString(); 
}

	/**
	 * 
	 */
	private static final long serialVersionUID = 5036118479163396358L;
}
