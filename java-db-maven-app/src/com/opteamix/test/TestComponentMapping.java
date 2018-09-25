package com.opteamix.test;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opteamix.entity.Contact;
import com.opteamix.entity.Customer;

public class TestComponentMapping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Phone Number: ");
		System.out.println("Enter email id: ");
		System.out.println("Enter Name: ");
		
		Contact c = new Contact(sc.next(),sc.next());
		
		Customer customer = new Customer(1, sc.next(), c);
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		session.save(customer);
		
		
		tx.commit();
		session.close();
		factory.close();
		sc.close();

	}

}
