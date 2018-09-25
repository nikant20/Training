package com.opteamix.test;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opteamix.entity.Cities;
import com.opteamix.entity.States;

public class TestMappingStore {

	public static void main(String[] args) {
		List<Cities> karnatakaCities = Arrays.asList(
				new Cities("BLR", "Banglore"),
				new Cities("MYS", "Mysore"),
				new Cities("BLG", "Belgaum")
				);
		
		List<Cities> maharastraCities = Arrays.asList(
				new Cities("MUM", "Mumbai"),
				new Cities("PUN", "Pune"),
				new Cities("NGP", "Nagpur")
				);
		
		//Create 2 States and add list of cities belonging to each state
		
		States karnatatka = new States("KA", "Karnataka");
		karnatatka.setCitiesList(karnatakaCities);
		
		States maharastra = new States("MH", "Maharsatra");
		maharastra.setCitiesList(maharastraCities);
		
		//Create Hibernate session and transaction
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(karnatatka);
		session.save(maharastra);
		
		tx.commit();
		session.close();
		factory.close();

	}

}