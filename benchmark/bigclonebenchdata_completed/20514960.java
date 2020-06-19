import java.io.*;
import java.lang.*;
import java.util.*;



class c20514960 {

    static JSONObject executeMethod(HttpClient httpClient, HttpMethod method, int timeout) throws HttpRequestFailureException, HttpException, IOException, HttpRequestTimeoutException {
        try {
            method.getParams().setSoTimeout(timeout * 1000);
            int status = -1;
            JSONObject result = null;
            MyHelperClass RETRY = new MyHelperClass();
            for (int i = 0; i < (int)(Object)RETRY; i++) {
                System.out.println("Execute method[" + method.getURI() + "](try " + (i + 1) + ")");
                status =(int)(Object) httpClient.executeMethod(method);
                MyHelperClass HttpStatus = new MyHelperClass();
                if (status == (int)(Object)HttpStatus.SC_OK) {
                    InputStream inputStream =(InputStream)(Object) method.getResponseBodyAsStream();
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(inputStream, baos);
                    String response = new String(baos.toByteArray(), "UTF-8");
                    System.out.println(response);
                    MyHelperClass JSONObject = new MyHelperClass();
                    result =(JSONObject)(Object) JSONObject.fromString(response);
                    if ((boolean)(Object)result.has("status")) {
                        String lingrStatus =(String)(Object) result.getString("status");
                        if ("ok".equals(lingrStatus)) {
                            break;
                        } else {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                } else {
                    throw new HttpRequestFailureException((String)(Object)status);
                }
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
	public MyHelperClass fromString(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class HttpClient {

public MyHelperClass executeMethod(HttpMethod o0){ return null; }}

class HttpMethod {

public MyHelperClass getURI(){ return null; }
	public MyHelperClass getResponseBodyAsStream(){ return null; }
	public MyHelperClass getParams(){ return null; }
	public MyHelperClass releaseConnection(){ return null; }}

class JSONObject {

public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass has(String o0){ return null; }}

class HttpRequestFailureException extends Exception{
	public HttpRequestFailureException(String errorMessage) { super(errorMessage); }
}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}

class HttpRequestTimeoutException extends Exception{
	public HttpRequestTimeoutException(String errorMessage) { super(errorMessage); }
}

class SocketTimeoutException extends Exception{
	public SocketTimeoutException(String errorMessage) { super(errorMessage); }
}
