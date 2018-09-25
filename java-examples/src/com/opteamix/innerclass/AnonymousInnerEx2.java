package com.opteamix.innerclass;

public class AnonymousInnerEx2 {

	public static void main(String[] args) {
		Hello h = new Hello(){
			public String sayHello(String s) {
				return "Hello "+s;
			}
		};
		System.out.println(h.sayHello("Nikant"));
	}

}
interface Hello{
	String sayHello(String s);
}
