package com.opteamix;

public class User {
	private int userid;
	private String userName;
	private String password;
	
	public User(int userid, String userName, String password) {
		super();
		this.userid = userid;
		this.userName = userName;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserid() {
		return userid;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
