import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4301327 {
public MyHelperClass HttpClient;
	public MyHelperClass getResponse(HttpURLConnection o0){ return null; }

    private String doRawGet(URI uri) throws Throwable, XdsInternalException {
        HttpURLConnection conn = null;
        String response = null;
        try {
            URL url;
            try {
                url = uri.toURL();
            } catch (Exception e) {
                MyHelperClass HttpClient = new MyHelperClass();
                throw(Throwable)(Object) HttpClient.getException(e, uri.toString());
            }
            MyHelperClass HttpsURLConnection = new MyHelperClass();
            HttpsURLConnection.setDefaultHostnameVerifier(this);
            conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setUseCaches(false);
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "text/html, text/xml, text/plain, */*");
            conn.connect();
            response =(String)(Object) this.getResponse(conn);
        } catch (IOException e) {
            throw(Throwable)(Object) HttpClient.getException(e, uri.toString());
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
        return response;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setDefaultHostnameVerifier(c4301327 o0){ return null; }
	public MyHelperClass getException(IOException o0, String o1){ return null; }
	public MyHelperClass getException(Exception o0, String o1){ return null; }}

class XdsInternalException extends Exception{
	public XdsInternalException(String errorMessage) { super(errorMessage); }
}
