package com.opteamix.innerclass;

public class StaticBlockExample2 {
	public static void main(String[] args) {
		new Sub();
		new Sub();
	}
	
}
class Super{
	static {
		System.out.println("I am static of super");
	}
	{
		System.out.println("I am instance of super");
	}
}
class Sub extends Super{
	static {
		System.out.println("I am static of sub");
	}
	{
		System.out.println("I am instance of sub");
	}
}
