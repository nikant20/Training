package com.opteamix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="customer")
public class Customer {
		@Column(length=15)
	    private String name;
		@Id
		@Column(length=25)
		private String email;
		@Column(length=3)
		private String countryCode;
		@Column(length=10)
		private String phoneNumber;
		
		
		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Customer(String name, String email, String countryCode, String phoneNumber) {
			super();
			this.name = name;
			this.email = email;
			this.countryCode = countryCode;
			this.phoneNumber = phoneNumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCountryCode() {
			return countryCode;
		}
		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		@Override
		public String toString() {
			return "Customer [name=" + name + ", email=" + email + ", countryCode=" + countryCode + ", phoneNumber="
					+ phoneNumber + "]";
		}
		
}
