import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12274679 {
public MyHelperClass executeHttp(HttpPost o0){ return null; }
public MyHelperClass EntityUtils;
	public MyHelperClass newHttpPost(String o0){ return null; }

    public JSONObject executeJSON(final String path, final JSONObject jsRequest) throws Throwable, IOException, HttpException, JSONException {
        final HttpPost httpRequest =(HttpPost)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) newHttpPost(path);
        httpRequest.setHeader("Content-Type", "application/json");
        final String request = jsRequest.toString();
        httpRequest.setEntity(new StringEntity(request));
        final HttpResponse httpResponse =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) executeHttp(httpRequest);
        final String response = EntityUtils.toString(httpResponse.getEntity());
        return new JSONObject(response);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class JSONObject {

JSONObject(String o0){}
	JSONObject(){}}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}

class HttpPost {

public MyHelperClass setEntity(StringEntity o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class StringEntity {

StringEntity(String o0){}
	StringEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
