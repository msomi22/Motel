package com.gmail.murithi.mugambi.dennis.bean.Room;

import com.gmail.murithi.mugambi.dennis.bean.ComonBean;

public class Room extends ComonBean{

	private String roomId;
	private int rentalFee;
	private String roomclass;
	private String status;
	

	public Room() {
		
		roomId = "";
		rentalFee = 0;
		roomclass = "";
		status = "";
		
	}


	public String getRoomId() {
		return roomId;
	}


	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}


	public int getRentalFee() {
		return rentalFee;
	}


	public void setRentalFee(int rentalFee) {
		this.rentalFee = rentalFee;
	}


	public String getRoomclass() {
		return roomclass;
	}


	public void setRoomclass(String roomclass) {
		this.roomclass = roomclass;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("Room [ ");
		builder.append("getUuid() = ");
		builder.append(getUuid());
		builder.append(", roomId = ");// room number, i.e  10,20,30
		builder.append(roomId);
		builder.append(", roomclass = ");//class A (best) etc
		builder.append(roomclass);
		builder.append(", status = ");//Available,Enganged
		builder.append(status);
		builder.append(", rentalFee = ");
		builder.append(rentalFee);
		builder.append("]");
		return builder.toString();
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4471252869494855149L;
}
