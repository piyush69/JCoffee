import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c1258712 {

    public static Document loadXML(URL url) {
        Document doc = null;
        try {
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            DocumentBuilder docBuilder =(DocumentBuilder)(Object) DocumentBuilderFactory.newInstance().newDocumentBuilder();
            doc =(Document)(Object) docBuilder.parse(url.openStream());
        } catch (UncheckedIOException pce) {
        } catch (ArithmeticException saxe) {
        } catch (IOException ioe) {
        }
        return doc;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }
	public MyHelperClass newDocumentBuilder(){ return null; }}

class Document {

}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
