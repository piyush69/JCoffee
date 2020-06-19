import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c22950123 {
public MyHelperClass SAWSConstant;
public MyHelperClass sawsDebugLog;
	public MyHelperClass debugLevel;

    private boolean exportPKC(String keystoreLocation, String pw) {
        boolean created = false;
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
            cert =(Certificate)(Object)(java.security.Certificate)(Object) ks.getCertificate("saws");
        } catch (KeyStoreException e) {
            if ((int)(Object)this.debugLevel >= (int)(Object)SAWSConstant.ErrorInfo) {
                this.sawsDebugLog.write("Error reading certificate from keystore file when exporting PKC: " + e.getMessage());
            }
            return false;
        }
        try {
            StringBuffer sb = new StringBuffer("-----BEGIN CERTIFICATE-----\n");
            sb.append(new String((String)(Object)Base64.encode(cert.getEncoded())));
            sb.append("\n-----END CERTIFICATE-----\n");
            OutputStreamWriter wr = new OutputStreamWriter(new FileOutputStream("sawsSigningPKC.crt"));
            wr.write(new String(sb));
            wr.flush();
            wr.close();
            created = true;
        } catch (Exception e) {
            if ((int)(Object)this.debugLevel >= (int)(Object)SAWSConstant.ErrorInfo) {
                this.sawsDebugLog.write("Error exporting PKC file: " + e.getMessage());
            }
            return false;
        }
        return created;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ErrorInfo;
public MyHelperClass write(String o0){ return null; }}

class Certificate {

public MyHelperClass getEncoded(){ return null; }}

class Base64 {

public static MyHelperClass encode(MyHelperClass o0){ return null; }}
