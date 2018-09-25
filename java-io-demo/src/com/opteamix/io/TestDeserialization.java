package com.opteamix.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserialization {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("emp.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			if(obj instanceof Employee) {
				Employee emp = (Employee)obj;
				System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
