package com.opteamix.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opteamix.TelecomServices;

public class TestTelecom {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("operators.xml");
		TelecomServices services = (TelecomServices) applicationContext.getBean("telco1");
		System.out.println("Service Name: "+services.getServiceName());
		System.out.println("List of locations: "+services.getLocations());
		System.out.println("List of URLs: "+services.getUrls());
	}

}
