import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9872346 {

    public static synchronized Document readRemoteDocument(URL url, boolean validate) throws Throwable, IOException, SAXParseException {
        MyHelperClass DEBUG = new MyHelperClass();
        if ((boolean)(Object)DEBUG) System.out.println("DocumentUtilities.readDocument( " + url + ")");
        Document document = null;
        try {
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            DocumentBuilderFactory factory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            factory.setCoalescing(true);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDefaultUseCaches(false);
            connection.setUseCaches(false);
            connection.setRequestProperty("User-Agent", "eXchaNGeR/" + System.getProperty("xngr.version") + " (http://xngr.org/)");
            connection.connect();
            InputStream stream = connection.getInputStream();
            document =(Document)(Object) factory.newDocumentBuilder().parse(stream);
            stream.close();
            connection.disconnect();
        } catch (UncheckedIOException e) {
            if ((SAXParseException)(Object)e instanceof SAXParseException) {
                throw (SAXParseException)(SAXParseException)(Object) e;
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
//        MyHelperClass DEBUG = new MyHelperClass();
        if ((boolean)(Object)DEBUG) System.out.println("DocumentUtilities.readDocument( " + url + ") [" + document + "]");
        return document;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }
	public MyHelperClass parse(InputStream o0){ return null; }}

class Document {

}

class SAXParseException extends Exception{
	public SAXParseException(String errorMessage) { super(errorMessage); }
}

class DocumentBuilderFactory {

public MyHelperClass setNamespaceAware(boolean o0){ return null; }
	public MyHelperClass newDocumentBuilder(){ return null; }
	public MyHelperClass setCoalescing(boolean o0){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}
