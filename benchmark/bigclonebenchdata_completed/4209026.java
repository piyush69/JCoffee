import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4209026 {
public MyHelperClass Logger;
	public MyHelperClass instantiateModule(String o0, List<Module o1){ return null; }

    public Collection<Module> loadModules()  throws Throwable {
        URL url = getClass().getResource("/modules.xml");
        if (url == null) {
            java.util.logging.Logger.getLogger(ModuleLoader.class.getName()).log(java.util.logging.Level.SEVERE, "Cannot find modules.xml file in classpath");
            return Collections.<Module>emptyList();
        }
        MyHelperClass DocumentBuilderFactory = new MyHelperClass();
        DocumentBuilderFactory fac = DocumentBuilderFactory.newInstance();
        Document document = null;
        InputStream input = null;
        try {
            input = url.openStream();
            DocumentBuilder bui = fac.newDocumentBuilder();
            document = bui.parse(url.openStream());
        } catch (SAXException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(ModuleLoader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(ModuleLoader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(ModuleLoader.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException ex) {
                    MyHelperClass Level = new MyHelperClass();
                    Logger.getLogger(ModuleLoader.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (document == null) {
            return Collections.<Module>emptyList();
        }
        List<Module> modules = new LinkedList<Module>();
        NodeList moduleListNodes = document.getElementsByTagName("module-list");
        for (int i = 0; i < moduleListNodes.getLength(); i++) {
            Element moduleListNode = (Element) moduleListNodes.item(i);
            NodeList moduleNodes = moduleListNode.getElementsByTagName("module");
            for (int j = 0; j < moduleNodes.getLength(); j++) {
                Element moduleNode = (Element) moduleNodes.item(j);
                String moduleClass = moduleNode.getAttribute("class");
                if (moduleClass != null) {
                    instantiateModule(moduleClass, modules);
                }
            }
        }
        return modules;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass newInstance(){ return null; }}

class Module {

}

class ModuleLoader {

}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class Document {

public MyHelperClass getElementsByTagName(String o0){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Element {

public MyHelperClass getAttribute(String o0){ return null; }
	public MyHelperClass getElementsByTagName(String o0){ return null; }}
