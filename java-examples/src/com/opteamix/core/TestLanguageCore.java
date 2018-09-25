package com.opteamix.core;

import java.util.Scanner;

public class TestLanguageCore {

	public static void main(String[] args) {
		Employee[] emp = new Employee[2];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee Information: ");
		for(int index = 0 ; index < emp.length ; index++) {
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			System.out.println("Enter Name: ");
			String name = sc.next();
			System.out.println("Enter designation: ");
			String desig = sc.next().toUpperCase();
			emp[index] = new Employee(id, name, desig);
		}
		System.out.println("*******Check employees belonging to Admin Designation******");
		for (Employee employee : emp) {
			if(employee.getDesig().equals("ADMIN")) {
				System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getDesig());
			}
		}
		System.out.println("******Display All Employees*******");
		for(Employee e : emp) {
			System.out.println(e);//print(e.toString())
		}
		sc.close();
	}
}
