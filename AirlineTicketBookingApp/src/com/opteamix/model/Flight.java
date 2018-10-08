package com.opteamix.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class Flight {
	@Id
	@Column
	private String flightNo;
	@Column(length=3)
	private int noOfSeats;
	@Column(length=15)
	private String source;
	@Column(length=15)
	private String destination;
	@Column
	private LocalDateTime departureTime;
	@Column
	private LocalDateTime arrivalTime;
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flight(String flightNo, int noOfSeats, String source, String destination, LocalDateTime departureTime,
			LocalDateTime arrivalTime) {
		super();
		this.flightNo = flightNo;
		this.noOfSeats = noOfSeats;
		this.source = source;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}
	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", noOfSeats=" + noOfSeats + ", source=" + source + ", destination="
				+ destination + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + "]";
	}
	
	
	
	
}
