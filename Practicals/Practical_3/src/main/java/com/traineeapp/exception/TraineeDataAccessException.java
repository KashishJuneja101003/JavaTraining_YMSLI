package com.traineeapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TraineeDataAccessException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public TraineeDataAccessException(String message) {
		super(message);
	}
}