package com.Dailyex.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class StoreExceptionHandler {
	
	//If we will have more exception we can mention  in value like value = {StoreNotFoundException.class, somemoreexception.class}
	@ExceptionHandler(value = {StoreNotFoundException.class})
	public ResponseEntity<Object> handlerStoresNotFoundException(StoreNotFoundException storeNotException){
		//Payload
		StoreException storesException = new StoreException(
				storeNotException.getMessage(),
				storeNotException.getCause(),
				HttpStatus.NOT_FOUND);
				
		return new ResponseEntity<>(storesException, HttpStatus.NOT_FOUND);
		
	}
	
}
