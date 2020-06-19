import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22431487 {
public static MyHelperClass encodeUrl(MyHelperClass o0){ return null; }
//public MyHelperClass encodeUrl(MyHelperClass o0){ return null; }

    public static String doPost(String URL, List<NameValuePair> params)  throws Throwable {
        try {
            OauthUtil util = new OauthUtil();
            URI uri = new URI(URL);
            HttpClient httpclient =(HttpClient)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) util.getNewHttpClient();
            HttpPost postMethod = new HttpPost(uri);
            StringBuffer paramString = new StringBuffer();
            paramString.append("OAuth");
            for (int i = 0; i < params.size(); i++) {
                paramString.append(" " + params.get(i).getName());
                paramString.append("=\"" + encodeUrl(params.get(i).getValue()) + "\",");
            }
            String xx = paramString.substring(0, paramString.length() - 1);
            postMethod.addHeader("Authorization", xx);
            HttpResponse httpResponse =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpclient.execute(postMethod);
            if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)httpResponse.getStatusLine().getStatusCode() == 200) {
                MyHelperClass EntityUtils = new MyHelperClass();
                String strResult = EntityUtils.toString(httpResponse.getEntity());
                MyHelperClass Log = new MyHelperClass();
                Log.i("DEBUG", "result: " + strResult);
                return strResult;
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

public MyHelperClass i(String o0, String o1){ return null; }
	public MyHelperClass getStatusCode(){ return null; }}

class NameValuePair {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getValue(){ return null; }}

class OauthUtil {

public MyHelperClass getNewHttpClient(){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

HttpPost(){}
	HttpPost(URI o0){}
	public MyHelperClass addHeader(String o0, String o1){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
