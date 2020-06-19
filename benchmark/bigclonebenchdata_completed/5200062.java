import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5200062 {
public MyHelperClass NULL;

    public Map load() throws Throwable, IOException {
        HashMap rpdMap =(HashMap)(Object) NULL; //new HashMap();
        rpdMap = new HashMap();
        try {
            MyHelperClass SAXParserFactory = new MyHelperClass();
            SAXParserFactory factory =(SAXParserFactory)(Object) SAXParserFactory.newInstance();
            XMLReader xr =(XMLReader)(Object) factory.newSAXParser().getXMLReader();
            ConfigHandler handler = new ConfigHandler();
            xr.setContentHandler(handler);
            xr.setErrorHandler(handler);
            MyHelperClass url = new MyHelperClass();
            InputStream is =(InputStream)(Object) url.openStream();
            xr.parse(new InputSource(is));
            is.close();
        } catch (SAXParseException e) {
            MyHelperClass url = new MyHelperClass();
            String msg = "Error while parsing line " + e.getLineNumber() + " of " + url + ": " + e.getMessage();
            throw new IOException(msg);
        } catch (SAXException e) {
            throw new IOException("Problem with XML: " + e);
        } catch (ParserConfigurationException e) {
            throw new IOException(e.getMessage());
        }
//        MyHelperClass rpdMap = new MyHelperClass();
        return(Map)(Object) rpdMap;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getXMLReader(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class SAXParserFactory {

public MyHelperClass newSAXParser(){ return null; }}

class XMLReader {

public MyHelperClass setContentHandler(ConfigHandler o0){ return null; }
	public MyHelperClass parse(InputSource o0){ return null; }
	public MyHelperClass setErrorHandler(ConfigHandler o0){ return null; }}

class ConfigHandler {

}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}}

class SAXParseException extends Exception{
	public SAXParseException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}
