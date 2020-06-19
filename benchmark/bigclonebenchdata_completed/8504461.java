import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8504461 {

//    @Override
    protected String doInBackground(Void... params)  throws Throwable {
        try {
            MyHelperClass UPDATE_URL = new MyHelperClass();
            HttpGet request = new HttpGet(UPDATE_URL);
            request.setHeader("Accept", "text/plain");
            MyHelperClass MyMovies = new MyHelperClass();
            HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) MyMovies.getHttpClient().execute(request);
            int statusCode =(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) response.getStatusLine().getStatusCode();
            MyHelperClass HttpStatus = new MyHelperClass();
            if (statusCode !=(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) (int)(Object)HttpStatus.SC_OK) {
                return "Error: Failed getting update notes";
            }
            MyHelperClass EntityUtils = new MyHelperClass();
            return EntityUtils.toString(response.getEntity());
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass getHttpClient(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass getStatusCode(){ return null; }}

class HttpGet {

HttpGet(MyHelperClass o0){}
	HttpGet(){}
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
