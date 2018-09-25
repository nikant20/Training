package com.opteamix.webservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class MyResource {
	
	@Produces(value = {MediaType.TEXT_PLAIN})
	@GET
	public String testService() {
		return "Working!";
	}
}
