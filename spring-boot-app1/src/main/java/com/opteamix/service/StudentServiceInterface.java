package com.opteamix.service;

import java.util.List;

import com.opteamix.beans.Student;

public interface StudentServiceInterface {
	public boolean store(Student student);
	public List<Student> getAllFailedStudents();
	public List<Student> getAllPassedStudents();
	public List<Student> getAllStudents();
}
