import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8434526 {
public MyHelperClass writeDocumentNoClosing(Document o0, ZipOutputStream o1, boolean o2){ return null; }
	public MyHelperClass loadDocumentNoClose(ZipInputStream o0){ return null; }
	public MyHelperClass addOriginSigs(ZipOutputStream o0){ return null; }
	public MyHelperClass addOriginSigsRels(String o0, ZipOutputStream o1){ return null; }
public MyHelperClass LOG;
	public MyHelperClass Constants;
	public MyHelperClass XPathAPI;
	public MyHelperClass FilenameUtils;
	public MyHelperClass IOUtils;
	public MyHelperClass getOfficeOpenXMLDocumentURL(){ return null; }

    private ZipOutputStream copyOOXMLContent(String signatureZipEntryName, OutputStream signedOOXMLOutputStream) throws Throwable, IOException, ParserConfigurationException, SAXException, TransformerConfigurationException, TransformerFactoryConfigurationError,(Throwable)(Object) TransformerException {
        ZipOutputStream zipOutputStream = new ZipOutputStream(signedOOXMLOutputStream);
        ZipInputStream zipInputStream = new ZipInputStream(this.getOfficeOpenXMLDocumentURL().openStream());
        ZipEntry zipEntry;
        boolean hasOriginSigsRels = false;
        while (null != (zipEntry = zipInputStream.getNextEntry())) {
            LOG.debug("copy ZIP entry: " + zipEntry.getName());
            ZipEntry newZipEntry = new ZipEntry(zipEntry.getName());
            zipOutputStream.putNextEntry(newZipEntry);
            if ("[Content_Types].xml".equals(zipEntry.getName())) {
                Document contentTypesDocument = loadDocumentNoClose(zipInputStream);
                Element typesElement = contentTypesDocument.getDocumentElement();
                Element overrideElement = contentTypesDocument.createElementNS("http://schemas.openxmlformats.org/package/2006/content-types", "Override");
                overrideElement.setAttribute("PartName", "/" + signatureZipEntryName);
                overrideElement.setAttribute("ContentType", "application/vnd.openxmlformats-package.digital-signature-xmlsignature+xml");
                typesElement.appendChild(overrideElement);
                Element nsElement = contentTypesDocument.createElement("ns");
                nsElement.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:tns", "http://schemas.openxmlformats.org/package/2006/content-types");
                NodeList nodeList = XPathAPI.selectNodeList(contentTypesDocument, "/tns:Types/tns:Default[@Extension='sigs']", nsElement);
                if (0 == nodeList.getLength()) {
                    Element defaultElement = contentTypesDocument.createElementNS("http://schemas.openxmlformats.org/package/2006/content-types", "Default");
                    defaultElement.setAttribute("Extension", "sigs");
                    defaultElement.setAttribute("ContentType", "application/vnd.openxmlformats-package.digital-signature-origin");
                    typesElement.appendChild(defaultElement);
                }
                writeDocumentNoClosing(contentTypesDocument, zipOutputStream, false);
            } else if ("_rels/.rels".equals(zipEntry.getName())) {
                Document relsDocument = loadDocumentNoClose(zipInputStream);
                Element nsElement = relsDocument.createElement("ns");
                nsElement.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:tns", "http://schemas.openxmlformats.org/package/2006/relationships");
                NodeList nodeList = XPathAPI.selectNodeList(relsDocument, "/tns:Relationships/tns:Relationship[@Target='_xmlsignatures/origin.sigs']", nsElement);
                if (0 == nodeList.getLength()) {
                    Element relationshipElement = relsDocument.createElementNS("http://schemas.openxmlformats.org/package/2006/relationships", "Relationship");
                    relationshipElement.setAttribute("Id", "rel-id-" + UUID.randomUUID().toString());
                    relationshipElement.setAttribute("Type", "http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/origin");
                    relationshipElement.setAttribute("Target", "_xmlsignatures/origin.sigs");
                    relsDocument.getDocumentElement().appendChild(relationshipElement);
                }
                writeDocumentNoClosing(relsDocument, zipOutputStream, false);
            } else if ("_xmlsignatures/_rels/origin.sigs.rels".equals(zipEntry.getName())) {
                hasOriginSigsRels = true;
                Document originSignRelsDocument = loadDocumentNoClose(zipInputStream);
                Element relationshipElement = originSignRelsDocument.createElementNS("http://schemas.openxmlformats.org/package/2006/relationships", "Relationship");
                String relationshipId = "rel-" + UUID.randomUUID().toString();
                relationshipElement.setAttribute("Id", relationshipId);
                relationshipElement.setAttribute("Type", "http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/signature");
                String target = FilenameUtils.getName(signatureZipEntryName);
                LOG.debug("target: " + target);
                relationshipElement.setAttribute("Target", target);
                originSignRelsDocument.getDocumentElement().appendChild(relationshipElement);
                writeDocumentNoClosing(originSignRelsDocument, zipOutputStream, false);
            } else {
                IOUtils.copy(zipInputStream, zipOutputStream);
            }
        }
        if (false == hasOriginSigsRels) {
            addOriginSigsRels(signatureZipEntryName, zipOutputStream);
             void addOriginSigs(zipOutputStream);
        }
        zipInputStream.close();
        return zipOutputStream;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NamespaceSpecNS;
public MyHelperClass getName(String o0){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass copy(ZipInputStream o0, ZipOutputStream o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass selectNodeList(Document o0, String o1, Element o2){ return null; }}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(OutputStream o0){}
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class TransformerConfigurationException extends Exception{
	public TransformerConfigurationException(String errorMessage) { super(errorMessage); }
}

class TransformerFactoryConfigurationError {

}

class TransformerException extends Exception{
	public TransformerException(String errorMessage) { super(errorMessage); }
}

class ZipInputStream {

public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }}

class Document {

public MyHelperClass createElement(String o0){ return null; }
	public MyHelperClass createElementNS(String o0, String o1){ return null; }
	public MyHelperClass getDocumentElement(){ return null; }}

class Element {

public MyHelperClass appendChild(Element o0){ return null; }
	public MyHelperClass setAttribute(String o0, String o1){ return null; }}

class NodeList {

public MyHelperClass getLength(){ return null; }}
