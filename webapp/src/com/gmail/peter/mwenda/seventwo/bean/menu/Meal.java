/**
 * 
 */
package com.gmail.peter.mwenda.seventwo.bean.menu;

import com.gmail.peter.mwenda.seventwo.bean.ComonBean;

/**
 * @author peter
 *
 */
public class Meal extends ComonBean{


	private String categoryId;
	private String description;
	private int unitPrice;

	/**
	 * 
	 */
	public Meal() {

		categoryId	= "";
		description	= "";
		unitPrice	= 0;

	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("Meal [");
		builder.append("getUuid()");
		builder.append(getUuid());
		builder.append(", categoryId =");
		builder.append(categoryId);
		builder.append(", description =");
		builder.append(description);
		builder.append(", unitPrice =");
		builder.append(unitPrice);
		builder.append("]");
		return builder.toString();   
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 2515273481484799131L;
}
