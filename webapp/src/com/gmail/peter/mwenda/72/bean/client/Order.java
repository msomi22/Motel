/**
 * 
 */
package com.gmail.murithi.mugambi.dennis.bean.client;

import com.gmail.murithi.mugambi.dennis.bean.ComonBean;

/**
 * 
 * @author peter
 *
 */
public class Order extends ComonBean{

	private int clientorderId;
	private String item;
	private int quantity;
	private int price;

	/**
	 * 
	 */
	public Order() {
		clientorderId = 0;
		item = "";
		quantity = 0;
		price = 0;
	}
	
	

	public int getClientorderId() {
		return clientorderId;
	}



	public void setClientorderId(int clientorderId) {
		this.clientorderId = clientorderId;
	}



	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("Order [ =");
		builder.append("getUuid() =");
		builder.append(getUuid());
		builder.append(", clientorderId =");
		builder.append(clientorderId);
		builder.append(", item =");
		builder.append(item);
		builder.append(", quantity =");
		builder.append(quantity);
		builder.append(", price =");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1678573868202534395L;
}
