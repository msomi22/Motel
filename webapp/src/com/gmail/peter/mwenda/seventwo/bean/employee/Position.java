/**
 * 
 */
package com.gmail.peter.mwenda.seventwo.bean.employee;

import com.gmail.peter.mwenda.seventwo.bean.ComonBean;

/**
 * @author peter
 *
 */
public class Position extends ComonBean {

	private String position;

	/**
	 * 
	 */
	public Position() { 

		position = "";	

	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	public String toString(){
		StringBuilder builder= new StringBuilder();
		builder.append("position [");
		builder.append("getUuid() = ");
		builder.append(getUuid());
		builder.append(", position = ");
		builder.append(position);
		builder.append("]");

		return builder.toString();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -6963232820940451950L;
}
