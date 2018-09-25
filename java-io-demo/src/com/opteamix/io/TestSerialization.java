package com.opteamix.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("emp.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			//Employee object with id = 100, name = Alex, salary =35000
			Employee emp = new Employee(100,"Alex",35000);
			oos.writeObject(emp);
			fos.flush();
			oos.flush();
			fos.close();
			oos.close();
			System.out.println("Object stored is: "+emp);
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}

}
