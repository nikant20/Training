package com.opteamix;

public class Aadhar implements ID{
	
	private long aadharNo= 987634567864L;
	private String name = "Nikant";
	private String state = "Bihar";
	private String city = "Sitamarhi";
	
	public Aadhar() {
		System.out.println("Aadhar created");
		
	}
	
	@Override
	public void display() {
		System.out.println("Aadhar No: "+aadharNo+", Name: "+name+", State: "+state+", City: "+city);
	}

}
