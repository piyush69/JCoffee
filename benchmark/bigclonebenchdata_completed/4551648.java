import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4551648 {

    public HttpResponse execute(HttpHost host, HttpRequest req, HttpContext ctx) throws Throwable, IOException, ClientProtocolException {
        MyHelperClass backend = new MyHelperClass();
        HttpResponse resp =(HttpResponse)(Object) backend.execute(host, req, ctx);
        MyHelperClass assessor = new MyHelperClass();
        if ((boolean)(Object)assessor.isFailure(resp)) {
            throw new UnsuccessfulResponseException((String)(Object)resp);
        }
        return resp;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isFailure(HttpResponse o0){ return null; }
	public MyHelperClass execute(HttpHost o0, HttpRequest o1, HttpContext o2){ return null; }}

class HttpHost {

}

class HttpRequest {

}

class HttpContext {

}

class HttpResponse {

}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class UnsuccessfulResponseException extends Exception{
	public UnsuccessfulResponseException(String errorMessage) { super(errorMessage); }
}
