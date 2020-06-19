import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9597416 {
public MyHelperClass HttpStatus;
	public MyHelperClass log;
	public MyHelperClass EntityUtils;
	public MyHelperClass httpClient;

//    @Override
    protected void doPost(final String url, final InputStream data) throws Throwable, WebServiceException {
        final HttpPost method = new HttpPost(url);
        method.setEntity(new InputStreamEntity(data, -1));
        try {
            final HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) this.httpClient.execute(method);
            final String responseString = response.getEntity() != null ? EntityUtils.toString(response.getEntity()) : "";
            final int statusCode =(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) response.getStatusLine().getStatusCode();
            switch(statusCode) {
                case(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) HttpStatus.SC_OK:
                    return;
                case(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) HttpStatus.SC_NOT_FOUND:
                    throw new ResourceNotFoundException(responseString);
                case(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) HttpStatus.SC_BAD_REQUEST:
                    throw new RequestException(responseString);
                case(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) HttpStatus.SC_FORBIDDEN:
                    throw new AuthorizationException(responseString);
                case(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) HttpStatus.SC_UNAUTHORIZED:
                    throw new AuthorizationException(responseString);
                default:
                    String em = "web service returned unknown status '" + statusCode + "', response was: " + responseString;
                    this.log.error(em);
                    throw new WebServiceException(em);
            }
        } catch (IOException e) {
            this.log.error("Fatal transport error: " + e.getMessage());
            throw new WebServiceException(e.getMessage(), e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_NOT_FOUND;
	public MyHelperClass SC_UNAUTHORIZED;
	public MyHelperClass SC_OK;
	public MyHelperClass SC_FORBIDDEN;
	public MyHelperClass SC_BAD_REQUEST;
public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }}

class WebServiceException extends Exception{
	public WebServiceException(String errorMessage) { super(errorMessage); }
	WebServiceException(){}
	WebServiceException(String o0, IOException o1){}
}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(InputStreamEntity o0){ return null; }}

class InputStreamEntity {

InputStreamEntity(){}
	InputStreamEntity(InputStream o0, int o1){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class ResourceNotFoundException extends Exception{
	public ResourceNotFoundException(String errorMessage) { super(errorMessage); }
}

class RequestException extends Exception{
	public RequestException(String errorMessage) { super(errorMessage); }
}

class AuthorizationException extends Exception{
	public AuthorizationException(String errorMessage) { super(errorMessage); }
}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
