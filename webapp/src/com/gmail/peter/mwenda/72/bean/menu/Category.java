/**
 * 
 */
package com.gmail.murithi.mugambi.dennis.bean.menu;

import com.gmail.murithi.mugambi.dennis.bean.ComonBean;

/**
 * @author peter
 *
 */
public class Category extends ComonBean{
	
	private String category;
	private String description;

	/**
	 * 
	 */
	public Category() {
		
		category ="";	
		description ="";
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
public String toString(){
	StringBuilder builder = new StringBuilder();
	builder.append("Category [ ");
	builder.append("getUuid()");
	builder.append(getUuid());
	builder.append(", category =");
	builder.append(category);
	builder.append(", description =");
	builder.append(description);
	builder.append("]");
	return builder.toString();
}

/**
 * 
 */
private static final long serialVersionUID = -2631010580257148587L;
}
