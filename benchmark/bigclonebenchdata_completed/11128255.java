import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11128255 {
public MyHelperClass massage(MyHelperClass o0){ return null; }
public MyHelperClass getClient(){ return null; }

    private String doOAIQuery(String request) throws Throwable, IOException, ProtocolException {
        DannoClient ac =(DannoClient)(Object) getClient();
        HttpGet get = new HttpGet(request);
        get.setHeader("Accept", "application/xml");
        HttpResponse response =(HttpResponse)(Object) ac.execute(get);
        if (!(Boolean)(Object)ac.isOK()) {
            throw new DannoRequestFailureException("GET", response);
        }
        return(String)(Object) massage(new BasicResponseHandler().handleResponse(response));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class DannoClient {

public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass isOK(){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class HttpResponse {

}

class DannoRequestFailureException extends Exception{
	public DannoRequestFailureException(String errorMessage) { super(errorMessage); }
	DannoRequestFailureException(){}
	DannoRequestFailureException(String o0, HttpResponse o1){}
}

class BasicResponseHandler {

public MyHelperClass handleResponse(HttpResponse o0){ return null; }}
