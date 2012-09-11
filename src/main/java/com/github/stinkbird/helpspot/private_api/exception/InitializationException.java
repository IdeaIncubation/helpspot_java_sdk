package com.github.stinkbird.helpspot.private_api.exception;

/**
 * This exception is raised if initialization failed because required parameters are missing to initialize private-api facade object. 
 * 
 * @author bbrahmbhatt
 *
 */
public class InitializationException extends RuntimeException {

	private static final long serialVersionUID = -4488982359198705881L;

	public InitializationException(String message) {
		 super(message);
	}

}
