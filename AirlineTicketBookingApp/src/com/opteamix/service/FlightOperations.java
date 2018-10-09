package com.opteamix.service;

import java.util.Date;
import java.util.List;

import com.opteamix.model.Flight;

public interface FlightOperations {
	public List<Flight> availability(String source, String destination, Date date);
}
