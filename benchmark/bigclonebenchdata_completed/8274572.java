import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8274572 {
public MyHelperClass addSignatureFacet(SignatureFacet o0){ return null; }
	public MyHelperClass getXAdESSignatureFacet(){ return null; }
	public MyHelperClass addSignatureFacet(IdentitySignatureFacet o0){ return null; }
public MyHelperClass tmpFile;
	public MyHelperClass documentOutputStream;
	public MyHelperClass temporaryDataStorage;
	public MyHelperClass IOUtils;
	public MyHelperClass getSignatureDigestAlgorithm(){ return null; }

    public  c8274572(TimeStampServiceValidator timeStampServiceValidator, RevocationDataService revocationDataService, SignatureFacet signatureFacet, InputStream documentInputStream, OutputStream documentOutputStream, TimeStampService timeStampService, String role, IdentityDTO identity, byte[] photo, DigestAlgo digestAlgo) throws Throwable, Exception {
        super(digestAlgo);
        this.temporaryDataStorage =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new HttpSessionTemporaryDataStorage();
        this.documentOutputStream =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) documentOutputStream;
        this.tmpFile =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) File.createTempFile("eid-dss-", ".odf");
        FileOutputStream fileOutputStream;
        fileOutputStream = new FileOutputStream((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)this.tmpFile);
        IOUtils.copy(documentInputStream, fileOutputStream);
        addSignatureFacet((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(SignatureFacet)(Object)new XAdESXLSignatureFacet(timeStampService, revocationDataService, getSignatureDigestAlgorithm()));
        addSignatureFacet(signatureFacet);
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

class TimeStampServiceValidator {

}

class RevocationDataService {

}

class SignatureFacet {

}

class TimeStampService {

}

class IdentityDTO {

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
