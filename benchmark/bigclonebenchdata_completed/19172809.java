import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c19172809 {

    public static Document parseDocument(Object toParse, boolean isFile, List<ErrorMessage> errorMessages) {
        Document document = null;
        try {
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            DocumentBuilderFactory docBuilderFactory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
            docBuilderFactory.setValidating(true);
            docBuilderFactory.setNamespaceAware(true);
            docBuilderFactory.setAttribute("http://java.sun.com/xml/jaxp/properties/schemaLanguage", "http://www.w3.org/2001/XMLSchema");
            docBuilderFactory.setAttribute("http://java.sun.com/xml/jaxp/properties/schemaSource", "BPMN20.xsd");
            DocumentBuilder docBuilder =(DocumentBuilder)(Object) docBuilderFactory.newDocumentBuilder();
            BPMNModelParsingErrors pErrors = new BPMNModelParsingErrors();
            docBuilder.setErrorHandler(pErrors);
            docBuilder.setEntityResolver(new BPMNModelEntityResolver());
            if (isFile) {
                String filepath = toParse.toString();
                File f = new File(filepath);
                if (!f.exists()) {
                    URL url =(URL)(Object) BPMNModelUtils.class.getResource(filepath);
                    if (url == null) {
                        if (filepath.startsWith("http") || filepath.startsWith("ftp")) {
                            url = new URL(filepath);
                        }
                    }
                    if (url != null) {
                        document =(Document)(Object) docBuilder.parse((InputStream)(Object)url.openStream());
                    }
                } else {
                    if (filepath.endsWith(".gz")) {
                        document =(Document)(Object) docBuilder.parse((InputStream)(Object)new GZIPInputStream(new FileInputStream(f)));
                    } else {
                        document =(Document)(Object) docBuilder.parse(new FileInputStream(f));
                    }
                }
            } else {
                if (toParse instanceof String) {
                    document =(Document)(Object) docBuilder.parse((InputStream)(Object)new InputSource(new StringReader(toParse.toString())));
                } else if (toParse instanceof InputStream) {
                    document =(Document)(Object) docBuilder.parse((InputStream) toParse);
                }
            }
            errorMessages.addAll((Collection<? extends ErrorMessage>)(Object)pErrors.getErrorMessages());
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return document;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }}

class ErrorMessage {

}

class Document {

}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }
	public MyHelperClass setNamespaceAware(boolean o0){ return null; }
	public MyHelperClass setValidating(boolean o0){ return null; }
	public MyHelperClass setAttribute(String o0, String o1){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }
	public MyHelperClass parse(FileInputStream o0){ return null; }
	public MyHelperClass setEntityResolver(BPMNModelEntityResolver o0){ return null; }
	public MyHelperClass setErrorHandler(BPMNModelParsingErrors o0){ return null; }}

class BPMNModelParsingErrors {

public MyHelperClass getErrorMessages(){ return null; }}

class BPMNModelEntityResolver {

}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}

class BPMNModelUtils {

}

class GZIPInputStream {

GZIPInputStream(FileInputStream o0){}
	GZIPInputStream(){}}

class InputSource {

InputSource(StringReader o0){}
	InputSource(){}}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
