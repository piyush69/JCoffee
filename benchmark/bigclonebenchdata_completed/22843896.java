import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c22843896 {
public MyHelperClass WEBSITE_HOST;

    private NodeList getNodeListForDataFile(String fileName, String dataType) {
        NodeList list = null;
        try {
            MyHelperClass WEBSITE_PROTOCAL = new MyHelperClass();
            URL url = new URL((String)(Object)WEBSITE_PROTOCAL,(String)(Object) WEBSITE_HOST, "/" + fileName + ".xml");
            InputStream is = url.openStream();
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            DocumentBuilderFactory dbf =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =(DocumentBuilder)(Object) dbf.newDocumentBuilder();
            Document document =(Document)(Object) builder.parse(is);
            list =(NodeList)(Object) document.getElementsByTagName(dataType);
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Error reading " + dataType + " data",(ParserConfigurationException)(Object) e);
        } catch (IOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Error reading " + dataType + " data", e);
        } catch (ArithmeticException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Error reading " + dataType + " data",(ParserConfigurationException)(Object) e);
        }
        return list;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, ParserConfigurationException o1){ return null; }
	public MyHelperClass error(String o0, SAXException o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass newInstance(){ return null; }}

class NodeList {

}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class Document {

public MyHelperClass getElementsByTagName(String o0){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}
