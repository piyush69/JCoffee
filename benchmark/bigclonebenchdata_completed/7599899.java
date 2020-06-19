import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7599899 {
public static MyHelperClass createSaxParser(){ return null; }
//public MyHelperClass createSaxParser(){ return null; }

    public static void parse(URL url, ContentHandler handler)  throws Throwable {
        InputStream input = null;
        try {
            input = url.openStream();
            SAXParser parser =(SAXParser)(Object) createSaxParser();
            XMLReader reader =(XMLReader)(Object) parser.getXMLReader();
            reader.setContentHandler(handler);
            reader.parse(new InputSource(input));
        } catch (UncheckedIOException e) {
            throw new XmlException("Could not parse xml",(SAXException)(Object) e);
        } catch (IOException e) {
            throw new XmlException("Could not parse xml", e);
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class SAXParser {

public MyHelperClass getXMLReader(){ return null; }}

class XMLReader {

public MyHelperClass setContentHandler(ContentHandler o0){ return null; }
	public MyHelperClass parse(InputSource o0){ return null; }}

class InputSource {

InputSource(){}
	InputSource(InputStream o0){}}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class XmlException extends Exception{
	public XmlException(String errorMessage) { super(errorMessage); }
	XmlException(){}
	XmlException(String o0, SAXException o1){}
	XmlException(String o0, IOException o1){}
}
