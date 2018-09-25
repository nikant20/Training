package com.opteamix.webservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
/*
import com.opteamix.beans.Employee;
*/
@Path("/api")
public class MyResource {
	
	@GET
	@Produces(value= {MediaType.TEXT_PLAIN})
	public String testService() {
		return "Webservice Working";
	}
	
/*	@GET
	@Path("employee/{id}")
	@Produces(value= {MediaType.APPLICATION_JSON})
	public Employee findEmployee(@PathParam("id") int empId, @QueryParam("phone") String phoneNo) {
		Employee emp = null;
		System.out.println("Client sent id = "+empId+", Phone No= "+phoneNo);
		if (empId==101) {
			emp = new Employee(101,"Alex",phoneNo, 'M');
		}
		if (empId==102) {
			emp = new Employee(102,"Bob",phoneNo, 'M');
		}
		if (empId==103) {
			emp = new Employee(103,"Charles",phoneNo, 'M');
		}
		
		return emp;
	}*/
}
