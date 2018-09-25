package com.opteamix;

import java.util.List;
import java.util.Set;

public class TelecomServices {
	private String serviceName;
	private List<String> locations;
	private Set<String> urls;
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public List<String> getLocations() {
		return locations;
	}
	public void setLocations(List<String> locations) {
		this.locations = locations;
	}
	public Set<String> getUrls() {
		return urls;
	}
	public void setUrls(Set<String> urls) {
		this.urls = urls;
	}
	
	
}
