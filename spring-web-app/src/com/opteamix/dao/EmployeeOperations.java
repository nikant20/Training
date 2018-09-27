package com.opteamix.dao;

import java.util.List;

import com.opteamix.beans.Employee;

public interface EmployeeOperations {
	public String store(Employee emp);
	public Employee findEmployee(int id);
	public String delete(int id);
	public List<Employee> getAllEmployees();
}
