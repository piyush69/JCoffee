import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9152056 {
public MyHelperClass addSignatureFacet(XAdESSignatureFacet o0){ return null; }
	public MyHelperClass addSignatureFacet(IdentitySignatureFacet o0){ return null; }
public MyHelperClass tmpFile;
	public MyHelperClass documentOutputStream;
	public MyHelperClass temporaryDataStorage;
	public MyHelperClass IOUtils;
	public MyHelperClass getSignatureDigestAlgorithm(){ return null; }

    public  c9152056(InputStream documentInputStream, DigestAlgo digestAlgo, RevocationDataService revocationDataService, TimeStampService timeStampService, String claimedRole, IdentityDTO identity, byte[] photo, TemporaryDataStorage temporaryDataStorage, OutputStream documentOutputStream) throws Throwable, IOException {
        super(digestAlgo);
        this.temporaryDataStorage =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) temporaryDataStorage;
        this.documentOutputStream =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) documentOutputStream;
        this.tmpFile =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) File.createTempFile("eid-dss-", ".asice");
        FileOutputStream fileOutputStream;
        fileOutputStream = new FileOutputStream((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)this.tmpFile);
        IOUtils.copy(documentInputStream, fileOutputStream);
        addSignatureFacet((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(XAdESSignatureFacet)(Object)new ASiCSignatureFacet(this.tmpFile, digestAlgo));
        XAdESSignatureFacet xadesSignatureFacet = new XAdESSignatureFacet(getSignatureDigestAlgorithm());
        xadesSignatureFacet.setRole(claimedRole);
        xadesSignatureFacet.setXadesNamespacePrefix("xades");
        addSignatureFacet(xadesSignatureFacet);
        addSignatureFacet((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(XAdESSignatureFacet)(Object)new XAdESXLSignatureFacet(timeStampService, revocationDataService, getSignatureDigestAlgorithm()));
        addSignatureFacet((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(XAdESSignatureFacet)(Object)new KeyInfoSignatureFacet(true, false, false));
        if (null != identity) {
            IdentitySignatureFacet identitySignatureFacet = new IdentitySignatureFacet(identity, photo, getSignatureDigestAlgorithm());
            addSignatureFacet(identitySignatureFacet);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class DigestAlgo {

}

class RevocationDataService {

}

class TimeStampService {

}

class IdentityDTO {

}

class TemporaryDataStorage {

}

class ASiCSignatureFacet {

ASiCSignatureFacet(MyHelperClass o0, DigestAlgo o1){}
	ASiCSignatureFacet(){}}

class XAdESSignatureFacet {

XAdESSignatureFacet(MyHelperClass o0){}
	XAdESSignatureFacet(){}
	public MyHelperClass setXadesNamespacePrefix(String o0){ return null; }
	public MyHelperClass setRole(String o0){ return null; }}

class XAdESXLSignatureFacet {

XAdESXLSignatureFacet(TimeStampService o0, RevocationDataService o1, MyHelperClass o2){}
	XAdESXLSignatureFacet(){}}

class KeyInfoSignatureFacet {

KeyInfoSignatureFacet(boolean o0, boolean o1, boolean o2){}
	KeyInfoSignatureFacet(){}}

class IdentitySignatureFacet {

IdentitySignatureFacet(IdentityDTO o0, byte[] o1, MyHelperClass o2){}
	IdentitySignatureFacet(){}}

class Object {

Object(DigestAlgo o0){}
	Object(){}}
