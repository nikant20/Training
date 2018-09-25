package com.opteamix.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestCollections{

	public static void main(String[] args) {
		List<Integer> list  = new ArrayList<>();
		for(int i = 0 ; i < 5 ;i++) {
			list.add(i);
		}
		System.out.println("List: "+list);
		Collections.sort(list);
		System.out.println("List in Sorted Order: "+list);
		Collections.reverse(list);
		System.out.println("List in Reverse order: "+list);
		Collections.shuffle(list);
		System.out.println("Shuffled List: "+list);
		//In order to sort complex object. your complex object must use comparator or comparable interface
		Student s1 = new Student(102,"Bob","A");
		Student s2 = new Student(101, "Clex", "B");
		Student s3 = new Student(100,"Dlex","C");
		List<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		System.out.println("******ALL STUDENTS********");
		for (Student student : studentList) {
			System.out.println(student);
		}
		System.out.println("*******Sorted Students***********");
		Collections.sort(studentList, new Student.SortByRollNo());
		for (Student student : studentList) {
			System.out.println(student);
		}
		System.out.println("********Sorted By Name********");
		Collections.sort(studentList, new Student.SortByName());
		for (Student student : studentList) {
			System.out.println(student);
		}
	}

}
