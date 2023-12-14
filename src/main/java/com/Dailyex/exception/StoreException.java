package com.Dailyex.exception;

import org.springframework.http.HttpStatus;

public class StoreException {
	private final String message;
	private final Throwable throwable;
	private HttpStatus httpStatus;
	
	public StoreException(String message, Throwable throwable, HttpStatus httpStatus) {
		super();
		this.message = message;
		this.throwable = throwable;
		this.httpStatus = httpStatus;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public String getMessage() {
		return message;
	}

	public Throwable getThrowable() {
		return throwable;
	}
	
	
}
