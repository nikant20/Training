package com.opteamix.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int CustomerId;
	
	@Column(length=15)
	private String name;
	
	@Embedded
	private Contact contacts; //You can make contact unique by making it @EmbeddedId

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String name, Contact contacts) {
		super();
		CustomerId = customerId;
		this.name = name;
		this.contacts = contacts;
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Contact getContacts() {
		return contacts;
	}

	public void setContacts(Contact contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", name=" + name + ", contacts=" + contacts + "]";
	}
	
}
