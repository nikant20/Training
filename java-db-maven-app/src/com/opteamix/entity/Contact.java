package com.opteamix.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Contact {
	
	@Column(length=10)
	private String phoneNo;
	
	@Column(length=25)
	private String emailId;
	public Contact() {
		super();
	}
	public Contact(String phoneNo, String emailId) {
		super();
		this.phoneNo = phoneNo;
		this.emailId = emailId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Contact [phoneNo=" + phoneNo + ", emailId=" + emailId + "]";
	}
	
}
