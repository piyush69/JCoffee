import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1977562 {
public MyHelperClass populateHttpEntityEnclosingRequestBaseMethod(WebRequest o0, HttpPut o1){ return null; }
	public MyHelperClass populateHttpRequestBaseMethod(WebRequest o0, HttpOptions o1){ return null; }
	public MyHelperClass populateHttpRequestBaseMethod(WebRequest o0, HttpDelete o1){ return null; }
	public MyHelperClass populateHttpRequestBaseMethod(WebRequest o0, HttpHead o1){ return null; }
	public MyHelperClass populateHttpRequestBaseMethod(WebRequest o0, HttpTrace o1){ return null; }
	public MyHelperClass populateHttpRequestBaseMethod(WebRequest o0, HttpGet o1){ return null; }
	public MyHelperClass populateHttpEntityEnclosingRequestBaseMethod(WebRequest o0, HttpPost o1){ return null; }
public MyHelperClass executeMethod(MyHelperClass o0){ return null; }
	public MyHelperClass processResponse(HttpResponse o0, MyHelperClass o1, String o2){ return null; }
public MyHelperClass DELETE;
	public MyHelperClass TRACE;
	public MyHelperClass PUT;
	public MyHelperClass GET;
	public MyHelperClass HEAD;
	public MyHelperClass POST;
	public MyHelperClass OPTIONS;
	public MyHelperClass httpRequest;
	public MyHelperClass initHttpClient(){ return null; }

    public WebResponse getResponse(WebRequest webRequest, String charset) throws Throwable, IOException {
        initHttpClient();
        switch((int)(Object)webRequest.getRequestMethod()) {
            case(int)(Object) GET:
                httpRequest.set(populateHttpRequestBaseMethod(webRequest, new HttpGet(webRequest.getUrl())));
                break;
            case(int)(Object) HEAD:
                httpRequest.set(populateHttpRequestBaseMethod(webRequest, new HttpHead(webRequest.getUrl())));
                break;
            case(int)(Object) OPTIONS:
                httpRequest.set(populateHttpRequestBaseMethod(webRequest, new HttpOptions(webRequest.getUrl())));
                break;
            case(int)(Object) TRACE:
                httpRequest.set(populateHttpRequestBaseMethod(webRequest, new HttpTrace(webRequest.getUrl())));
                break;
            case(int)(Object) DELETE:
                httpRequest.set(populateHttpRequestBaseMethod(webRequest, new HttpDelete(webRequest.getUrl())));
                break;
            case(int)(Object) POST:
                httpRequest.set(populateHttpEntityEnclosingRequestBaseMethod(webRequest, new HttpPost(webRequest.getUrl())));
                break;
            case(int)(Object) PUT:
                httpRequest.set(populateHttpEntityEnclosingRequestBaseMethod(webRequest, new HttpPut(webRequest.getUrl())));
                break;
            default:
                throw new RuntimeException("Method not yet supported: " + webRequest.getRequestMethod());
        }
        WebResponse resp;
        HttpResponse response =(HttpResponse)(Object) executeMethod(httpRequest.get());
        if (response == null) {
            throw new IOException("LIGHTHTTP. An empty response received from server. Possible reason: host is offline");
        }
        resp =(WebResponse)(Object) processResponse(response, httpRequest.get(), charset);
        httpRequest.set(null);
        return resp;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(){ return null; }
	public MyHelperClass set(Object o0){ return null; }}

class WebRequest {

public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getRequestMethod(){ return null; }}

class WebResponse {

}

class HttpGet {

HttpGet(MyHelperClass o0){}
	HttpGet(){}}

class HttpHead {

HttpHead(MyHelperClass o0){}
	HttpHead(){}}

class HttpOptions {

HttpOptions(MyHelperClass o0){}
	HttpOptions(){}}

class HttpTrace {

HttpTrace(MyHelperClass o0){}
	HttpTrace(){}}

class HttpDelete {

HttpDelete(MyHelperClass o0){}
	HttpDelete(){}}

class HttpPost {

HttpPost(MyHelperClass o0){}
	HttpPost(){}}

class HttpPut {

HttpPut(MyHelperClass o0){}
	HttpPut(){}}

class HttpResponse {

}
