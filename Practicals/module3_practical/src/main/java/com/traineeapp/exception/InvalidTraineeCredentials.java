package com.traineeapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidTraineeCredentials extends RuntimeException{

	private static final long serialVersionUID = -440857459639068613L;

	public InvalidTraineeCredentials(String message) {
		super(message);
	}
	
}
