package com.opteamix.beans;

import java.util.List;

public interface EmployeeOperations {
	public String create(Employee emp);
	public Employee findEmployeeById(int id);
	public List<Employee> findAll();
	public String deleteById(int id);
}
