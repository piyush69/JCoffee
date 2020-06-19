import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19549575 {
public MyHelperClass getWrappedInputStream(InputStream o0, MyHelperClass o1){ return null; }
public MyHelperClass GZIP_ENCODING;
	public MyHelperClass convertStreamToString(InputStream o0){ return null; }

    protected InputStream callApiGet(String apiUrl, int expected)  throws Throwable {
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            MyHelperClass ApplicationConstants = new MyHelperClass();
            if ((int)(Object)ApplicationConstants.CONNECT_TIMEOUT > -1) {
//                MyHelperClass ApplicationConstants = new MyHelperClass();
                request.setConnectTimeout((int)(Object)ApplicationConstants.CONNECT_TIMEOUT);
            }
//            MyHelperClass ApplicationConstants = new MyHelperClass();
            if ((int)(Object)ApplicationConstants.READ_TIMEOUT > -1) {
//                MyHelperClass ApplicationConstants = new MyHelperClass();
                request.setReadTimeout((int)(Object)ApplicationConstants.READ_TIMEOUT);
            }
            MyHelperClass requestHeaders = new MyHelperClass();
            for (String headerName :(String[])(Object) (Object[])(Object)requestHeaders.keySet()) {
//                MyHelperClass requestHeaders = new MyHelperClass();
                request.setRequestProperty(headerName,(String)(Object) requestHeaders.get(headerName));
            }
            request.connect();
            if (request.getResponseCode() != expected) {
                throw new BingMapsException((String)(Object)convertStreamToString(request.getErrorStream()));
            } else {
                return(InputStream)(Object) getWrappedInputStream(request.getInputStream(), GZIP_ENCODING.equalsIgnoreCase(request.getContentEncoding()));
            }
        } catch (IOException e) {
            throw new BingMapsException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_TIMEOUT;
	public MyHelperClass CONNECT_TIMEOUT;
public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class BingMapsException extends Exception{
	public BingMapsException(String errorMessage) { super(errorMessage); }
}
