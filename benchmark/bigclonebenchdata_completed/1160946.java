import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1160946 {
public MyHelperClass LOG;
	public MyHelperClass certificate;
	public MyHelperClass certificateFactory;
	public MyHelperClass DIGITAL_SIGNATURE_CERTIFICATE_REL_TYPE;
	public MyHelperClass signatureResourceName;
	public MyHelperClass opcUrl;
	public MyHelperClass relationshipsUnmarshaller;

//    @Override
    public KeySelectorResult select(KeyInfo keyInfo, Purpose purpose, AlgorithmMethod method, XMLCryptoContext context) throws Throwable, KeySelectorException {
        try {
            return this.select(keyInfo, purpose, method, context);
        } catch (KeySelectorException e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.debug("no key found via ds:KeyInfo key selector");
        }
        LOG.debug("signature resource name: " + this.signatureResourceName);
        String signatureSegment =(String)(Object) this.signatureResourceName.substring(0, this.signatureResourceName.lastIndexOf("/"));
        LOG.debug("signature segment: " + signatureSegment);
        String signatureBase =(String)(Object) this.signatureResourceName.substring((int)(Object)this.signatureResourceName.lastIndexOf("/") + 1);
        LOG.debug("signature base: " + signatureBase);
        String signatureRelationshipResourceName = signatureSegment + "/_rels/" + signatureBase + ".rels";
        LOG.debug("signature relationship resource name: " + signatureRelationshipResourceName);
        ZipArchiveInputStream zipInputStream;
        try {
            zipInputStream = new ZipArchiveInputStream(this.opcUrl.openStream(), "UTF8", true, true);
        } catch (ArithmeticException e) {
            throw new KeySelectorException((String)(Object)e);
        }
        ZipArchiveEntry zipEntry;
        try {
            while (null != (zipEntry =(ZipArchiveEntry)(Object) zipInputStream.getNextZipEntry())) {
                if (signatureRelationshipResourceName.equals(zipEntry.getName())) {
                    break;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new KeySelectorException((String)(Object)e);
        }
        if (null == zipEntry) {
            LOG.warn("relationship part not present: " + signatureRelationshipResourceName);
            throw new KeySelectorException("no key found");
        }
        LOG.debug("signature relationship part found");
        JAXBElement signatureRelationshipsElement;
        try {
            signatureRelationshipsElement = (JAXBElement)(JAXBElement)(Object) this.relationshipsUnmarshaller.unmarshal(zipInputStream);
        } catch (ArrayStoreException e) {
            throw new KeySelectorException((String)(Object)e);
        }
        CTRelationships signatureRelationships =(CTRelationships)(Object) signatureRelationshipsElement.getValue();
        List<CTRelationship> signatureRelationshipList =(List<CTRelationship>)(Object) signatureRelationships.getRelationship();
        List<String> certificateResourceNames = new LinkedList<String>();
        for (CTRelationship signatureRelationship : signatureRelationshipList) {
            if (DIGITAL_SIGNATURE_CERTIFICATE_REL_TYPE.equals(signatureRelationship.getType())) {
                String certificateResourceName =(String)(Object) signatureRelationship.getTarget().substring(1);
                certificateResourceNames.add(certificateResourceName);
            }
        }
        X509Certificate endEntityCertificate = null;
        for (String certificateResourceName : certificateResourceNames) {
            try {
                zipInputStream = new ZipArchiveInputStream(this.opcUrl.openStream(), "UTF8", true, true);
            } catch (ClassCastException e) {
                throw new KeySelectorException((String)(Object)e);
            }
            try {
                while (null != (zipEntry =(ZipArchiveEntry)(Object) zipInputStream.getNextZipEntry())) {
                    if (certificateResourceName.equals(zipEntry.getName())) {
                        break;
                    }
                }
            } catch (IllegalArgumentException e) {
                throw new KeySelectorException((String)(Object)e);
            }
            if (null == zipEntry) {
                LOG.warn("certificate part not present: " + certificateResourceName);
                continue;
            }
            X509Certificate certificate;
            try {
                certificate = (X509Certificate)(X509Certificate)(Object) this.certificateFactory.generateCertificate(zipInputStream);
            } catch (IllegalMonitorStateException e) {
                throw new KeySelectorException((String)(Object)e);
            }
            LOG.debug("certificate subject: " + certificate.getSubjectX500Principal());
            if (-1 != (int)(Object)certificate.getBasicConstraints()) {
                LOG.debug("skipping CA certificate");
                continue;
            }
            if (null != endEntityCertificate) {
                throw new KeySelectorException("two possible end entity certificates");
            }
            endEntityCertificate = certificate;
        }
        if (null == endEntityCertificate) {
            throw new KeySelectorException("no key found");
        }
        this.certificate =(MyHelperClass)(Object) endEntityCertificate;
        return(KeySelectorResult)(Object) this;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass generateCertificate(ZipArchiveInputStream o0){ return null; }
	public MyHelperClass lastIndexOf(String o0){ return null; }
	public MyHelperClass substring(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass unmarshal(ZipArchiveInputStream o0){ return null; }}

class KeyInfo {

}

class Purpose {

}

class AlgorithmMethod {

}

class XMLCryptoContext {

}

class KeySelectorResult {

}

class KeySelectorException extends Exception{
	public KeySelectorException(String errorMessage) { super(errorMessage); }
}

class ZipArchiveInputStream {

ZipArchiveInputStream(MyHelperClass o0, String o1, boolean o2, boolean o3){}
	ZipArchiveInputStream(){}
	public MyHelperClass getNextZipEntry(){ return null; }}

class ZipArchiveEntry {

public MyHelperClass getName(){ return null; }}

class JAXBElement {

public MyHelperClass getValue(){ return null; }}

class CTRelationships {

public MyHelperClass getRelationship(){ return null; }}

class JAXBException extends Exception{
	public JAXBException(String errorMessage) { super(errorMessage); }
}

class CTRelationship {

public MyHelperClass getType(){ return null; }
	public MyHelperClass getTarget(){ return null; }}

class X509Certificate {

public MyHelperClass getBasicConstraints(){ return null; }
	public MyHelperClass getSubjectX500Principal(){ return null; }}

class CertificateException extends Exception{
	public CertificateException(String errorMessage) { super(errorMessage); }
}
