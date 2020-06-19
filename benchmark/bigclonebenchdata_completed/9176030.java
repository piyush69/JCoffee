import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9176030 {
public MyHelperClass SSLContext;
public MyHelperClass sslcontext;
	public MyHelperClass params;
	public MyHelperClass ioReactor;
	public MyHelperClass TrustManagerFactory;

    public  c9176030(final HttpParams params) throws Throwable, Exception {
        super();
        this.params =(MyHelperClass)(Object) params;
        this.ioReactor =(MyHelperClass)(Object) new DefaultConnectingIOReactor(2, this.params);
        ClassLoader cl = getClass().getClassLoader();
        URL url = cl.getResource("test.keystore");
        KeyStore keystore = KeyStore.getInstance("jks");
        keystore.load(url.openStream(), "nopassword".toCharArray());
        TrustManagerFactory tmfactory =(TrustManagerFactory)(Object) TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        tmfactory.init(keystore);
        TrustManager[] trustmanagers =(TrustManager[])(Object) tmfactory.getTrustManagers();
        this.sslcontext = SSLContext.getInstance("TLS");
        this.sslcontext.init(null, trustmanagers, null);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getDefaultAlgorithm(){ return null; }
	public MyHelperClass init(Object o0, TrustManager[] o1, Object o2){ return null; }
	public MyHelperClass getInstance(MyHelperClass o0){ return null; }}

class HttpParams {

}

class TrustManagerFactory {

public MyHelperClass init(KeyStore o0){ return null; }
	public MyHelperClass getTrustManagers(){ return null; }}

class TrustManager {

}

class DefaultConnectingIOReactor {

DefaultConnectingIOReactor(){}
	DefaultConnectingIOReactor(int o0, MyHelperClass o1){}}
