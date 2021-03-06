package com.opteamix.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("p")
@Entity
public class Programmer extends  Employee{
	@Column(length=15)
	private String technology;

	public Programmer() {
		super();
	}

	public Programmer(int id, String name, String technology) {
		super(id, name);
		this.technology = technology;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "Programmer [technology=" + technology + ", toString()=" + super.toString() + "]";
	}
	
	
}
