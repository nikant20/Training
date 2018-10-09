package com.opteamix.dao;

import com.opteamix.model.Ticket;

public interface AutoServiceDao {
	public String generateTicket(Ticket Ticket);
	public String reschedule(int ticketId);
}
