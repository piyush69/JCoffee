import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c5162896 {
public MyHelperClass assertEquals(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass assertEquals(String o0, MyHelperClass o1){ return null; }
public MyHelperClass ExecutionContext;
	public MyHelperClass HttpStatus;
	public MyHelperClass SM;
	public MyHelperClass localServer;
	public MyHelperClass getServerHttp(){ return null; }
	public MyHelperClass assertEquals(String o0, int o1, int o2){ return null; }

    public void testRedirectWithCookie() throws Exception {
        String host = "localhost";
        int port =(int)(Object) this.localServer.getServicePort();
        this.localServer.register("*", new BasicRedirectService(host, port));
        DefaultHttpClient client = new DefaultHttpClient();
        CookieStore cookieStore =(CookieStore)(Object) new BasicCookieStore();
        client.setCookieStore(cookieStore);
        BasicClientCookie cookie = new BasicClientCookie("name", "value");
        cookie.setDomain("localhost");
        cookie.setPath("/");
        cookieStore.addCookie(cookie);
        HttpContext context =(HttpContext)(Object) new BasicHttpContext();
        HttpGet httpget = new HttpGet("/oldlocation/");
        HttpResponse response =(HttpResponse)(Object) client.execute(getServerHttp(), httpget, context);
        HttpEntity e =(HttpEntity)(Object) response.getEntity();
        if (e != null) {
            e.consumeContent();
        }
        HttpRequest reqWrapper = (HttpRequest)(HttpRequest)(Object) context.getAttribute(ExecutionContext.HTTP_REQUEST);
        assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
        assertEquals("/newlocation/", reqWrapper.getRequestLine().getUri());
        Header[] headers =(Header[])(Object) reqWrapper.getHeaders(SM.COOKIE);
        assertEquals("There can only be one (cookie)", 1, headers.length);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
	public MyHelperClass HTTP_REQUEST;
	public MyHelperClass COOKIE;
public MyHelperClass register(String o0, BasicRedirectService o1){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getServicePort(){ return null; }
	public MyHelperClass getUri(){ return null; }}

class BasicRedirectService {

BasicRedirectService(String o0, int o1){}
	BasicRedirectService(){}}

class DefaultHttpClient {

public MyHelperClass setCookieStore(CookieStore o0){ return null; }
	public MyHelperClass execute(MyHelperClass o0, HttpGet o1, HttpContext o2){ return null; }}

class BasicCookieStore {

}

class BasicClientCookie {

BasicClientCookie(String o0, String o1){}
	BasicClientCookie(){}
	public MyHelperClass setPath(String o0){ return null; }
	public MyHelperClass setDomain(String o0){ return null; }}

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

public MyHelperClass getHeaders(MyHelperClass o0){ return null; }
	public MyHelperClass getRequestLine(){ return null; }}

class Header {

}

class CookieStore {

public MyHelperClass addCookie(BasicClientCookie o0){ return null; }}
