
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22305828 {

    protected InputSource getInputSource(String pReferencingSystemId, String pURI) throws SAXException {
        URL url = null;
        if (pReferencingSystemId != null) {
            try {
                url = new URL(new URL(pReferencingSystemId), pURI);
            } catch (UncheckedIOException e) {
            }
            if (url == null) {
                try {
                    url =(URL)(Object) (new File(new File(pReferencingSystemId).getParentFile(), pURI).toURL());
                } catch (UncheckedIOException e) {
                }
            }
        }
        if (url == null) {
            try {
                url = new URL(pURI);
            } catch (UncheckedIOException e) {
                try {
                    url =(URL)(Object) (new File(pURI).toURL());
                } catch (UncheckedIOException f) {
                    throw new SAXException("Failed to parse the URI " + pURI);
                }
            }
        }
        try {
            InputSource isource = new InputSource(url.openStream());
            isource.setSystemId(url.toString());
            return isource;
        } catch (UncheckedIOException e) {
            throw new SAXException("Failed to open the URL " + url,(IOException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputSource {

InputSource(){}
	InputSource(MyHelperClass o0){}
	public MyHelperClass setSystemId(String o0){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
	SAXException(){}
	SAXException(String o0, IOException o1){}
}

class URL {

URL(String o0){}
	URL(URL o0, String o1){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass toURL(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
