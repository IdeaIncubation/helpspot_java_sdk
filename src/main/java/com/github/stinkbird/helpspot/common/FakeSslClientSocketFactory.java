package com.github.stinkbird.helpspot.common;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.commons.httpclient.ConnectTimeoutException;
import org.apache.commons.httpclient.params.HttpConnectionParams;
import org.apache.commons.httpclient.protocol.SecureProtocolSocketFactory;

/**
 * This SSL factory is used to fake SSL certificate. Do not use this in production environment. 
 * 
 * @author bbrahmbhatt
 *
 */
public class FakeSslClientSocketFactory implements SecureProtocolSocketFactory
{
   
    public FakeSslClientSocketFactory() throws NoSuchAlgorithmException, KeyManagementException
    {
        sslSecurityContext = SSLContext.getInstance("SSL");        

        sslSecurityContext.init(null, new TrustManager[] { 
									            	  new X509TrustManager() {
										            	            	
										                    public void checkClientTrusted(X509Certificate ax509certificate1[], String s1)
										                        throws CertificateException
										                    {
										                    }
										
										                    public void checkServerTrusted(X509Certificate ax509certificate1[], String s1)
										                        throws CertificateException
										                    {
										                    }
										
										                    public X509Certificate[] getAcceptedIssuers()
										                    {
										                        return new X509Certificate[0];
										                    }
										
										                    final FakeSslClientSocketFactory this$0;								
										            
												            {
												                this$0 = FakeSslClientSocketFactory.this;
												            }
									                  }
								
								                  }, null);
      
    }

    public Socket createSocket(String s, int i)
        throws IOException, UnknownHostException
    {
        return sslSecurityContext.getSocketFactory().createSocket(s, i);
    }

    public Socket createSocket(String s, int i, InetAddress inetaddress, int j)
        throws IOException, UnknownHostException
    {
        return sslSecurityContext.getSocketFactory().createSocket(s, i, inetaddress, j);
    }

    public Socket createSocket(String s, int i, InetAddress inetaddress, int j, HttpConnectionParams httpconnectionparams)
        throws IOException, UnknownHostException, ConnectTimeoutException
    {
        return sslSecurityContext.getSocketFactory().createSocket(s, i, inetaddress, j);
    }

    public Socket createSocket(Socket socket, String s, int i, boolean flag)
        throws IOException, UnknownHostException
    {
        return sslSecurityContext.getSocketFactory().createSocket(socket, s, i, flag);
    }

    private SSLContext sslSecurityContext;
}

