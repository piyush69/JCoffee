import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23310399 {
public MyHelperClass mTextView1;
	public MyHelperClass eregi_replace(String o0, String o1, String o2){ return null; }

            public void onClick(View v)  throws Throwable {
                String uriAPI = "http://www.sina.com";
                HttpGet httpRequest = new HttpGet(uriAPI);
                try {
                    HttpResponse httpResponse = (HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)new DefaultHttpClient().execute(httpRequest);
                    if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)httpResponse.getStatusLine().getStatusCode() == 200) {
                        MyHelperClass EntityUtils = new MyHelperClass();
                        String strResult = EntityUtils.toString(httpResponse.getEntity());
                        strResult =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) eregi_replace("(\r\n|\r|\n|\n\r)", "", strResult);
                        mTextView1.setText(strResult);
                    } else {
                        mTextView1.setText("Error Response: " + httpResponse.getStatusLine().toString());
                    }
                } catch (ClientProtocolException e) {
                    mTextView1.setText(e.getMessage().toString());
                    e.printStackTrace();
                } catch (IOException e) {
                    mTextView1.setText(e.getMessage().toString());
                    e.printStackTrace();
                } catch (Exception e) {
                    mTextView1.setText(e.getMessage().toString());
                    e.printStackTrace();
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass getStatusCode(){ return null; }}

class View {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class DefaultHttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
