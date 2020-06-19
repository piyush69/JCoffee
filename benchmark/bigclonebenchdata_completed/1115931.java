import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c1115931 {
public MyHelperClass assertEquals(int o0, int o1){ return null; }
	public MyHelperClass assertNull(String o0){ return null; }
	public MyHelperClass assertEquals(String o0, String o1){ return null; }

    public void testSetRequestProperty() throws Exception {
        MockHTTPServer httpServer = new MockHTTPServer("HTTP Server for User-Specified Request Property", 2);
        httpServer.start();
        MyHelperClass bound = new MyHelperClass();
        synchronized (bound) {
            if (!(Boolean)(Object)httpServer.started) {
//                MyHelperClass bound = new MyHelperClass();
                bound.wait(5000);
            }
        }
        HttpURLConnection urlConnection = (HttpURLConnection) new URL("http://localhost:" + httpServer.port()).openConnection();
        assertEquals(0, urlConnection.getRequestProperties().size());
        final String PROPERTY1 = "Accept";
        final String PROPERTY2 = "Connection";
        urlConnection.setRequestProperty(PROPERTY1, null);
        urlConnection.setRequestProperty(PROPERTY1, null);
        urlConnection.setRequestProperty(PROPERTY2, "keep-alive");
        assertEquals(2, urlConnection.getRequestProperties().size());
        assertNull(urlConnection.getRequestProperty(PROPERTY1));
        assertEquals("keep-alive", urlConnection.getRequestProperty(PROPERTY2));
        urlConnection.setRequestProperty(PROPERTY1, "/");
        urlConnection.setRequestProperty(PROPERTY2, null);
        assertEquals("/", urlConnection.getRequestProperty(PROPERTY1));
        assertNull(urlConnection.getRequestProperty(PROPERTY2));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MockHTTPServer {
public MyHelperClass started;
MockHTTPServer(String o0, int o1){}
	MockHTTPServer(){}
	public MyHelperClass port(){ return null; }
	public MyHelperClass start(){ return null; }}
