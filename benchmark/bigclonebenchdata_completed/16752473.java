import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16752473 {
public MyHelperClass newHttpException(HttpUriRequest o0, HttpResponse o1){ return null; }

    public HttpResponse executeHttp(final HttpUriRequest request, final int expectedCode) throws Throwable, ClientProtocolException, IOException, HttpException {
        MyHelperClass httpClient = new MyHelperClass();
        final HttpResponse response =(HttpResponse)(Object) httpClient.execute(request);
        if ((int)(Object)response.getStatusLine().getStatusCode() != expectedCode) {
            throw(Throwable)(Object) newHttpException(request, response);
        }
        return response;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass execute(HttpUriRequest o0){ return null; }}

class HttpUriRequest {

}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}
