import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16634836 {
public MyHelperClass when(URLConnection o0){ return null; }
	public MyHelperClass mock(URL o0){ return null; }
	public MyHelperClass assertSame(URLConnection o0, URLConnection o1){ return null; }
	public MyHelperClass mock(URLConnection o0){ return null; }

//    @Test
    public void mockingURLWorks() throws Throwable, Exception {
        URL url =(URL)(Object) mock((URL)(Object)URL.class);
        URLConnection urlConnectionMock =(URLConnection)(Object) mock((URL)(Object)URLConnection.class);
        when(url.openConnection()).thenReturn(urlConnectionMock);
        URLConnection openConnection = url.openConnection();
        assertSame(openConnection, urlConnectionMock);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass thenReturn(URLConnection o0){ return null; }}

class Test {

}
