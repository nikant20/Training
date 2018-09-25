package com.opteamix;

public class Customer extends User {
	private String account;
	private String ifsc;
	public Customer(int userid, String userName, String password, String account, String ifsc) {
		super(userid, userName, password);
		this.account = account;
		this.ifsc = ifsc;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	
}
