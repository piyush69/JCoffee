import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7169985 {
public static MyHelperClass Log;
//public MyHelperClass Log;

    public static String connRemote(JSONObject jsonObject, String OPCode, List<NameValuePair> nameValuePair)  throws Throwable {
        String retSrc = "";
        try {
            HttpClient httpClient =(HttpClient)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new DefaultHttpClient();
            MyHelperClass AZConstants = new MyHelperClass();
            HttpPost httpPost = new HttpPost(AZConstants.validateURL);
            HttpParams httpParams =(HttpParams)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new BasicHttpParams();
//            MyHelperClass AZConstants = new MyHelperClass();
            nameValuePair.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair(AZConstants.ACTION_TYPE, OPCode));
//            MyHelperClass AZConstants = new MyHelperClass();
            nameValuePair.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair(AZConstants.PARAM, jsonObject.toString()));
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePair));
            httpPost.setParams(httpParams);
            HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpClient.execute(httpPost);
            MyHelperClass EntityUtils = new MyHelperClass();
            retSrc = EntityUtils.toString(response.getEntity());
        } catch (Exception e) {
            MyHelperClass TAG = new MyHelperClass();
            Log.e(TAG, e.toString());
        }
        return retSrc;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ACTION_TYPE;
	public MyHelperClass validateURL;
	public MyHelperClass PARAM;
public MyHelperClass e(MyHelperClass o0, String o1){ return null; }}

class JSONObject {

}

class NameValuePair {

}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

}

class HttpPost {

HttpPost(MyHelperClass o0){}
	HttpPost(){}
	public MyHelperClass setParams(HttpParams o0){ return null; }
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class HttpParams {

}

class BasicHttpParams {

}

class BasicNameValuePair {

BasicNameValuePair(MyHelperClass o0, String o1){}
	BasicNameValuePair(){}}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(List<NameValuePair> o0){}
	UrlEncodedFormEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
