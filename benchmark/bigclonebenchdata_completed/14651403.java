import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14651403 {
public MyHelperClass SVG_COLOR_PROFILE_TAG;
	public MyHelperClass convertIntent(Element o0){ return null; }

    public ICCColorSpaceExt createICCColorSpaceExt(BridgeContext ctx, Element paintedElement, String iccProfileName)  throws Throwable {
        MyHelperClass cache = new MyHelperClass();
        ICCColorSpaceExt cs =(ICCColorSpaceExt)(Object) cache.request(iccProfileName.toLowerCase());
        if (cs != null) {
            return cs;
        }
        Document doc =(Document)(Object) paintedElement.getOwnerDocument();
        MyHelperClass SVG_NAMESPACE_URI = new MyHelperClass();
        NodeList list =(NodeList)(Object) doc.getElementsByTagNameNS(SVG_NAMESPACE_URI, SVG_COLOR_PROFILE_TAG);
        int n =(int)(Object) list.getLength();
        Element profile = null;
        for (int i = 0; i < n; i++) {
            Node node =(Node)(Object) list.item(i);
            MyHelperClass Node = new MyHelperClass();
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element profileNode = (Element)(Element)(Object) node;
                MyHelperClass SVG_NAME_ATTRIBUTE = new MyHelperClass();
                String nameAttr =(String)(Object) profileNode.getAttributeNS(null, SVG_NAME_ATTRIBUTE);
                if (iccProfileName.equalsIgnoreCase(nameAttr)) {
                    profile = profileNode;
                }
            }
        }
        if (profile == null) return null;
        MyHelperClass XLinkSupport = new MyHelperClass();
        String href =(String)(Object) XLinkSupport.getXLinkHref(profile);
        ICC_Profile p = null;
        if (href != null) {
            String baseURI =(String)(Object) ((SVGOMDocument)(SVGOMDocument)(Object) doc).getURL();
            ParsedURL purl = new ParsedURL(baseURI, href);
            MyHelperClass ERR_URI_MALFORMED = new MyHelperClass();
            if (!(Boolean)(Object)purl.complete()) throw new BridgeException(paintedElement, ERR_URI_MALFORMED, new Object[] { href });
            try {
                ParsedURL pDocURL = null;
                if (baseURI != null) {
                    pDocURL = new ParsedURL(baseURI);
                }
                ctx.getUserAgent().checkLoadExternalResource(purl, pDocURL);
                MyHelperClass ICC_Profile = new MyHelperClass();
                p =(ICC_Profile)(Object) ICC_Profile.getInstance(purl.openStream());
            } catch (UncheckedIOException e) {
                MyHelperClass ERR_URI_IO = new MyHelperClass();
                throw new BridgeException(paintedElement, ERR_URI_IO, new Object[] { href });
            } catch (SecurityException e) {
                MyHelperClass ERR_URI_UNSECURE = new MyHelperClass();
                throw new BridgeException(paintedElement, ERR_URI_UNSECURE, new Object[] { href });
            }
        }
        if (p == null) {
            return null;
        }
        int intent =(int)(Object) convertIntent(profile);
        cs = new ICCColorSpaceExt(p, intent);
//        MyHelperClass cache = new MyHelperClass();
        cache.put(iccProfileName.toLowerCase(), cs);
        return cs;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ELEMENT_NODE;
public MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass getXLinkHref(Element o0){ return null; }
	public MyHelperClass put(String o0, ICCColorSpaceExt o1){ return null; }
	public MyHelperClass checkLoadExternalResource(ParsedURL o0, ParsedURL o1){ return null; }
	public MyHelperClass request(String o0){ return null; }}

class BridgeContext {

public MyHelperClass getUserAgent(){ return null; }}

class Element {

public MyHelperClass getOwnerDocument(){ return null; }
	public MyHelperClass getAttributeNS(Object o0, MyHelperClass o1){ return null; }}

class ICCColorSpaceExt {

ICCColorSpaceExt(ICC_Profile o0, int o1){}
	ICCColorSpaceExt(){}}

class Document {

public MyHelperClass getElementsByTagNameNS(MyHelperClass o0, MyHelperClass o1){ return null; }}

class NodeList {

public MyHelperClass getLength(){ return null; }
	public MyHelperClass item(int o0){ return null; }}

class Node {

public MyHelperClass getNodeType(){ return null; }}

class ICC_Profile {

}

class SVGOMDocument {

public MyHelperClass getURL(){ return null; }}

class ParsedURL {

ParsedURL(){}
	ParsedURL(String o0, String o1){}
	ParsedURL(String o0){}
	public MyHelperClass complete(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class BridgeException extends Exception{
	public BridgeException(String errorMessage) { super(errorMessage); }
	BridgeException(Element o0, MyHelperClass o1, Object[] o2){}
	BridgeException(){}
}
