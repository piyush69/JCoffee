import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c4032668 {
public MyHelperClass id;
	public MyHelperClass SubjectPublicKeyInfo;
	public MyHelperClass PrincipalUtil;

    public void CertificateID(String hashAlgorithm, X509Certificate issuerCert, BigInteger number, String provider) throws OCSPException {
        try {
            MessageDigest digest = MessageDigest.getInstance(hashAlgorithm, provider);
            AlgorithmIdentifier hashAlg = new AlgorithmIdentifier(new DERObjectIdentifier(hashAlgorithm), new DERNull());
            X509Principal issuerName =(X509Principal)(Object) PrincipalUtil.getSubjectX509Principal(issuerCert);
            digest.update((byte)(Object)issuerName.getEncoded());
            ASN1OctetString issuerNameHash =(ASN1OctetString)(Object) new DEROctetString(digest.digest());
            PublicKey issuerKey =(PublicKey)(Object) issuerCert.getPublicKey();
            ASN1InputStream aIn = new ASN1InputStream(issuerKey.getEncoded());
            SubjectPublicKeyInfo info =(SubjectPublicKeyInfo)(Object) SubjectPublicKeyInfo.getInstance(aIn.readObject());
            digest.update((byte)(Object)info.getPublicKeyData().getBytes());
            ASN1OctetString issuerKeyHash =(ASN1OctetString)(Object) new DEROctetString(digest.digest());
            DERInteger serialNumber = new DERInteger(number);
            this.id =(MyHelperClass)(Object) new CertID(hashAlg, issuerNameHash, issuerKeyHash, serialNumber);
        } catch (Exception e) {
            throw new OCSPException("problem creating ID: " + e, e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getSubjectX509Principal(X509Certificate o0){ return null; }
	public MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class X509Certificate {

public MyHelperClass getPublicKey(){ return null; }}

class BigInteger {

}

class OCSPException extends Exception{
	public OCSPException(String errorMessage) { super(errorMessage); }
	OCSPException(String o0, Exception o1){}
	OCSPException(){}
}

class AlgorithmIdentifier {

AlgorithmIdentifier(DERObjectIdentifier o0, DERNull o1){}
	AlgorithmIdentifier(){}}

class DERObjectIdentifier {

DERObjectIdentifier(String o0){}
	DERObjectIdentifier(){}}

class DERNull {

}

class X509Principal {

public MyHelperClass getEncoded(){ return null; }}

class ASN1OctetString {

}

class DEROctetString {

DEROctetString(byte[] o0){}
	DEROctetString(){}}

class ASN1InputStream {

ASN1InputStream(byte[] o0){}
	ASN1InputStream(){}
	public MyHelperClass readObject(){ return null; }}

class SubjectPublicKeyInfo {

public MyHelperClass getPublicKeyData(){ return null; }}

class DERInteger {

DERInteger(BigInteger o0){}
	DERInteger(){}}

class CertID {

CertID(AlgorithmIdentifier o0, ASN1OctetString o1, ASN1OctetString o2, DERInteger o3){}
	CertID(){}}
