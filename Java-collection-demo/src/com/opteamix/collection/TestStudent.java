package com.opteamix.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TestStudent {

	public static void main(String[] args) {
		Set<Student> studentsSet = new HashSet();
		Scanner sc = new Scanner(System.in);
		int option = 0;
		do {
			System.out.println("1. Add Student 2. Exit");
			option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter roll Number: ");
				int rollNo = sc.nextInt();
				System.out.println("Enter name: ");
				String name = sc.next();
				System.out.println("Enter grade: ");
				String grade = sc.next();
				Student s = new Student(rollNo, name, grade);
				studentsSet.add(s);
				System.out.println("Number of students: "+studentsSet.size());
				System.out.println("------------------------------------------");
				break;
			}
		} while (option!=2);
		Iterator<Student> itr = studentsSet.iterator();
		while (itr.hasNext()) {
			Student student = (Student) itr.next();
			System.out.println(student);
			System.out.println("-----------------------------------------------");
			
		}
	}

}
