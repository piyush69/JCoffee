import java.io.*;
import java.lang.*;
import java.util.*;



class c19715255 {
public static MyHelperClass HttpClientUtils;
	public static MyHelperClass JSONObject;
//public MyHelperClass HttpClientUtils;
//	public MyHelperClass JSONObject;

    static Object executeMethod(HttpMethod method, int timeout, boolean array) throws HttpRequestFailureException, HttpException, IOException, HttpRequestTimeoutException {
        try {
            method.getParams().setSoTimeout(timeout * 1000);
            int status = -1;
            Object result = null;
            System.out.println("Execute method: " + method.getPath() + " " + method.getQueryString());
            MyHelperClass TwitterclipsePlugin = new MyHelperClass();
            TwitterclipseConfig config =(TwitterclipseConfig)(Object) TwitterclipsePlugin.getDefault().getTwitterclipseConfiguration();
            MyHelperClass TWITTER_BASE_URL = new MyHelperClass();
            HttpClient httpClient =(HttpClient)(Object) HttpClientUtils.createHttpClient(TWITTER_BASE_URL, config.getUserId(), config.getPassword());
            status =(int)(Object) httpClient.executeMethod(method);
            System.out.println("Received response. status = " + status);
            MyHelperClass HttpStatus = new MyHelperClass();
            if (status == (int)(Object)HttpStatus.SC_OK) {
                InputStream inputStream =(InputStream)(Object) method.getResponseBodyAsStream();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(inputStream, baos);
                String response = new String(baos.toByteArray(), "UTF-8");
                System.out.println(response);
                MyHelperClass JSONArray = new MyHelperClass();
                if (array) result = JSONArray.fromString(response); else result = JSONObject.fromString(response);
            } else {
                throw new HttpRequestFailureException((String)(Object)status);
            }
            return result;
        } catch (UncheckedIOException e) {
            throw new HttpRequestTimeoutException((String)(Object)e);
        } finally {
            method.releaseConnection();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass setSoTimeout(int o0){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass getTwitterclipseConfiguration(){ return null; }
	public MyHelperClass fromString(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass createHttpClient(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }}

class HttpMethod {

public MyHelperClass getQueryString(){ return null; }
	public MyHelperClass releaseConnection(){ return null; }
	public MyHelperClass getParams(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getResponseBodyAsStream(){ return null; }}

class HttpRequestFailureException extends Exception{
	public HttpRequestFailureException(String errorMessage) { super(errorMessage); }
}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}

class HttpRequestTimeoutException extends Exception{
	public HttpRequestTimeoutException(String errorMessage) { super(errorMessage); }
}

class TwitterclipseConfig {

public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getUserId(){ return null; }}

class HttpClient {

public MyHelperClass executeMethod(HttpMethod o0){ return null; }}

class SocketTimeoutException extends Exception{
	public SocketTimeoutException(String errorMessage) { super(errorMessage); }
}
