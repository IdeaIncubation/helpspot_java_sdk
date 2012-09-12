package com.github.stinkbird.helpspot.private_api.query;

/**
 * This class helps to prepare query string to pass on private method call api. 
 * 
 * @author bbrahmbhatt
 *
 */
public abstract class QueryPreparationHelperUtil {

	public static String prepareQueryStringForPrivateRequestGet(String xRequest) {	
		
		// define private method base
		String methodName = "private.request.get";
				
		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append("method=" + methodName);
		if(xRequest != null && !"".equals(xRequest.trim())) {
			queryBuffer.append("&" + "xRequest=" + xRequest);
		}
				
		return queryBuffer.toString();		
	}
	
	public static String prepareQueryStringForPrivateRequestSearch(String sUserId) {
		
		// define private method base
		String methodName = "private.request.search";
		
		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append("method=" + methodName);
		if(sUserId != null && !"".equals(sUserId.trim())) {
			queryBuffer.append("&" + "sUserId=" + sUserId);
		}
				
		return queryBuffer.toString();
	}
	
	public static String prepareQueryStringForPrivateRequestGetTimeEvents(String xRequest) {	
		
		// define private method base
		String methodName = "private.request.getTimeEvents";
				
		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append("method=" + methodName);
		if(xRequest != null && !"".equals(xRequest.trim())) {
			queryBuffer.append("&" + "xRequest=" + xRequest);
		}
				
		return queryBuffer.toString();
	}
}
