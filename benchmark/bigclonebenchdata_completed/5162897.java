import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5162897 {
public MyHelperClass assertEquals(String o0, MyHelperClass o1){ return null; }
public MyHelperClass ClientPNames;
	public MyHelperClass ExecutionContext;
	public MyHelperClass HTTP;
	public MyHelperClass localServer;
	public MyHelperClass HttpStatus;
	public MyHelperClass getServerHttp(){ return null; }

    public void testDefaultHeadersRedirect() throws Throwable, Exception {
        String host = "localhost";
        int port =(int)(Object) this.localServer.getServicePort();
        this.localServer.register("*", new BasicRedirectService(host, port));
        DefaultHttpClient client = new DefaultHttpClient();
        HttpContext context =(HttpContext)(Object) new BasicHttpContext();
        List<Header> defaultHeaders = new ArrayList<Header>(1);
        defaultHeaders.add(new BasicHeader(HTTP.USER_AGENT, "my-test-client"));
        client.getParams().setParameter(ClientPNames.DEFAULT_HEADERS, defaultHeaders);
        HttpGet httpget = new HttpGet("/oldlocation/");
        HttpResponse response =(HttpResponse)(Object) client.execute(getServerHttp(), httpget, context);
        HttpEntity e =(HttpEntity)(Object) response.getEntity();
        if (e != null) {
            e.consumeContent();
        }
        HttpRequest reqWrapper = (HttpRequest) context.getAttribute(ExecutionContext.HTTP_REQUEST);
        assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
        assertEquals("/newlocation/", reqWrapper.getRequestLine().getUri());
        Header header = reqWrapper.getFirstHeader(HTTP.USER_AGENT);
        assertEquals("my-test-client", header.getValue());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_REQUEST;
	public MyHelperClass SC_OK;
	public MyHelperClass DEFAULT_HEADERS;
	public MyHelperClass USER_AGENT;
public MyHelperClass getServicePort(){ return null; }
	public MyHelperClass setParameter(MyHelperClass o0, List<Header o1){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getUri(){ return null; }
	public MyHelperClass register(String o0, BasicRedirectService o1){ return null; }}

class BasicRedirectService {

BasicRedirectService(String o0, int o1){}
	BasicRedirectService(){}}

class DefaultHttpClient {

public MyHelperClass getParams(){ return null; }
	public MyHelperClass execute(MyHelperClass o0, HttpGet o1, HttpContext o2){ return null; }}

class HttpContext {

public MyHelperClass getAttribute(MyHelperClass o0){ return null; }}

class BasicHttpContext {

}

class Header {

public MyHelperClass getValue(){ return null; }}

class BasicHeader {

BasicHeader(MyHelperClass o0, String o1){}
	BasicHeader(){}}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class HttpEntity {

public MyHelperClass consumeContent(){ return null; }}

class HttpRequest {

public MyHelperClass getFirstHeader(MyHelperClass o0){ return null; }
	public MyHelperClass getRequestLine(){ return null; }}
