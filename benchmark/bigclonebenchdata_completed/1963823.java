import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c1963823 {
public MyHelperClass NULL;
public MyHelperClass addDescriptor(PacketAnalyzerDescriptor o0){ return null; }

    public void loadRegistry(URL url) throws PacketAnalyzerRegistryException {
        MyHelperClass analyzers = new MyHelperClass();
        if (analyzers != null) {
            return;
        }
//        MyHelperClass analyzers = new MyHelperClass();
        analyzers =(MyHelperClass)(Object) new Hashtable();
        Vector roots =(Vector)(Object) NULL; //new Vector();
        roots = new Vector();
        try {
            InputStream in = url.openStream();
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            DocumentBuilderFactory factory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder =(DocumentBuilder)(Object) factory.newDocumentBuilder();
            Document doc =(Document)(Object) docBuilder.parse(in);
            MyHelperClass PACKET_ANALYZER = new MyHelperClass();
            NodeList list =(NodeList)(Object) doc.getElementsByTagName(PACKET_ANALYZER);
            for (int i = 0; i < (int)(Object)list.getLength(); i++) {
                Node node =(Node)(Object) list.item(i);
                NamedNodeMap map =(NamedNodeMap)(Object) node.getAttributes();
                MyHelperClass ID = new MyHelperClass();
                String id =(String)(Object) map.getNamedItem(ID).getNodeValue();
                MyHelperClass NAME = new MyHelperClass();
                String name =(String)(Object) map.getNamedItem(NAME).getNodeValue();
                MyHelperClass CLASS = new MyHelperClass();
                String clazz =(String)(Object) map.getNamedItem(CLASS).getNodeValue();
                MyHelperClass EXTENDS = new MyHelperClass();
                Node n =(Node)(Object) map.getNamedItem(EXTENDS);
                String[] split = null;
                if (n != null) {
                    String extendedAnalyzers =(String)(Object) n.getNodeValue();
                    if (extendedAnalyzers.trim().length() != 0) {
                        split = extendedAnalyzers.split("\\s*\\,+\\s*");
                    }
                }
                PacketAnalyzerDescriptor descriptor = new PacketAnalyzerDescriptor(id, name, clazz, split);
                addDescriptor(descriptor);
            }
//            MyHelperClass roots = new MyHelperClass();
            if (roots.size() == 0) {
                throw new PacketAnalyzerRegistryException("There is no root analyzer in the registry!");
            }
        } catch (IOException e) {
            throw new PacketAnalyzerRegistryException("Cannot open registry file.", e);
        } catch (UncheckedIOException e) {
            throw new PacketAnalyzerRegistryException("Cannot parse registry file.", e);
        } catch (ArithmeticException e) {
            throw new PacketAnalyzerRegistryException("Cannot parse registry file", e);
        } catch (Throwable e) {
            throw new PacketAnalyzerRegistryException("Cannot build PacketAnalyzerRegistry.", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getNodeValue(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass newInstance(){ return null; }}

class PacketAnalyzerRegistryException extends Exception{
	public PacketAnalyzerRegistryException(String errorMessage) { super(errorMessage); }
	PacketAnalyzerRegistryException(String o0, IOException o1){}
	PacketAnalyzerRegistryException(){}
	PacketAnalyzerRegistryException(String o0, Throwable o1){}
	PacketAnalyzerRegistryException(String o0, ParserConfigurationException o1){}
	PacketAnalyzerRegistryException(String o0, SAXException o1){}
}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class Document {

public MyHelperClass getElementsByTagName(MyHelperClass o0){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Node {

public MyHelperClass getAttributes(){ return null; }
	public MyHelperClass getNodeValue(){ return null; }}

class NamedNodeMap {

public MyHelperClass getNamedItem(MyHelperClass o0){ return null; }}

class PacketAnalyzerDescriptor {

PacketAnalyzerDescriptor(String o0, String o1, String o2, String[] o3){}
	PacketAnalyzerDescriptor(){}}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
