import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21609541 {

    public static long[] getOnlineUids(String myUid) throws Throwable, ClientProtocolException, IOException, JSONException {
        MyHelperClass params = new MyHelperClass();
        HttpClient client =(HttpClient)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new DefaultHttpClient(params);
        MyHelperClass UIDS_ONLINE_URI = new MyHelperClass();
        HttpGet get = new HttpGet(UIDS_ONLINE_URI);
        HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) client.execute(get);
        if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)response.getStatusLine().getStatusCode() == 200) {
            MyHelperClass EntityUtils = new MyHelperClass();
            String res = EntityUtils.toString(response.getEntity());
            JSONArray result = new JSONArray(res);
            long[] friends = new long[(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)result.length()];
            int uid = Integer.parseInt(myUid);
            for (int i = 0; i <(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) (int)(Object)result.length(); i++) {
                if (uid !=(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) (int)(Object)result.getInt(i)) {
                    friends[i] =(long)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) result.getInt(i);
                }
            }
            return friends;
        }
        throw new IOException("bad http response:" + response.getStatusLine().getReasonPhrase());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getReasonPhrase(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }}

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

HttpGet(MyHelperClass o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class JSONArray {

JSONArray(String o0){}
	JSONArray(){}
	public MyHelperClass length(){ return null; }
	public MyHelperClass getInt(int o0){ return null; }}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
