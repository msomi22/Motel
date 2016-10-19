package com.gmail.murithi.mugambi.dennis.bean.Sales;
import java.util.Date;

import com.gmail.murithi.mugambi.dennis.bean.ComonBean;

public class Sales extends ComonBean {

	private String transactionid;
	private String mealId;
	private int  quantity;
	private String day;
	private String week;
	private String month;
	private String year;
	private Date  Date;


	public Sales() {

		transactionid= "";
		mealId = "";
		quantity= 0;
		day= "";
		week= "";
		month= "";
		year= "";
		Date= new Date();
	}


	public String getMealId() {
		return mealId;
	}


	public void setMealId(String mealId) {
		this.mealId = mealId;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getTransactionid() {
		return transactionid;
	}


	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
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
		return Date;
	}


	public void setDate(Date date) {
		Date = date;
	}
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("Sales [");
		builder.append("getUuid() = ");
		builder.append(getUuid());
		builder.append(", transactionid =");//from orders,payment via m-pesa, banks etc 
		builder.append(transactionid);
		builder.append(", mealId =");
		builder.append(mealId);
		builder.append(", quantity =");
		builder.append(quantity);
		builder.append(", day =");
		builder.append(day);
		builder.append(", week =");
		builder.append(week);
		builder.append(", month = ");
		builder.append(month);
		builder.append(", year =");
		builder.append(year);
		builder.append(", Date =");
		builder.append(Date);
		builder.append("]");
		return builder.toString();
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -2487608160056191965L;
}
