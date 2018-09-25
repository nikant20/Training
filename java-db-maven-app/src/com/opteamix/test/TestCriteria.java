package com.opteamix.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.opteamix.entity.Student;

public class TestCriteria {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Criteria crt = session.createCriteria(Student.class);
		//crt.add(Restrictions.eq("grade", "A")); //Here name is the Java Bean Variable name
		//crt.add(Restrictions.ilike("name", "%a%")); // it is case insensitive search
		crt.add(Restrictions.like("name", "%A%")); // it is case sensitive search
		List<Student> studentList = crt.list();
		for (Student student : studentList) {
			System.out.println(student);
		}

	}

}
