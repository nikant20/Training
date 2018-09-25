package com.opteamix.innerclass;

public class StaticBlockEx1 {
	static {
		System.out.println("I am static Block 1");
	}
	public static void main(String[] args) {
		System.out.println("I am main method");
	}
	static {
		System.out.println("I am static Block 2");
	}
	{
		System.out.println("Instance Block");//it will not be invoked since no object is created.
	}
}
