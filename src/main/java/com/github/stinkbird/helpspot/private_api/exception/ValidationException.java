package com.github.stinkbird.helpspot.private_api.exception;

/**
 * This exception is raised when required parameters are missing while calling private-api methods by help of private-api facade object. 
 * 
 * @author bbrahmbhatt
 *
 */
public class ValidationException extends RuntimeException {

	private static final long serialVersionUID = 3720323652263432919L;

	public ValidationException(String message) {
		 super(message);
	}

}
