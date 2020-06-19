import java.io.*;
import java.lang.*;
import java.util.*;



class c13333160 {
public MyHelperClass parseMenu(Element o0){ return null; }
	public MyHelperClass addEntry(ZipOutputStream o0, String o1, String o2){ return null; }
	public MyHelperClass addDir(ZipOutputStream o0, String o1){ return null; }

    private void run(Reader xmlIn, OutputStream out) throws IOException, SAXException {
        Document dom = null;
        try {
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            DocumentBuilderFactory f =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
            f.setNamespaceAware(false);
            f.setCoalescing(true);
            f.setIgnoringComments(true);
            f.setValidating(false);
            DocumentBuilder b =(DocumentBuilder)(Object) f.newDocumentBuilder();
            dom =(Document)(Object) b.parse(new InputSource(xmlIn));
        } catch (UncheckedIOException err) {
            throw new IOException(err);
        }
        Element root =(Element)(Object) dom.getDocumentElement();
        if (root == null) throw new SAXException("Not root in document");
        Attr att =(Attr)(Object) root.getAttributeNode("label");
        if (att == null) root.setAttribute("label", "Wikipedia");
        Menu menu =(Menu)(Object) parseMenu(root);
        menu.id =(MyHelperClass)(Object) "menuWikipedia";
        ZipOutputStream zout = new ZipOutputStream(out);
        MyHelperClass ResourceUtils = new MyHelperClass();
        String content =(String)(Object) ResourceUtils.getContent(XUL4Wikipedia.class, "chrome.manifest");
        addEntry(zout, "chrome.manifest", content);
//        MyHelperClass ResourceUtils = new MyHelperClass();
        content =(String)(Object) ResourceUtils.getContent(XUL4Wikipedia.class, "install.rdf");
        addEntry(zout, "install.rdf", content);
//        MyHelperClass ResourceUtils = new MyHelperClass();
        content =(String)(Object) ResourceUtils.getContent(XUL4Wikipedia.class, "library.js");
        addDir(zout, "chrome/");
        addDir(zout, "chrome/content/");
        addDir(zout, "chrome/skin/");
        String signal = "/*INSERT_CMD_HERE*/";
        int n = content.indexOf(signal);
        if (n == -1) throw new RuntimeException("where is " + signal + " ??");
        ZipEntry entry = new ZipEntry("chrome/content/library.js");
        zout.putNextEntry(entry);
        PrintWriter pout = new PrintWriter((Writer)(Object)zout);
        pout.write(content.substring(0, n));
        menu.toJS(pout);
        pout.write(content.substring(n + signal.length()));
        pout.flush();
        zout.closeEntry();
        entry = new ZipEntry("chrome/content/menu.xul");
        zout.putNextEntry(entry);
        pout = new PrintWriter((Writer)(Object)zout);
        pout.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        MyHelperClass XUL = new MyHelperClass();
        pout.println("<overlay id=\"xul4wikipedia\" xmlns=\"" + XUL.NS + "\">");
        pout.println("<script src=\"library.js\"/>");
        pout.println("<popup id=\"contentAreaContextMenu\">");
        pout.println("<menuseparator/>");
        menu.toXUL(pout);
        pout.println("</popup>");
        pout.println("</overlay>");
        pout.flush();
        zout.closeEntry();
        InputStream png = XUL4Wikipedia.class.getResourceAsStream("32px-Wikipedia-logo.png");
        if (png == null) throw new IOException("Cannot get icon");
        entry = new ZipEntry("chrome/skin/wikipedia.png");
        zout.putNextEntry(entry);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copyTo(png, zout);
        zout.closeEntry();
        zout.finish();
        zout.flush();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NS;
public MyHelperClass copyTo(InputStream o0, ZipOutputStream o1){ return null; }
	public MyHelperClass getContent(Class<XUL4Wikipedia> o0, String o1){ return null; }
	public MyHelperClass newInstance(){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class Document {

public MyHelperClass getDocumentElement(){ return null; }}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }
	public MyHelperClass setCoalescing(boolean o0){ return null; }
	public MyHelperClass setIgnoringComments(boolean o0){ return null; }
	public MyHelperClass setNamespaceAware(boolean o0){ return null; }
	public MyHelperClass setValidating(boolean o0){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputSource o0){ return null; }}

class InputSource {

InputSource(){}
	InputSource(Reader o0){}}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class Element {

public MyHelperClass getAttributeNode(String o0){ return null; }
	public MyHelperClass setAttribute(String o0, String o1){ return null; }}

class Attr {

}

class Menu {
public MyHelperClass id;
public MyHelperClass toJS(PrintWriter o0){ return null; }
	public MyHelperClass toXUL(PrintWriter o0){ return null; }}

class ZipOutputStream {

ZipOutputStream(OutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass flush(){ return null; }
	public MyHelperClass finish(){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class XUL4Wikipedia {

}

class ZipEntry {

ZipEntry(){}
	ZipEntry(String o0){}}
