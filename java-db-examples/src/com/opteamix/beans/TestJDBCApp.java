package com.opteamix.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestJDBCApp {
	
	static final String url = "jdbc:derby://localhost:1527/opteamix";
	static final String user = "admin";
	static final String password = "admin";

	public static void main(String[] args) {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			Connection connection = DriverManager.getConnection(url, user, password);
			String insertQuery = "insert into emp values(?,?,?)";
			String selectQuery = "select * from emp";
			PreparedStatement prepareInsert = connection.prepareStatement(insertQuery);
			Employee emp = new Employee(102,"Bob", 45000);
			prepareInsert.setInt(1, emp.getId());
			prepareInsert.setString(2, emp.getName());
			prepareInsert.setDouble(3, emp.getSalary());
			
			int rowCount = prepareInsert.executeUpdate();
			System.out.println("Rows affected: "+rowCount);
			System.out.println("------Retriving all records--------");
			
			PreparedStatement prepareSelect = connection.prepareStatement(selectQuery);
			ResultSet result = prepareSelect.executeQuery();
			while(result.next()) {
				Employee emp2 = new Employee();
				emp2.setId(result.getInt(1));
				emp2.setName(result.getString(2));
				emp2.setSalary(result.getDouble(3));
				System.out.println(emp2);
				System.out.println("*************************************");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
