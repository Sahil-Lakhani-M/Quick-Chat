package com.quickchat.entities;

public class Message {
	private String senderName;
	private String recieverName;
	private String message;
	private String timeStamp;
	private Status status;
	
	public Message() {
		super();
	}

	public Message(String senderName, String recieverName, String message, String timeStamp, Status status) {
		super();
		this.senderName = senderName;
		this.recieverName = recieverName;
		this.message = message;
		this.timeStamp = timeStamp;
		this.status = status;
	}

	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getRecieverName() {
		return recieverName;
	}
	public void setRecieverName(String recieverName) {
		this.recieverName = recieverName;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Message [senderName=" + senderName + ", recieverName=" + recieverName + ", message=" + message
				+ ", timeStamp=" + timeStamp + ", status=" + status + "]";
	}
}
