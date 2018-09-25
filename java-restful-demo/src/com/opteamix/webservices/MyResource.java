package com.opteamix.webservices;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.opteamix.beans.Employee;
import com.opteamix.beans.EmployeeDAO;
import com.opteamix.beans.Employee;

@Path("/api")
public class MyResource {
	
	@GET
	@Produces(value= {MediaType.TEXT_PLAIN})
	public String testService() {
		return "Webservice Working";
	}
	
	@GET
	@Path("employee/{id}")
	@Produces(value= {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
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
	}
	
	
	@POST
	@Consumes(value= {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("employee")
	public Response createEmployee(Employee employee) {
		System.out.println("Id: "+employee.getId()+", Name: "+employee.getName()+", Gender: "+employee.getGender()+",Phone Number: "+employee.getPhoneNumber());
		Response response = null;
		if(employee.getId()<0) {
			response = Response.status(Status.PARTIAL_CONTENT).entity("can't be stored").build();
		}else {
			response = Response.status(Status.CREATED).entity(employee).build();
		}
		
		return response;
	}
	
	@DELETE
	@Path("employee/{id}")
	@Produces(value= {MediaType.TEXT_PLAIN})
	public String deleteEmployee(@PathParam("id") int id) {
		return "Employee with an Id "+id+" deleted";
	}
	
	EmployeeDAO employeeDao = new EmployeeDAO();
	
	@POST
	@Path("create")
	@Consumes(value= {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(value= {MediaType.TEXT_PLAIN})
	public String createEmp(Employee emp) {
		String response = employeeDao.create(emp);
		return response;
	}
	
	@POST
	@Path("findbyid")
	@Consumes(value= {MediaType.TEXT_PLAIN})
	@Produces(value = {MediaType.TEXT_PLAIN})
	public String findEmployee(int id) {
		String response = employeeDao.findEmployeeById(id).toString();
		return response;
	}
	
	@GET
	@Path("findall")
	@Produces(value= {MediaType.TEXT_PLAIN})
	public String findAll() {
		String response = employeeDao.findAll().toString();
		return response;
	}
	
	@POST
	@Path("deletebyid")
	@Produces(value= {MediaType.TEXT_PLAIN})
	public String deleteById(int id) {
		String response = employeeDao.deleteById(id);
		return response;
	}
	
}
