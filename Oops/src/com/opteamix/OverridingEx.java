package com.opteamix;

public class OverridingEx {

	public static void main(String[] args) {
		Base base = new Drive();
		base.f1();
		base.f2();

	}
	
}

class Base{
	static void f1() {
		System.out.println("I am coming from base f1");
	}
	void f2() {
		System.out.println("I am coming from base f2");
	}
	
}


class Drive extends Base{
	
	static void f1() {
		System.out.println("I am coming from derive f1");
	}
	void f2() {
		System.out.println("I am coming from derive f2");
	}
	
}