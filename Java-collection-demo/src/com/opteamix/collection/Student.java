package com.opteamix.collection;

import java.util.Comparator;

public class Student {
	private int rollNo;
	private String name;
	private String grade;
	private String deptName;
	
	public static class SortByRollNo implements Comparator<Student>{

		@Override
		public int compare(Student arg0, Student arg1) {
			
			return arg0.getRollNo() - arg1.getRollNo();
		}
		
	}
	
	public static class SortByName implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
		
	}
	
	
	public Student() {
		super();
	}
	
	public Student(int rollNo, String name, String grade) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
	}
	
	public Student(int rollNo, String name, String grade, String deptName) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
		this.deptName = deptName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
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
		return "Student [rollNo=" + rollNo + ", name=" + name + ", grade=" + grade + ", deptName=" + deptName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}	
}
