package com.opteamix.beans;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeDAO implements EmployeeOperations{

	@Override
	public String create(Employee emp) {
		int status = 0;
		SessionFactory sessionFactory = DBUtility.createSessionFactory();
		Session session = sessionFactory.openSession();
		if (emp!=null) {
			Transaction transaction = session.beginTransaction();
			session.save(emp);
			transaction.commit();
			status=1;
		}
		session.close();
		sessionFactory.close();
		if(status!=0) {
			return "Data added Sucessfully";
		}
		else {
			return "Sorry, Couldn't insert data";
		}
		
	}

	@Override
	public Employee findEmployeeById(int id) {
		SessionFactory sessionFactory = DBUtility.createSessionFactory();
		Session session = sessionFactory.openSession();
		Employee emp = session.get(Employee.class, id);
		session.close();
		sessionFactory.close();
		return emp;
	}

	@Override
	public List<Employee> findAll() {
		
		SessionFactory sessionFactory = DBUtility.createSessionFactory();
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> allUsers = criteria.list();
		session.close();
		sessionFactory.close();
		return allUsers;
	}

	@Override
	public String deleteById(int id) {
		String status = null;
		SessionFactory sessionFactory = DBUtility.createSessionFactory();
		Session session = sessionFactory.openSession();
		
		Employee emp = session.get(Employee.class, id);
		if(emp!=null) {
			Transaction tx = session.beginTransaction();
			session.delete(emp);
			tx.commit();
			status = "Employee with id: "+id+" deleted";
		}else {
			status = "Employee not found";
		}
		
		session.close();
		sessionFactory.close();
		return status;
	}
	
	

}
