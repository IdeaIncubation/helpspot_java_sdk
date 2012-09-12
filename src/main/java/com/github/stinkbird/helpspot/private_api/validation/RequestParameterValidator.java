package com.github.stinkbird.helpspot.private_api.validation;

import com.github.stinkbird.helpspot.private_api.exception.ValidationException;
/**
 * This is helper utility to validate if required parameters are present before calling private api methods.
 * 
 * @author bbrahmbhatt
 *
 */
public abstract class RequestParameterValidator {
	
	public static void validateRequiredParametersForPrivateRequestGet(String xRequest) {
		// Validate Required parameters
		boolean isXRequestPresent = xRequest != null && !"".equals(xRequest.trim());
		if(!isXRequestPresent) {
			throw new ValidationException("xRequest is required parameter to call private.request.get on helpspot private api.");
		} 
	}
	
	public static void validateRequiredParametersForPrivateRequestGetTimeEvents(String xRequest) {
		// Validate Required parameters
		boolean isXRequestPresent = xRequest != null && !"".equals(xRequest.trim());
		if(!isXRequestPresent) {
			throw new ValidationException("xRequest is required parameter to call private.request.getTimeEvents on helpspot private api.");
		}
	}

}
