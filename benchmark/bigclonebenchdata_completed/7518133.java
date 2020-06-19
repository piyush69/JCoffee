import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7518133 {
public static MyHelperClass ConnRoutePNames;
	public static MyHelperClass EntityUtils;
	public static MyHelperClass createHttpClient(){ return null; }
	public static MyHelperClass setup(){ return null; }
	public static MyHelperClass createRequest(){ return null; }
//public MyHelperClass ConnRoutePNames;
//	public MyHelperClass EntityUtils;
//	public MyHelperClass createHttpClient(){ return null; }
//	public MyHelperClass createRequest(){ return null; }
//	public MyHelperClass setup(){ return null; }

    public static final void main(String[] args) throws Throwable, Exception {
        final HttpHost target = new HttpHost("issues.apache.org", 443, "https");
        final HttpHost proxy = new HttpHost("127.0.0.1", 8666, "http");
        setup();
        HttpClient client =(HttpClient)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) createHttpClient();
        client.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
        HttpRequest req =(HttpRequest)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) createRequest();
        System.out.println("executing request to " + target + " via " + proxy);
        HttpEntity entity = null;
        try {
            HttpResponse rsp =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) client.execute(target, req);
            entity =(HttpEntity)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) rsp.getEntity();
            System.out.println("----------------------------------------");
            System.out.println(rsp.getStatusLine());
            Header[] headers =(Header[])(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) rsp.getAllHeaders();
            for (int i = 0; i < headers.length; i++) {
                System.out.println(headers[i]);
            }
            System.out.println("----------------------------------------");
            if (rsp.getEntity() != null) {
                System.out.println(EntityUtils.toString(rsp.getEntity()));
            }
        } finally {
            if (entity != null) entity.consumeContent();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEFAULT_PROXY;
public MyHelperClass setParameter(MyHelperClass o0, HttpHost o1){ return null; }}

class HttpHost {

HttpHost(String o0, int o1, String o2){}
	HttpHost(){}}

class HttpClient {

public MyHelperClass getParams(){ return null; }
	public MyHelperClass execute(HttpHost o0, HttpRequest o1){ return null; }}

class HttpRequest {

}

class HttpEntity {

public MyHelperClass consumeContent(){ return null; }}

class HttpResponse {

public MyHelperClass getAllHeaders(){ return null; }
	public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class Header {

}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
