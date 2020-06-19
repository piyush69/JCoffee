import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19910629 {
public MyHelperClass read(InputStream o0){ return null; }

    public String putData(String id, String updatedNote, DefaultHttpClient httpclient)  throws Throwable {
        try {
            HttpPut put = new HttpPut("http://3dforandroid.appspot.com/api/v1/note/update/" + id);
            StringEntity se = new StringEntity(updatedNote);
            MyHelperClass HTTP = new MyHelperClass();
            se.setContentEncoding(HTTP.UTF_8);
            se.setContentType("application/json");
            put.setEntity(se);
            put.setHeader("Content-Type", "application/json");
            put.setHeader("Accept", "*/*");
            HttpResponse response =(HttpResponse)(Object) httpclient.execute(put);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            InputStream instream;
            instream =(InputStream)(Object) entity.getContent();
            MyHelperClass responseMessage = new MyHelperClass();
            responseMessage = read(instream);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (ArrayStoreException e) {
            e.printStackTrace();
        }
        MyHelperClass responseMessage = new MyHelperClass();
        return(String)(Object) responseMessage;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass UTF_8;
}

class DefaultHttpClient {

public MyHelperClass execute(HttpPut o0){ return null; }}

class HttpPut {

HttpPut(String o0){}
	HttpPut(){}
	public MyHelperClass setHeader(String o0, String o1){ return null; }
	public MyHelperClass setEntity(StringEntity o0){ return null; }}

class StringEntity {

StringEntity(String o0){}
	StringEntity(){}
	public MyHelperClass setContentEncoding(MyHelperClass o0){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}
