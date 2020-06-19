import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c22950121 {
public MyHelperClass SAWSConstant;
public MyHelperClass sawsDebugLog;
	public MyHelperClass debugLevel;

    private boolean createPKCReqest(String keystoreLocation, String pw) {
        boolean created = false;
        Security.addProvider((Provider)(Object)new BouncyCastleProvider());
        KeyStore ks = null;
        try {
            ks = KeyStore.getInstance(KeyStore.getDefaultType());
            ks.load(new BufferedInputStream(new FileInputStream(keystoreLocation)), pw.toCharArray());
        } catch (Exception e) {
            if ((int)(Object)this.debugLevel >= (int)(Object)SAWSConstant.ErrorInfo) {
                this.sawsDebugLog.write("Error reading keystore file when creating PKC request: " + e.getMessage());
            }
            return false;
        }
        Certificate cert = null;
        try {
            cert =(java.security.Certificate)(Object) ks.getCertificate("saws");
        } catch (KeyStoreException e) {
            if ((int)(Object)this.debugLevel >= (int)(Object)SAWSConstant.ErrorInfo) {
                this.sawsDebugLog.write("Error reading certificate from keystore file when creating PKC request: " + e.getMessage());
            }
            return false;
        }
        PKCS10CertificationRequest request = null;
        PublicKey pk = cert.getPublicKey();
        try {
            request = new PKCS10CertificationRequest("SHA1with" + pk.getAlgorithm(), new X500Principal(((X509Certificate) cert).getSubjectDN().toString()), pk, new DERSet(), (PrivateKey) ks.getKey("saws", pw.toCharArray()));
            PEMWriter pemWrt = new PEMWriter(new OutputStreamWriter(new FileOutputStream("sawsRequest.csr")));
            pemWrt.writeObject(request);
            pemWrt.close();
            created = true;
        } catch (Exception e) {
            if ((int)(Object)this.debugLevel >= (int)(Object)SAWSConstant.ErrorInfo) {
                this.sawsDebugLog.write("Error creating PKC request file: " + e.getMessage());
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

class BouncyCastleProvider {

}

class PKCS10CertificationRequest {

PKCS10CertificationRequest(){}
	PKCS10CertificationRequest(String o0, X500Principal o1, PublicKey o2, DERSet o3, PrivateKey o4){}}

class X500Principal {

X500Principal(String o0){}
	X500Principal(){}}

class DERSet {

}

class PEMWriter {

PEMWriter(OutputStreamWriter o0){}
	PEMWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass writeObject(PKCS10CertificationRequest o0){ return null; }}

class X509Certificate {

public MyHelperClass getSubjectDN(){ return null; }}
