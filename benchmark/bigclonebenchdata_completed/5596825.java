import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5596825 {
public MyHelperClass addSignatureFacet(XAdESSignatureFacet o0){ return null; }
	public MyHelperClass addSignatureFacet(SignatureFacet o0){ return null; }
	public MyHelperClass addSignatureFacet(IdentitySignatureFacet o0){ return null; }
public MyHelperClass tmpFile;
	public MyHelperClass documentOutputStream;
	public MyHelperClass temporaryDataStorage;
	public MyHelperClass IOUtils;
	public MyHelperClass getSignatureDigestAlgorithm(){ return null; }

    public  c5596825(InputStream documentInputStream, SignatureFacet signatureFacet, OutputStream documentOutputStream, RevocationDataService revocationDataService, TimeStampService timeStampService, String role, IdentityDTO identity, byte[] photo, DigestAlgo signatureDigestAlgo) throws Throwable, IOException {
        super(signatureDigestAlgo);
        this.temporaryDataStorage =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new HttpSessionTemporaryDataStorage();
        this.documentOutputStream =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) documentOutputStream;
        this.tmpFile =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) File.createTempFile("eid-dss-", ".zip");
        FileOutputStream fileOutputStream;
        fileOutputStream = new FileOutputStream((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)this.tmpFile);
        IOUtils.copy(documentInputStream, fileOutputStream);
        addSignatureFacet((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(XAdESSignatureFacet)(Object)new ZIPSignatureFacet(this.tmpFile, signatureDigestAlgo));
        XAdESSignatureFacet xadesSignatureFacet = new XAdESSignatureFacet(getSignatureDigestAlgorithm());
        xadesSignatureFacet.setRole(role);
        addSignatureFacet(xadesSignatureFacet);
        addSignatureFacet((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(XAdESSignatureFacet)(Object)new KeyInfoSignatureFacet(true, false, false));
        addSignatureFacet((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(XAdESSignatureFacet)(Object)new XAdESXLSignatureFacet(timeStampService, revocationDataService, getSignatureDigestAlgorithm()));
        addSignatureFacet(signatureFacet);
        if (null != identity) {
            IdentitySignatureFacet identitySignatureFacet = new IdentitySignatureFacet(identity, photo, getSignatureDigestAlgorithm());
            addSignatureFacet(identitySignatureFacet);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class SignatureFacet {

}

class RevocationDataService {

}

class TimeStampService {

}

class IdentityDTO {

}

class DigestAlgo {

}

class ZIPSignatureFacet {

ZIPSignatureFacet(MyHelperClass o0, DigestAlgo o1){}
	ZIPSignatureFacet(){}}

class XAdESSignatureFacet {

XAdESSignatureFacet(MyHelperClass o0){}
	XAdESSignatureFacet(){}
	public MyHelperClass setRole(String o0){ return null; }}

class KeyInfoSignatureFacet {

KeyInfoSignatureFacet(boolean o0, boolean o1, boolean o2){}
	KeyInfoSignatureFacet(){}}

class XAdESXLSignatureFacet {

XAdESXLSignatureFacet(TimeStampService o0, RevocationDataService o1, MyHelperClass o2){}
	XAdESXLSignatureFacet(){}}

class IdentitySignatureFacet {

IdentitySignatureFacet(IdentityDTO o0, byte[] o1, MyHelperClass o2){}
	IdentitySignatureFacet(){}}

class Object {

Object(DigestAlgo o0){}
	Object(){}}

class HttpSessionTemporaryDataStorage {

}
