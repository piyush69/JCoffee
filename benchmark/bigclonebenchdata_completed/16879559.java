import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16879559 {
public MyHelperClass findViewById(MyHelperClass o0){ return null; }
	public MyHelperClass setContentView(MyHelperClass o0){ return null; }
public MyHelperClass id;
	public MyHelperClass layout;

//    @Override
    public void onCreate(Bundle savedInstanceState)  throws Throwable {
        this.onCreate(savedInstanceState);
        setContentView(layout.main);
        final EditText eText = (EditText) findViewById(id.address);
        final Button button = (Button) findViewById(id.ButtonGo);
        button.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                try {
                    HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
                    HttpPost httppost = new HttpPost("https://mt0-app.cloud.cm/rpc/json");
                    List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
                    nameValuePairs.add(new BasicNameValuePair("m", "login"));
                    nameValuePairs.add(new BasicNameValuePair("c", "User"));
                    nameValuePairs.add(new BasicNameValuePair("password", "cloudisgreat"));
                    nameValuePairs.add(new BasicNameValuePair("alias", "cs588"));
                    httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
                    String result = "";
                    try {
                        HttpResponse response = httpclient.execute(httppost);
                        MyHelperClass EntityUtils = new MyHelperClass();
                        result = EntityUtils.toString(response.getEntity());
                    } catch (Exception e) {
                        result = e.getMessage();
                    }
                    MyHelperClass Context = new MyHelperClass();
                    LayoutInflater inflater = (LayoutInflater) WebTest.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    final View layout = inflater.inflate(layout.window1, null);
                    final PopupWindow popup = new PopupWindowTest(layout, 100, 100);
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
                    final PopupWindow popup2 = new PopupWindowTest(layout2, 100, 100);
                    TextView tview = (TextView) layout2.findViewById(id.pagetext);
                    tview.setText(result);
//                    MyHelperClass Gravity = new MyHelperClass();
                    popup2.showAtLocation(layout, Gravity.CENTER, 50, -90);
                } catch (Exception e) {
                    MyHelperClass Log = new MyHelperClass();
                    Log.d("Debug", e.toString());
                }
            }
        });
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass main;
	public MyHelperClass test_button;
	public MyHelperClass ButtonGo;
	public MyHelperClass pagetext;
	public MyHelperClass CENTER;
	public MyHelperClass address;
	public MyHelperClass LAYOUT_INFLATER_SERVICE;
public MyHelperClass d(String o0, String o1){ return null; }}

class Bundle {

}

class EditText {

}

class Button {

public MyHelperClass setOnClickListener(){ return null; }
	public MyHelperClass setOnClickListener(<anonymous OnClickListener> o0){ return null; }
	public MyHelperClass setOnTouchListener(){ return null; }}

class OnClickListener {

}

class View {
public MyHelperClass window1;
}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

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

UrlEncodedFormEntity(List<NameValuePair> o0){}
	UrlEncodedFormEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class LayoutInflater {

}

class PopupWindow {

public MyHelperClass dismiss(){ return null; }}

class PopupWindowTest {

PopupWindowTest(View o0, int o1, int o2){}
	PopupWindowTest(){}}

class OnTouchListener {

}

class TextView {

public MyHelperClass setText(String o0){ return null; }}

class WebTest {

}

class MotionEvent {

}
