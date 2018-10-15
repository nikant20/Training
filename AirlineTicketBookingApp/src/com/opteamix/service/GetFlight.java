package com.opteamix.service;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.opteamix.model.Flight;

@Repository
public class GetFlight implements FlightOperations{
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	//checking flight availability
	@Override
	public List<Flight> availability(String source, String destination, Date date) {
		String hql = "select f "
				+ "from Flight f where f.source=:s and f.destination=:d "
				+ "and f.date=:da";
		List<Flight> flightList = (List<Flight>) hibernateTemplate.findByNamedParam(hql, new String[] {"s","d","da"}, new Object[] {source, destination, date});
		return flightList;
	}
	
}
