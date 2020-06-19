import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c7254343 {
public MyHelperClass query;
	public MyHelperClass EXIST_SERVER;
	public MyHelperClass parser;
	public MyHelperClass getOut(){ return null; }

    public void manageRequest(Transformer transformer) throws ServletException {
        try {
            this.parser.reset();
            String encodedQuery = URLEncoder.encode((String)(Object)this.query, "ISO-8859-1");
            URL url = new URL(EXIST_SERVER + "?_query=" + encodedQuery);
            InputStream in = url.openStream();
            Document doc =(Document)(Object) this.parser.parse(in);
            Source source =(Source)(Object) new DOMSource(doc);
            transformer.transform(source, new StreamResult(this.getOut()));
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass parse(InputStream o0){ return null; }
	public MyHelperClass reset(){ return null; }}

class Transformer {

public MyHelperClass transform(Source o0, StreamResult o1){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class Document {

}

class Source {

}

class DOMSource {

DOMSource(){}
	DOMSource(Document o0){}}

class StreamResult {

StreamResult(MyHelperClass o0){}
	StreamResult(){}}

class TransformerException extends Exception{
	public TransformerException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
