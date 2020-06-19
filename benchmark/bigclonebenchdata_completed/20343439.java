import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20343439 {
public MyHelperClass SSLUtil;
	public MyHelperClass Debug;
public MyHelperClass connection;
	public MyHelperClass close(URLConnection o0){ return null; }

        public void run()  throws Throwable {
            URLConnection con = null;
            try {
                MyHelperClass url = new MyHelperClass();
                con =(URLConnection)(Object) url.openConnection();
//                MyHelperClass url = new MyHelperClass();
                if ("HTTPS".equalsIgnoreCase((String)(Object)url.getProtocol())) {
                    HttpsURLConnection scon = (HttpsURLConnection)(HttpsURLConnection)(Object) con;
                    try {
                        MyHelperClass clientCertAlias = new MyHelperClass();
                        scon.setSSLSocketFactory(SSLUtil.getSSLSocketFactory(clientCertAlias));
                        MyHelperClass hostCertLevel = new MyHelperClass();
                        HostnameVerifier hv =(HostnameVerifier)(Object) SSLUtil.getHostnameVerifier(hostCertLevel);
                        if (hv != null) {
                            scon.setHostnameVerifier(hv);
                        }
                    } catch (GeneralSecurityException e) {
                        MyHelperClass module = new MyHelperClass();
                        Debug.logError(e, module);
                    } catch (GenericConfigException e) {
                        MyHelperClass module = new MyHelperClass();
                        Debug.logError(e, module);
                    }
                }
            } catch (IOException e) {
                MyHelperClass module = new MyHelperClass();
                Debug.logError(e, module);
            }
            synchronized (URLConnector.this) {
                MyHelperClass timedOut = new MyHelperClass();
                if ((boolean)(Object)timedOut && con != null) {
                    close(con);
                } else {
                    connection =(MyHelperClass)(Object) con;
                    URLConnector.this.notify();
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass logError(IOException o0, MyHelperClass o1){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass logError(GenericConfigException o0, MyHelperClass o1){ return null; }
	public MyHelperClass getHostnameVerifier(MyHelperClass o0){ return null; }
	public MyHelperClass getProtocol(){ return null; }
	public MyHelperClass logError(GeneralSecurityException o0, MyHelperClass o1){ return null; }
	public MyHelperClass getSSLSocketFactory(MyHelperClass o0){ return null; }}

class HttpsURLConnection {

public MyHelperClass setHostnameVerifier(HostnameVerifier o0){ return null; }
	public MyHelperClass setSSLSocketFactory(MyHelperClass o0){ return null; }}

class HostnameVerifier {

}

class GenericConfigException extends Exception{
	public GenericConfigException(String errorMessage) { super(errorMessage); }
}

class URLConnector {

}
