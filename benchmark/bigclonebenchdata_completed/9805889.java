import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9805889 {
public MyHelperClass NULL;
public MyHelperClass textpassword;
	public MyHelperClass textusername;
	public MyHelperClass startActivityForResult(Intent o0, int o1){ return null; }
public MyHelperClass Toast;
	public MyHelperClass result;
	public MyHelperClass getApplicationContext(){ return null; }

//            @Override
            public void onClick(View v)  throws Throwable {
                MyHelperClass username = new MyHelperClass();
                username = textusername.getText().toString();
                MyHelperClass password = new MyHelperClass();
                password = textpassword.getText().toString();
                ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
//                MyHelperClass username = new MyHelperClass();
                nameValuePairs.add((NameValuePair)(Object)new name_value("uname", username));
//                MyHelperClass password = new MyHelperClass();
                nameValuePairs.add((NameValuePair)(Object)new name_value("upass", password));
                try {
                    HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
                    HttpPost httppost = new HttpPost("http://www.gotrackit.net/server/check_user.php");
                    httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
                    HttpResponse response =(HttpResponse)(Object) httpclient.execute(httppost);
                    HttpEntity entity =(HttpEntity)(Object) response.getEntity();
                    MyHelperClass is = new MyHelperClass();
                    is = entity.getContent();
                } catch (Exception e) {
                    MyHelperClass Log = new MyHelperClass();
                    Log.e("log_tag", "Error in http connection" + e.toString());
                }
                try {
                    MyHelperClass is = new MyHelperClass();
                    BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)is, "iso-8859-1"), 8);
                    StringBuilder sb = NULL; //new StringBuilder();
                    sb = new StringBuilder();
//                    MyHelperClass sb = new MyHelperClass();
                    sb.append(reader.readLine() + "\n");
                    String line = "0";
                    while ((line = reader.readLine()) != null) {
//                        MyHelperClass sb = new MyHelperClass();
                        sb.append(line + "\n");
                    }
//                    MyHelperClass is = new MyHelperClass();
                    is.close();
                    String result = NULL; //new String();
                    result = sb.toString();
                } catch (Exception e) {
                    MyHelperClass Log = new MyHelperClass();
                    Log.e("log_tag", "Error converting result " + e.toString());
                }
                MyHelperClass result = new MyHelperClass();
                if ((boolean)(Object)result.contains("reject")) {
                    Context context =(Context)(Object) getApplicationContext();
                    int duration =(int)(Object) Toast.LENGTH_SHORT;
                    String wrong = "Invalid  Username or Password";
                    Toast toast =(Toast)(Object) Toast.makeText(context, wrong, duration);
                    toast.show();
                } else {
                    MyApp uid = (MyApp)(MyApp)(Object) getApplicationContext();
                    uid.setStringValue(result);
                    Intent myintent = new Intent(v.getContext(), UserMap.class);
                    startActivityForResult(myintent, 0);
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LENGTH_SHORT;
public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass e(String o0, String o1){ return null; }
	public MyHelperClass makeText(Context o0, String o1, int o2){ return null; }
	public MyHelperClass append(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class View {

public MyHelperClass getContext(){ return null; }}

class NameValuePair {

}

class name_value {

name_value(String o0, MyHelperClass o1){}
	name_value(){}}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(ArrayList<NameValuePair> o0){}
	UrlEncodedFormEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class Context {

}

class Toast {

public MyHelperClass show(){ return null; }}

class MyApp {

public MyHelperClass setStringValue(MyHelperClass o0){ return null; }}

class Intent {

Intent(MyHelperClass o0, Class<UserMap> o1){}
	Intent(){}}

class UserMap {

}
