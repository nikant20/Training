package com.opteamix.controller;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.opteamix.dao.AdminDao;
import com.opteamix.dao.AutoServiceDao;
import com.opteamix.dao.CustomerDao;
import com.opteamix.model.Customer;
import com.opteamix.model.Flight;
import com.opteamix.model.Ticket;
import com.opteamix.service.CancelOperations;
import com.opteamix.service.FlightOperations;

@RestController
@CrossOrigin(origins = {"*"}, methods = {RequestMethod.POST,RequestMethod.GET,RequestMethod.PUT,RequestMethod.DELETE})
public class WebServiceController {
	
	@Autowired
	private CustomerDao customerOp;
	@Autowired
	private AdminDao adminOp;
	@Autowired
	private AutoServiceDao autoOp;
	@Autowired
	private FlightOperations flightOp;
	@Autowired
	private CancelOperations cancOp;
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
	
	@RequestMapping(value="/generateTicket", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.TEXT_PLAIN_VALUE}) 
	public String generateTicket(@RequestBody Ticket Ticket) {
		String response = autoOp.generateTicket(Ticket);
		return response;
	}
		
	@RequestMapping(value="/query/{source}/{destination}/{date}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE})
	public List<Flight> query(@PathVariable("source") String source, @PathVariable("destination") String destination,@PathVariable("date") String date) {
		DateFormat dateFormat;
		Date theDate = null;
		dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			theDate = dateFormat.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Flight> flightDetails = flightOp.availability(source, destination, theDate);
		return flightDetails;
	}
	
	@RequestMapping(value="/cancelTicket/{id}", method = RequestMethod.GET, produces = {MediaType.TEXT_PLAIN_VALUE})
	public String cancelTicket(@PathVariable("id") int ticketId) {
		String response = cancOp.cancelTicket(ticketId);
		return response;
	}
	
}
