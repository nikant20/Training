package com.opteamix.beans;

public class Customer {
	private int customerId;
	private String name;
	private Account account;
	
	private static int customerIdGenerator = 1000;
	
	public Customer(String name, double balance) {
		this.customerId =customerIdGenerator++;
		this.name = name;
		this.account = new Account(balance);
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}
