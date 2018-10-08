package com.opteamix.dao;

import com.opteamix.model.Customer;
import com.opteamix.model.Flight;
import com.opteamix.model.Ticket;

public interface CustomerDao {
	
	public String store(Customer customer);
	public String Book(Ticket ticket);
	public Ticket search(int ticketId);
	public String cancel(int ticketId);
	public String reschedule(int ticketId);
}

