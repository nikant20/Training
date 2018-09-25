package com.opteamix.innerclass;

public class InstanceBlockEx2 {
	public static void main(String[] args) {
		new Derive();
	}
}
class Base{
	{
		System.out.println("A");
	}
	public Base() {
		System.out.println("X");
	}
}
class Derive extends Base{
	{
		System.out.println("B");
	}
	public Derive() {
		System.out.println("Y");
	}
}