import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23585985 {
public static MyHelperClass LOG;
//public MyHelperClass LOG;

    public static StreamSource getStreamSource(Item item, XQueryContext context) throws Throwable, XPathException, MalformedURLException, IOException {
        StreamSource streamSource = new StreamSource();
        MyHelperClass Type = new MyHelperClass();
        if (item.getType() == Type.JAVA_OBJECT) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.debug("Streaming Java object");
            Object obj = ((JavaObjectValue)(JavaObjectValue)(Object) item).getObject();
            if (!(obj instanceof File)) {
                throw new XPathException("Passed java object should be a File");
            }
            File inputFile = (File) obj;
            InputStream is = new FileInputStream(inputFile);
            streamSource.setInputStream(is);
            streamSource.setSystemId(inputFile.toURI().toURL().toString());
//        MyHelperClass Type = new MyHelperClass();
        } else if (item.getType() == Type.ANY_URI) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.debug("Streaming xs:anyURI");
            String url =(String)(Object) item.getStringValue();
            if (url.startsWith("/")) {
                url = "xmldb:exist://" + url;
            }
            InputStream is = new URL(url).openStream();
            streamSource.setInputStream(is);
            streamSource.setSystemId(url);
//        MyHelperClass Type = new MyHelperClass();
        } else if (item.getType() == Type.ELEMENT || item.getType() == Type.DOCUMENT) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.debug("Streaming element or document node");
            if ((NodeProxy)(Object)item instanceof NodeProxy) {
                NodeProxy np = (NodeProxy)(NodeProxy)(Object) item;
                String url = "xmldb:exist://" + np.getDocument().getBaseURI();
//                MyHelperClass LOG = new MyHelperClass();
                LOG.debug("Document detected, adding URL " + url);
                streamSource.setSystemId(url);
            }
            Serializer serializer =(Serializer)(Object) context.getBroker().newSerializer();
            NodeValue node = (NodeValue)(NodeValue)(Object) item;
            InputStream is =(InputStream)(Object) new NodeInputStream(serializer, node);
            streamSource.setInputStream(is);
//        MyHelperClass Type = new MyHelperClass();
        } else if (item.getType() == Type.BASE64_BINARY || item.getType() == Type.HEX_BINARY) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.debug("Streaming base64 binary");
            BinaryValue binary = (BinaryValue)(BinaryValue)(Object) item;
            byte[] data = (byte[])(byte[])(Object) binary.toJavaObject((byte[])(Object)byte[].class);
            InputStream is = new ByteArrayInputStream(data);
            streamSource.setInputStream(is);
            if ((Base64BinaryDocument)(Object)item instanceof Base64BinaryDocument) {
                Base64BinaryDocument b64doc = (Base64BinaryDocument)(Base64BinaryDocument)(Object) item;
                String url = "xmldb:exist://" + b64doc.getUrl();
//                MyHelperClass LOG = new MyHelperClass();
                LOG.debug("Base64BinaryDocument detected, adding URL " + url);
                streamSource.setSystemId(url);
            }
        } else {
//            MyHelperClass Type = new MyHelperClass();
            LOG.error("Wrong item type " + Type.getTypeName(item.getType()));
//            MyHelperClass Type = new MyHelperClass();
            throw new XPathException("wrong item type " + Type.getTypeName(item.getType()));
        }
        return streamSource;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass JAVA_OBJECT;
	public MyHelperClass BASE64_BINARY;
	public MyHelperClass ELEMENT;
	public MyHelperClass HEX_BINARY;
	public MyHelperClass DOCUMENT;
	public MyHelperClass ANY_URI;
public MyHelperClass getTypeName(MyHelperClass o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getBaseURI(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass newSerializer(){ return null; }}

class Item {

public MyHelperClass getType(){ return null; }
	public MyHelperClass getStringValue(){ return null; }}

class XQueryContext {

public MyHelperClass getBroker(){ return null; }}

class StreamSource {

public MyHelperClass setInputStream(InputStream o0){ return null; }
	public MyHelperClass setSystemId(String o0){ return null; }}

class XPathException extends Exception{
	public XPathException(String errorMessage) { super(errorMessage); }
}

class JavaObjectValue {

public MyHelperClass getObject(){ return null; }}

class NodeProxy {

public MyHelperClass getDocument(){ return null; }}

class Serializer {

}

class NodeValue {

}

class NodeInputStream {

NodeInputStream(){}
	NodeInputStream(Serializer o0, NodeValue o1){}}

class BinaryValue {

public MyHelperClass toJavaObject(byte[] o0){ return null; }}

class Base64BinaryDocument {

public MyHelperClass getUrl(){ return null; }}
