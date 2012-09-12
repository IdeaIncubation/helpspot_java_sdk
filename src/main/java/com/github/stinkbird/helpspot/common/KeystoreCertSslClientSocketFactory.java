package com.github.stinkbird.helpspot.common;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

import org.apache.commons.httpclient.ConnectTimeoutException;
import org.apache.commons.httpclient.params.HttpConnectionParams;
import org.apache.commons.httpclient.protocol.SecureProtocolSocketFactory; 

/**
 * SecureProtocolSocketFactory from keystore file.
 * 
 * @author bbrahmbhatt
 *
 */
public class KeystoreCertSslClientSocketFactory implements SecureProtocolSocketFactory
{
    private static class CustomUserDefinedTrustManager implements X509TrustManager
    {
    	
    	private final X509TrustManager x509TrustManager;
        private X509Certificate x509CertificateChain[];
        
        CustomUserDefinedTrustManager(X509TrustManager trustManager)
        {
            this.x509TrustManager = trustManager;
        }

        public X509Certificate[] getAcceptedIssuers()
        {
            throw new UnsupportedOperationException();
        }

        public void checkClientTrusted(X509Certificate chain[], String authType)
            throws CertificateException
        {
            throw new UnsupportedOperationException();
        }

        public void checkServerTrusted(X509Certificate chain[], String authType)
            throws CertificateException
        {
            this.x509CertificateChain = chain;
            x509TrustManager.checkServerTrusted(chain, authType);
        }        
    }

    public KeystoreCertSslClientSocketFactory(KeyStore ks) throws NoSuchAlgorithmException, KeyManagementException, GeneralSecurityException
    {
        sslSecurityContext = SSLContext.getInstance("TLS");
        CustomUserDefinedTrustManager customManager = null;
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX");
        try
        {
            trustManagerFactory.init(ks);
            TrustManager trustMangers[] = trustManagerFactory.getTrustManagers();
            int length = trustMangers.length;
            for(int i = 0; i < length; i++)
            {
                TrustManager trustManager = trustMangers[i];
                if(trustManager instanceof X509TrustManager)
                {
                    X509TrustManager defaultmanager = (X509TrustManager)trustManager;
                    customManager = new CustomUserDefinedTrustManager(defaultmanager);
                }
            }

            sslSecurityContext.init(null, new TrustManager[] {customManager, 
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
											
											                    final KeystoreCertSslClientSocketFactory this$0;								
											            
													            {
													                this$0 = KeystoreCertSslClientSocketFactory.this;
													            }
										                  }
									
									                  }, null);
        }
        catch(GeneralSecurityException exp)
        {
            throw new GeneralSecurityException("There is some unknown problem in certificate");
        }
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
