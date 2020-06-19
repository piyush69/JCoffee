


class c6856320 {
public MyHelperClass assertNull(String o0, MyHelperClass o1){ return null; }
public MyHelperClass getConnection(ThreadSafeClientConnManager o0, HttpRoute o1){ return null; }
public MyHelperClass Helper;
	public MyHelperClass HttpVersion;
	public MyHelperClass EntityUtils;
	public MyHelperClass httpContext;
	public MyHelperClass httpExecutor;
	public MyHelperClass defaultParams;
	public MyHelperClass httpProcessor;
	public MyHelperClass createTSCCM(Object o0, Object o1){ return null; }
	public MyHelperClass getServerHttp(){ return null; }

    public void testConnectionManagerGC() throws Exception {
        ThreadSafeClientConnManager mgr =(ThreadSafeClientConnManager)(Object) createTSCCM(null, null);
        final HttpHost target =(HttpHost)(Object) getServerHttp();
        final HttpRoute route = new HttpRoute(target, null, false);
        final int rsplen = 8;
        final String uri = "/random/" + rsplen;
        HttpRequest request =(HttpRequest)(Object) new BasicHttpRequest("GET", uri, HttpVersion.HTTP_1_1);
        ManagedClientConnection conn =(ManagedClientConnection)(Object) getConnection(mgr, route);
        conn.open(route, httpContext, defaultParams);
        HttpResponse response =(HttpResponse)(Object) Helper.execute(request, conn, target, httpExecutor, httpProcessor, defaultParams, httpContext);
        EntityUtils.toByteArray(response.getEntity());
        conn.markReusable();
        mgr.releaseConnection(conn, -1, null);
        WeakReference wref = new WeakReference(mgr);
        mgr = null;
        System.gc();
        Thread.sleep(1000);
        assertNull("TSCCM not garbage collected", wref.get());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_1_1;
public MyHelperClass execute(HttpRequest o0, ManagedClientConnection o1, HttpHost o2, MyHelperClass o3, MyHelperClass o4, MyHelperClass o5, MyHelperClass o6){ return null; }
	public MyHelperClass toByteArray(MyHelperClass o0){ return null; }}

class ThreadSafeClientConnManager {

public MyHelperClass releaseConnection(ManagedClientConnection o0, int o1, Object o2){ return null; }}

class HttpHost {

}

class HttpRoute {

HttpRoute(HttpHost o0, Object o1, boolean o2){}
	HttpRoute(){}}

class HttpRequest {

}

class BasicHttpRequest {

BasicHttpRequest(String o0, String o1, MyHelperClass o2){}
	BasicHttpRequest(){}}

class ManagedClientConnection {

public MyHelperClass markReusable(){ return null; }
	public MyHelperClass open(HttpRoute o0, MyHelperClass o1, MyHelperClass o2){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class WeakReference {

WeakReference(){}
	WeakReference(ThreadSafeClientConnManager o0){}
	public MyHelperClass get(){ return null; }}
