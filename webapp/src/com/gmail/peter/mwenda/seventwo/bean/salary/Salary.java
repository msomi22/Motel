package com.gmail.peter.mwenda.seventwo.bean.salary;

import com.gmail.peter.mwenda.seventwo.bean.ComonBean;

public class Salary extends ComonBean{
	
	private String category;
	private String amount;

	public Salary() {
		category = "";
		amount = "";
		
}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("  Salary [ ");
		builder.append("getUuid() = ");
		builder.append(getUuid());
		builder.append(", category = ");// can be hourly,daily,weekly or monthly
		builder.append(category);
		builder.append(", amount = ");
		builder.append(amount);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -7521810492871481245L;
}
