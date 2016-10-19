/**
 * 
 */
package com.gmail.peter.mwenda.seventwo.bean.client;

import java.util.Date;

import com.gmail.peter.mwenda.seventwo.bean.ComonBean;

/**
 * @author peter
 *
 */
public class ClientOrder extends ComonBean{

	private String clentId;
	private int orderNumber;
	private String deliveryPlace;
	private String deliveryTime;
	private Date deliveryDate;
	private String orderStatus; 

	/**
	 * 
	 */
	public ClientOrder() {
		clentId = "";
		orderNumber = 0;
		deliveryPlace = "";
		deliveryTime = "";
		deliveryDate = new Date();
		orderStatus = "";
	}
	
	public String getClentId() {
		return clentId;
	}

	public void setClentId(String clentId) {
		this.clentId = clentId;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getDeliveryPlace() {
		return deliveryPlace;
	}

	public void setDeliveryPlace(String deliveryPlace) {
		this.deliveryPlace = deliveryPlace;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("Order [ =");
		builder.append("getUuid() =");
		builder.append(getUuid());
		builder.append(", clentId =");
		builder.append(clentId);
		builder.append(", orderNumber =");
		builder.append(orderNumber);
		builder.append(", deliveryPlace =");
		builder.append(deliveryPlace);
		builder.append(", deliveryTime =");
		builder.append(deliveryTime);
		builder.append(", deliveryDate =");
		builder.append(deliveryDate);
		builder.append(", orderStatus =");
		builder.append(orderStatus);
		builder.append("]");
		return builder.toString();
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1678573868202534395L;
}
