package com.opteamix.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class States {
	
	@Id
	@Column(length=3)
	private String stateId;
	@Column(length=15)
	private String stateName;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="States_Cities_ID", joinColumns= {@JoinColumn(name= "state")},
				inverseJoinColumns= {@JoinColumn(name="city")})
	private List<Cities> citiesList;
	
	
	public States() {
		super();
		// TODO Auto-generated constructor stub
	}
	public States(String stateId, String stateName) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
	}
	public String getStateId() {
		return stateId;
	}
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	public List<Cities> getCitiesList() {
		return citiesList;
	}
	public void setCitiesList(List<Cities> citiesList) {
		this.citiesList = citiesList;
	}
	
	@Override
	public String toString() {
		return "States [stateId=" + stateId + ", stateName=" + stateName + "]";
	}
	
	
}