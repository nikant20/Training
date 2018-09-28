package com.opteamix.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.opteamix.beans.Student;

@Repository
public class StudentDaoImpl implements StudentDAOInterface {
	
	@Autowired
	private SessionFactory sf;
	
	@Override
	public boolean store(Student student) {
		boolean status = false;
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();
		session.close();
		status = true;
		return status;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> students = null;
		Session session = sf.openSession();
		students = session.createCriteria(Student.class).list();
		return students;		
	}

}
