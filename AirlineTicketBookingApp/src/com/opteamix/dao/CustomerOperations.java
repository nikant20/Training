package com.opteamix.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.opteamix.model.Customer;
import com.opteamix.model.Flight;
import com.opteamix.model.Ticket;

@Repository
public class CustomerOperations implements CustomerDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Override
	public Flight query(Flight flight) {
		Flight flightQuery = new Flight(flight.getSource(),flight.getDestination(),flight.getDate(), flight.getNoOfSeats());
		
		return flightQuery;
	}
	
	@Transactional
	@Override
	public String Book(Ticket ticket) {
		String status = null;
		if(ticket!=null) {
			hibernateTemplate.save(ticket);
			status = "Ticket Booked";
		}else {
			status = "Sorry, Booking Failed";
		}
		
		return status;
	}
	
	@Transactional
	@Override
	public String store(Customer customer) {
		String status = null;

		if(customer!=null) {
			hibernateTemplate.save(customer);
			status = "Customer with Name: "+customer.getName()+" And email id: "+customer.getEmail()+" is saved";
		}
		else {
			status = "Sorry, customer isn't stored";
		}
		return status;
	}

	@Override
	public Ticket search(int ticketId) {
		return hibernateTemplate.get(Ticket.class, ticketId);
	}
	
	@Transactional
	@Override
	public String cancel(int ticketId) {
		Ticket ticketDetails = hibernateTemplate.get(Ticket.class, ticketId);
		hibernateTemplate.delete(ticketDetails);
		return "Ticket Cancelled";
	}

	@Transactional
	@Override
	public String reschedule(int ticketId) {
		cancel(ticketId);
		Ticket ticketDetails = search(ticketId);
		
		return "Details Updated";
	}

}
