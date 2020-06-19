import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c932225 {
public MyHelperClass NULL;
public MyHelperClass _vendorMessageDigestBytes;
	public MyHelperClass _vendorMessageDigest;
	public MyHelperClass _vendorSig;
	public MyHelperClass _vendorSignatureBytes;
	public MyHelperClass getBankString(){ return null; }

    public void createVendorSignature()  throws Throwable {
        byte b;
        try {
            MessageDigest _vendorMessageDigest =(MessageDigest)(Object) NULL; //new MessageDigest();
            _vendorMessageDigest = MessageDigest.getInstance("MD5");
            Signature _vendorSig =(Signature)(Object) NULL; //new Signature();
            _vendorSig = Signature.getInstance("MD5/RSA/PKCS#1");
            MyHelperClass _vendorPrivateKey = new MyHelperClass();
            _vendorSig.initSign((PrivateKey) _vendorPrivateKey);
            _vendorMessageDigest.update((byte)(Object)getBankString().getBytes());
            _vendorMessageDigestBytes =(MyHelperClass)(Object) _vendorMessageDigest.digest();
            _vendorSig.update((byte)(Object)_vendorMessageDigestBytes);
            _vendorSignatureBytes =(MyHelperClass)(Object) _vendorSig.sign();
        } catch (Exception e) {
        }
        ;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass initSign(PrivateKey o0){ return null; }
	public MyHelperClass sign(){ return null; }
	public MyHelperClass getBytes(){ return null; }}
