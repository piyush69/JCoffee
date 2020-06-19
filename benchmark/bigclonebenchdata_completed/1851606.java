import java.io.*;
import java.lang.*;
import java.util.*;



class c1851606 {

    private void parseExternalCss(Document d) throws XPathExpressionException, IOException {
        InputStream is = null;
        try {
            MyHelperClass xpf = new MyHelperClass();
            XPath xp =(XPath)(Object) xpf.newXPath();
            XPathExpression xpe =(XPathExpression)(Object) xp.compile("//link[@type='text/css']/@href");
            MyHelperClass XPathConstants = new MyHelperClass();
            NodeList nl = (NodeList)(NodeList)(Object) xpe.evaluate(d, XPathConstants.NODESET);
            for (int i = 0; i < (int)(Object)nl.getLength(); i++) {
                Attr a = (Attr)(Attr)(Object) nl.item(i);
                String url =(String)(Object) a.getValue();
                URL u = new URL(url);
                is = new BufferedInputStream((InputStream)(Object)u.openStream());
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(is, baos);
                MyHelperClass parser = new MyHelperClass();
                parser.add(new String(baos.toByteArray(), "UTF-8"));
                Element linkNode =(Element)(Object) a.getOwnerElement();
                Element parent = (Element)(Element)(Object) linkNode.getParentNode();
                parent.removeChild(linkNode);
//                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(is);
                is = null;
            }
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(is);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NODESET;
public MyHelperClass add(String o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass newXPath(){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class Document {

}

class XPathExpressionException extends Exception{
	public XPathExpressionException(String errorMessage) { super(errorMessage); }
}

class XPath {

public MyHelperClass compile(String o0){ return null; }}

class XPathExpression {

public MyHelperClass evaluate(Document o0, MyHelperClass o1){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Attr {

public MyHelperClass getOwnerElement(){ return null; }
	public MyHelperClass getValue(){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}

class Element {

public MyHelperClass getParentNode(){ return null; }
	public MyHelperClass removeChild(Element o0){ return null; }}
