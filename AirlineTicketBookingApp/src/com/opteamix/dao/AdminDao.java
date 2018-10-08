package com.opteamix.dao;


import com.opteamix.model.Flight;

public interface AdminDao {
	public String setFlightDetails(Flight flight);
	public Flight getFlightDetails(int flightNo);
}
