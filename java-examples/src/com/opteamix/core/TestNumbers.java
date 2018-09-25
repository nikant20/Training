package com.opteamix.core;

public class TestNumbers {

	public static void main(String[] args) {
		double randomNumber = 0.0;
		int otp = 0;
		String randomString = null;
		do {
			randomNumber = Math.random();
			otp = new Double(randomNumber*10000).intValue();
			randomString = String.valueOf(otp);
			
			System.out.println("Inside Loop: "+randomNumber);
			System.out.println("Inside Loop: "+otp);
			
		} while (randomString.length() !=4);
		System.out.println("Outside Loop: "+randomNumber);
		System.out.println("Outside Loop: "+otp);
	}

}
