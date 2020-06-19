import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c11843018 {
public MyHelperClass id;
	public MyHelperClass SubjectPublicKeyInfo;

    public void RespID(PublicKey key) throws OCSPException {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA1");
            ASN1InputStream aIn = new ASN1InputStream(key.getEncoded());
            SubjectPublicKeyInfo info =(SubjectPublicKeyInfo)(Object) SubjectPublicKeyInfo.getInstance(aIn.readObject());
            digest.update((byte)(Object)info.getPublicKeyData().getBytes());
            ASN1OctetString keyHash =(ASN1OctetString)(Object) new DEROctetString(digest.digest());
            this.id =(MyHelperClass)(Object) new ResponderID(keyHash);
        } catch (Exception e) {
            throw new OCSPException("problem creating ID: " + e, e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class OCSPException extends Exception{
	public OCSPException(String errorMessage) { super(errorMessage); }
	OCSPException(String o0, Exception o1){}
	OCSPException(){}
}

class ASN1InputStream {

ASN1InputStream(byte[] o0){}
	ASN1InputStream(){}
	public MyHelperClass readObject(){ return null; }}

class SubjectPublicKeyInfo {

public MyHelperClass getPublicKeyData(){ return null; }}

class ASN1OctetString {

}

class DEROctetString {

DEROctetString(byte[] o0){}
	DEROctetString(){}}

class ResponderID {

ResponderID(ASN1OctetString o0){}
	ResponderID(){}}
