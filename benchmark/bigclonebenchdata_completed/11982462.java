import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c11982462 {
public MyHelperClass getTypes(){ return null; }

    private Document getXMLDoc(Region region) {
        Document doc;
        try {
            InputStream stream;
            MyHelperClass HOURS = new MyHelperClass();
            URL url = new URL("http://eve-central.com/api/marketstat?hours=" + HOURS + "&" + getTypes() + "&regionlimit=" + region.getTypeID());
            System.out.println(url.toString());
            stream = url.openStream();
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            DocumentBuilderFactory factory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
            DocumentBuilder parser =(DocumentBuilder)(Object) factory.newDocumentBuilder();
            doc =(Document)(Object) parser.parse(stream);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            doc =(Document)(Object) new DefaultDocument();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            doc =(Document)(Object) new DefaultDocument();
        } catch (IOException e) {
            e.printStackTrace();
            doc =(Document)(Object) new DefaultDocument();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            doc =(Document)(Object) new DefaultDocument();
        }
        return doc;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }}

class Region {

public MyHelperClass getTypeID(){ return null; }}

class Document {

}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class DefaultDocument {

}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}
