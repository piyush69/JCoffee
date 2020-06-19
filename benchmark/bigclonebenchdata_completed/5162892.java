import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c5162892 {
public MyHelperClass assertEquals(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass assertEquals(int o0, MyHelperClass o1){ return null; }
public MyHelperClass ExecutionContext;
	public MyHelperClass ClientPNames;
	public MyHelperClass HttpStatus;
	public MyHelperClass localServer;
	public MyHelperClass getServerHttp(){ return null; }

    public void testRelativeRedirect2() throws Exception {
        int port =(int)(Object) this.localServer.getServicePort();
        String host =(String)(Object) this.localServer.getServiceHostName();
        this.localServer.register("*", new RelativeRedirectService2());
        DefaultHttpClient client = new DefaultHttpClient();
        HttpContext context =(HttpContext)(Object) new BasicHttpContext();
        client.getParams().setBooleanParameter(ClientPNames.REJECT_RELATIVE_REDIRECT, false);
        HttpGet httpget = new HttpGet("/test/oldlocation");
        HttpResponse response =(HttpResponse)(Object) client.execute(getServerHttp(), httpget, context);
        HttpEntity e =(HttpEntity)(Object) response.getEntity();
        if (e != null) {
            e.consumeContent();
        }
        HttpRequest reqWrapper = (HttpRequest)(HttpRequest)(Object) context.getAttribute(ExecutionContext.HTTP_REQUEST);
        HttpHost targetHost = (HttpHost)(HttpHost)(Object) context.getAttribute(ExecutionContext.HTTP_TARGET_HOST);
        assertEquals((String)(Object)HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
        assertEquals("/test/relativelocation", reqWrapper.getRequestLine().getUri());
        assertEquals(host, targetHost.getHostName());
        assertEquals(port, targetHost.getPort());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
	public MyHelperClass HTTP_REQUEST;
	public MyHelperClass HTTP_TARGET_HOST;
	public MyHelperClass REJECT_RELATIVE_REDIRECT;
public MyHelperClass setBooleanParameter(MyHelperClass o0, boolean o1){ return null; }
	public MyHelperClass register(String o0, RelativeRedirectService2 o1){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getServicePort(){ return null; }
	public MyHelperClass getServiceHostName(){ return null; }
	public MyHelperClass getUri(){ return null; }}

class RelativeRedirectService2 {

}

class DefaultHttpClient {

public MyHelperClass execute(MyHelperClass o0, HttpGet o1, HttpContext o2){ return null; }
	public MyHelperClass getParams(){ return null; }}

class HttpContext {

public MyHelperClass getAttribute(MyHelperClass o0){ return null; }}

class BasicHttpContext {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class HttpEntity {

public MyHelperClass consumeContent(){ return null; }}

class HttpRequest {

public MyHelperClass getRequestLine(){ return null; }}

class HttpHost {

public MyHelperClass getHostName(){ return null; }
	public MyHelperClass getPort(){ return null; }}
