package com.opteamix.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opteamix.Customer;

public class TestDependencyInjection {
	public static void main(String[] args) {
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("springs.xml");
		Customer customer = (Customer)applicationContext.getBean("cust1");
		System.out.println("Name: "+customer.getCustomerName());
		System.out.println("State: "+customer.getAddr().getState());
		System.out.println("City: "+customer.getAddr().getCity());
		System.out.println("***This is setter/property injection****");
	}
}
