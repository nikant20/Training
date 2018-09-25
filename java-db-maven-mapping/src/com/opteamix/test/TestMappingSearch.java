package com.opteamix.test;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.opteamix.entity.States;

public class TestMappingSearch {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter State Id");
		String stateId = sc.next();
		States state = session.get(States.class, stateId);
		System.out.println(state);
		System.out.println(state.getCitiesList());
		session.close();
		factory.close();
		sc.close();
	}

}
