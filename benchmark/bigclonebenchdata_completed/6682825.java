import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6682825 {
public MyHelperClass providerName;
	public MyHelperClass storePass;
	public MyHelperClass storeURI;
	public MyHelperClass storeType;
	public MyHelperClass keyStore;

    KeyStore getKeyStore() throws JarSignerException {
        MyHelperClass keyStore = new MyHelperClass();
        if (keyStore == null) {
            KeyStore store = null;
            MyHelperClass providerName = new MyHelperClass();
            if (providerName == null) {
                try {
                    store = KeyStore.getInstance((String)(Object)this.storeType);
                } catch (KeyStoreException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    store = KeyStore.getInstance((String)(Object)storeType,(String)(Object) providerName);
                } catch (KeyStoreException e) {
                    e.printStackTrace();
                } catch (NoSuchProviderException e) {
                    e.printStackTrace();
                }
            }
            if (storeURI == null) {
                throw new JarSignerException("Cannot load the keystore " + " error con el keystore");
            }
            try {
                storeURI = storeURI.replace(File.separatorChar, '/');
                URL url = null;
                try {
                    url = new URL((String)(Object)storeURI);
                } catch (java.net.MalformedURLException e) {
                    url = new File((String)(Object)storeURI).toURI().toURL();
                }
                InputStream is = null;
                try {
                    is = url.openStream();
                    store.load(is,(char[])(Object) storePass);
                } finally {
                    if (is != null) {
                        is.close();
                    }
                }
            } catch (Exception e) {
                throw new JarSignerException("Cannot load the keystore " + storeURI, e);
            }
            keyStore =(MyHelperClass)(Object) store;
        }
        return(KeyStore)(Object) keyStore;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass replace(char o0, char o1){ return null; }}

class JarSignerException extends Exception{
	public JarSignerException(String errorMessage) { super(errorMessage); }
	JarSignerException(String o0, Exception o1){}
	JarSignerException(){}
}
