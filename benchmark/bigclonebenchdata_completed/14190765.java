import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14190765 {
public MyHelperClass alNS;
	public MyHelperClass responseDoc;
	public MyHelperClass rdfNS;
	public MyHelperClass Location;
	public MyHelperClass baseurl;
	public MyHelperClass annohash;
	public MyHelperClass getAnnohash(){ return null; }

    private void _PostParser(Document document, AnnotationManager annoMan, Document htmldoc, String baseurl)  throws Throwable {
        MyHelperClass xformer = new MyHelperClass();
        xformer = annoMan.getTransformer();
        MyHelperClass builder = new MyHelperClass();
        builder = annoMan.getBuilder();
        String annohash = "";
        if (document == null) return;
        MyHelperClass annoNS = new MyHelperClass();
        NodeList ndlist = document.getElementsByTagNameNS(annoNS, "body");
        if (ndlist.getLength() != 1) {
            System.out.println("Sorry Annotation Body was found " + ndlist.getLength() + " times");
            return;
        }
        Element bodynode = (Element) ndlist.item(0);
        Node htmlNode = bodynode.getElementsByTagName("html").item(0);
        if (htmlNode == null) htmlNode = bodynode.getElementsByTagName("HTML").item(0);
//        MyHelperClass builder = new MyHelperClass();
        Document newdoc = builder.newDocument();
        MyHelperClass rdfNS = new MyHelperClass();
        Element rootelem = newdoc.createElementNS(rdfNS, "r:RDF");
//        MyHelperClass rdfNS = new MyHelperClass();
        rootelem.setAttribute("xmlns:r", rdfNS);
//        MyHelperClass annoNS = new MyHelperClass();
        rootelem.setAttribute("xmlns:a", annoNS);
        MyHelperClass dubNS = new MyHelperClass();
        rootelem.setAttribute("xmlns:d", dubNS);
        MyHelperClass threadNS = new MyHelperClass();
        rootelem.setAttribute("xmlns:t", threadNS);
        newdoc.appendChild(rootelem);
        Element tmpelem;
        NodeList tmpndlist;
//        MyHelperClass annoNS = new MyHelperClass();
        Element annoElem = newdoc.createElementNS(annoNS, "a:Annotation");
        rootelem.appendChild(annoElem);
//        MyHelperClass annoNS = new MyHelperClass();
        tmpelem = (Element) document.getElementsByTagNameNS(annoNS, "context").item(0);
        String context = tmpelem.getChildNodes().item(0).getNodeValue();
//        MyHelperClass annoNS = new MyHelperClass();
        annoElem.setAttributeNS(annoNS, "a:context", context);
        MyHelperClass alNS = new MyHelperClass();
        NodeList elemcontl = tmpelem.getElementsByTagNameNS(alNS, "context-element");
        Node ncontext_element = null;
        if (elemcontl.getLength() > 0) {
            Node old_context_element = elemcontl.item(0);
            ncontext_element = newdoc.importNode(old_context_element, true);
        }
//        MyHelperClass dubNS = new MyHelperClass();
        tmpndlist = document.getElementsByTagNameNS(dubNS, "title");
//        MyHelperClass dubNS = new MyHelperClass();
        annoElem.setAttributeNS(dubNS, "d:title", tmpndlist.getLength() > 0 ? tmpndlist.item(0).getChildNodes().item(0).getNodeValue() : "Default");
//        MyHelperClass dubNS = new MyHelperClass();
        tmpelem = (Element) document.getElementsByTagNameNS(dubNS, "creator").item(0);
//        MyHelperClass dubNS = new MyHelperClass();
        annoElem.setAttributeNS(dubNS, "d:creator", tmpelem.getChildNodes().item(0).getNodeValue());
//        MyHelperClass annoNS = new MyHelperClass();
        tmpelem = (Element) document.getElementsByTagNameNS(annoNS, "created").item(0);
//        MyHelperClass annoNS = new MyHelperClass();
        annoElem.setAttributeNS(annoNS, "a:created", tmpelem.getChildNodes().item(0).getNodeValue());
//        MyHelperClass dubNS = new MyHelperClass();
        tmpelem = (Element) document.getElementsByTagNameNS(dubNS, "date").item(0);
//        MyHelperClass dubNS = new MyHelperClass();
        annoElem.setAttributeNS(dubNS, "d:date", tmpelem.getChildNodes().item(0).getNodeValue());
//        MyHelperClass dubNS = new MyHelperClass();
        tmpndlist = document.getElementsByTagNameNS(dubNS, "language");
        String language = (tmpndlist.getLength() > 0 ? tmpndlist.item(0).getChildNodes().item(0).getNodeValue() : "en");
//        MyHelperClass dubNS = new MyHelperClass();
        annoElem.setAttributeNS(dubNS, "d:language", language);
//        MyHelperClass rdfNS = new MyHelperClass();
        Node typen = newdoc.importNode(document.getElementsByTagNameNS(rdfNS, "type").item(0), true);
        annoElem.appendChild(typen);
//        MyHelperClass annoNS = new MyHelperClass();
        Element contextn = newdoc.createElementNS(annoNS, "a:context");
//        MyHelperClass rdfNS = new MyHelperClass();
        contextn.setAttributeNS(rdfNS, "r:resource", context);
        annoElem.appendChild(contextn);
//        MyHelperClass annoNS = new MyHelperClass();
        Node annotatesn = newdoc.importNode(document.getElementsByTagNameNS(annoNS, "annotates").item(0), true);
        annoElem.appendChild(annotatesn);
//        MyHelperClass annoNS = new MyHelperClass();
        Element newbodynode = newdoc.createElementNS(annoNS, "a:body");
        annoElem.appendChild(newbodynode);
        if (ncontext_element != null) {
            contextn.appendChild(ncontext_element);
        } else {
            System.out.println("No context element found, we create one...");
            try {
                XPointer xptr = new XPointer(htmldoc);
                NodeRange xprange = xptr.getRange(context, htmldoc);
//                MyHelperClass alNS = new MyHelperClass();
                Element context_elem = newdoc.createElementNS(alNS, "al:context-element");
//                MyHelperClass alNS = new MyHelperClass();
                context_elem.setAttributeNS(alNS, "al:text", xprange.getContentString());
                context_elem.appendChild(newdoc.createTextNode(annoMan.generateContextString(xprange)));
                contextn.appendChild(context_elem);
            } catch (XPointerRangeException e2) {
                e2.printStackTrace();
            }
        }
        WordFreq wf = new WordFreq(annoMan.extractTextFromNode(htmldoc));
//        MyHelperClass alNS = new MyHelperClass();
        Element docident = newdoc.createElementNS(alNS, "al:document-identifier");
        annotatesn.appendChild(docident);
//        MyHelperClass alNS = new MyHelperClass();
        docident.setAttributeNS(alNS, "al:orig-url", ((Element)(Element)(Object) annotatesn).getAttributeNS(rdfNS, "resource"));
//        MyHelperClass alNS = new MyHelperClass();
        docident.setAttributeNS(alNS, "al:version", "1");
        Iterator it = null;
        it = wf.getSortedWordlist();
        Map.Entry ent;
        String word;
        int count;
        int i = 0;
        while (it.hasNext()) {
            ent = (Map.Entry) it.next();
            word = ((String) ent.getKey());
            count = ((Counter) ent.getValue()).count;
            if ((word.length() > 4) && (i < 10)) {
//                MyHelperClass alNS = new MyHelperClass();
                Element wordelem = newdoc.createElementNS(alNS, "al:word");
//                MyHelperClass alNS = new MyHelperClass();
                wordelem.setAttributeNS(alNS, "al:freq", Integer.toString(count));
                wordelem.appendChild(newdoc.createTextNode(word));
                docident.appendChild(wordelem);
                i++;
            }
        }
        try {
            StringWriter strw = new StringWriter();
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
//            MyHelperClass xformer = new MyHelperClass();
            xformer.transform(new DOMSource(newdoc), new StreamResult(strw));
            messagedigest.update(strw.toString().getBytes());
            byte[] md5bytes = messagedigest.digest();
            annohash = "";
            for (int b = 0; b < md5bytes.length; b++) {
                String s = Integer.toHexString(md5bytes[b] & 0xFF);
                annohash = annohash + ((s.length() == 1) ? "0" + s : s);
            }
            this.annohash =(MyHelperClass)(Object) annohash;
            annoElem.setAttribute("xmlns:al", alNS);
            annoElem.setAttributeNS(alNS, "al:id", getAnnohash());
            Location = (baseurl + "/annotation/"(MyHelperClass)(Object) + getAnnohash());
            annoElem.setAttributeNS(rdfNS, "r:about", Location);
            newbodynode.setAttributeNS(rdfNS, "r:resource", baseurl + "/annotation/body/" + getAnnohash());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        annoMan.store(newdoc.getDocumentElement());
        annoMan.createAnnoResource(newdoc.getDocumentElement(), getAnnohash());
        if (htmlNode != null) annoMan.createAnnoBody(htmlNode, getAnnohash());
        Location = (this.baseurl + "/annotation/" + getAnnohash());
        annoElem.setAttributeNS(rdfNS, "r:about", Location);
        this.responseDoc = newdoc;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newDocument(){ return null; }}

class Document {

public MyHelperClass getElementsByTagNameNS(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass createElementNS(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass importNode(Node o0, boolean o1){ return null; }
	public MyHelperClass appendChild(Element o0){ return null; }
	public MyHelperClass createTextNode(String o0){ return null; }}

class AnnotationManager {

public MyHelperClass getTransformer(){ return null; }
	public MyHelperClass extractTextFromNode(Document o0){ return null; }
	public MyHelperClass generateContextString(NodeRange o0){ return null; }
	public MyHelperClass getBuilder(){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Element {

public MyHelperClass getElementsByTagNameNS(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getElementsByTagName(String o0){ return null; }
	public MyHelperClass setAttributeNS(MyHelperClass o0, String o1, String o2){ return null; }
	public MyHelperClass getChildNodes(){ return null; }
	public MyHelperClass appendChild(Node o0){ return null; }
	public MyHelperClass appendChild(Element o0){ return null; }
	public MyHelperClass setAttributeNS(MyHelperClass o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass setAttribute(String o0, MyHelperClass o1){ return null; }}

class Node {

public MyHelperClass appendChild(Element o0){ return null; }}

class XPointer {

XPointer(Document o0){}
	XPointer(){}
	public MyHelperClass getRange(String o0, Document o1){ return null; }}

class NodeRange {

public MyHelperClass getContentString(){ return null; }}

class XPointerRangeException extends Exception{
	public XPointerRangeException(String errorMessage) { super(errorMessage); }
}

class WordFreq {

public MyHelperClass getSortedWordlist(){ return null; }}

class Counter {
public MyHelperClass count;
}

class DOMSource {

DOMSource(Document o0){}
	DOMSource(){}}

class StreamResult {

StreamResult(StringWriter o0){}
	StreamResult(){}}

class TransformerException extends Exception{
	public TransformerException(String errorMessage) { super(errorMessage); }
}
