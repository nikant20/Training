package com.opteamix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Value("Max")
	private String name;
	@Autowired
	private Contacts contacts;
}
