import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c20365368 {
public MyHelperClass params;
	public MyHelperClass conn;
	public MyHelperClass readTimeout;
	public MyHelperClass connectTimeout;
	public MyHelperClass request;
	public MyHelperClass response;
	public MyHelperClass readResponse(){ return null; }
	public MyHelperClass buildHeader(){ return null; }
	public MyHelperClass sendRequest(){ return null; }
	public MyHelperClass buildParams(){ return null; }

    public HttpResponse execute(HttpRequest request) throws IOException {
        this.request =(MyHelperClass)(Object) request;
        buildParams();
        String l =(String)(Object) request.getUrl();
        if ((HttpGet)(Object)request instanceof HttpGet) {
            l = l + "?" + params;
        }
        URL url = new URL(l);
        conn =(MyHelperClass)(Object) (HttpURLConnection) url.openConnection();
        conn.setConnectTimeout(connectTimeout);
        conn.setReadTimeout(readTimeout);
        buildHeader();
        if ((HttpPost)(Object)request instanceof HttpPost) {
            sendRequest();
        }
        readResponse();
        return(HttpResponse)(Object) this.response;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setReadTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass setConnectTimeout(MyHelperClass o0){ return null; }}

class HttpRequest {

public MyHelperClass getUrl(){ return null; }}

class HttpResponse {

}

class HttpGet {

}

class HttpPost {

}
