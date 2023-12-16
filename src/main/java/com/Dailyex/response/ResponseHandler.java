package com.Dailyex.response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {
	
	public static ResponseEntity<Object> reposeBuilder(String message, HttpStatus httpStatus, Object responseObject){
		
		Map<String, Object> response = new HashMap<>();
		
		response.put("message", message);
		response.put("httpStatus", httpStatus);
		response.put("data", responseObject);
		
		return new ResponseEntity<>(response, httpStatus);
	}

	public static ResponseEntity<Object> reposeBuilderWithoutData(String message, HttpStatus httpStatus){

		Map<String, Object> response = new HashMap<>();

		response.put("message", message);
		response.put("httpStatus", httpStatus);
		return new ResponseEntity<>(response, httpStatus);
	}
}
