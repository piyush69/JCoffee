import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19204595 {
public MyHelperClass readResponse(Class<Error o0, MyHelperClass o1){ return null; }
public MyHelperClass getWrappedInputStream(InputStream o0, MyHelperClass o1){ return null; }
public MyHelperClass GZIP_ENCODING;
	public MyHelperClass createBingSearchApiClientException(Error o0){ return null; }

    protected InputStream callApiMethod(String apiUrl, int expected)  throws Throwable {
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            MyHelperClass requestHeaders = new MyHelperClass();
            for (String headerName :(String[])(Object) (Object[])(Object)requestHeaders.keySet()) {
//                MyHelperClass requestHeaders = new MyHelperClass();
                request.setRequestProperty(headerName,(String)(Object) requestHeaders.get(headerName));
            }
            request.connect();
            if (request.getResponseCode() != expected) {
                MyHelperClass GZIP_ENCODING = new MyHelperClass();
                Error error = readResponse(Error.class, getWrappedInputStream(request.getErrorStream(), GZIP_ENCODING.equalsIgnoreCase(request.getContentEncoding())));
                throw(Throwable)(Object) createBingSearchApiClientException(error);
            } else {
                return(InputStream)(Object) getWrappedInputStream(request.getInputStream(), GZIP_ENCODING.equalsIgnoreCase(request.getContentEncoding()));
            }
        } catch (IOException e) {
            throw new BingSearchException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class BingSearchException extends Exception{
	public BingSearchException(String errorMessage) { super(errorMessage); }
}
