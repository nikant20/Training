package com.opteamix.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opteamix.entity.Student;

public class TestCRUD {
	public static void main(String[] args) {
		//Creating configuration File
		Configuration cfg = new Configuration();
		cfg.configure(); //By default it looks for hibernate.cfg.xml
		// Creating the SessionFactory
		SessionFactory factory = cfg.buildSessionFactory();
		//Creating the Session
		Session session = factory.openSession();
		
		// Starting the transaction
		
		Transaction tx = session.beginTransaction();
		/*
		Student s1 = new Student(101,"Alex","A");
		Student s2 = new Student(102,"Bob","B");
		Student s3 = new Student(103,"Charles","A");
		Student s4 = new Student(104,"David","C");
		session.save(s1);// it will be in transaction
		session.save(s2);
		session.save(s3);
		session.save(s4);
		tx.commit();
		*/
		/*//Search Student by ID
		Student s = session.get(Student.class, 5); // get method is only for getting value by primary key
		System.out.println(s);*/
		
		/*//Update grade of student
		s.setGrade("B");
		Transaction tx2 = session.beginTransaction();
		session.update(s); //Update student, set Grade = "B" where roll no = 1
		tx2.commit();
		System.out.println("****************After Update***************");
		System.out.println(s);*/
		
		/*//Delete
		Transaction tx3 = session.beginTransaction();
		session.delete(s);
		System.out.println(s);
		tx3.commit();*/
		
		Query qry = session.createQuery("select s from Student s where s.rollNo between ? and ?");
		qry.setParameter(0, 7);
		qry.setParameter(1, 8);
		
		List<Student> listStudent = qry.list();
		System.out.println("*******************************************************");
		for (Student student : listStudent) {
			System.out.println(student);
		}
	
		
		session.close();
		factory.close();
		System.out.println("************Thank You***************");
	}
}
