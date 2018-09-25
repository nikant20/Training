package com.opteamix.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Employee {
	    @Id
	    @Column(length=2)
		private int id;
	    @Column(length=20)
		private String name;
	    @Column(length=10)
		private String phoneNumber;
	    @Column(length=2)
		private char gender;
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(int id, String name, String phoneNumber, char gender) {
			super();
			this.id = id;
			this.name = name;
			this.phoneNumber = phoneNumber;
			this.gender = gender;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", gender=" + gender
					+ "]";
		}
		
		
}
