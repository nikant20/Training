package com.opteamix.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opteamix.Person;

public class TestAnnotationConfig {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Person person = (Person) context.getBean("person");//pass the classname first character as lower case. 
		System.out.println("*********Personal Information*********");
		System.out.println("Name: "+person.getName());
		System.out.println("Phone: "+person.getContacts().getPhoneNumber());
		System.out.println("Email: "+person.getContacts().getEmailId());
	}

}
