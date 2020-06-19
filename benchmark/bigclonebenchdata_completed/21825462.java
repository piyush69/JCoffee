import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21825462 {
public static MyHelperClass write(Document o0, PrintWriter o1){ return null; }
public static MyHelperClass XPathConstants;
	public static MyHelperClass readFromStream(InputStream o0){ return null; }
	public MyHelperClass write(Document o0, PrintWriter o1){ return null; }
//public MyHelperClass XPathConstants;
//	public MyHelperClass readFromStream(InputStream o0){ return null; }

    public static void convert(URL url, PrintWriter writer, String server)  throws Throwable {
        try {
            MyHelperClass NamespaceConstant = new MyHelperClass();
            XPathFactory xpf = XPathFactory.newInstance(NamespaceConstant.OBJECT_MODEL_SAXON);
            XPath xpe =(XPath)(Object) xpf.newXPath();
            InputStream is = null;
            try {
                is = url.openStream();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Document doc =(Document)(Object) readFromStream(is);
            xpe.setNamespaceContext(new NamespaceContext() {

                public String getNamespaceURI(String s) {
                    if (s.equals("tns")) {
                        return "http://services.remote/";
                    } else if (s.equals("xsd")) {
                        return "http://www.w3.org/2001/XMLSchema";
                    } else if (s.equals("soap")) {
                        return "http://schemas.xmlsoap.org/wsdl/soap/";
                    MyHelperClass XMLConstants = new MyHelperClass();
                    MyHelperClass XMLConstants = new MyHelperClass();
                    } else if (s.equals(XMLConstants.DEFAULT_NS_PREFIX)) {
                        return "http://schemas.xmlsoap.org/wsdl/";
                    } else {
                        return null;
                    }
                }

                public String getPrefix(String s) {
                    return null;
                }

                public Iterator getPrefixes(String s) {
                    return null;
                }
            });
            Element defs = (Element) xpe.compile("/*:definitions").evaluate(doc, XPathConstants.NODE);
            defs.setAttribute("xmlns", "http://schemas.xmlsoap.org/wsdl/");
            Node schemaLocation = (Node) xpe.compile("/*:definitions/*:types/xsd:schema/xsd:import/@schemaLocation").evaluate(doc, XPathConstants.NODE);
            String sl =(String)(Object) schemaLocation.getNodeValue();
            for (int i = 0; i < 3; i++) sl = sl.substring(sl.indexOf('/') + 1);
            schemaLocation.setNodeValue(server + "/" + sl);
            Node location = (Node) xpe.compile("/*:definitions/*:service/*:port/soap:address/@location").evaluate(doc, XPathConstants.NODE);
            String l =(String)(Object) location.getNodeValue();
            for (int i = 0; i < 3; i++) l = l.substring(l.indexOf('/') + 1);
            location.setNodeValue(server + "/" + l);
            write(doc, writer);
        } catch (XPathFactoryConfigurationException e) {
            e.printStackTrace();
            System.err.println("Error:" + e);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
            System.err.println("Error:" + e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OBJECT_MODEL_SAXON;
	public MyHelperClass NODE;
public MyHelperClass evaluate(Document o0, MyHelperClass o1){ return null; }}

class XPathFactory {

public MyHelperClass newXPath(){ return null; }
	public MyHelperClass newInstance(MyHelperClass o0){ return null; }}

class XPath {

public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass setNamespaceContext(){ return null; }
	public MyHelperClass setNamespaceContext(<anonymous NamespaceContext> o0){ return null; }}

class Document {

}

class NamespaceContext {

}

class Element {

public MyHelperClass setAttribute(String o0, String o1){ return null; }}

class Node {

public MyHelperClass setNodeValue(String o0){ return null; }
	public MyHelperClass getNodeValue(){ return null; }}

class XPathFactoryConfigurationException extends Exception{
	public XPathFactoryConfigurationException(String errorMessage) { super(errorMessage); }
}

class XPathExpressionException extends Exception{
	public XPathExpressionException(String errorMessage) { super(errorMessage); }
}
