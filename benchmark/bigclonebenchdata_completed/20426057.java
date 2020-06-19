import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20426057 {

    public static KeyStore createKeyStore(final URL url, final String password) throws Throwable, KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException {
        if (url == null) throw new IllegalArgumentException("Keystore url may not be null");
        MyHelperClass LOG = new MyHelperClass();
        LOG.debug("Initializing key store");
        KeyStore keystore = null;
        if (url.getFile().endsWith(".p12")) keystore = KeyStore.getInstance("pkcs12"); else keystore = KeyStore.getInstance(KeyStore.getDefaultType());
        keystore.load(url.openStream(), password != null ? password.toCharArray() : null);
        return keystore;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}

class CertificateException extends Exception{
	public CertificateException(String errorMessage) { super(errorMessage); }
}
