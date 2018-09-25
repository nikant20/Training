package com.opteamix;

public class Customer {
	private int Customerid; //pass value from container
	private String customerName;//pass value from container
	
	private Address addr;//pass object from container

	public int getCustomerid() {
		return Customerid;
	}

	public void setCustomerid(int customerid) {
		Customerid = customerid;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
}
