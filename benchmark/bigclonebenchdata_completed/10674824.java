import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10674824 {
public MyHelperClass localServer_;
	public MyHelperClass SSLContext;
	public MyHelperClass createKeyManagerFactory(){ return null; }
	public MyHelperClass createTrustManagerFactory(){ return null; }

//    @Before
    public void setUp() throws Throwable, Exception {
        final URL url = getClass().getClassLoader().getResource("insecureSSL.keystore");
        final KeyStore keystore = KeyStore.getInstance("jks");
        final char[] pwd = "nopassword".toCharArray();
        keystore.load(url.openStream(), pwd);
        final TrustManagerFactory trustManagerFactory =(TrustManagerFactory)(Object) createTrustManagerFactory();
        trustManagerFactory.init(keystore);
        final TrustManager[] trustManagers =(TrustManager[])(Object) trustManagerFactory.getTrustManagers();
        final KeyManagerFactory keyManagerFactory =(KeyManagerFactory)(Object) createKeyManagerFactory();
        keyManagerFactory.init(keystore, pwd);
        final KeyManager[] keyManagers =(KeyManager[])(Object) keyManagerFactory.getKeyManagers();
        final SSLContext serverSSLContext =(SSLContext)(Object) SSLContext.getInstance("TLS");
        serverSSLContext.init(keyManagers, trustManagers, null);
        localServer_ =(MyHelperClass)(Object) new LocalTestServer(serverSSLContext);
        localServer_.registerDefaultHandlers();
        localServer_.start();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass registerDefaultHandlers(){ return null; }
	public MyHelperClass start(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class Before {

}

class TrustManagerFactory {

public MyHelperClass init(KeyStore o0){ return null; }
	public MyHelperClass getTrustManagers(){ return null; }}

class TrustManager {

}

class KeyManagerFactory {

public MyHelperClass init(KeyStore o0, char[] o1){ return null; }
	public MyHelperClass getKeyManagers(){ return null; }}

class KeyManager {

}

class SSLContext {

public MyHelperClass init(KeyManager[] o0, TrustManager[] o1, Object o2){ return null; }}

class LocalTestServer {

LocalTestServer(SSLContext o0){}
	LocalTestServer(){}}
