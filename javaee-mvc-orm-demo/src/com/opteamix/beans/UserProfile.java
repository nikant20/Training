package com.opteamix.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserProfile {
	@Id
	@Column(length=20)
	private String userName;
	@Column(length=20)
	private String password;
	@Column(length=5)
	private String gender;
	@Column(length=10)
	private String phone;
	public UserProfile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserProfile(String userName, String password, String gender, String phone) {
		super();
		this.userName = userName;
		this.password = password;
		this.gender = gender;
		this.phone = phone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
