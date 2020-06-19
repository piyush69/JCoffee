import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21609545 {

    public static JSONObject update(String name, String uid, double lat, double lon, boolean online) throws Throwable, ClientProtocolException, IOException, JSONException {
        MyHelperClass params = new MyHelperClass();
        HttpClient client =(HttpClient)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new DefaultHttpClient(params);
        MyHelperClass UPDATE_URI = new MyHelperClass();
        HttpPost post = new HttpPost(UPDATE_URI);
        List<NameValuePair> parameters = new ArrayList<NameValuePair>();
        parameters.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("name", name));
        parameters.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("uid", uid));
        parameters.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("latitude", Double.toString(lat)));
        parameters.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("longitude", Double.toString(lon)));
        parameters.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("online", Boolean.toString(online)));
        MyHelperClass HTTP = new MyHelperClass();
        post.setEntity(new UrlEncodedFormEntity(parameters, HTTP.UTF_8));
        HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) client.execute(post);
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
public MyHelperClass UTF_8;
public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getReasonPhrase(){ return null; }}

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

public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

DefaultHttpClient(MyHelperClass o0){}
	DefaultHttpClient(){}}

class HttpPost {

HttpPost(MyHelperClass o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class NameValuePair {

}

class BasicNameValuePair {

BasicNameValuePair(String o0, String o1){}
	BasicNameValuePair(){}}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(List<NameValuePair> o0, MyHelperClass o1){}
	UrlEncodedFormEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
