package com.gmail.peter.mwenda.seventwo.bean.Room;

import com.gmail.peter.mwenda.seventwo.bean.ComonBean;

public class ClientRoom extends ComonBean{
	
	private String clientId;
	private String roomId;
	private String duration;
	private String status;
	private String description;
	

	public ClientRoom() {
		clientId = "";
		roomId = "";
		duration = "";
		status = "";
		description = "";

}


	public String getClientId() {
		return clientId;
	}


	public void setClientId(String clientId) {
		this.clientId = clientId;
	}


	public String getRoomId() {
		return roomId;
	}


	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("ClientRoom [ ");
		builder.append("getUuid() = ");
		builder.append(getUuid());
		builder.append(", clientId = ");
		builder.append(clientId);
		builder.append(", roomId = ");
		builder.append(roomId);
		builder.append(", duration = ");// One night, Two days etc
		builder.append(duration);
		builder.append(", status= ");//Cleared,Pending-yet to pay full amount,Approved-has paid
		builder.append(status);
		builder.append(", description = ");//Two clients-men, Couple etc 
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 8512910364183270175L;
} 
