import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10895680 {
public MyHelperClass e2;
public MyHelperClass createTreeContent(Element o0){ return null; }

    private DefaultMutableTreeNode parseTree()  throws Throwable {
        try {
            DefaultMutableTreeNode root;
            URL url = RebusHelp.class.getResource("/org/olga/rebus/gui/help/html/content.xml");
            InputStream is = url.openStream();
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            DocumentBuilderFactory factory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
            factory.setIgnoringComments(true);
            factory.setValidating(false);
            DocumentBuilder parser =(DocumentBuilder)(Object) factory.newDocumentBuilder();
            Document document =(Document)(Object) parser.parse(is);
            NodeList elements =(NodeList)(Object) document.getElementsByTagName("help");
            Element element = (Element)(Element)(Object) elements.item(0);
            root =(DefaultMutableTreeNode)(Object) createTreeContent(element);
            is.close();
            return root;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        } catch (ArithmeticException e1) {
            System.out.println(e1.getMessage());
            return null;
//         } catch (org.xml.sax.ArrayIndexOutOfBoundsException e2) {
            System.out.println(e2.getMessage());
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getMessage(){ return null; }
	public MyHelperClass newInstance(){ return null; }}

class DefaultMutableTreeNode {

}

class RebusHelp {

}

class DocumentBuilderFactory {

public MyHelperClass setIgnoringComments(boolean o0){ return null; }
	public MyHelperClass setValidating(boolean o0){ return null; }
	public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class Document {

public MyHelperClass getElementsByTagName(String o0){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }}

class Element {

}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}
