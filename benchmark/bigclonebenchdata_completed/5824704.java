import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5824704 {

//    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, final HttpServletResponse response) throws Throwable, Exception {
        final String id =(String)(Object) request.getParameter("id");
        if (id == null) {
            MyHelperClass HttpServletResponse = new MyHelperClass();
            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
            return null;
        }
        try {
            MyHelperClass jaxrTemplate = new MyHelperClass();
            jaxrTemplate.execute(new JAXRCallback() {

                public Object execute(Connection connection) throws JAXRException {
                    RegistryObject registryObject =(RegistryObject)(Object) connection.getRegistryService().getBusinessQueryManager().getRegistryObject(id);
                    if ((ExtrinsicObject)(Object)registryObject instanceof ExtrinsicObject) {
                        ExtrinsicObject extrinsicObject = (ExtrinsicObject)(ExtrinsicObject)(Object) registryObject;
                        DataHandler dataHandler =(DataHandler)(Object) extrinsicObject.getRepositoryItem();
                        if (dataHandler != null) {
                            response.setContentType("text/html");
                            try {
                                PrintWriter out =(PrintWriter)(Object) response.getWriter();
                                InputStream is =(InputStream)(Object) dataHandler.getInputStream();
                                try {
                                    MyHelperClass XMLOutputFactory = new MyHelperClass();
                                    final XMLStreamWriter xmlStreamWriter =(XMLStreamWriter)(Object) XMLOutputFactory.newInstance().createXMLStreamWriter(out);
                                    xmlStreamWriter.writeStartDocument();
                                    xmlStreamWriter.writeStartElement("div");
                                    xmlStreamWriter.writeStartElement("textarea");
                                    xmlStreamWriter.writeAttribute("name", "repositoryItem");
                                    xmlStreamWriter.writeAttribute("class", "xml");
                                    xmlStreamWriter.writeAttribute("style", "display:none");
                                    MyHelperClass IOUtils = new MyHelperClass();
                                    IOUtils.copy(new XmlInputStreamReader(is), new XmlStreamTextWriter(xmlStreamWriter));
                                    xmlStreamWriter.writeEndElement();
                                    xmlStreamWriter.writeStartElement("script");
                                    xmlStreamWriter.writeAttribute("class", "javascript");
                                    xmlStreamWriter.writeCharacters("dp.SyntaxHighlighter.HighlightAll('repositoryItem');");
                                    xmlStreamWriter.writeEndElement();
                                    xmlStreamWriter.writeEndElement();
                                    xmlStreamWriter.writeEndDocument();
                                    xmlStreamWriter.flush();
                                } finally {
                                    is.close();
                                }
                            } catch (Throwable ex) {
                                MyHelperClass log = new MyHelperClass();
                                log.error("Error while trying to format repository item " + id, ex);
                            }
                        } else {
                        }
                    } else {
                    }
                    return null;
                }
            });
        } catch (UncheckedIOException ex) {
            throw new ServletException((String)(Object)ex);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_BAD_REQUEST;
public MyHelperClass createXMLStreamWriter(PrintWriter o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getRegistryObject(String o0){ return null; }
	public MyHelperClass execute(){ return null; }
	public MyHelperClass copy(XmlInputStreamReader o0, XmlStreamTextWriter o1){ return null; }
	public MyHelperClass getBusinessQueryManager(){ return null; }
	public MyHelperClass execute( JAXRCallback o0){ return null; }
	public MyHelperClass error(String o0, Throwable o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass sendError(MyHelperClass o0){ return null; }}

class ModelAndView {

}

class JAXRCallback {

}

class JAXRException extends Exception{
	public JAXRException(String errorMessage) { super(errorMessage); }
}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass getRegistryService(){ return null; }}

class RegistryObject {

}

class ExtrinsicObject {

public MyHelperClass getRepositoryItem(){ return null; }}

class DataHandler {

public MyHelperClass getInputStream(){ return null; }}

class XMLStreamWriter {

public MyHelperClass writeStartDocument(){ return null; }
	public MyHelperClass writeStartElement(String o0){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass writeAttribute(String o0, String o1){ return null; }
	public MyHelperClass writeEndElement(){ return null; }
	public MyHelperClass writeEndDocument(){ return null; }
	public MyHelperClass writeCharacters(String o0){ return null; }}

class XmlInputStreamReader {

XmlInputStreamReader(){}
	XmlInputStreamReader(InputStream o0){}}

class XmlStreamTextWriter {

XmlStreamTextWriter(){}
	XmlStreamTextWriter(XMLStreamWriter o0){}}
