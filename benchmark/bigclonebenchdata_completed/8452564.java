import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8452564 {
public MyHelperClass toast_handler;
	public MyHelperClass convertStreamToString(InputStream o0){ return null; }

                    public void run()  throws Throwable {
                        try {
                            MyHelperClass Feesh = new MyHelperClass();
                            HttpPost httpPostRequest = new HttpPost(Feesh.device_URL);
                            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
                            nameValuePairs.add((NameValuePair)(Object)new BasicNameValuePair("c", "feed"));
                            MyHelperClass foodAmount = new MyHelperClass();
                            nameValuePairs.add((NameValuePair)(Object)new BasicNameValuePair("amount", String.valueOf(foodAmount)));
                            MyHelperClass foodType = new MyHelperClass();
                            nameValuePairs.add((NameValuePair)(Object)new BasicNameValuePair("type", String.valueOf(foodType)));
                            httpPostRequest.setEntity(new UrlEncodedFormEntity(nameValuePairs));
                            HttpResponse httpResponse = (HttpResponse) (HttpResponse)(Object)new DefaultHttpClient().execute(httpPostRequest);
                            HttpEntity entity =(HttpEntity)(Object) httpResponse.getEntity();
                            String resultString = "";
                            if (entity != null) {
                                InputStream instream =(InputStream)(Object) entity.getContent();
                                resultString =(String)(Object) convertStreamToString(instream);
                                instream.close();
                            }
                            Message msg_toast = new Message();
                            msg_toast.obj =(MyHelperClass)(Object) resultString;
                            toast_handler.sendMessage(msg_toast);
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        } catch (UncheckedIOException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass device_URL;
public MyHelperClass sendMessage(Message o0){ return null; }}

class HttpPost {

HttpPost(){}
	HttpPost(MyHelperClass o0){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class NameValuePair {

}

class BasicNameValuePair {

BasicNameValuePair(){}
	BasicNameValuePair(String o0, String o1){}}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(){}
	UrlEncodedFormEntity(List<NameValuePair> o0){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class DefaultHttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class Message {
public MyHelperClass obj;
}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}
