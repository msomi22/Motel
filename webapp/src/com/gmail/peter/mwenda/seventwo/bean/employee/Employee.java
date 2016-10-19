package com.gmail.peter.mwenda.seventwo.bean.employee;
import java.util.Date;

import com.gmail.peter.mwenda.seventwo.bean.Person;

/**
 * 
 */

/**
 * @author peter
 *
 */
public class Employee extends Person {
	
	
	private String status;
	private  String employeeNumber;  
	private  String salaryid;
	private Date  registrationDate;

	public Employee(){
		status = "";
		employeeNumber = "";
		salaryid = "";
		registrationDate = new Date();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}


	public String getSalaryid() {
		return salaryid;
	}

	public void setSalaryid(String salaryid) {
		this.salaryid = salaryid;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [");
		builder.append("getUuid() = ");
		builder.append(getUuid());
		builder.append(", status = ");
		builder.append(status);
		builder.append(", employeeNumber = ");
		builder.append(employeeNumber);
		builder.append(", getIdNumber() = ");
		builder.append(getIdNumber());
		builder.append(", getName() = ");
		builder.append(getName());
		builder.append(", getPhoneNumber() = ");
		builder.append(getPhoneNumber());
		builder.append(", getEmail() = ");
		builder.append(getEmail());
		builder.append(", salaryid = ");
		builder.append(salaryid);
		builder.append(", registrationDate = ");   
		builder.append(registrationDate);
		builder.append("]");
		return builder.toString(); 
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 6497861403112172846L;
}
