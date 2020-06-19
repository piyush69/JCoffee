import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4779829 {
public MyHelperClass findViewById(MyHelperClass o0){ return null; }
public MyHelperClass id;
	public MyHelperClass startActivity(Intent o0){ return null; }
public MyHelperClass Intent;
	public MyHelperClass statusOK;
	public MyHelperClass etracks;
	public MyHelperClass authenticationURL;
	public MyHelperClass EntityUtils;
	public MyHelperClass Log;
	public MyHelperClass statusUnprocessable;
	public MyHelperClass finish(){ return null; }
	public MyHelperClass createHttpClient(){ return null; }

    public void myCheckCredHandler(View v)  throws Throwable {
        MyHelperClass Log = new MyHelperClass();
        Log.d("login_section", "entered handler");
        EditText Username = (EditText)(EditText)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) findViewById(id.Username);
        EditText Password = (EditText)(EditText)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) findViewById(id.user_pass);
        String username_S = Username.getText().toString();
        String pass_S = Password.getText().toString();
        TextView ltv = (TextView)(TextView)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) findViewById(id.LoginPagetv);
        HttpClient httpclient =(HttpClient)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) createHttpClient();
        HttpPost httppost = new HttpPost(authenticationURL);
        try {
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
            nameValuePairs.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("login", username_S));
            nameValuePairs.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("password", pass_S));
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpclient.execute(httppost);
            int status =(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) response.getStatusLine().getStatusCode();
            String responseBody = EntityUtils.toString(response.getEntity());
            Log.d("login_section", responseBody);
            JSONObject jsonObject = new JSONObject(responseBody);
            if (status ==(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) (int)(Object)this.statusOK && jsonObject.getBoolean("logged_in")) {
                ltv.setText("You have been logged in. :D");
                etracks.setLogged(true);
                etracks.setUserToken(jsonObject.getString("user_token"));
                Intent it = new Intent(Intent.ACTION_VIEW);
                it.setClassName(this, etracks.class.getName());
                this.finish();
                startActivity(it);
            } else if (status ==(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) (int)(Object)this.statusUnprocessable && !jsonObject.getBoolean("logged_in")) {
                if (!(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Boolean)(Object)jsonObject.isNull("errors")) ltv.setText(jsonObject.getString("errors")); else ltv.setText("login unsuccessful");
            } else Log.d("login_section", "what just happened?");
        } catch (ClientProtocolException e) {
        } catch (IOException e) {
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ACTION_VIEW;
	public MyHelperClass user_pass;
	public MyHelperClass Username;
	public MyHelperClass LoginPagetv;
public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass d(String o0, String o1){ return null; }
	public MyHelperClass setUserToken(MyHelperClass o0){ return null; }
	public MyHelperClass setLogged(boolean o0){ return null; }}

class View {

}

class EditText {

public MyHelperClass getText(){ return null; }}

class TextView {

public MyHelperClass setText(String o0){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

HttpPost(MyHelperClass o0){}
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

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class JSONObject {

JSONObject(){}
	JSONObject(String o0){}
	public MyHelperClass getBoolean(String o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass isNull(String o0){ return null; }}

class Intent {

Intent(MyHelperClass o0){}
	Intent(){}
	public MyHelperClass setClassName(c4779829 o0, String o1){ return null; }}

class etracks {

}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
