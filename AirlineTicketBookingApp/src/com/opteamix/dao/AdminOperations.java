package com.opteamix.dao;

import java.sql.Date;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.opteamix.model.Flight;
@Repository
public class AdminOperations implements AdminDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	public Flight getFlightDetails(int flightNo) {
		return hibernateTemplate.get(Flight.class, flightNo);	
	}
	
	@Transactional
	@Override
	public String setFlightDetails(Flight flight) {
		hibernateTemplate.save(flight);
		return "Flight Details saved successFully";
	}

}
