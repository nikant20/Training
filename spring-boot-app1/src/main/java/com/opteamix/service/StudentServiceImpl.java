package com.opteamix.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opteamix.beans.Student;
import com.opteamix.dao.StudentDAOInterface;

@Service
public class StudentServiceImpl implements StudentServiceInterface {

	@Autowired
	private StudentDAOInterface studentDAO;
	
	@Override
	public boolean store(Student student) {
		boolean status = false;
		if(student!=null) {
			status = studentDAO.store(student);
		}
		return status;
	}

	@Override
	public List<Student> getAllFailedStudents() {
		List<Student> failedStudentsList = null;
		List<Student> allStudents = studentDAO.getAllStudents();
		failedStudentsList = new ArrayList<>();
		for (Student student : allStudents) {
			if(student.getGrades().equals("D")) {
				failedStudentsList.add(student);
			}
		}
		return failedStudentsList;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> studentList = null;
		studentList = studentDAO.getAllStudents();
		return studentList;
	}

	@Override
	public List<Student> getAllPassedStudents() {
		List<Student> passedStudentsList = null;
		List<Student> allStudents = studentDAO.getAllStudents();
		passedStudentsList = new ArrayList<>();
		for (Student student : allStudents) {
			if(!student.getGrades().equals("D")) {
				passedStudentsList.add(student);
			}
		}
		return passedStudentsList;
	}

}
