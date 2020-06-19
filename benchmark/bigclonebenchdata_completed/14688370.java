import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c14688370 {

    public SSLContext getSSLContext() throws IOException {
        try {
            MyHelperClass keyStoreFile = new MyHelperClass();
            URL url = getClass().getClassLoader().getResource((String)(Object)keyStoreFile);
            MyHelperClass type = new MyHelperClass();
            KeyStore keystore = KeyStore.getInstance((String)(Object)type.name());
            MyHelperClass keyPassword = new MyHelperClass();
            keystore.load(url.openStream(),(char[])(Object) keyPassword);
            MyHelperClass KeyManagerFactory = new MyHelperClass();
            KeyManagerFactory kmfactory =(KeyManagerFactory)(Object) KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
//            MyHelperClass keyPassword = new MyHelperClass();
            kmfactory.init(keystore, keyPassword);
            KeyManager[] keymanagers =(KeyManager[])(Object) kmfactory.getKeyManagers();
            MyHelperClass protocol = new MyHelperClass();
            SSLContext sslcontext =(SSLContext)(Object) SSLContext.getInstance(protocol.name());
            MyHelperClass TRUST_MANAGER = new MyHelperClass();
            sslcontext.init(keymanagers, TRUST_MANAGER, null);
            return sslcontext;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass name(){ return null; }
	public MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass getDefaultAlgorithm(){ return null; }}

class SSLContext {

public MyHelperClass init(KeyManager[] o0, MyHelperClass o1, Object o2){ return null; }
	public static MyHelperClass getInstance(MyHelperClass o0){ return null; }}

class KeyManagerFactory {

public MyHelperClass getKeyManagers(){ return null; }
	public MyHelperClass init(KeyStore o0, MyHelperClass o1){ return null; }}

class KeyManager {

}
