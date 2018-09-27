package com.opteamix.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.opteamix.beans.Employee;

@Repository //To get connected an create objects automatically
public class EmployeeDao implements EmployeeOperations {
	
	@Autowired //
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional //This is used to do transaction with DML commands
	public String store(Employee emp) {
		String status = null;
		if(emp!=null) {
			hibernateTemplate.save(emp);
			status = "Employee with an id: "+emp.getId()+" is stored";
		}else {
			status = "Sorry, employee can't be stored";
		}
		return status;
	}

	@Override
	public Employee findEmployee(int id) {
		Employee emp = (Employee) hibernateTemplate.get(Employee.class, id);
		return emp;
	}

	@Override
	@Transactional //Since delete is a DML command
	public String delete(int id) {
		String status = null;
		Employee emp = (Employee) hibernateTemplate.get(Employee.class, id);
		if(emp!=null) {
			hibernateTemplate.delete(emp);
			status = "Deleted Employee";
		}else {
			status = "Employee isn't found";
		}
		
		return status;
	}

	@Override
	public List<Employee> getAllEmployees() {
		Employee employee = new Employee();
		List<Employee> emp =   (List<Employee>) hibernateTemplate.find("select e from com.opteamix.beans.Employee e");
		
		return emp;
	}

}
