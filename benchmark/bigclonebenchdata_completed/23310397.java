import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23310397 {
public MyHelperClass findViewById(MyHelperClass o0){ return null; }
public MyHelperClass NULL;
	public MyHelperClass setContentView(MyHelperClass o0){ return null; }
public MyHelperClass id;
	public MyHelperClass eregi_replace(String o0, String o1, String o2){ return null; }
public MyHelperClass layout;

    public void onCreate(Bundle savedInstanceState)  throws Throwable {
        this.onCreate(savedInstanceState);
        setContentView(layout.main);
        Button mButton1 =(Button)(Object) NULL; //new Button();
        mButton1 = (Button) findViewById(id.myButton1);
        Button mButton2 =(Button)(Object) NULL; //new Button();
        mButton2 = (Button) findViewById(id.myButton2);
        TextView mTextView1 =(TextView)(Object) NULL; //new TextView();
        mTextView1 = (TextView) findViewById(id.myTextView1);
        mButton1.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                String uriAPI = "http://www.sina.com";
                HttpPost httpRequest = new HttpPost(uriAPI);
                List<NameValuePair> params = new ArrayList<NameValuePair>();
                params.add((NameValuePair)(Object)new BasicNameValuePair("str", "post string"));
                try {
                    MyHelperClass HTTP = new MyHelperClass();
                    httpRequest.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
                    HttpResponse httpResponse = (HttpResponse)(Object)new DefaultHttpClient().execute(httpRequest);
                    if (httpResponse.getStatusLine().getStatusCode() == 200) {
                        MyHelperClass EntityUtils = new MyHelperClass();
                        String strResult = EntityUtils.toString(httpResponse.getEntity());
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
        });
        mButton2.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                String uriAPI = "http://www.sina.com";
                HttpGet httpRequest = new HttpGet(uriAPI);
                try {
                    HttpResponse httpResponse = (HttpResponse)(Object)new DefaultHttpClient().execute(httpRequest);
                    if (httpResponse.getStatusLine().getStatusCode() == 200) {
                        MyHelperClass EntityUtils = new MyHelperClass();
                        String strResult = EntityUtils.toString(httpResponse.getEntity());
                        strResult =(String)(Object) eregi_replace("(\r\n|\r|\n|\n\r)", "", strResult);
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
        });
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass main;
	public MyHelperClass myTextView1;
	public MyHelperClass UTF_8;
	public MyHelperClass myButton1;
	public MyHelperClass myButton2;
public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass setOnClickListener(){ return null; }}

class Bundle {

}

class Button {

public MyHelperClass setOnClickListener(){ return null; }
	public MyHelperClass setOnClickListener(<anonymous OnClickListener> o0){ return null; }}

class TextView {

public MyHelperClass setText(String o0){ return null; }}

class OnClickListener {

}

class View {

}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}}

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

public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
