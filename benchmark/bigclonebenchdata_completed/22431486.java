import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22431486 {

    public static String doPostEntity(String URL, List<NameValuePair> params)  throws Throwable {
        try {
            OauthUtil util = new OauthUtil();
            URI uri = new URI(URL);
            HttpClient httpclient =(HttpClient)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) util.getNewHttpClient();
            HttpPost postMethod = new HttpPost(uri);
            MyHelperClass HTTP = new MyHelperClass();
            postMethod.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
            HttpResponse httpResponse =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpclient.execute(postMethod);
            if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)httpResponse.getStatusLine().getStatusCode() == 200) {
                MyHelperClass EntityUtils = new MyHelperClass();
                String strResult = EntityUtils.toString(httpResponse.getEntity());
                MyHelperClass Log = new MyHelperClass();
                Log.i("DEBUG", "result: " + strResult);
                String token;
                try {
                    JSONObject obj = new JSONObject(strResult);
                    token =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) obj.getString("access_token");
                } catch (Exception e) {
                    token = strResult.substring(strResult.indexOf("access_token=") + 13);
                }
                return token;
            }
        } catch (Exception e) {
            MyHelperClass Log = new MyHelperClass();
            Log.i("DEBUG", e.toString());
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass UTF_8;
public MyHelperClass i(String o0, String o1){ return null; }
	public MyHelperClass getStatusCode(){ return null; }}

class NameValuePair {

}

class OauthUtil {

public MyHelperClass getNewHttpClient(){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

HttpPost(){}
	HttpPost(URI o0){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(List<NameValuePair> o0, MyHelperClass o1){}
	UrlEncodedFormEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class JSONObject {

JSONObject(String o0){}
	JSONObject(){}
	public MyHelperClass getString(String o0){ return null; }}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
