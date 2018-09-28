package com.opteamix.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@Column(length=10)
	private String usn;
	@Column(length=15)
	private String name;
	@Column(length=2)
	private String grades;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String usn, String name, String grades) {
		super();
		this.usn = usn;
		this.name = name;
		this.grades = grades;
	}
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrades() {
		return grades;
	}
	public void setGrades(String grades) {
		this.grades = grades;
	}
	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", grades=" + grades + "]";
	}
}
