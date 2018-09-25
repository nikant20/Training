package com.opteamix.Exception;

public class CustomerNotFoundException extends Exception {

	public CustomerNotFoundException(String message) {
		//the message is an error message that is initialized which can be printed while handling exception
		super(message);
	}
	
}
