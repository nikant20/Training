package com.opteamix;

public abstract class Employee {
	
	
	abstract void calSalary();
	
	private int empId;
	private String empName;
	
	
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
