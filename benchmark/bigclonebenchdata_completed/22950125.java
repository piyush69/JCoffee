import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c22950125 {
public MyHelperClass SAWSConstant;
public MyHelperClass CertificateFactory;
	public MyHelperClass sawsDebugLog;
	public MyHelperClass debugLevel;

    private boolean importPKC(String keystoreLocation, String pw, String pkcFile, String alias) {
        boolean imported = false;
        KeyStore ks = null;
        try {
            ks = KeyStore.getInstance(KeyStore.getDefaultType());
            ks.load(new BufferedInputStream(new FileInputStream(keystoreLocation)), pw.toCharArray());
        } catch (Exception e) {
            if ((int)(Object)this.debugLevel >= (int)(Object)SAWSConstant.ErrorInfo) {
                this.sawsDebugLog.write("Error reading keystore file when exporting PKC: " + e.getMessage());
            }
            return false;
        }
        Certificate cert = null;
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(pkcFile));
            CertificateFactory cf =(CertificateFactory)(Object) CertificateFactory.getInstance("X.509");
            while (bis.available() > 0) {
                cert =(Certificate)(Object) cf.generateCertificate(bis);
            }
        } catch (Exception e) {
            if ((int)(Object)this.debugLevel >= (int)(Object)SAWSConstant.ErrorInfo) {
                this.sawsDebugLog.write("Error reading certificate from file when importing PKC: " + e.getMessage());
            }
            return false;
        }
        BufferedOutputStream bos = null;
        try {
            bos = new BufferedOutputStream(new FileOutputStream(new File(keystoreLocation)));
        } catch (FileNotFoundException e) {
            if ((int)(Object)this.debugLevel >= (int)(Object)SAWSConstant.ErrorInfo) {
                this.sawsDebugLog.write("Error accessing key store file when importing certificate: " + e.getMessage());
            }
            return false;
        }
        try {
            if (alias.equals("rootca")) {
                ks.setCertificateEntry(alias,(java.security.cert.Certificate)(Object) cert);
            } else {
                KeyStore.PrivateKeyEntry pkEntry = (KeyStore.PrivateKeyEntry) ks.getEntry(alias, new KeyStore.PasswordProtection(pw.toCharArray()));
                ks.setKeyEntry(alias, pkEntry.getPrivateKey(), pw.toCharArray(),(java.security.cert.Certificate[])(Object) new Certificate[] { cert });
            }
            ks.store(bos, pw.toCharArray());
            imported = true;
        } catch (Exception e) {
            e.printStackTrace();
            if ((int)(Object)this.debugLevel >= (int)(Object)SAWSConstant.ErrorInfo) {
                this.sawsDebugLog.write("Error writing keystore to file when importing key store: " + e.getMessage());
            }
            return false;
        }
        return imported;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ErrorInfo;
public MyHelperClass write(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class CertificateFactory {

public MyHelperClass generateCertificate(BufferedInputStream o0){ return null; }}
