import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18661682 {
public static MyHelperClass URIConstants;
	public static MyHelperClass Marshaller;
	public static MyHelperClass IOUtils;
	public static MyHelperClass logger;
	public static MyHelperClass OMAbstractFactory;
	public static MyHelperClass XPathHelper;
	public static MyHelperClass AXIOMUtil;
	public static MyHelperClass JAXBContext;
	public static MyHelperClass assertNotNull(InputStream o0){ return null; }
public MyHelperClass XPathHelper;
	public MyHelperClass AXIOMUtil;
	public MyHelperClass logger;
	public MyHelperClass Marshaller;
	public MyHelperClass IOUtils;
	public MyHelperClass URIConstants;
	public MyHelperClass JAXBContext;
	public MyHelperClass OMAbstractFactory;
	public MyHelperClass assertNotNull(InputStream o0){ return null; }

    public static OMElement createOMRequest(String file, int count, String[] documentIds) throws Throwable, Exception {
        ObjectFactory factory = new ObjectFactory();
        SubmitDocumentRequest sdr = factory.createSubmitDocumentRequest();
        IdType pid = factory.createIdType();
        pid.setRoot("1.3.6.1.4.1.21367.2005.3.7.6fa11e467880478");
        sdr.setPatientId(pid);
        ClassLoader classLoader = JUnitHelper.class.getClassLoader();
        DocumentsType documents = factory.createDocumentsType();
        for (int i = 0; i < count; ++i) {
            DocumentType document = factory.createDocumentType();
            if ((documentIds != null) && (documentIds.length > i)) {
                document.setId(documentIds[i]);
            }
            CodeType type = factory.createCodeType();
            type.setCode("51855-5");
            type.setCodeSystem("2.16.840.1.113883.6.1");
            document.setType(type);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            InputStream is = classLoader.getResourceAsStream(file);
            assertNotNull(is);
            IOUtils.copy(is, bos);
            document.setContent(bos.toByteArray());
            documents.getDocument().add(document);
        }
        sdr.setDocuments(documents);
        QName qname = new QName(URIConstants.XDSBRIDGE_URI, "SubmitDocumentRequest");
        JAXBContext jc = JAXBContext.newInstance(SubmitDocumentRequest.class);
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        JAXBElement element = new JAXBElement(qname, sdr.getClass(), sdr);
        StringWriter sw = new StringWriter();
        marshaller.marshal(element, sw);
        String xml = sw.toString();
        logger.debug(xml);
        OMElement result = AXIOMUtil.stringToOM(OMAbstractFactory.getOMFactory(), xml);
        List<OMElement> list = XPathHelper.selectNodes(result, "./ns:Documents/ns:Document/ns:Content", URIConstants.XDSBRIDGE_URI);
        for (OMElement contentNode : list) {
            OMText binaryNode = (OMText) contentNode.getFirstOMChild();
            if (binaryNode != null) {
                binaryNode.setOptimize(true);
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass XDSBRIDGE_URI;
	public MyHelperClass JAXB_FORMATTED_OUTPUT;
public MyHelperClass newInstance(Class<SubmitDocumentRequest o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass getOMFactory(){ return null; }}

class OMElement {

public MyHelperClass getFirstOMChild(){ return null; }}

class ObjectFactory {

public MyHelperClass createDocumentType(){ return null; }
	public MyHelperClass createDocumentsType(){ return null; }
	public MyHelperClass createIdType(){ return null; }
	public MyHelperClass createSubmitDocumentRequest(){ return null; }
	public MyHelperClass createCodeType(){ return null; }}

class SubmitDocumentRequest {

public MyHelperClass setPatientId(IdType o0){ return null; }
	public MyHelperClass setDocuments(DocumentsType o0){ return null; }}

class IdType {

public MyHelperClass setRoot(String o0){ return null; }}

class JUnitHelper {

}

class DocumentsType {

public MyHelperClass getDocument(){ return null; }}

class DocumentType {

public MyHelperClass setId(String o0){ return null; }
	public MyHelperClass setType(CodeType o0){ return null; }
	public MyHelperClass setContent(byte[] o0){ return null; }}

class CodeType {

public MyHelperClass setCode(String o0){ return null; }
	public MyHelperClass setCodeSystem(String o0){ return null; }}

class QName {

}

class JAXBContext {

public MyHelperClass createMarshaller(){ return null; }}

class Marshaller {

public MyHelperClass marshal(JAXBElement o0, StringWriter o1){ return null; }}

class JAXBElement {

JAXBElement(QName o0, Class<CAP#1> o1, SubmitDocumentRequest o2){}
	JAXBElement(){}}

class OMText {

public MyHelperClass setOptimize(boolean o0){ return null; }}
