import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16706336 {
public MyHelperClass password;
	public MyHelperClass alias;
	public MyHelperClass SSLUtil;

        protected URLConnection openConnection(URL url) throws Throwable, IOException {
            URLConnection con = url.openConnection();
            if ("HTTPS".equalsIgnoreCase(url.getProtocol())) {
                HttpsURLConnection scon = (HttpsURLConnection)(HttpsURLConnection)(Object) con;
                try {
                    MyHelperClass ks = new MyHelperClass();
                    scon.setSSLSocketFactory(SSLUtil.getSSLSocketFactory(ks, password, alias));
                    MyHelperClass SSLUtil = new MyHelperClass();
                    scon.setHostnameVerifier(SSLUtil.getHostnameVerifier(SSLUtil.HOSTCERT_MIN_CHECK));
                } catch (UncheckedIOException e) {
                    throw new IOException(e.getMessage());
                } catch (ArithmeticException e) {
                    throw new IOException(e.getMessage());
                }
            }
            return con;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HOSTCERT_MIN_CHECK;
public MyHelperClass getHostnameVerifier(MyHelperClass o0){ return null; }
	public MyHelperClass getSSLSocketFactory(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }}

class HttpsURLConnection {

public MyHelperClass setSSLSocketFactory(MyHelperClass o0){ return null; }
	public MyHelperClass setHostnameVerifier(MyHelperClass o0){ return null; }}

class GeneralException extends Exception{
	public GeneralException(String errorMessage) { super(errorMessage); }
}
