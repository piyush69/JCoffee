import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14267524 {
public MyHelperClass readStream(MyHelperClass o0, InputStream o1){ return null; }
public MyHelperClass content;
	public MyHelperClass responseCode;
	public MyHelperClass responseHeader;
	public MyHelperClass responseURL;
	public MyHelperClass inputStream;
	public MyHelperClass length;
	public MyHelperClass charset;

    public  void Web(String urlString, String charset) throws Throwable, java.net.MalformedURLException, java.io.IOException {
        this.charset =(MyHelperClass)(Object) charset;
        final java.net.URL url = new java.net.URL(urlString);
        final java.net.URLConnection uconn = url.openConnection();
        if (!(uconn instanceof java.net.HttpURLConnection)) throw new java.lang.IllegalArgumentException("URL protocol must be HTTP.");
        final java.net.HttpURLConnection conn = (java.net.HttpURLConnection) uconn;
        conn.setConnectTimeout(600000);
        conn.setReadTimeout(600000);
        conn.setInstanceFollowRedirects(true);
        conn.setRequestProperty("User-agent", "spider");
        conn.connect();
        responseHeader =(MyHelperClass)(Object) conn.getHeaderFields();
        responseCode =(MyHelperClass)(Object) conn.getResponseCode();
        responseURL =(MyHelperClass)(Object) conn.getURL();
        length =(MyHelperClass)(Object) conn.getContentLength();
        final java.io.InputStream stream = conn.getErrorStream();
        if (stream != null) {
            content = readStream(length, stream);
        } else if ((inputStream =(MyHelperClass)(Object)(MyHelperClass[])(Object) conn.getContent()) != null &&(InputStream)(Object) inputStream instanceof java.io.InputStream) {
            content = readStream(length, (java.io.InputStream)(InputStream)(Object) inputStream);
        }
        conn.disconnect();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
