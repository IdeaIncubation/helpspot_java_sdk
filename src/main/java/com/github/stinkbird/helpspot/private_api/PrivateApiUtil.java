package com.github.stinkbird.helpspot.private_api;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.httpclient.Credentials;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethodBase;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.protocol.Protocol;
import org.apache.commons.httpclient.protocol.ProtocolSocketFactory;

import com.github.stinkbird.helpspot.private_api.exception.InitializationException;
import com.github.stinkbird.helpspot.private_api.exception.ValidationException;

/**
 * This is a private-api facade object.
 * 
 * All Private Api calls are implemented by help of this utility. 
 * 
 * @author bbrahmbhatt
 *
 */
public class PrivateApiUtil {
	
	private static final String PROTOCOL = "stinkbirdhelpspot";

	private HttpClient client;
		
	private String helpSpotHostNameOrIPAddress;		
	
	private static PrivateApiUtil singletonRef;
	
	private PrivateApiUtil(String helpSpotHostNameOrIPAddress, 
			               int portNumber,
			               boolean isSecureHttp,
			               ProtocolSocketFactory protocolSocketFactory,
			               String helpSpotAdminUsername,
			               String helpSpotAdminPassword) {
		
		boolean isHostProvided = helpSpotHostNameOrIPAddress != null && !"".equals(helpSpotHostNameOrIPAddress.trim());
		boolean isPortProvided = portNumber <= 0;
		boolean isProtocolSocketFactoryProvided = protocolSocketFactory != null;
		boolean isHostUsernameProvided = helpSpotAdminUsername != null && !"".equals(helpSpotAdminUsername.trim());
		boolean isHostPasswordProvided = helpSpotAdminPassword != null && !"".equals(helpSpotAdminPassword.trim());
		
		if(isHostProvided && isPortProvided && isProtocolSocketFactoryProvided && isHostUsernameProvided && isHostPasswordProvided) {
			
			this.client = new HttpClient();
			
			Credentials defaultcreds = new UsernamePasswordCredentials(helpSpotAdminUsername.trim(), helpSpotAdminPassword.trim());
			this.client.getState().setCredentials(new AuthScope(helpSpotHostNameOrIPAddress.trim(), portNumber, AuthScope.ANY_REALM), defaultcreds);			
			
			Protocol.registerProtocol(PROTOCOL, new Protocol(isSecureHttp == true? "https" : "http", protocolSocketFactory, portNumber));
			
			this.helpSpotHostNameOrIPAddress = helpSpotHostNameOrIPAddress;
			
		} else {
			StringBuffer message = new StringBuffer();
			if(!isHostProvided) {
				message.append("Host Name OR Host IP Address is not provided. ");
			}
			if(!isPortProvided) {
				message.append("Port number is not provided. ");
			}
			if(!isProtocolSocketFactoryProvided) {
				message.append("ProtocolSocketFactory is not provided. ");
			}
			if(!isHostUsernameProvided) {
				message.append("Host username is not provided. ");
			}
			if(!isHostPasswordProvided) {
				message.append("Host password is not provided. ");
			}
			throw new InitializationException(message.toString());
		}
		
	}
	
	/**
	 * Do not allow cloning 
	 */
	public Object clone()
	throws CloneNotSupportedException
	{
		throw new CloneNotSupportedException();     
	}
	
	public static PrivateApiUtil getInstanceOf(String helpSpotHostNameOrIPAddress, 
									           int portNumber,
									           boolean isSecureHttp,
									           ProtocolSocketFactory protocolSocketFactory,
									           String helpSpotAdminUsername,
									           String helpSpotAdminPassword) {
	    if (singletonRef == null) {
	    	singletonRef = new PrivateApiUtil(helpSpotHostNameOrIPAddress, 
									          portNumber,
									          isSecureHttp,
									          protocolSocketFactory,
									          helpSpotAdminUsername,
									          helpSpotAdminPassword);
	    }
	    
	    return singletonRef;
	}
	
	private PostMethod getPostMethod(String queryString) {
		return new PostMethod(PROTOCOL + "://" + helpSpotHostNameOrIPAddress + "/api/index.php?"+queryString);
	}
	
	private GetMethod getGetMethod(String queryString) {
		return new GetMethod(PROTOCOL + "://" + helpSpotHostNameOrIPAddress + "/api/index.php?"+queryString);
	}
	
	/**
	 * This method calls private.request.get method on private api of helpspot. 
	 * 
	 * It retrieves detail information about particular helpspot request with all notes stored in request history log. 
	 * 
	 * @return Request
	 * @throws IOException 
	 * @throws HttpException 
	 * @throws JAXBException 
	 */
	public com.github.stinkbird.helpspot.private_api.response_for.request.get.Request callPrivateRequestGet(String xRequest, 
																											boolean isPostRequest) 
	throws HttpException, IOException, JAXBException {
		
		// define private method base
		String methodName = "private.request.get";
		
		// Validate Required parameters
		boolean isXRequestPresent = xRequest != null && !"".equals(xRequest.trim());
		if(!isXRequestPresent) {
			throw new ValidationException("xRequest is required parameter to call private.request.get on helpspot private api.");
		} 
		
		// Prepare query string
		String queryString = "method=" + methodName + "&" + "xRequest=" + xRequest;
		
		// Prepare method base
		HttpMethodBase methodBase = isPostRequest ? getPostMethod(queryString) : getGetMethod(queryString);
		
		// Make api call on method base
		client.executeMethod(methodBase);
		
		// Unmarshall the response object
		JAXBContext jc = JAXBContext.newInstance( com.github.stinkbird.helpspot.private_api.response_for.request.get.Request.class.getPackage().getName() );
		Unmarshaller u = jc.createUnmarshaller();
		StringBuffer xmlStr = new StringBuffer( methodBase.getResponseBodyAsString() );
		return (com.github.stinkbird.helpspot.private_api.response_for.request.get.Request) u.unmarshal( new StreamSource( new StringReader( xmlStr.toString() ) ) );
		
	}

}
