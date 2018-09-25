package com.opteamix.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@DiscriminatorValue("m")
@Entity
public class Manager extends Employee {
			private int empCount;

			public Manager() {
				super();
				// TODO Auto-generated constructor stub
			}

			public Manager(int id, String name, int empCount) {
				super(id, name);
				this.empCount = empCount;
			}

			public int getEmpCount() {
				return empCount;
			}

			public void setEmpCount(int empCount) {
				this.empCount = empCount;
			}

			@Override
			public String toString() {
				return "Manager [empCount=" + empCount + ", toString()=" + super.toString() + "]";
			}		
}
