package com.opteamix.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opteamix.entity.Employee;
import com.opteamix.entity.Manager;
import com.opteamix.entity.Programmer;

public class TestInheritanceMapping {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Programmer p1 = new Programmer(1, "Alex", "Java");
		Manager m1 = new Manager(2,"Bob",20);
		session.save(p1);
		session.save(m1);
		tx.commit();
		
		System.out.println("****Getting Objects*******");
		Criteria crt = session.createCriteria(Employee.class);
		List<Employee> empList = crt.list();
		
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		
		session.close();
		factory.close();
	}
}
