package com.opteamix.test;

import java.util.Scanner;

import com.opteamix.beans.Account;
import com.opteamix.beans.Customer;

public class TestBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many customers you need to store: ");
		int size = sc.nextInt();
		Customer[] customers = new Customer[size];
		System.out.println("Bank official enter customer details: ");
		for(int i = 0 ; i < size ; i++) {
			System.out.println("Enter Name: ");
			String name = sc.next();
			System.out.println("Enter amount to deposit");
			double amount = sc.nextDouble();
			customers[i] = new Customer(name, amount);
			System.out.println("-------------------------");
		}
		System.out.println("**********************************");
		for (Customer customer : customers) {
			System.out.println("********Customer Details**********");
			System.out.println("Customer Id = "+customer.getCustomerId());
			System.out.println("Name: "+customer.getName());
			Account ac = customer.getAccount();
			System.out.println("Account no: "+ac.getAccountNumber());
			System.out.println("Balance: "+ac.getBalance());
			System.out.println("----------------------");
		}
		
		sc.close();
	}
	

}
