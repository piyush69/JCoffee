import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16879560 {
public MyHelperClass id;

            public void onClick(View v)  throws Throwable {
                try {
                    HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
                    HttpPost httppost = new HttpPost("https://mt0-app.cloud.cm/rpc/json");
                    List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
                    nameValuePairs.add((NameValuePair)(Object)new BasicNameValuePair("m", "login"));
                    nameValuePairs.add((NameValuePair)(Object)new BasicNameValuePair("c", "User"));
                    nameValuePairs.add((NameValuePair)(Object)new BasicNameValuePair("password", "cloudisgreat"));
                    nameValuePairs.add((NameValuePair)(Object)new BasicNameValuePair("alias", "cs588"));
                    httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
                    String result = "";
                    try {
                        HttpResponse response =(HttpResponse)(Object) httpclient.execute(httppost);
                        MyHelperClass EntityUtils = new MyHelperClass();
                        result = EntityUtils.toString(response.getEntity());
                    } catch (Exception e) {
                        result = e.getMessage();
                    }
                    MyHelperClass Context = new MyHelperClass();
                    LayoutInflater inflater = (LayoutInflater) WebTest.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    final View layout = inflater.inflate(layout.window1, null);
                    final PopupWindow popup =(PopupWindow)(Object) new PopupWindowTest(layout, 100, 100);
                    Button b = (Button) layout.findViewById(id.test_button);
                    b.setOnTouchListener(new OnTouchListener() {

//                        @Override
                        public boolean onTouch(View v, MotionEvent event) {
                            MyHelperClass Log = new MyHelperClass();
                            Log.d("Debug", "Button activate");
                            popup.dismiss();
                            return false;
                        }
                    });
                    MyHelperClass Gravity = new MyHelperClass();
                    popup.showAtLocation(layout, Gravity.CENTER, 0, 0);
                    View layout2 = inflater.inflate(layout.window1, null);
                    final PopupWindow popup2 =(PopupWindow)(Object) new PopupWindowTest(layout2, 100, 100);
                    TextView tview = (TextView) layout2.findViewById(id.pagetext);
                    tview.setText(result);
//                    MyHelperClass Gravity = new MyHelperClass();
                    popup2.showAtLocation(layout, Gravity.CENTER, 50, -90);
                } catch (Exception e) {
                    MyHelperClass Log = new MyHelperClass();
                    Log.d("Debug", e.toString());
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass test_button;
	public MyHelperClass pagetext;
	public MyHelperClass CENTER;
	public MyHelperClass LAYOUT_INFLATER_SERVICE;
public MyHelperClass d(String o0, String o1){ return null; }}

class View {
public MyHelperClass window1;
}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

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

UrlEncodedFormEntity(List<NameValuePair> o0){}
	UrlEncodedFormEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class LayoutInflater {

public MyHelperClass inflate(MyHelperClass o0, Object o1){ return null; }}

class PopupWindow {

public MyHelperClass dismiss(){ return null; }
	public MyHelperClass showAtLocation(View o0, MyHelperClass o1, int o2, int o3){ return null; }}

class PopupWindowTest {

PopupWindowTest(View o0, int o1, int o2){}
	PopupWindowTest(){}}

class Button {

public MyHelperClass setOnTouchListener(<anonymous OnTouchListener> o0){ return null; }
	public MyHelperClass setOnTouchListener(){ return null; }}

class OnTouchListener {

}

class TextView {

public MyHelperClass setText(String o0){ return null; }}

class WebTest {

}

class MotionEvent {

}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
