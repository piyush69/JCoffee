import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3277049 {

    public java.security.cert.X509Certificate[] getServerCerts() throws Throwable, IOException {
        MyHelperClass theURL = new MyHelperClass();
        String callURL =(String)(Object) theURL;
        callURL += "?method=test";
        java.net.HttpURLConnection conn;
        java.net.URL url = new java.net.URL(callURL);
        conn = (java.net.HttpURLConnection) url.openConnection();
        MyHelperClass isFollowingRedirects = new MyHelperClass();
        if (isFollowingRedirects != null) conn.setInstanceFollowRedirects((boolean)(Object)isFollowingRedirects.booleanValue());
        MyHelperClass theConnectTimeout = new MyHelperClass();
        if ((int)(Object)theConnectTimeout >= 0) conn.setConnectTimeout((int)(Object)theConnectTimeout);
        MyHelperClass theReadTimeout = new MyHelperClass();
        if ((int)(Object)theReadTimeout >= 0) conn.setReadTimeout((int)(Object)theReadTimeout);
        if (conn instanceof javax.net.ssl.HttpsURLConnection) {
            SecurityRetriever retriever = new SecurityRetriever();
            javax.net.ssl.SSLContext sc;
            try {
                sc = javax.net.ssl.SSLContext.getInstance("SSL");
                MyHelperClass theKeyManagers = new MyHelperClass();
                sc.init((javax.net.ssl.KeyManager[])(Object)(KeyManager[])(Object)theKeyManagers, new javax.net.ssl.TrustManager[] {(javax.net.ssl.TrustManager)(Object)(TrustManager)(Object) retriever }, new java.security.SecureRandom());
            } catch (java.security.GeneralSecurityException e) {
                MyHelperClass log = new MyHelperClass();
                log.error("Could not initialize SSL context", e);
                IOException toThrow = new IOException("Could not initialize SSL context: " + e.getMessage());
                toThrow.setStackTrace(e.getStackTrace());
                throw toThrow;
            }
            javax.net.ssl.HttpsURLConnection sConn = (javax.net.ssl.HttpsURLConnection) conn;
            sConn.setSSLSocketFactory(sc.getSocketFactory());
            sConn.setHostnameVerifier(new javax.net.ssl.HostnameVerifier() {

                public boolean verify(String hostname, javax.net.ssl.SSLSession session) {
                    return true;
                }
            });
            try {
                conn.connect();
            } catch (IOException e) {
                if (retriever.getCerts() == null) throw e;
            }
            return((java.security.cert.X509Certificate[])(Object)X509Certificate[])(Object) retriever.getCerts();
        } else return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass booleanValue(){ return null; }
	public MyHelperClass error(String o0, GeneralSecurityException o1){ return null; }}

class SecurityRetriever {

public MyHelperClass getCerts(){ return null; }}

class TrustManager {

}

class KeyManager {

}

class X509Certificate {

}
