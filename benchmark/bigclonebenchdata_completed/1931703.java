import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1931703 {
public MyHelperClass XML_PATH;
	public MyHelperClass getGPSTrace(NodeList o0){ return null; }

    public GPSTrace loadGPSTrace(long reportID)  throws Throwable {
        try {
            MyHelperClass SERVER_URL = new MyHelperClass();
            URL url = new URL((int)(Object)SERVER_URL + (int)(Object)XML_PATH + "gps.xml");
            System.out.println(url);
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            DocumentBuilderFactory factory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =(DocumentBuilder)(Object) factory.newDocumentBuilder();
            MyHelperClass document = new MyHelperClass();
            document = builder.parse(url.openStream());
//            MyHelperClass document = new MyHelperClass();
            Element customerElement =(Element)(Object) document.getDocumentElement();
            NodeList gps =(NodeList)(Object) customerElement.getElementsByTagName("gps");
            MyHelperClass trace = new MyHelperClass();
            trace = getGPSTrace(gps);
        } catch (SAXException sxe) {
            Exception x = sxe;
            if (sxe.getException() != null) x = sxe.getException();
            x.printStackTrace();
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        MyHelperClass trace = new MyHelperClass();
        return(GPSTrace)(Object) trace;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getDocumentElement(){ return null; }}

class GPSTrace {

}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class Element {

public MyHelperClass getElementsByTagName(String o0){ return null; }}

class NodeList {

}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}
