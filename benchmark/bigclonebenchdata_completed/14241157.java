import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14241157 {
public MyHelperClass SetRepositoryMessage(MyHelperClass o0, Object o1, String o2, String o3, Object o4){ return null; }
public MyHelperClass TEXT_HTML;
	public MyHelperClass TEXT_XML;
public MyHelperClass log;
	public MyHelperClass strJobId;
	public MyHelperClass Status;
	public MyHelperClass MediaType;
	public MyHelperClass getApplication(){ return null; }

//    @Override
    public Representation getRepresentation(Variant variant)  throws Throwable {
        Representation representation = null;
        MediaType requestMediaType =(MediaType)(Object) variant.getMediaType();
        if (TEXT_XML.equals(requestMediaType)) {
            try {
                MyHelperClass MediaType = new MyHelperClass();
                representation =(Representation)(Object) new DomRepresentation(MediaType.TEXT_XML);
            } catch (UncheckedIOException e) {
                e.printStackTrace();
                return null;
            }
        }
        String strJobsUrl =(String)(Object) ((ResourceApplication)(ResourceApplication)(Object) getApplication()).getJobsUrl();
        Document reportDoc = null;
        try {
            SAXReader reader = new SAXReader();
            reportDoc =(Document)(Object) reader.read(strJobsUrl + "/" + strJobId + "/report.xml");
        } catch (UncheckedIOException e) {
            String strErrMsg = "Unable to find job, " + strJobId + ": " + e.getMessage();
            log.debug(strErrMsg);
            Representation rep =(Representation)(Object) SetRepositoryMessage(Status.CLIENT_ERROR_NOT_FOUND, null, "JobNotFound", strErrMsg, null);
            return rep;
        }
        if (TEXT_XML.equals(requestMediaType)) {
            log.debug("XML Media Type requested");
            try {
                reportDoc.removeProcessingInstruction("xml-stylesheet");
                DOMWriter writer = new DOMWriter();
                Document doc =(Document)(Object) writer.write(reportDoc);
                doc.normalizeDocument();
                ((DomRepresentation)(DomRepresentation)(Object) representation).setDocument(doc);
                return representation;
            } catch (UncheckedIOException e) {
                String strErrMsg = "Error display job's report: " + e.getMessage();
                log.debug(strErrMsg);
                Representation rep =(Representation)(Object) SetRepositoryMessage(Status.CLIENT_ERROR_CONFLICT, null, "ClientConflict", strErrMsg, null);
                return rep;
            }
        } else if (TEXT_HTML.equals(requestMediaType)) {
            log.debug("HTML Media Type requested");
            try {
                ProcessingInstruction pi =(ProcessingInstruction)(Object) reportDoc.processingInstruction("xml-stylesheet");
                if (pi != null) {
                    String strXslHref =(String)(Object) pi.getValue("href");
                    URL url = new URL(strXslHref);
                    XSLTransformer reportDocTransformer = new XSLTransformer();
                    log.debug("constructed the reportDocTransformer");
                    reportDoc =(Document)(Object) reportDocTransformer.transform(reportDoc, url.openStream());
                }
            } catch (MalformedURLException e) {
                String strErrMsg = "Error accessing referenced XSL-STYLESHEET: " + e.getMessage();
                log.debug(strErrMsg);
                Representation rep =(Representation)(Object) SetRepositoryMessage(Status.SERVER_ERROR_INTERNAL, null, "InternalError", strErrMsg, null);
                return rep;
            } catch (IOException e) {
                String strErrMsg = "Error accessing referenced XSL-STYLESHEET: " + e.getMessage();
                log.debug(strErrMsg);
                Representation rep =(Representation)(Object) SetRepositoryMessage(Status.SERVER_ERROR_INTERNAL, null, "InternalError", strErrMsg, null);
                return rep;
            } catch (UncheckedIOException e) {
                String strErrMsg = "Error accessing referenced XSL-STYLESHEET: " + e.getMessage();
                log.debug(strErrMsg);
                Representation rep =(Representation)(Object) SetRepositoryMessage(Status.SERVER_ERROR_INTERNAL, null, "InternalError", strErrMsg, null);
                return rep;
            }
            representation =(Representation)(Object) new StringRepresentation(reportDoc.asXML(), MediaType.TEXT_HTML);
            return representation;
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SERVER_ERROR_INTERNAL;
	public MyHelperClass TEXT_HTML;
	public MyHelperClass CLIENT_ERROR_NOT_FOUND;
	public MyHelperClass CLIENT_ERROR_CONFLICT;
	public MyHelperClass TEXT_XML;
public MyHelperClass debug(String o0){ return null; }}

class Variant {

public MyHelperClass getMediaType(){ return null; }}

class Representation {

}

class MediaType {

}

class DomRepresentation {

DomRepresentation(){}
	DomRepresentation(MyHelperClass o0){}
	public MyHelperClass setDocument(Document o0){ return null; }}

class ResourceApplication {

public MyHelperClass getJobsUrl(){ return null; }}

class SAXReader {

public MyHelperClass read(String o0){ return null; }}

class DocumentException extends Exception{
	public DocumentException(String errorMessage) { super(errorMessage); }
}

class DOMWriter {

public MyHelperClass write(Document o0){ return null; }}

class Document {

public MyHelperClass asXML(){ return null; }
	public MyHelperClass normalizeDocument(){ return null; }
	public MyHelperClass removeProcessingInstruction(String o0){ return null; }
	public MyHelperClass processingInstruction(String o0){ return null; }}

class ProcessingInstruction {

public MyHelperClass getValue(String o0){ return null; }}

class XSLTransformer {

public MyHelperClass transform(Document o0, InputStream o1){ return null; }}

class FedoraAPIException extends Exception{
	public FedoraAPIException(String errorMessage) { super(errorMessage); }
}

class StringRepresentation {

StringRepresentation(){}
	StringRepresentation(MyHelperClass o0, MyHelperClass o1){}}
