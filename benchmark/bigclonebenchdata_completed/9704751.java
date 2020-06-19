import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9704751 {
public MyHelperClass addSignatureFacet(SignatureFacet o0){ return null; }
	public MyHelperClass getXAdESSignatureFacet(){ return null; }
	public MyHelperClass addSignatureFacet(IdentitySignatureFacet o0){ return null; }
public MyHelperClass tmpFile;
	public MyHelperClass documentOutputStream;
	public MyHelperClass temporaryDataStorage;
	public MyHelperClass IOUtils;
	public MyHelperClass getSignatureDigestAlgorithm(){ return null; }

    public  c9704751(InputStream documentInputStream, OutputStream documentOutputStream, SignatureFacet signatureFacet, String role, IdentityDTO identity, byte[] photo, RevocationDataService revocationDataService, TimeStampService timeStampService, DigestAlgo signatureDigestAlgo) throws Throwable, IOException {
        super(signatureDigestAlgo);
        this.temporaryDataStorage =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new HttpSessionTemporaryDataStorage();
        this.documentOutputStream =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) documentOutputStream;
        this.tmpFile =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) File.createTempFile("eid-dss-", ".ooxml");
        FileOutputStream fileOutputStream;
        fileOutputStream = new FileOutputStream((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)this.tmpFile);
        IOUtils.copy(documentInputStream, fileOutputStream);
        addSignatureFacet(signatureFacet);
        addSignatureFacet((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(SignatureFacet)(Object)new XAdESXLSignatureFacet(timeStampService, revocationDataService, getSignatureDigestAlgorithm()));
        XAdESSignatureFacet xadesSignatureFacet =(XAdESSignatureFacet)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) this.getXAdESSignatureFacet();
        xadesSignatureFacet.setRole(role);
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

class IdentityDTO {

}

class RevocationDataService {

}

class TimeStampService {

}

class DigestAlgo {

}

class XAdESXLSignatureFacet {

XAdESXLSignatureFacet(TimeStampService o0, RevocationDataService o1, MyHelperClass o2){}
	XAdESXLSignatureFacet(){}}

class XAdESSignatureFacet {

public MyHelperClass setRole(String o0){ return null; }}

class IdentitySignatureFacet {

IdentitySignatureFacet(IdentityDTO o0, byte[] o1, MyHelperClass o2){}
	IdentitySignatureFacet(){}}

class Object {

Object(DigestAlgo o0){}
	Object(){}}

class HttpSessionTemporaryDataStorage {

}
