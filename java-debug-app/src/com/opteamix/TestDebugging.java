package com.opteamix;

public class TestDebugging {

	public static void main(String[] args) {
		System.out.println("Main starts");
		test();
		System.out.println("Main ends ");
		System.out.println("Thank you");

	}
	
	public static void test() {
		int a = 10;
		for(int i = 1; i<=15 ; i++) {
			System.out.println("i = "+i);
		}
	}

}
