import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19641319 {
public MyHelperClass MimeTypes;
public MyHelperClass assertTrue(boolean o0){ return null; }

    public void testDoPost() throws Throwable, Exception {
        URL url = null;
        MyHelperClass connector = new MyHelperClass();
        url = new URL("http://127.0.0.1:" + connector.getLocalPort() + "/test/dump/info?query=foo");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        connection.setDoInput(true);
        MyHelperClass HttpHeaders = new MyHelperClass();
        connection.addRequestProperty((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)HttpHeaders.CONTENT_TYPE, MimeTypes.FORM_ENCODED);
//        MyHelperClass HttpHeaders = new MyHelperClass();
        connection.addRequestProperty((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)HttpHeaders.CONTENT_LENGTH, "10");
        connection.getOutputStream().write("abcd=1234\n".getBytes());
        connection.getOutputStream().flush();
        connection.connect();
        MyHelperClass IO = new MyHelperClass();
        String s0 = IO.toString(connection.getInputStream());
        assertTrue(s0.startsWith("<html>"));
        assertTrue(s0.indexOf("<td>POST</td>") > 0);
        assertTrue(s0.indexOf("abcd:&nbsp;</th><td>1234") > 0);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CONTENT_TYPE;
	public MyHelperClass CONTENT_LENGTH;
	public MyHelperClass FORM_ENCODED;
public MyHelperClass getLocalPort(){ return null; }}

class Object {

public MyHelperClass toString(InputStream o0){ return null; }}
