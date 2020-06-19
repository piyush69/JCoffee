
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9929396 {
public MyHelperClass useAuthorization(){ return null; }
	public MyHelperClass getBasicAuthorizationString(){ return null; }

    private Element returnAnnoBody(final String url) {
        DOMParser parser = new DOMParser();
        try {
            URL bodyURL = new URL(url);
            URLConnection url_con =(URLConnection)(Object) bodyURL.openConnection();
            if ((boolean)(Object)useAuthorization()) {
                url_con.setRequestProperty("Authorization", "Basic " + getBasicAuthorizationString());
            }
            InputStream content =(InputStream)(Object) url_con.getInputStream();
            InputSource insource = new InputSource(content);
            parser.parse(insource);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return null;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return null;
        }
        Document annodoc =(Document)(Object) parser.getDocument();
        return(Element)(Object) annodoc.getDocumentElement();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Element {

}

class DOMParser {

public MyHelperClass parse(InputSource o0){ return null; }
	public MyHelperClass getDocument(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class InputSource {

InputSource(){}
	InputSource(InputStream o0){}}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Document {

public MyHelperClass getDocumentElement(){ return null; }}
