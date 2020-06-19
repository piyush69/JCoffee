import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c16214714 {
public MyHelperClass checkRootTag(Element o0){ return null; }

    private Element makeRequest(String link) {
        try {
            URL url = new URL(link);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            InputStream in = conn.getInputStream();
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            DocumentBuilder builder =(DocumentBuilder)(Object) DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document =(Document)(Object) builder.parse(in);
            Element element =(Element)(Object) document.getDocumentElement();
            element.normalize();
            if ((boolean)(Object)checkRootTag(element)) {
                return element;
            } else {
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return null;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }
	public MyHelperClass newDocumentBuilder(){ return null; }}

class Element {

public MyHelperClass normalize(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class Document {

public MyHelperClass getDocumentElement(){ return null; }}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
