package com.opteamix.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.opteamix.dao.AdminDao;
import com.opteamix.dao.CustomerDao;
import com.opteamix.model.Customer;
import com.opteamix.model.Flight;

@RestController
@CrossOrigin(origins = {"*"}, methods = {RequestMethod.POST,RequestMethod.GET,RequestMethod.PUT,RequestMethod.DELETE})
public class WebServiceController {
	
	@Autowired
	private CustomerDao customerOp;
	@Autowired
	private AdminDao adminOp;
	
	@RequestMapping(value="/store", method = RequestMethod.POST, produces= {MediaType.TEXT_PLAIN_VALUE}, consumes= {MediaType.APPLICATION_JSON_VALUE})
	public String storeCustomer(@RequestBody Customer customer) {
		String response = customerOp.store(customer);
		return response;
	}
	
	@RequestMapping(value="/flightDataAdminStore", method = RequestMethod.POST, produces = {MediaType.TEXT_PLAIN_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	public String storeFlightDetails(@RequestBody Flight flight) {
		String response = adminOp.setFlightDetails(flight);
		return response;
	}
	
	@RequestMapping(value="/flightDataAdminGetDetails/{flightNo}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	public Flight getFlightDetails(@PathVariable("flightNo") int flightNo) {
		int flightNumber = flightNo;
		Flight flightDetails = adminOp.getFlightDetails(flightNumber);
		return flightDetails;
	}
		
	@RequestMapping(value="/query", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE})
	public Flight query(@RequestBody Flight flight) {
		return customerOp.query(flight);
	}
	
}
