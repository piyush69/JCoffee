import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4781643 {
public static MyHelperClass loadConfig(String o0, Properties o1){ return null; }
//public MyHelperClass loadConfig(String o0, Properties o1){ return null; }

    public static void loadConfig(URL urlFile) throws Throwable, CacheException {
        Document document;
        try {
            MyHelperClass Utilities = new MyHelperClass();
            document =(Document)(Object) Utilities.getDocument(urlFile.openStream());
        } catch (IOException e) {
            throw new CacheException("Could not open '" + urlFile.getFile() + "'", e);
        } catch (UncheckedIOException e) {
            throw new CacheException("Could not open '" + urlFile.getFile() + "'",(JAnalyticsException)(Object) e);
        }
        MyHelperClass DOCUMENT_CACHE_ELEMENT_NAME = new MyHelperClass();
        Element element = (Element)(Element)(Object) document.getElementsByTagName(DOCUMENT_CACHE_ELEMENT_NAME).item(0);
        if (element != null) {
            MyHelperClass CLASSNAME_ATTRIBUTE_NAME = new MyHelperClass();
            String className =(String)(Object) element.getAttribute(CLASSNAME_ATTRIBUTE_NAME);
            if (className != null) {
                Properties config = new Properties();
                MyHelperClass PARAM_ELEMENT_NAME = new MyHelperClass();
                NodeList nodes =(NodeList)(Object) element.getElementsByTagName(PARAM_ELEMENT_NAME);
                if (nodes != null) {
                    for (int i = 0, count =(int)(Object) nodes.getLength(); i < count; i++) {
                        Node node =(Node)(Object) nodes.item(i);
                        if ((Element)(Object)node instanceof Element) {
                            Element n = (Element)(Element)(Object) node;
                            MyHelperClass NAME_ATTRIBUTE_NAME = new MyHelperClass();
                            String name =(String)(Object) n.getAttribute(NAME_ATTRIBUTE_NAME);
                            MyHelperClass VALUE_ATTRIBUTE_NAME = new MyHelperClass();
                            String value =(String)(Object) n.getAttribute(VALUE_ATTRIBUTE_NAME);
                            config.put(name, value);
                        }
                    }
                }
                loadConfig(className, config);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getDocument(InputStream o0){ return null; }
	public MyHelperClass item(int o0){ return null; }}

class CacheException extends Exception{
	public CacheException(String errorMessage) { super(errorMessage); }
	CacheException(String o0, JAnalyticsException o1){}
	CacheException(){}
	CacheException(String o0, IOException o1){}
}

class Document {

public MyHelperClass getElementsByTagName(MyHelperClass o0){ return null; }}

class JAnalyticsException extends Exception{
	public JAnalyticsException(String errorMessage) { super(errorMessage); }
}

class Element {

public MyHelperClass getAttribute(MyHelperClass o0){ return null; }
	public MyHelperClass getElementsByTagName(MyHelperClass o0){ return null; }}

class NodeList {

public MyHelperClass getLength(){ return null; }
	public MyHelperClass item(int o0){ return null; }}

class Node {

}
