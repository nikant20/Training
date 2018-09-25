package com.opteamix.innerclass;

public class InstanceBlockEx1 {

	public static void main(String[] args) {
		new Customer();
		System.out.println("-------------------------");
		new Customer("Hello");
	}
}

class Customer{
	{
		System.out.println("Instance Block");
	}
	public Customer() {
		System.out.println("Customer default constructor");
	}
	public Customer(String n){
		System.out.println("Parametrized Constructor");
	}
}
