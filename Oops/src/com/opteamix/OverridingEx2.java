package com.opteamix;

public class OverridingEx2 {

	public static void main(String[] args) {
        new Child();
	}

}
class Parent{
	
	public Parent() {
		f1();
	}
	void f1() {
		System.out.println("I am parent f1 method()");
	}
	
}
class Child extends Parent{
	void f1() {
		System.out.println("I am child f1 method()");
	}
}
