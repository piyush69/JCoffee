import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11798810 {
public MyHelperClass RESPONSE_ENCODING;
	public MyHelperClass documentBuilder;
	public MyHelperClass HTTP_UNAUTHORIZED;
	public MyHelperClass LOGGER;
	public MyHelperClass HTTP_UNAVAILABLE;
	public MyHelperClass IOUtils;
	public MyHelperClass WAITING_TIME;
	public MyHelperClass httpClient;
	public MyHelperClass HTTP_OK;
	public MyHelperClass isNextRequestAllowed(){ return null; }
	public MyHelperClass updateLastRequestTimestamp(){ return null; }

    private synchronized Document executeHttpMethod(final HttpUriRequest httpRequest) throws Throwable, UnauthorizedException, ThrottledException, ApiException {
        if (!(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Boolean)(Object)isNextRequestAllowed()) {
            try {
                if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)LOGGER.isDebugEnabled()) {
                    LOGGER.debug("Wait " + WAITING_TIME + "ms for request.");
                }
                wait((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(long)(Object)WAITING_TIME);
            } catch (InterruptedException ie) {
                throw new ApiException("Waiting for request interrupted.", ie);
            }
        }
        try {
            if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)LOGGER.isDebugEnabled()) {
                LOGGER.debug("Perform request.");
            }
            HttpResponse httpResponse =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpClient.execute(httpRequest);
            switch((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)httpResponse.getStatusLine().getStatusCode()) {
                case(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) HTTP_OK:
                    HttpEntity httpEntity =(HttpEntity)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpResponse.getEntity();
                    if (httpEntity != null) {
                        InputStream responseStream =(InputStream)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpEntity.getContent();
                        if (responseStream == null) {
                            throw new ApiException("TODO");
                        } else {
                            String response = null;
                            try {
                                response = IOUtils.toString(responseStream, RESPONSE_ENCODING);
                            } catch (IOException ioe) {
                                throw new ApiException("Problem reading response", ioe);
                            } catch (RuntimeException re) {
                                httpRequest.abort();
                                throw new ApiException("Problem reading response", re);
                            } finally {
                                responseStream.close();
                            }
                            StringReader responseReader = new StringReader(response);
                            Document document =(Document)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) documentBuilder.parse(new InputSource(responseReader));
                            return document;
                        }
                    }
                case(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) HTTP_UNAVAILABLE:
                    throw new ThrottledException("TODO");
                case(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) HTTP_UNAUTHORIZED:
                    throw new UnauthorizedException("TODO");
                default:
                    throw new ApiException("Unexpected HTTP status code: " + httpResponse.getStatusLine().getStatusCode());
            }
        } catch (SAXException se) {
            throw new ApiException("TODO", se);
        } catch (IOException ioe) {
            throw new ApiException("TODO", ioe);
        } finally {
            updateLastRequestTimestamp();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass parse(InputSource o0){ return null; }
	public MyHelperClass execute(HttpUriRequest o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }}

class HttpUriRequest {

public MyHelperClass abort(){ return null; }}

class Document {

}

class UnauthorizedException extends Exception{
	public UnauthorizedException(String errorMessage) { super(errorMessage); }
}

class ThrottledException extends Exception{
	public ThrottledException(String errorMessage) { super(errorMessage); }
}

class ApiException extends Exception{
	public ApiException(String errorMessage) { super(errorMessage); }
	ApiException(String o0, RuntimeException o1){}
	ApiException(String o0, IOException o1){}
	ApiException(){}
	ApiException(String o0, SAXException o1){}
	ApiException(String o0, InterruptedException o1){}
}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class InputSource {

InputSource(){}
	InputSource(StringReader o0){}}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class Object {

public MyHelperClass toString(InputStream o0, MyHelperClass o1){ return null; }}
