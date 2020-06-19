import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10177738 {
public MyHelperClass useHTTPProxy;
	public MyHelperClass proxyPort;
	public MyHelperClass proxyHost;
	public MyHelperClass getServerURL(){ return null; }
	public MyHelperClass getProxyPassword(){ return null; }
	public MyHelperClass getProxyLogin(){ return null; }

    public HttpURLConnection getURLConnection() throws Throwable, IOException {
        String url_str =(String)(Object) getServerURL();
        URL url = new URL(url_str);
        HttpURLConnection urlConnection;
        if (url_str.toLowerCase().startsWith("https")) {
            HttpsURLConnection urlSConnection = (HttpsURLConnection)(HttpsURLConnection)(Object) url.openConnection();
            urlSConnection.setHostnameVerifier(new HostnameVerifier() {

                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });
            urlConnection =(HttpURLConnection)(Object) urlSConnection;
        } else urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("POST");
        if ((boolean)(Object)useHTTPProxy && getProxyLogin() != null) {
            String authString = getProxyLogin() + ":" + getProxyPassword();
            String auth = "Basic " + new sun.misc.BASE64Encoder().encode(authString.getBytes());
            urlConnection.setRequestProperty("Proxy-Authorization", auth);
        }
        urlConnection.setDoOutput(true);
        if ((boolean)(Object)useHTTPProxy) {
            System.getProperties().put("proxySet", "true");
            System.getProperties().put("proxyHost", proxyHost);
            System.getProperties().put("proxyPort", String.valueOf(proxyPort));
        }
        return urlConnection;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpsURLConnection {

public MyHelperClass setHostnameVerifier( HostnameVerifier o0){ return null; }
	public MyHelperClass setHostnameVerifier(){ return null; }}

class HostnameVerifier {

}

class SSLSession {

}
