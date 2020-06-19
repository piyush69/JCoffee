import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6856319 {
public MyHelperClass assertEquals(String o0, MyHelperClass o1, MyHelperClass o2){ return null; }
public MyHelperClass assertFalse(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getConnection(ThreadSafeClientConnManager o0, HttpRoute o1, long o2, MyHelperClass o3){ return null; }
public MyHelperClass createTSCCM(HttpParams o0, Object o1){ return null; }
	public MyHelperClass getConnection(ThreadSafeClientConnManager o0, HttpRoute o1){ return null; }
public MyHelperClass httpExecutor;
	public MyHelperClass Helper;
	public MyHelperClass httpContext;
	public MyHelperClass TimeUnit;
	public MyHelperClass defaultParams;
	public MyHelperClass httpProcessor;
	public MyHelperClass HttpVersion;
	public MyHelperClass HttpStatus;
	public MyHelperClass assertTrue(boolean o0){ return null; }
	public MyHelperClass fail(String o0){ return null; }
	public MyHelperClass getServerHttp(){ return null; }

    public void testReleaseConnectionOnAbort() throws Throwable, Exception {
        MyHelperClass defaultParams = new MyHelperClass();
        HttpParams mgrpar =(HttpParams)(Object) defaultParams.copy();
        MyHelperClass ConnManagerParams = new MyHelperClass();
        ConnManagerParams.setMaxTotalConnections(mgrpar, 1);
        ThreadSafeClientConnManager mgr =(ThreadSafeClientConnManager)(Object) createTSCCM(mgrpar, null);
        final HttpHost target =(HttpHost)(Object) getServerHttp();
        final HttpRoute route = new HttpRoute(target, null, false);
        final int rsplen = 8;
        final String uri = "/random/" + rsplen;
        HttpRequest request =(HttpRequest)(Object) new BasicHttpRequest("GET", uri, HttpVersion.HTTP_1_1);
        ManagedClientConnection conn =(ManagedClientConnection)(Object) getConnection(mgr, route);
        conn.open(route, httpContext, defaultParams);
        HttpResponse response =(HttpResponse)(Object) Helper.execute(request, conn, target, httpExecutor, httpProcessor, defaultParams, httpContext);
        assertEquals("wrong status in first response", HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
        try {
            getConnection(mgr, route, 100L, TimeUnit.MILLISECONDS);
            fail("ConnectionPoolTimeoutException should have been thrown");
        } catch (UncheckedIOException e) {
        }
        assertTrue((AbstractClientConnAdapter)(Object)conn instanceof AbstractClientConnAdapter);
        ((AbstractClientConnAdapter)(AbstractClientConnAdapter)(Object) conn).abortConnection();
        conn =(ManagedClientConnection)(Object) getConnection(mgr, route, 5L, TimeUnit.SECONDS);
        assertFalse("connection should have been closed", conn.isOpen());
        mgr.releaseConnection(conn, -1, null);
        mgr.shutdown();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MILLISECONDS;
	public MyHelperClass SC_OK;
	public MyHelperClass SECONDS;
	public MyHelperClass HTTP_1_1;
public MyHelperClass copy(){ return null; }
	public MyHelperClass setMaxTotalConnections(HttpParams o0, int o1){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass execute(HttpRequest o0, ManagedClientConnection o1, HttpHost o2, MyHelperClass o3, MyHelperClass o4, MyHelperClass o5, MyHelperClass o6){ return null; }}

class HttpParams {

}

class ThreadSafeClientConnManager {

public MyHelperClass shutdown(){ return null; }
	public MyHelperClass releaseConnection(ManagedClientConnection o0, int o1, Object o2){ return null; }}

class HttpHost {

}

class HttpRoute {

HttpRoute(){}
	HttpRoute(HttpHost o0, Object o1, boolean o2){}}

class HttpRequest {

}

class BasicHttpRequest {

BasicHttpRequest(String o0, String o1, MyHelperClass o2){}
	BasicHttpRequest(){}}

class ManagedClientConnection {

public MyHelperClass open(HttpRoute o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass isOpen(){ return null; }}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }}

class ConnectionPoolTimeoutException extends Exception{
	public ConnectionPoolTimeoutException(String errorMessage) { super(errorMessage); }
}

class AbstractClientConnAdapter {

public MyHelperClass abortConnection(){ return null; }}
