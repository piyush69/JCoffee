
import java.io.UncheckedIOException;


class c4123407 {
public MyHelperClass handleDocument(Document o0){ return null; }
	public MyHelperClass getTextContent(Element o0){ return null; }

    private void handleInclude(Element elem) throws Exception {
        String source =(String)(Object) getTextContent(elem);
        URL url = null;
        try {
            url = new URL(source);
        } catch (UncheckedIOException e) {
            url =(URL)(Object) XmlConfig.class.getResource(source);
        }
        MyHelperClass db = new MyHelperClass();
        Document doc =(Document)(Object) db.parse(url.openStream());
        handleDocument(doc);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass parse(MyHelperClass o0){ return null; }}

class Element {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class XmlConfig {

}

class Document {

}
