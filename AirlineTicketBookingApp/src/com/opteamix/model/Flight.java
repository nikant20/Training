package com.opteamix.model;


import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="flight")
public class Flight {
	@Id
	@Column(length=6)
	private int flightNo;
	@Column(length=3)
	private int noOfSeats;
	@Column(length=15)
	private String source;
	@Column(length=15)
	private String destination;
	@Column(length = 5)
	private String departureTime;
	@Column(length = 5)
	private String arrivalTime;
	@Column(length = 10)
	private double fare;
	
	@Transient
	private String dateString;
	@Column
	private Date date;
	
	public String getDateString() {
		return dateString;
	}

	public void setDateString(String dateString) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = null;
		try {
			date = sdf.parse(dateString);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.date = new Date(date.getTime());
	}

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flight(int flightNo, int noOfSeats, String source, String destination, String departureTime,
			String arrivalTime, double fare, Date date) {
		super();
		this.flightNo = flightNo;
		this.noOfSeats = noOfSeats;
		this.source = source;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.fare = fare;
		this.date = date;
	}

	public Flight(String source, String destination, Date date, int noOfSeats) {
		super();
		this.source = source;
		this.destination = destination;
		this.date = date;
		this.noOfSeats = noOfSeats;
	}

	public int getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(int  flightNo) {
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

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", noOfSeats=" + noOfSeats + ", source=" + source + ", destination="
				+ destination + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", fare=" + fare
				+ ", date=" + date + "]";
	}
	
	
	
}
