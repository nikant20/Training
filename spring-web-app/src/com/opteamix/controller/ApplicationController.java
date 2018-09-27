package com.opteamix.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.opteamix.beans.Employee;
import com.opteamix.dao.EmployeeDao;
import com.opteamix.dao.EmployeeOperations;

@Controller
public class ApplicationController {
	
	@Autowired
	private EmployeeOperations employeeOperations;
	
	@RequestMapping(value="/check", method = RequestMethod.GET)
	public String test() {
		System.out.println("Test is called");
		return "index";	
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public ModelAndView testTime() {
		ModelAndView mav = new ModelAndView("index", "time",new Date() );
		return mav;
	}
	
	@RequestMapping(value="/find", method = RequestMethod.GET)
	public ModelAndView findemployee() {
		Employee employee = new Employee(105,"George","9803763824", 'M');
		ModelAndView mav = new ModelAndView("showEmployee","employee", employee);
		return mav;
	}
	
	@RequestMapping(value="/showFrom", method=RequestMethod.GET)
	public ModelAndView showEmployeeForm() {
		Employee emp = new Employee();
		ModelAndView mav = new ModelAndView("employeeForm", "employee", emp);
		return mav;
	}
	
	@RequestMapping(value="/store", method=RequestMethod.POST)
	public ModelAndView registerEmployee(@ModelAttribute("employee") Employee emp) {
		String status = null;
		if(emp == null) {
			status = "Sorry, can't be stored";
			ModelAndView mav = new ModelAndView("error", "errorKey", status);
			return mav;
		}
		status = employeeOperations.store(emp);
		ModelAndView mav = new ModelAndView("showEmployee","employee",emp);
		mav.addObject("successKey", status);
		return mav;
	}
	
	@RequestMapping(value="/findbyid", method = RequestMethod.GET)
	public ModelAndView findById(@RequestParam("id") int id) {
		Employee emp = employeeOperations.findEmployee(id);
		ModelAndView mav = new ModelAndView("showEmployee","employeebyid",emp);
		return mav;
	} 
	
	@RequestMapping(value="/deletebyid", method = RequestMethod.GET)
	public ModelAndView deleteById(@RequestParam("id") int id) {
		String emp = employeeOperations.delete(id);
		ModelAndView mav = new ModelAndView("showEmployee","deletebyid",emp);
		return mav;
	} 
	
	@RequestMapping(value="/showall", method = RequestMethod.GET)
	public ModelAndView showall() {
		List<Employee> emp = (List<Employee>) employeeOperations.getAllEmployees();
		ModelAndView mav = new ModelAndView("showEmployee","showall",emp);
		return mav;
	}
	
}

