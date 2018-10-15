package com.opteamix.service;


import java.time.temporal.ChronoUnit;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.opteamix.model.Ticket;

@Repository
public class CancelTicket implements CancelOperations {
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	//Cancelled ticket code
	@Override
	public String cancelTicket(int ticketId) {
		Ticket ticketDetails = hibernateTemplate.get(Ticket.class, ticketId);
		ticketDetails.setTicketStatus("cancelled");
		double fare = ticketDetails.getFlight().getFare();
		Date dateofJourney = ticketDetails.getDateOfJourney();
		int noOfDays = dateDifference(dateofJourney);
		if(noOfDays >= 10) {
			fare = (0.9*fare);
		}else if(noOfDays >=5 && noOfDays <10 ) {
			fare = (0.8*fare);
		}else if(noOfDays < 5) {
			fare = (0.5*fare);
		}	
		
		return "Ticket Cancelled and Amount refunded is: "+fare;
	}
	
	//Method to find the difference in dates
	private int dateDifference(Date datejourney) {
		
		return (int) ChronoUnit.DAYS.between(datejourney.toInstant(), new Date().toInstant());
		
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String currentDate = String.valueOf(new Date());
		Integer days = null;
		try {
			Date currDate = sdf.parse(currentDate);
			long diff = datejourney.getTime() - currDate.getTime();
			days = (int) (diff / (1000*60*60*24));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return days;*/
	}


}
