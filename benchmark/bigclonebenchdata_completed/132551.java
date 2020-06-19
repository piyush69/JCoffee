import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c132551 {
public MyHelperClass NULL;
public MyHelperClass _bankSig;
	public MyHelperClass _bankSignatureBytes;
	public MyHelperClass _bankMessageDigestBytes;
	public MyHelperClass _bankMessageDigest;
	public MyHelperClass getBankString(){ return null; }

    public void createBankSignature()  throws Throwable {
        byte b;
        try {
            MessageDigest _bankMessageDigest =(MessageDigest)(Object) NULL; //new MessageDigest();
            _bankMessageDigest = MessageDigest.getInstance("MD5");
            Signature _bankSig =(Signature)(Object) NULL; //new Signature();
            _bankSig = Signature.getInstance("MD5/RSA/PKCS#1");
            MyHelperClass _bankPrivateKey = new MyHelperClass();
            _bankSig.initSign((PrivateKey) _bankPrivateKey);
            _bankMessageDigest.update((byte)(Object)getBankString().getBytes());
            _bankMessageDigestBytes =(MyHelperClass)(Object) _bankMessageDigest.digest();
            _bankSig.update((byte)(Object)_bankMessageDigestBytes);
            _bankSignatureBytes =(MyHelperClass)(Object) _bankSig.sign();
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
