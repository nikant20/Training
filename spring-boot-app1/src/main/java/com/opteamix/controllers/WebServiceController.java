package com.opteamix.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.opteamix.beans.Student;
import com.opteamix.service.StudentServiceInterface;

@RestController
public class WebServiceController {
	
	@Autowired
	private StudentServiceInterface serviceInterface;
	
	@RequestMapping(value="/webFind", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Student> findStudent() {
		return serviceInterface.getAllStudents();
	}
	
	@RequestMapping(value="/webStore", method = RequestMethod.POST, 
			produces = MediaType.TEXT_PLAIN_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeStudent(@RequestBody Student student) {
		boolean status = serviceInterface.store(student);
		if(status) {
			return "Student stored!";
		}else {
			return "Sorry! Student not stored";
		}
	}
	
	@RequestMapping(value="/webFindFailed", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Student> findFailedStudent() {
		return serviceInterface.getAllFailedStudents();
	}
	
	@RequestMapping(value="/webFindPassed", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Student> findPassedStudent() {
		return serviceInterface.getAllPassedStudents();
	}
	
	
}
