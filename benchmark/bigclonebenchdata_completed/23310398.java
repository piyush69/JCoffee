import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23310398 {

            public void onClick(View v)  throws Throwable {
                String uriAPI = "http://www.sina.com";
                HttpPost httpRequest = new HttpPost(uriAPI);
                List<NameValuePair> params = new ArrayList<NameValuePair>();
                params.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("str", "post string"));
                try {
                    MyHelperClass HTTP = new MyHelperClass();
                    httpRequest.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
                    HttpResponse httpResponse = (HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)new DefaultHttpClient().execute(httpRequest);
                    if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)httpResponse.getStatusLine().getStatusCode() == 200) {
                        MyHelperClass EntityUtils = new MyHelperClass();
                        String strResult = EntityUtils.toString(httpResponse.getEntity());
                        MyHelperClass mTextView1 = new MyHelperClass();
                        mTextView1.setText(strResult);
                    } else {
                        MyHelperClass mTextView1 = new MyHelperClass();
                        mTextView1.setText("Error Response: " + httpResponse.getStatusLine().toString());
                    }
                } catch (ClientProtocolException e) {
                    MyHelperClass mTextView1 = new MyHelperClass();
                    mTextView1.setText(e.getMessage().toString());
                    e.printStackTrace();
                } catch (IOException e) {
                    MyHelperClass mTextView1 = new MyHelperClass();
                    mTextView1.setText(e.getMessage().toString());
                    e.printStackTrace();
                } catch (Exception e) {
                    MyHelperClass mTextView1 = new MyHelperClass();
                    mTextView1.setText(e.getMessage().toString());
                    e.printStackTrace();
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass UTF_8;
public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass setText(String o0){ return null; }}

class View {

}

class HttpPost {

HttpPost(String o0){}
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

class DefaultHttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
