package com.opteamix;

public class PAN implements ID {
	
	private String panNo="ASCN198J";
	private String name = "Nikant";
	
	@Override
	public void display() {
		System.out.println("Pan NO:"+panNo+", Name: "+name);
	}
}
