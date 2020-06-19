import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11233252 {
public MyHelperClass trustAnchors;
	public MyHelperClass LOG;

    private void loadTrustAnchors(final String keystoreLocation)  throws Throwable {
        MyHelperClass LOG = new MyHelperClass();
        LOG.debug("keystore location: " + keystoreLocation);
        try {
            if (keystoreLocation == null) {
                throw new NullPointerException("No TrustAnchor KeyStore name is set");
            }
            InputStream keyStoreStream = null;
            if (new File(keystoreLocation).exists()) {
                keyStoreStream = new FileInputStream(keystoreLocation);
            } else if (new File("../trust1.keystore").exists()) {
                keyStoreStream = new FileInputStream(new File("../trust1.keystore"));
            } else if (new File("trust1.keystore").exists()) {
                keyStoreStream = new FileInputStream(new File("../trust1.keystore"));
            } else {
                URL url = Thread.currentThread().getContextClassLoader().getResource("trust1.keystore");
                if (url != null) keyStoreStream = new BufferedInputStream(url.openStream());
            }
            MyHelperClass trustStoreType = new MyHelperClass();
            KeyStore ks = KeyStore.getInstance((String)(Object)trustStoreType);
            MyHelperClass trustStorePassword = new MyHelperClass();
            ks.load(keyStoreStream,(char[])(Object) trustStorePassword.toCharArray());
            Enumeration<String> aliases = ks.aliases();
            while (aliases.hasMoreElements()) {
                String alias = aliases.nextElement();
//                MyHelperClass LOG = new MyHelperClass();
                LOG.debug("inspecting alias " + alias);
                if (ks.entryInstanceOf(alias, KeyStore.TrustedCertificateEntry.class)) {
//                    MyHelperClass LOG = new MyHelperClass();
                    LOG.debug("Adding TrustAnchor: " + ((X509Certificate)(X509Certificate)(Object) ks.getCertificate(alias)).getSubjectX500Principal().getName());
                    TrustAnchor ta = new TrustAnchor((X509Certificate)(X509Certificate)(Object) (ks.getCertificate(alias)), null);
                    this.trustAnchors.add(ta);
                }
            }
        } catch (Exception ex) {
            LOG.error("Error loading TrustAnchors", ex);
            this.trustAnchors = null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getName(){ return null; }
	public MyHelperClass add(TrustAnchor o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass toCharArray(){ return null; }}

class X509Certificate {

public MyHelperClass getSubjectX500Principal(){ return null; }}

class TrustAnchor {

TrustAnchor(X509Certificate o0, Object o1){}
	TrustAnchor(){}}
