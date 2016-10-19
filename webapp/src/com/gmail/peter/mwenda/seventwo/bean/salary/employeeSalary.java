package com.gmail.peter.mwenda.seventwo.bean.salary;

import java.util.Date;

import com.gmail.peter.mwenda.seventwo.bean.ComonBean;

public class employeeSalary extends ComonBean{

	private String employeeId;
	private String day;
	private String week;
	private String month;
	private String year;
	private Date datePaid;

	public employeeSalary() {
		employeeId = "";
		day = "";
		week = "";
		month = "";
		year = "";
		datePaid = new Date();
	}


	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		this.day = day;
	}


	public String getWeek() {
		return week;
	}


	public void setWeek(String week) {
		this.week = week;
	}


	public String getMonth() {
		return month;
	}


	public void setMonth(String month) {
		this.month = month;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public Date getDatePaid() {
		return datePaid;
	}


	public void setDatePaid(Date datePaid) {
		this.datePaid = datePaid;
	}


	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("  employeeSalary [ ");
		builder.append("getUuid() = ");
		builder.append(getUuid());
		builder.append(", employeeId = ");
		builder.append(employeeId);
		builder.append(", day = ");
		builder.append(day);
		builder.append(", week = ");
		builder.append(week);
		builder.append(", month = ");
		builder.append(month);
		builder.append(", year = ");
		builder.append(year);
		builder.append(", datePaid = ");
		builder.append(datePaid);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1271429550937953519L;
}
