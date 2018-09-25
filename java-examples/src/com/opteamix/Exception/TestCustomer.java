package com.opteamix.Exception;

public class TestCustomer {

	public static void main(String[] args) {
		
		try {
			Customer customer = search(105);
			System.out.println("Id= "+customer.getCustomerId()+", Name = "+customer.getName());
		} catch (CustomerNotFoundException e) {
			System.err.println(e.getMessage());//Command to print error message to console
		} finally {
			System.out.println("Finally block is executed");
		}
		System.out.println("Program exits");
		
	}
	public static Customer search(int id) throws CustomerNotFoundException {
		Customer[] customers = {
				new Customer(101,"Alex"),
				new Customer(102,"Bob"),
				new Customer(103,"Charles")
		};
		Customer c = null;
		
		for (Customer temp : customers) {
			if(temp.getCustomerId()==id) {
				c = temp;
				break;
			}
		}
		if(c==null) {
			throw new CustomerNotFoundException("Customer Not Found with an Id: "+id);
		}
		return c;	
	}

}
