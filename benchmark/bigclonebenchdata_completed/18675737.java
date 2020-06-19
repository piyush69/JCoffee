import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c18675737 {
public MyHelperClass IOUtils;
	public MyHelperClass blogId;
	public MyHelperClass Atom;
	public MyHelperClass xml2ascii;
	public MyHelperClass AuthToken;
	public MyHelperClass domBuilder;
	public MyHelperClass GDataVersion;
	public MyHelperClass getHttpClient(){ return null; }

    private void post(String title, Document content, Set<String> tags) throws HttpException, IOException, TransformerException {
        PostMethod method = null;
        try {
            method = new PostMethod("http://www.blogger.com/feeds/" + this.blogId + "/posts/default");
            method.addRequestHeader("GData-Version", String.valueOf(GDataVersion));
            method.addRequestHeader("Authorization", "GoogleLogin auth=" + this.AuthToken);
            Document dom =(Document)(Object) this.domBuilder.newDocument();
            Element entry =(Element)(Object) dom.createElementNS(Atom.NS, "entry");
            dom.appendChild(entry);
            entry.setAttribute("xmlns",(String)(Object) Atom.NS);
            Element titleNode =(Element)(Object) dom.createElementNS(Atom.NS, "title");
            entry.appendChild(titleNode);
            titleNode.setAttribute("type", "text");
            titleNode.appendChild((Element)(Object)dom.createTextNode(title));
            Element contentNode =(Element)(Object) dom.createElementNS(Atom.NS, "content");
            entry.appendChild(contentNode);
            contentNode.setAttribute("type", "xhtml");
            contentNode.appendChild((Element)(Object)dom.importNode(content.getDocumentElement(), true));
            for (String tag : tags) {
                Element category =(Element)(Object) dom.createElementNS(Atom.NS, "category");
                category.setAttribute("scheme", "http://www.blogger.com/atom/ns#");
                category.setAttribute("term", tag);
                entry.appendChild(category);
            }
            StringWriter out = new StringWriter();
            this.xml2ascii.transform(new DOMSource(dom), new StreamResult(out));
            method.setRequestEntity(new StringRequestEntity(out.toString(), "application/atom+xml", "UTF-8"));
            int status =(int)(Object) getHttpClient().executeMethod(method);
            if (status == 201) {
                IOUtils.copyTo(method.getResponseBodyAsStream(), System.out);
            } else {
                throw new HttpException("post returned http-code=" + status + " expected 201 (CREATE)");
            }
        } catch (UncheckedIOException err) {
            throw err;
        } catch (HttpException err) {
            throw err;
        } catch (ArithmeticException err) {
            throw err;
        } finally {
            if (method != null) method.releaseConnection();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NS;
public MyHelperClass newDocument(){ return null; }
	public MyHelperClass executeMethod(PostMethod o0){ return null; }
	public MyHelperClass copyTo(MyHelperClass o0, PrintStream o1){ return null; }
	public MyHelperClass transform(DOMSource o0, StreamResult o1){ return null; }}

class Document {

public MyHelperClass createTextNode(String o0){ return null; }
	public MyHelperClass appendChild(Element o0){ return null; }
	public MyHelperClass getDocumentElement(){ return null; }
	public MyHelperClass createElementNS(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass importNode(MyHelperClass o0, boolean o1){ return null; }}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}

class TransformerException extends Exception{
	public TransformerException(String errorMessage) { super(errorMessage); }
}

class PostMethod {

PostMethod(String o0){}
	PostMethod(){}
	public MyHelperClass releaseConnection(){ return null; }
	public MyHelperClass addRequestHeader(String o0, String o1){ return null; }
	public MyHelperClass setRequestEntity(StringRequestEntity o0){ return null; }
	public MyHelperClass getResponseBodyAsStream(){ return null; }}

class Element {

public MyHelperClass setAttribute(String o0, String o1){ return null; }
	public MyHelperClass appendChild(Element o0){ return null; }}

class DOMSource {

DOMSource(){}
	DOMSource(Document o0){}}

class StreamResult {

StreamResult(StringWriter o0){}
	StreamResult(){}}

class StringRequestEntity {

StringRequestEntity(String o0, String o1, String o2){}
	StringRequestEntity(){}}
