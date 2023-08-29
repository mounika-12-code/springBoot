package com.example.project.model;

public class Contact {
	 private String name;
	    private String mobileNum;
	    private String email;
	    private String subject;
	    private String message;
	
	public String getName() {
		return name;
	}
	public String getModileNum() {
		return mobileNum;
	}
	public String getEmail() {
		return email;
	}
	public String getSubject() {
		return subject;
	}
	public String getMessage() {
		return message;
	}
	@Override
	public String toString() {
		return "Contact [modileNum=" + mobileNum + ", email=" + email + ", subject=" + subject + ", message=" + message
				+ ", name=" + name + "]";
	}
}
	
	
	


