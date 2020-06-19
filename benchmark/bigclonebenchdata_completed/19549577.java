import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19549577 {
public MyHelperClass GZIP_ENCODING;
	public MyHelperClass convertStreamToString(InputStream o0){ return null; }
	public MyHelperClass getParametersString(Map<String,List<String o0){ return null; }

    protected InputStream callApiPost(String apiUrl, Map<String, List<String>> parameters, int expected)  throws Throwable {
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            MyHelperClass ApplicationConstants = new MyHelperClass();
            if (ApplicationConstants.CONNECT_TIMEOUT > -1) {
                MyHelperClass ApplicationConstants = new MyHelperClass();
                request.setConnectTimeout(ApplicationConstants.CONNECT_TIMEOUT);
            }
            MyHelperClass ApplicationConstants = new MyHelperClass();
            if (ApplicationConstants.READ_TIMEOUT > -1) {
                MyHelperClass ApplicationConstants = new MyHelperClass();
                request.setReadTimeout(ApplicationConstants.READ_TIMEOUT);
            }
            MyHelperClass requestHeaders = new MyHelperClass();
            for (String headerName : requestHeaders.keySet()) {
                MyHelperClass requestHeaders = new MyHelperClass();
                request.setRequestProperty(headerName, requestHeaders.get(headerName));
            }
            request.setRequestMethod("POST");
            request.setDoOutput(true);
            PrintStream out = new PrintStream(new BufferedOutputStream(request.getOutputStream()));
            out.print(getParametersString(parameters));
            out.flush();
            out.close();
            request.connect();
            if (request.getResponseCode() != expected) {
                throw new BingMapsException(convertStreamToString(request.getErrorStream()));
            } else {
                return getWrappedInputStream(request.getInputStream(), GZIP_ENCODING.equalsIgnoreCase(request.getContentEncoding()));
            }
        } catch (IOException e) {
            throw new BingMapsException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BingMapsException extends Exception{
	public BingMapsException(String errorMessage) { super(errorMessage); }
}
