import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c13198370 {
public MyHelperClass SAXParserFactory;
	public MyHelperClass getShortName(){ return null; }

    public void XMLResourceBundle() throws MissingResourceException {
        String systemId = getShortName() + ".xml";
        URL url;
        if ((url = getClass().getResource(systemId)) != null) {
            InputStream is = null;
            try {
                is = url.openStream();
                SAXParserFactory factory =(SAXParserFactory)(Object) SAXParserFactory.newInstance();
                factory.setNamespaceAware(false);
                factory.setValidating(false);
                XMLReader xmlReader =(XMLReader)(Object) factory.newSAXParser().getXMLReader();
                xmlReader.setContentHandler(new MessageContentHandler());
                xmlReader.parse(new InputSource(is));
            } catch (IOException ioe) {
                System.err.println(ioe.getMessage());
                ioe.printStackTrace();
            } catch (UncheckedIOException se) {
                System.err.println(se.getMessage());
                se.printStackTrace();
            } catch (ArithmeticException pce) {
                System.err.println(pce.getMessage());
                pce.printStackTrace();
            } finally {
                try {
                    if (is != null) is.close();
                } catch (IOException ioe) {
                    System.err.println(ioe.getMessage());
                    ioe.printStackTrace();
                }
            }
        } else {
            throw new MissingResourceException("Resource file '" + systemId + "' could not be found.", systemId, null);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getXMLReader(){ return null; }
	public MyHelperClass newInstance(){ return null; }}

class SAXParserFactory {

public MyHelperClass setNamespaceAware(boolean o0){ return null; }
	public MyHelperClass newSAXParser(){ return null; }
	public MyHelperClass setValidating(boolean o0){ return null; }}

class XMLReader {

public MyHelperClass setContentHandler(MessageContentHandler o0){ return null; }
	public MyHelperClass parse(InputSource o0){ return null; }}

class MessageContentHandler {

}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}
