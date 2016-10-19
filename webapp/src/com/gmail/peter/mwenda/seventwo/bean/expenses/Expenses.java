package com.gmail.peter.mwenda.seventwo.bean.expenses;

import java.util.Date;

import com.gmail.peter.mwenda.seventwo.bean.ComonBean;

public class Expenses extends ComonBean {
	
	
	private String day;
	private String week;
	private String month;
	private String year;
	private Date  date;
	private String amount;
	private String description;
	
	public Expenses() {
		day= "";
		week= "";
		month= "";
		year= "";
		date= new Date();
		amount= "";
		description= "";

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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date; 
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("  Expenses [ ");
		builder.append("getUuid() = ");
		builder.append(getUuid());
		builder.append(", day = ");
		builder.append(day);
		builder.append(", week = ");
		builder.append(week);
		builder.append(", month = ");
		builder.append(month);
		builder.append(", year = ");
		builder.append(year);
		builder.append(", date = ");
		builder.append(date);
		builder.append(", amount = ");
		builder.append(amount);
		builder.append(", description = ");
		builder.append(description);
		builder.append("]");
		return builder.toString();
}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
