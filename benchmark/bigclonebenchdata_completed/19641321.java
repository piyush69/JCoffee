import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19641321 {
public MyHelperClass assertFalse(MyHelperClass o0){ return null; }
	public MyHelperClass assertTrue(MyHelperClass o0){ return null; }

    public void testUnavailable() throws Throwable, Exception {
        URL url = null;
        MyHelperClass connector = new MyHelperClass();
        url = new URL("http://127.0.0.1:" + connector.getLocalPort() + "/test/dump/info?query=foo");
        MyHelperClass IO = new MyHelperClass();
        assertTrue(IO.toString(url.openStream()).startsWith("<html>"));
        MyHelperClass context = new MyHelperClass();
        assertTrue(context.getServletHandler().isAvailable());
//        MyHelperClass connector = new MyHelperClass();
        url = new URL("http://127.0.0.1:" + connector.getLocalPort() + "/test/dump/ex2/2");
        try {
//            MyHelperClass IO = new MyHelperClass();
            IO.toString(url.openStream());
        } catch (IOException e) {
        }
//        MyHelperClass context = new MyHelperClass();
        assertFalse(context.getServletHandler().isAvailable());
        Thread.sleep(4000);
//        MyHelperClass context = new MyHelperClass();
        assertTrue(context.getServletHandler().isAvailable());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isAvailable(){ return null; }
	public MyHelperClass getLocalPort(){ return null; }
	public MyHelperClass getServletHandler(){ return null; }}

class Object {

public MyHelperClass toString(InputStream o0){ return null; }}
