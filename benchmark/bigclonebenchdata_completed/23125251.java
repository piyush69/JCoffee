import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c23125251 {
public static MyHelperClass ImageInputStream(MyHelperClass o0){ return null; }
public static MyHelperClass HttpConnectionParams;
	public static MyHelperClass DEFAULT_POST_REQUEST_TIMEOUT;
//	public MyHelperClass ImageInputStream(MyHelperClass o0){ return null; }
	public static MyHelperClass printPostRequestHeader(HttpPost o0){ return null; }
//public MyHelperClass HttpConnectionParams;
//	public MyHelperClass DEFAULT_POST_REQUEST_TIMEOUT;
//	public MyHelperClass printPostRequestHeader(HttpPost o0){ return null; }

    public static HttpData postRequest(HttpPost postMethod, String xml) throws ClientProtocolException, SocketException, IOException, SocketTimeoutException {
        HttpData data = new HttpData();
        try {
            postMethod.addHeader("Content-Type", "text/xml; charset=utf-8");
            postMethod.addHeader("Connection", "Keep-Alive");
            postMethod.addHeader("User-Agent", "Openwave");
            MyHelperClass HTTP = new MyHelperClass();
            StringEntity se = new StringEntity(xml, HTTP.UTF_8);
            postMethod.setEntity(se);
            printPostRequestHeader(postMethod);
            HttpParams httpParams =(HttpParams)(Object) new BasicHttpParams();
            MyHelperClass HTTP_TIMEOUT = new MyHelperClass();
            HttpConnectionParams.setConnectionTimeout(httpParams, HTTP_TIMEOUT);
            HttpClient client =(HttpClient)(Object) new DefaultHttpClient(httpParams);
            MyHelperClass HttpConnectionParams = new MyHelperClass();
            client.getParams().setIntParameter(HttpConnectionParams.CONNECTION_TIMEOUT, DEFAULT_POST_REQUEST_TIMEOUT);
//            MyHelperClass HttpConnectionParams = new MyHelperClass();
            client.getParams().setIntParameter(HttpConnectionParams.SO_TIMEOUT, DEFAULT_POST_REQUEST_TIMEOUT);
            HttpResponse httpResponse =(HttpResponse)(Object) client.execute(postMethod);
            if (httpResponse == null) throw new SocketTimeoutException();
            if ((int)(Object)httpResponse.getStatusLine().getStatusCode() == 200) {
                byte bytearray[] =(byte[])(Object) ImageInputStream(httpResponse.getEntity());
                data.setByteArray(bytearray);
            } else {
                data.setStatusCode(httpResponse.getStatusLine().getStatusCode() + "");
            }
        } catch (UncheckedIOException e) {
            throw new SocketException();
        } catch (SocketTimeoutException e) {
            throw new SocketTimeoutException();
        } catch (ArithmeticException e) {
            throw new ClientProtocolException();
        } catch (IOException e) {
            throw new IOException();
        } finally {
            postMethod.abort();
        }
        return data;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SO_TIMEOUT;
	public MyHelperClass UTF_8;
	public MyHelperClass CONNECTION_TIMEOUT;
public MyHelperClass setConnectionTimeout(HttpParams o0, MyHelperClass o1){ return null; }
	public MyHelperClass setIntParameter(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getStatusCode(){ return null; }}

class HttpPost {

public MyHelperClass addHeader(String o0, String o1){ return null; }
	public MyHelperClass setEntity(StringEntity o0){ return null; }
	public MyHelperClass abort(){ return null; }}

class HttpData {

public MyHelperClass setStatusCode(String o0){ return null; }
	public MyHelperClass setByteArray(byte[] o0){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
	ClientProtocolException(){}
}

class StringEntity {

StringEntity(String o0, MyHelperClass o1){}
	StringEntity(){}}

class HttpParams {

}

class BasicHttpParams {

}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }
	public MyHelperClass getParams(){ return null; }}

class DefaultHttpClient {

DefaultHttpClient(HttpParams o0){}
	DefaultHttpClient(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}
