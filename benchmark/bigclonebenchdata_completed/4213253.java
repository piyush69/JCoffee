import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c4213253 {
public MyHelperClass debug;
	public MyHelperClass println(String o0){ return null; }

    public VersionInfo getVersionInfo(String url) {
        try {
            XmlContentHandler handler = new XmlContentHandler();
            MyHelperClass XMLReaderFactory = new MyHelperClass();
            XMLReader myReader =(XMLReader)(Object) XMLReaderFactory.createXMLReader();
            myReader.setContentHandler(handler);
            myReader.parse(new InputSource(new URL(url).openStream()));
            return(VersionInfo)(Object) handler.getVersionInfo();
        } catch (UncheckedIOException e) {
            MyHelperClass debug = new MyHelperClass();
            if ((boolean)(Object)debug) {
                println("SAXException was thrown!");
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            if ((boolean)(Object)debug) {
                println("MalformedURLException was thrown!");
                e.printStackTrace();
            }
        } catch (IOException e) {
            if ((boolean)(Object)debug) {
                println("IOException was thrown!");
                e.printStackTrace();
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createXMLReader(){ return null; }}

class VersionInfo {

}

class XmlContentHandler {

public MyHelperClass getVersionInfo(){ return null; }}

class XMLReader {

public MyHelperClass parse(InputSource o0){ return null; }
	public MyHelperClass setContentHandler(XmlContentHandler o0){ return null; }}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
