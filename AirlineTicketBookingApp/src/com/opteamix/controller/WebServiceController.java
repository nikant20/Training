package com.opteamix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.opteamix.dao.CustomerDao;
import com.opteamix.dao.CustomerOperations;
import com.opteamix.model.Customer;

@RestController
@CrossOrigin(origins = {"*"}, methods = {RequestMethod.POST,RequestMethod.GET,RequestMethod.PUT,RequestMethod.DELETE})
public class WebServiceController {
	
	@Autowired
	private CustomerDao customerOp;
	
	@RequestMapping(value="/store", method = RequestMethod.POST, produces= {MediaType.TEXT_PLAIN_VALUE}, consumes= {MediaType.APPLICATION_JSON_VALUE})
	public String storeCustomer(@RequestBody Customer customer) {
		String response = customerOp.store(customer);
		return response;
	}
}
