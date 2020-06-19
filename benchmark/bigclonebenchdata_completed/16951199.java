import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16951199 {
public MyHelperClass assertEquals(int o0, MyHelperClass o1){ return null; }
public MyHelperClass createTSCCM(HttpParams o0, Object o1){ return null; }
	public MyHelperClass assertNotNull(HttpEntity o0){ return null; }
public MyHelperClass TimeUnit;
	public MyHelperClass EntityUtils;
	public MyHelperClass getServerHttp(){ return null; }
	public MyHelperClass fail(String o0){ return null; }

    public void testReleaseOnIOException() throws Throwable, Exception {
        MyHelperClass localServer = new MyHelperClass();
        localServer.register("/dropdead", new HttpRequestHandler() {

            public void handle(final HttpRequest request, final HttpResponse response, final HttpContext context) throws HttpException, IOException {
                BasicHttpEntity entity = new BasicHttpEntity() {

//                    @Override
                    public void writeTo(final OutputStream outstream) throws IOException {
                        byte[] tmp = new byte[5];
                        outstream.write(tmp);
                        outstream.flush();
                        MyHelperClass ExecutionContext = new MyHelperClass();
                        DefaultHttpServerConnection conn = (DefaultHttpServerConnection)(DefaultHttpServerConnection)(Object) context.getAttribute(ExecutionContext.HTTP_CONNECTION);
                        try {
                            conn.sendResponseHeader(response);
                        } catch (UncheckedIOException ignore) {
                        }
                    }
                };
                entity.setChunked(true);
                response.setEntity(entity);
            }
        });
        MyHelperClass defaultParams = new MyHelperClass();
        HttpParams params =(HttpParams)(Object) defaultParams.copy();
        MyHelperClass ConnManagerParams = new MyHelperClass();
        ConnManagerParams.setMaxTotalConnections(params, 1);
//        MyHelperClass ConnManagerParams = new MyHelperClass();
        ConnManagerParams.setMaxConnectionsPerRoute(params, new ConnPerRouteBean(1));
        ThreadSafeClientConnManager mgr =(ThreadSafeClientConnManager)(Object) createTSCCM(params, null);
        assertEquals(0, mgr.getConnectionsInPool());
        DefaultHttpClient client = new DefaultHttpClient(mgr, params);
        HttpGet httpget = new HttpGet("/dropdead");
        HttpHost target =(HttpHost)(Object) getServerHttp();
        HttpResponse response =(HttpResponse)(Object) client.execute(target, httpget);
        ClientConnectionRequest connreq =(ClientConnectionRequest)(Object) mgr.requestConnection(new HttpRoute(target), null);
        try {
            connreq.getConnection(250, TimeUnit.MILLISECONDS);
            fail("ConnectionPoolTimeoutException should have been thrown");
        } catch (UncheckedIOException expected) {
        }
        HttpEntity e =(HttpEntity)(Object) response.getEntity();
        assertNotNull(e);
        try {
            EntityUtils.toByteArray(e);
            fail("MalformedChunkCodingException should have been thrown");
        } catch (UncheckedIOException expected) {
        }
        assertEquals(0, mgr.getConnectionsInPool());
        connreq =(ClientConnectionRequest)(Object) mgr.requestConnection(new HttpRoute(target), null);
        ManagedClientConnection conn =(ManagedClientConnection)(Object) connreq.getConnection(250, TimeUnit.MILLISECONDS);
        mgr.releaseConnection(conn, -1, null);
        mgr.shutdown();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MILLISECONDS;
	public MyHelperClass HTTP_CONNECTION;
public MyHelperClass toByteArray(HttpEntity o0){ return null; }
	public MyHelperClass register(String o0){ return null; }
	public MyHelperClass register(String o0,  HttpRequestHandler o1){ return null; }
	public MyHelperClass copy(){ return null; }
	public MyHelperClass setMaxTotalConnections(HttpParams o0, int o1){ return null; }
	public MyHelperClass setMaxConnectionsPerRoute(HttpParams o0, ConnPerRouteBean o1){ return null; }}

class HttpRequestHandler {

}

class HttpParams {

}

class ConnPerRouteBean {

ConnPerRouteBean(){}
	ConnPerRouteBean(int o0){}}

class ThreadSafeClientConnManager {

public MyHelperClass shutdown(){ return null; }
	public MyHelperClass requestConnection(HttpRoute o0, Object o1){ return null; }
	public MyHelperClass getConnectionsInPool(){ return null; }
	public MyHelperClass releaseConnection(ManagedClientConnection o0, int o1, Object o2){ return null; }}

class DefaultHttpClient {

DefaultHttpClient(){}
	DefaultHttpClient(ThreadSafeClientConnManager o0, HttpParams o1){}
	public MyHelperClass execute(HttpHost o0, HttpGet o1){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpHost {

}

class HttpResponse {

public MyHelperClass setEntity(BasicHttpEntity o0){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class ClientConnectionRequest {

public MyHelperClass getConnection(int o0, MyHelperClass o1){ return null; }}

class HttpRoute {

HttpRoute(){}
	HttpRoute(HttpHost o0){}}

class ConnectionPoolTimeoutException extends Exception{
	public ConnectionPoolTimeoutException(String errorMessage) { super(errorMessage); }
}

class HttpEntity {

}

class MalformedChunkCodingException extends Exception{
	public MalformedChunkCodingException(String errorMessage) { super(errorMessage); }
}

class ManagedClientConnection {

}

class HttpRequest {

}

class HttpContext {

public MyHelperClass getAttribute(MyHelperClass o0){ return null; }}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}

class BasicHttpEntity {

public MyHelperClass setChunked(boolean o0){ return null; }}

class DefaultHttpServerConnection {

public MyHelperClass sendResponseHeader(HttpResponse o0){ return null; }}
