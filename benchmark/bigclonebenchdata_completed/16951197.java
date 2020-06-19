
import java.io.UncheckedIOException;


class c16951197 {
public MyHelperClass assertEquals(int o0, MyHelperClass o1){ return null; }
public MyHelperClass createTSCCM(HttpParams o0, Object o1){ return null; }
	public MyHelperClass assertNotNull(HttpEntity o0){ return null; }
public MyHelperClass TimeUnit;
	public MyHelperClass getServerHttp(){ return null; }
	public MyHelperClass fail(String o0){ return null; }

    public void testReleaseOnEntityWriteTo() throws Exception {
        MyHelperClass defaultParams = new MyHelperClass();
        HttpParams params =(HttpParams)(Object) defaultParams.copy();
        MyHelperClass ConnManagerParams = new MyHelperClass();
        ConnManagerParams.setMaxTotalConnections(params, 1);
//        MyHelperClass ConnManagerParams = new MyHelperClass();
        ConnManagerParams.setMaxConnectionsPerRoute(params, new ConnPerRouteBean(1));
        ThreadSafeClientConnManager mgr =(ThreadSafeClientConnManager)(Object) createTSCCM(params, null);
        assertEquals(0, mgr.getConnectionsInPool());
        DefaultHttpClient client = new DefaultHttpClient(mgr, params);
        HttpGet httpget = new HttpGet("/random/20000");
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
        ByteArrayOutputStream outsteam = new ByteArrayOutputStream();
        e.writeTo(outsteam);
        assertEquals(1, mgr.getConnectionsInPool());
        connreq =(ClientConnectionRequest)(Object) mgr.requestConnection(new HttpRoute(target), null);
        ManagedClientConnection conn =(ManagedClientConnection)(Object) connreq.getConnection(250, TimeUnit.MILLISECONDS);
        mgr.releaseConnection(conn, -1, null);
        mgr.shutdown();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MILLISECONDS;
public MyHelperClass copy(){ return null; }
	public MyHelperClass setMaxConnectionsPerRoute(HttpParams o0, ConnPerRouteBean o1){ return null; }
	public MyHelperClass setMaxTotalConnections(HttpParams o0, int o1){ return null; }}

class HttpParams {

}

class ConnPerRouteBean {

ConnPerRouteBean(int o0){}
	ConnPerRouteBean(){}}

class ThreadSafeClientConnManager {

public MyHelperClass releaseConnection(ManagedClientConnection o0, int o1, Object o2){ return null; }
	public MyHelperClass requestConnection(HttpRoute o0, Object o1){ return null; }
	public MyHelperClass shutdown(){ return null; }
	public MyHelperClass getConnectionsInPool(){ return null; }}

class DefaultHttpClient {

DefaultHttpClient(ThreadSafeClientConnManager o0, HttpParams o1){}
	DefaultHttpClient(){}
	public MyHelperClass execute(HttpHost o0, HttpGet o1){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpHost {

}

class HttpResponse {

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

public MyHelperClass writeTo(ByteArrayOutputStream o0){ return null; }}

class ByteArrayOutputStream {

}

class ManagedClientConnection {

}
