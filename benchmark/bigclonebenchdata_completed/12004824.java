import java.io.*;
import java.lang.*;
import java.util.*;



class c12004824 {
public MyHelperClass NULL;
public MyHelperClass HttpConnectionParams;

    public HttpResponse executeHttpRequest(HttpRequestBase httpRequest) {
        HttpResponse response = null;
        try {
            HttpParams httpParams =(HttpParams)(Object) new BasicHttpParams();
            MyHelperClass maxTime = new MyHelperClass();
            HttpConnectionParams.setConnectionTimeout(httpParams, maxTime);
//            MyHelperClass maxTime = new MyHelperClass();
            HttpConnectionParams.setSoTimeout(httpParams, maxTime);
            DefaultHttpClient httpclient =(DefaultHttpClient)(Object) NULL; //new DefaultHttpClient();
            httpclient = new DefaultHttpClient(httpParams);
//            MyHelperClass httpclient = new MyHelperClass();
            response =(HttpResponse)(Object) httpclient.execute(httpRequest);
//            MyHelperClass maxTime = new MyHelperClass();
            maxTime =(MyHelperClass)(Object) 15000;
        } catch (Exception e) {
        }
        return response;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setSoTimeout(HttpParams o0, MyHelperClass o1){ return null; }
	public MyHelperClass execute(HttpRequestBase o0){ return null; }
	public MyHelperClass setConnectionTimeout(HttpParams o0, MyHelperClass o1){ return null; }}

class HttpRequestBase {

}

class HttpResponse {

}

class HttpParams {

}

class BasicHttpParams {

}

class DefaultHttpClient {

DefaultHttpClient(){}
	DefaultHttpClient(HttpParams o0){}
	public MyHelperClass execute(HttpRequestBase o0){ return null; }}
