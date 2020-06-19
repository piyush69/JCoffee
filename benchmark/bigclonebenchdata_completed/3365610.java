import java.io.*;
import java.lang.*;
import java.util.*;



class c3365610 {
public MyHelperClass NULL;

    private HTMLDocument fetchDocument(String urlString) throws MalformedURLException, IOException {
        try {
            URL url = new URL(urlString);
            HTMLEditorKit kit = new HTMLEditorKit();
            HTMLDocument doc =(HTMLDocument)(Object) NULL; //new HTMLDocument();
            doc = (HTMLDocument)(HTMLDocument)(Object) kit.createDefaultDocument();
//            MyHelperClass doc = new MyHelperClass();
            doc.putProperty("IgnoreCharsetDirective", Boolean.TRUE);
            URLConnection con =(URLConnection)(Object) url.openConnection();
            con.setConnectTimeout(5000);
            con.connect();
            Reader reader = new InputStreamReader((InputStream)(Object)con.getInputStream());
//            MyHelperClass doc = new MyHelperClass();
            kit.read(reader,(MyHelperClass)(Object) doc, 0);
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(e.getLocalizedMessage());
        }
        MyHelperClass doc = new MyHelperClass();
        return (HTMLDocument)(Object)doc;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass putProperty(String o0, Boolean o1){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class HTMLDocument {

public MyHelperClass putProperty(String o0, Boolean o1){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class HTMLEditorKit {

public MyHelperClass createDefaultDocument(){ return null; }
	public MyHelperClass read(Reader o0, MyHelperClass o1, int o2){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }
	public MyHelperClass connect(){ return null; }}

class BadLocationException extends Exception{
	public BadLocationException(String errorMessage) { super(errorMessage); }
}
