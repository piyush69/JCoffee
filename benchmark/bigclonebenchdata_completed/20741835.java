import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c20741835 {
public MyHelperClass DEFAULT_READ_TIMEOUT_IN_MS;
	public MyHelperClass HTTP_OK;
	public MyHelperClass WARNING;
	public MyHelperClass logger;
	public MyHelperClass FINER;
	public MyHelperClass fromInputStream(InputStream o0){ return null; }
	public MyHelperClass closeQuietly(HttpURLConnection o0){ return null; }
	public MyHelperClass openConnection(URL o0){ return null; }
	public MyHelperClass customizeConnection(HttpURLConnection o0){ return null; }

//    @Override
    public Response executeGet(String url) throws IOException {
        MyHelperClass INFO = new MyHelperClass();
        if ((boolean)(Object)logger.isLoggable(INFO)) logger.info("Making a GET request to " + url);
        HttpURLConnection httpUrlConnection = null;
        InputStream inputStream = null;
        try {
            httpUrlConnection =(HttpURLConnection)(Object) openConnection(new URL(url));
            httpUrlConnection.setReadTimeout((int)(Object)DEFAULT_READ_TIMEOUT_IN_MS);
            httpUrlConnection.setUseCaches(false);
            customizeConnection(httpUrlConnection);
            httpUrlConnection.setRequestMethod("GET");
            httpUrlConnection.connect();
            if ((boolean)(Object)logger.isLoggable(FINER)) logger.finer("Response headers: " + httpUrlConnection.getHeaderFields());
            try {
                inputStream = httpUrlConnection.getResponseCode() != (int)(Object)HTTP_OK ? httpUrlConnection.getErrorStream() : httpUrlConnection.getInputStream();
            } catch (IOException e) {
                if ((boolean)(Object)logger.isLoggable(WARNING)) logger.warning("An error occurred while making a GET request to " + url + ": " + e);
            }
            return new Response(httpUrlConnection.getResponseCode(), fromInputStream(inputStream));
        } finally {
            closeQuietly(httpUrlConnection);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warning(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass finer(String o0){ return null; }
	public MyHelperClass isLoggable(MyHelperClass o0){ return null; }}

class Response {

Response(){}
	Response(int o0, MyHelperClass o1){}}
