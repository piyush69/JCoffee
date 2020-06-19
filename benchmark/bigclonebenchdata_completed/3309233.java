import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3309233 {
public MyHelperClass isFirstLocation;
	public MyHelperClass RESULT_FIRST_FAILE;
	public MyHelperClass requestGearsLocation(int o0){ return null; }

//        @Override
        protected String doInBackground(String... params)  throws Throwable {
            try {
                final HttpParams param =(HttpParams)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new BasicHttpParams();
                MyHelperClass HttpConnectionParams = new MyHelperClass();
                HttpConnectionParams.setConnectionTimeout(param, 30000);
//                MyHelperClass HttpConnectionParams = new MyHelperClass();
                HttpConnectionParams.setSoTimeout(param, 30000);
                DefaultHttpClient client = new DefaultHttpClient(param);
                HttpPost post = new HttpPost("http://www.google.com/loc/json");
                post.setEntity(new StringEntity(params[0]));
                MyHelperClass DEBUG = new MyHelperClass();
                if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)DEBUG) Log.d("Location", params[0]);
                HttpResponse resp =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) client.execute(post);
                if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)resp.getStatusLine().getStatusCode() == 200) {
                    HttpEntity entity =(HttpEntity)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) resp.getEntity();
                    MyHelperClass EntityUtils = new MyHelperClass();
                    String result = EntityUtils.toString(entity);
                    return result;
                } else {
                    MyHelperClass isFirstLocation = new MyHelperClass();
                    if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)isFirstLocation) {
                        requestGearsLocation(1);
                        isFirstLocation =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) false;
                        return(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) RESULT_FIRST_FAILE;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setConnectionTimeout(HttpParams o0, int o1){ return null; }
	public MyHelperClass setSoTimeout(HttpParams o0, int o1){ return null; }
	public MyHelperClass getStatusCode(){ return null; }}

class HttpParams {

}

class BasicHttpParams {

}

class DefaultHttpClient {

DefaultHttpClient(HttpParams o0){}
	DefaultHttpClient(){}
	public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(StringEntity o0){ return null; }}

class StringEntity {

StringEntity(String o0){}
	StringEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class HttpEntity {

}

class Object {

public MyHelperClass toString(HttpEntity o0){ return null; }}
