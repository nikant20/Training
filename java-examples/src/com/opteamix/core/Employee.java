package com.opteamix.core;

public class Employee {
	private int id;
	private String name;
	private String desig;
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String name, String desig) {
		super();
		this.id = id;
		this.name = name;
		this.desig = desig;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desig=" + desig + "]";
	}
	
	
}
