import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5678658 {
public MyHelperClass DIGITAL_SIGNATURE_ORIGIN_REL_TYPE;
	public MyHelperClass DIGITAL_SIGNATURE_REL_TYPE;
public MyHelperClass LOG;
	public MyHelperClass relationshipsUnmarshaller;

    private List<String> getSignatureResourceNames(URL url) throws Throwable, IOException, ParserConfigurationException, SAXException, TransformerException, JAXBException {
        List<String> signatureResourceNames = new LinkedList<String>();
        ZipArchiveInputStream zipInputStream = new ZipArchiveInputStream(url.openStream(), "UTF8", true, true);
        ZipArchiveEntry zipEntry;
        while (null != (zipEntry =(ZipArchiveEntry)(Object) zipInputStream.getNextZipEntry())) {
            if ("_rels/.rels".equals(zipEntry.getName())) {
                break;
            }
        }
        if (null == zipEntry) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.debug("no _rels/.rels relationship part present");
            return signatureResourceNames;
        }
        String dsOriginPart = null;
        JAXBElement packageRelationshipsElement = (JAXBElement)(JAXBElement)(Object) this.relationshipsUnmarshaller.unmarshal(zipInputStream);
        CTRelationships packageRelationships =(CTRelationships)(Object) packageRelationshipsElement.getValue();
        List<CTRelationship> packageRelationshipList =(List<CTRelationship>)(Object) packageRelationships.getRelationship();
        for (CTRelationship packageRelationship : packageRelationshipList) {
            if (DIGITAL_SIGNATURE_ORIGIN_REL_TYPE.equals(packageRelationship.getType())) {
                dsOriginPart =(String)(Object) packageRelationship.getTarget();
                break;
            }
        }
        if (null == dsOriginPart) {
            LOG.debug("no Digital Signature Origin part present");
            return signatureResourceNames;
        }
        LOG.debug("Digital Signature Origin part: " + dsOriginPart);
        String dsOriginName = dsOriginPart.substring(dsOriginPart.lastIndexOf("/") + 1);
        LOG.debug("Digital Signature Origin base: " + dsOriginName);
        String dsOriginSegment = dsOriginPart.substring(0, dsOriginPart.lastIndexOf("/")) + "/";
        LOG.debug("Digital Signature Origin segment: " + dsOriginSegment);
        String dsOriginRels = dsOriginSegment + "_rels/" + dsOriginName + ".rels";
        LOG.debug("Digital Signature Origin relationship part: " + dsOriginRels);
        if (dsOriginRels.startsWith("/")) {
            dsOriginRels = dsOriginRels.substring(1);
        }
        zipInputStream = new ZipArchiveInputStream(url.openStream(), "UTF8", true, true);
        while (null != (zipEntry =(ZipArchiveEntry)(Object) zipInputStream.getNextZipEntry())) {
            if (dsOriginRels.equals(zipEntry.getName())) {
                break;
            }
        }
        if (null == zipEntry) {
            LOG.debug("no Digital Signature Origin relationship part present");
            return signatureResourceNames;
        }
        JAXBElement dsoRelationshipsElement = (JAXBElement)(JAXBElement)(Object) this.relationshipsUnmarshaller.unmarshal(zipInputStream);
        CTRelationships dsoRelationships =(CTRelationships)(Object) dsoRelationshipsElement.getValue();
        List<CTRelationship> dsoRelationshipList =(List<CTRelationship>)(Object) dsoRelationships.getRelationship();
        for (CTRelationship dsoRelationship : dsoRelationshipList) {
            if (DIGITAL_SIGNATURE_REL_TYPE.equals(dsoRelationship.getType())) {
                String signatureResourceName;
                if ((boolean)(Object)dsoRelationship.getTarget().startsWith("/")) {
                    signatureResourceName =(String)(Object) dsoRelationship.getTarget();
                } else {
                    signatureResourceName = dsOriginSegment + dsoRelationship.getTarget();
                }
                if (signatureResourceName.startsWith("/")) {
                    signatureResourceName = signatureResourceName.substring(1);
                }
                LOG.debug("signature resource name: " + signatureResourceName);
                signatureResourceNames.add(signatureResourceName);
            }
        }
        return signatureResourceNames;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }
	public MyHelperClass unmarshal(ZipArchiveInputStream o0){ return null; }}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class TransformerException extends Exception{
	public TransformerException(String errorMessage) { super(errorMessage); }
}

class JAXBException extends Exception{
	public JAXBException(String errorMessage) { super(errorMessage); }
}

class ZipArchiveInputStream {

ZipArchiveInputStream(InputStream o0, String o1, boolean o2, boolean o3){}
	ZipArchiveInputStream(){}
	public MyHelperClass getNextZipEntry(){ return null; }}

class ZipArchiveEntry {

public MyHelperClass getName(){ return null; }}

class JAXBElement {

public MyHelperClass getValue(){ return null; }}

class CTRelationships {

public MyHelperClass getRelationship(){ return null; }}

class CTRelationship {

public MyHelperClass getTarget(){ return null; }
	public MyHelperClass getType(){ return null; }}
