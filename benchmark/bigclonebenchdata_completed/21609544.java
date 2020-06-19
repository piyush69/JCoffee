import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21609544 {

    public static JSONObject delete(String uid) throws Throwable, ClientProtocolException, IOException, JSONException {
        MyHelperClass params = new MyHelperClass();
        HttpClient client =(HttpClient)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new DefaultHttpClient(params);
        MyHelperClass DELETE_URI = new MyHelperClass();
        HttpGet get = new HttpGet(DELETE_URI + "?uid=" + uid);
        HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) client.execute(get);
        if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)response.getStatusLine().getStatusCode() == 200) {
            MyHelperClass EntityUtils = new MyHelperClass();
            String res = EntityUtils.toString(response.getEntity());
            return new JSONObject(res);
        }
        throw new IOException("bad http response:" + response.getStatusLine().getReasonPhrase());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getReasonPhrase(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }}

class JSONObject {

JSONObject(String o0){}
	JSONObject(){}}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

DefaultHttpClient(MyHelperClass o0){}
	DefaultHttpClient(){}}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
