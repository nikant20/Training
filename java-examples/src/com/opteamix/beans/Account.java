package com.opteamix.beans;

public class Account {
	private long accountNumber;
	private double balance;
	
	
	private static long accountNumberGenerator = 50000;

	public Account(double balance) {
		super();
		this.accountNumber = accountNumberGenerator++;
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
}
