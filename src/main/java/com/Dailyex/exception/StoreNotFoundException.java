package com.Dailyex.exception;

public class StoreNotFoundException extends RuntimeException{

	public StoreNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public StoreNotFoundException(String message) {
		super(message);
	}
	
	

}
