import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4700182 {
public MyHelperClass CHARSET;
	public MyHelperClass configureProxy(DefaultHttpClient o0){ return null; }

    public String sendRequest(HttpRequest request) throws Throwable, IOException, AuthenticationException, RedmineException, NotFoundException {
        MyHelperClass logger = new MyHelperClass();
        logger.debug(request.getRequestLine().toString());
        MyHelperClass HttpUtil = new MyHelperClass();
        DefaultHttpClient httpclient =(DefaultHttpClient)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) HttpUtil.getNewHttpClient();
        configureProxy(httpclient);
        MyHelperClass login = new MyHelperClass();
        if (login != null) {
            MyHelperClass Base64Encoder = new MyHelperClass();
            final String credentials = String.valueOf(Base64Encoder.encode(((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(char)(Object)login + ':' + password).getBytes(CHARSET)));
            request.addHeader("Authorization", "Basic: " + credentials);
        }
        request.addHeader("Accept-Encoding", "gzip,deflate");
        HttpResponse httpResponse = httpclient.execute((HttpUriRequest)(HttpUriRequest)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) request);
        int responseCode =(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpResponse.getStatusLine().getStatusCode();
        MyHelperClass HttpStatus = new MyHelperClass();
        if (responseCode ==(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) (int)(Object)HttpStatus.SC_UNAUTHORIZED) {
            throw new AuthenticationException("Authorization error. Please check if you provided a valid API access key or Login and Password and REST API service is enabled on the server.");
        }
//        MyHelperClass HttpStatus = new MyHelperClass();
        if (responseCode ==(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) (int)(Object)HttpStatus.SC_FORBIDDEN) {
            throw new AuthenticationException("Forbidden. Please check the user has proper permissions.");
        }
        HttpEntity responseEntity =(HttpEntity)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpResponse.getEntity();
        MyHelperClass EntityUtils = new MyHelperClass();
        String responseBody = EntityUtils.toString(responseEntity);
//        MyHelperClass HttpStatus = new MyHelperClass();
        if (responseCode ==(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) (int)(Object)HttpStatus.SC_NOT_FOUND) {
            throw new NotFoundException("Server returned '404 not found'. response body:" + responseBody);
        }
//        MyHelperClass HttpStatus = new MyHelperClass();
        if (responseCode ==(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) (int)(Object)HttpStatus.SC_UNPROCESSABLE_ENTITY) {
            MyHelperClass RedmineXMLParser = new MyHelperClass();
            List<String> errors =(List<String>)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) RedmineXMLParser.parseErrors(responseBody);
            throw new RedmineException((String[])(Object)(String[])(Object)(String[])(Object)(String[])(Object)(String[])(Object)(String[])(Object)(String[])(Object)(String[])(Object)(String)(Object)errors);
        }
        httpclient.getConnectionManager().shutdown();
        return responseBody;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_NOT_FOUND;
	public MyHelperClass SC_UNPROCESSABLE_ENTITY;
	public MyHelperClass SC_UNAUTHORIZED;
	public MyHelperClass SC_FORBIDDEN;
public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass shutdown(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getNewHttpClient(){ return null; }
	public MyHelperClass parseErrors(String o0){ return null; }}

class HttpRequest {

public MyHelperClass addHeader(String o0, String o1){ return null; }
	public MyHelperClass getRequestLine(){ return null; }}

class AuthenticationException extends Exception{
	public AuthenticationException(String errorMessage) { super(errorMessage); }
}

class RedmineException extends Exception{
	public RedmineException(String errorMessage) { super(errorMessage); }
}

class NotFoundException extends Exception{
	public NotFoundException(String errorMessage) { super(errorMessage); }
}

class DefaultHttpClient {

public MyHelperClass getConnectionManager(){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class HttpUriRequest {

}

class HttpEntity {

}

class Object {

public MyHelperClass toString(HttpEntity o0){ return null; }}
