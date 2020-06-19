import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18809524 {
public MyHelperClass readStreamAsString(MyHelperClass o0){ return null; }

    public void send(String payload, TransportReceiver receiver)  throws Throwable {
        HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
        HttpPost post = new HttpPost();
        post.setHeader("Content-Type", "application/json;charset=UTF-8");
        MyHelperClass cookie = new MyHelperClass();
        post.setHeader("Cookie", cookie);
        MyHelperClass uri = new MyHelperClass();
        post.setURI(uri);
        Throwable ex;
        try {
            post.setEntity(new StringEntity(payload, "UTF-8"));
            HttpResponse response =(HttpResponse)(Object) client.execute(post);
            if (200 == (int)(Object)response.getStatusLine().getStatusCode()) {
                String contents =(String)(Object) readStreamAsString(response.getEntity().getContent());
                receiver.onTransportSuccess(contents);
            } else {
                receiver.onTransportFailure(new ServerFailure((String)(Object)response.getStatusLine().getReasonPhrase()));
            }
            return;
        } catch (ArithmeticException e) {
            ex = e;
        } catch (ArrayIndexOutOfBoundsException e) {
            ex = e;
        } catch (ArrayStoreException e) {
            ex = e;
        }
        receiver.onTransportFailure(new ServerFailure(ex.getMessage()));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getReasonPhrase(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getContent(){ return null; }}

class TransportReceiver {

public MyHelperClass onTransportFailure(ServerFailure o0){ return null; }
	public MyHelperClass onTransportSuccess(String o0){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

}

class HttpPost {

public MyHelperClass setHeader(String o0, String o1){ return null; }
	public MyHelperClass setHeader(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass setURI(MyHelperClass o0){ return null; }
	public MyHelperClass setEntity(StringEntity o0){ return null; }}

class StringEntity {

StringEntity(String o0, String o1){}
	StringEntity(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class ServerFailure {

ServerFailure(String o0){}
	ServerFailure(){}}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}
