package com.opteamix.dao;

import java.util.List;

import com.opteamix.beans.Student;

public interface StudentDAOInterface {
	public boolean store(Student student);
	public List<Student> getAllStudents();
}
