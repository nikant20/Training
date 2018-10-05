package com.opteamix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.opteamix.beans.Employee;
import com.opteamix.dao.EmployeeOperations;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"}, methods = {RequestMethod.POST,RequestMethod.GET,RequestMethod.PUT,RequestMethod.DELETE})
public class WebServiceController {
	@Autowired
	private EmployeeOperations employeeOperations;
	
	@RequestMapping(value="/webFind/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	public Employee findEmployee(@PathVariable("id") int empId) {
		int id = empId;
		Employee employee = employeeOperations.findEmployee(id);
		return employee;
	}
	
	@RequestMapping(value="/webStore", method = RequestMethod.POST, produces= {MediaType.TEXT_PLAIN_VALUE}, consumes= {MediaType.APPLICATION_JSON_VALUE})
	public String storeEmployee(@RequestBody Employee emp) {
		String response = employeeOperations.store(emp);
		return response;
	}
	
	@RequestMapping(value="/webDelete/{id}", method = RequestMethod.DELETE, produces = {MediaType.TEXT_PLAIN_VALUE})
	public String deleteEmployee(@PathVariable("id") int empId) {
		int id = empId;
		String response = employeeOperations.delete(id);
		return response;
	}
	
	@RequestMapping(value="/showAll", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Employee> showAllEmployee() {
		List<Employee>  employeeList = employeeOperations.getAllEmployees();
		return employeeList;
	}
	
	
}
