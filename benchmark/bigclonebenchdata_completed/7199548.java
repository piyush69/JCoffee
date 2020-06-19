import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7199548 {
public MyHelperClass SVG_FONT_TAG;
	public MyHelperClass SVG_FONT_FACE_TAG;
	public MyHelperClass SVG_G_TAG;
	public MyHelperClass getBaseElement(BridgeContext o0){ return null; }

    protected GVTFontFamily getFontFamily(BridgeContext ctx, ParsedURL purl)  throws Throwable {
        String purlStr = purl.toString();
        Element e =(Element)(Object) getBaseElement(ctx);
        SVGDocument svgDoc = (SVGDocument)(SVGDocument)(Object) e.getOwnerDocument();
        String docURL =(String)(Object) svgDoc.getURL();
        ParsedURL pDocURL = null;
        if (docURL != null) pDocURL = new ParsedURL(docURL);
        MyHelperClass XMLBaseSupport = new MyHelperClass();
        String baseURI =(String)(Object) XMLBaseSupport.getCascadedXMLBase(e);
        purl = new ParsedURL(baseURI, purlStr);
        UserAgent userAgent =(UserAgent)(Object) ctx.getUserAgent();
        try {
            userAgent.checkLoadExternalResource(purl, pDocURL);
        } catch (SecurityException ex) {
            userAgent.displayError(ex);
            return null;
        }
        if (purl.getRef() != null) {
            Element ref =(Element)(Object) ctx.getReferencedElement(e, purlStr);
            MyHelperClass SVG_NAMESPACE_URI = new MyHelperClass();
            if (!ref.getNamespaceURI().equals(SVG_NAMESPACE_URI) || !ref.getLocalName().equals(SVG_FONT_TAG)) {
                return null;
            }
            SVGDocument doc = (SVGDocument)(SVGDocument)(Object) e.getOwnerDocument();
            SVGDocument rdoc = (SVGDocument)(SVGDocument)(Object) ref.getOwnerDocument();
            Element fontElt = ref;
            if (doc != rdoc) {
                fontElt = (Element)(Element)(Object) doc.importNode(ref, true);
//                MyHelperClass XMLBaseSupport = new MyHelperClass();
                String base =(String)(Object) XMLBaseSupport.getCascadedXMLBase(ref);
//                MyHelperClass SVG_NAMESPACE_URI = new MyHelperClass();
                Element g =(Element)(Object) doc.createElementNS(SVG_NAMESPACE_URI, SVG_G_TAG);
                g.appendChild(fontElt);
//                MyHelperClass XMLBaseSupport = new MyHelperClass();
                g.setAttributeNS(XMLBaseSupport.XML_NAMESPACE_URI, "xml:base", base);
                MyHelperClass CSSUtilities = new MyHelperClass();
                CSSUtilities.computeStyleAndURIs(ref, fontElt, purlStr);
            }
            Element fontFaceElt = null;
            for (Node n =(Node)(Object) fontElt.getFirstChild(); n != null; n =(Node)(Object) n.getNextSibling()) {
                MyHelperClass Node = new MyHelperClass();
                if ((n.getNodeType() == Node.ELEMENT_NODE) && n.getNamespaceURI().equals(SVG_NAMESPACE_URI) && n.getLocalName().equals(SVG_FONT_FACE_TAG)) {
                    fontFaceElt = (Element)(Element)(Object) n;
                    break;
                }
            }
            SVGFontFaceElementBridge fontFaceBridge;
//            MyHelperClass SVG_NAMESPACE_URI = new MyHelperClass();
            fontFaceBridge = (SVGFontFaceElementBridge)(SVGFontFaceElementBridge)(Object) ctx.getBridge(SVG_NAMESPACE_URI, SVG_FONT_FACE_TAG);
            GVTFontFace gff =(GVTFontFace)(Object) fontFaceBridge.createFontFace(ctx, fontFaceElt);
            return(GVTFontFamily)(Object) new SVGFontFamily(gff, fontElt, ctx);
        }
        try {
            MyHelperClass Font = new MyHelperClass();
            Font font =(Font)(Object) Font.createFont(Font.TRUETYPE_FONT, purl.openStream());
            return(GVTFontFamily)(Object) new AWTFontFamily(this, font);
        } catch (Exception ex) {
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TRUETYPE_FONT;
	public MyHelperClass ELEMENT_NODE;
	public MyHelperClass XML_NAMESPACE_URI;
public MyHelperClass computeStyleAndURIs(Element o0, Element o1, String o2){ return null; }
	public MyHelperClass createFont(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getCascadedXMLBase(Element o0){ return null; }}

class BridgeContext {

public MyHelperClass getUserAgent(){ return null; }
	public MyHelperClass getBridge(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReferencedElement(Element o0, String o1){ return null; }}

class ParsedURL {

ParsedURL(){}
	ParsedURL(String o0, String o1){}
	ParsedURL(String o0){}
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass getRef(){ return null; }}

class GVTFontFamily {

}

class Element {

public MyHelperClass getOwnerDocument(){ return null; }
	public MyHelperClass getNamespaceURI(){ return null; }
	public MyHelperClass appendChild(Element o0){ return null; }
	public MyHelperClass setAttributeNS(MyHelperClass o0, String o1, String o2){ return null; }
	public MyHelperClass getLocalName(){ return null; }
	public MyHelperClass getFirstChild(){ return null; }}

class SVGDocument {

public MyHelperClass getURL(){ return null; }
	public MyHelperClass createElementNS(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass importNode(Element o0, boolean o1){ return null; }}

class UserAgent {

public MyHelperClass checkLoadExternalResource(ParsedURL o0, ParsedURL o1){ return null; }
	public MyHelperClass displayError(SecurityException o0){ return null; }}

class Node {

public MyHelperClass getNextSibling(){ return null; }
	public MyHelperClass getNodeType(){ return null; }
	public MyHelperClass getNamespaceURI(){ return null; }
	public MyHelperClass getLocalName(){ return null; }}

class SVGFontFaceElementBridge {

public MyHelperClass createFontFace(BridgeContext o0, Element o1){ return null; }}

class GVTFontFace {

}

class SVGFontFamily {

SVGFontFamily(GVTFontFace o0, Element o1, BridgeContext o2){}
	SVGFontFamily(){}}

class Font {

}

class AWTFontFamily {

AWTFontFamily(){}
	AWTFontFamily(c7199548 o0, Font o1){}}
