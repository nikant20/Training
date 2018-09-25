package com.opteamix.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class Cities {
	@Id
	@Column(length=3)
	private String cityId;
	@Column(length=15)
	private String cityName;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinTable(name="States_Cities_ID", joinColumns= {@JoinColumn(name= "city")},
	inverseJoinColumns= {@JoinColumn(name="state")})
	private States state;
	
	
	
	public Cities() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cities(String cityId, String cityName) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
	}
	
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	@Override
	public String toString() {
		return "States [cityId=" + cityId + ", cityName=" + cityName + "]";
	}

}
