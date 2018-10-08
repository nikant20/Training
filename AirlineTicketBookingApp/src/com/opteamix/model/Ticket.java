package com.opteamix.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ticket")
public class Ticket {
	
	@Id
	@Column(length=6)
	private int ticketId;
	@Column
	private Date dateOfJourney;
	@Column
	private Date dateofBooking;
	@Column
	private double fare;
	@Column
	private String ticketStatus;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name="ticketDetails", joinColumns= {@JoinColumn(name="flightNo")}, 
	inverseJoinColumns= {@JoinColumn(name="ticketId")})
	private Flight flight;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name="ticketDetails", joinColumns= {@JoinColumn(name="email")},
	inverseJoinColumns= {@JoinColumn(name="ticketId")})
	private Customer customer;

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(int ticketId, Date dateOfJourney, Date dateofBooking, double fare, String ticketStatus, Flight flight,
			Customer customer) {
		super();
		this.ticketId = ticketId;
		this.dateOfJourney = dateOfJourney;
		this.dateofBooking = dateofBooking;
		this.fare = fare;
		this.ticketStatus = ticketStatus;
		this.flight = flight;
		this.customer = customer;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public Date getDateOfJourney() {
		return dateOfJourney;
	}

	public void setDateOfJourney(Date dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}

	public Date getDateofBooking() {
		return dateofBooking;
	}

	public void setDateofBooking(Date dateofBooking) {
		this.dateofBooking = dateofBooking;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", dateOfJourney=" + dateOfJourney + ", dateofBooking=" + dateofBooking
				+ ", fare=" + fare + ", ticketStatus=" + ticketStatus + ", flight=" + flight + ", customer=" + customer
				+ "]";
	}
	
	
}
