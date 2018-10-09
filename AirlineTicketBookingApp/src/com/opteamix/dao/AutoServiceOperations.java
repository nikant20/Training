package com.opteamix.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.opteamix.model.Ticket;

@Repository
public class AutoServiceOperations implements AutoServiceDao {
    
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Transactional
	@Override
	public String generateTicket(Ticket ticket) {
		String status = null;
		if(ticket!=null) {
			hibernateTemplate.save(ticket.getFlight());
			hibernateTemplate.save(ticket.getCustomer());
			hibernateTemplate.save(ticket);
			status = "Ticket Generated";
		}else {
			status = "Sorry, Couldn't generate Ticket";
		}
		return status;
	}

}
