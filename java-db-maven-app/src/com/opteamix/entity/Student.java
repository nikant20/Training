package com.opteamix.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //GenerationType.AUTO @SequenceGenerator(generator="testSequence", sequenceName="test_seq") 
														//generates the custmoized sequence no in any db except derby
	private int rollNo;
	
	@Column(name = "student_name", length = 15)
	private String name;
	
	@Column(length = 5)
	private String grade;
	
	public Student() {
		super();
	}

	public Student(int rollNo, String name, String grade) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", grade=" + grade + "]";
	}

}
