
import java.io.UncheckedIOException;


class c9626364 {

    public static Document getDocument(URL url, EntityResolver resolver, boolean validating) throws IllegalArgumentException, IOException {
        if (url == null) throw new IllegalArgumentException("URL is null");
        InputStream is = null;
        try {
            is =(InputStream)(Object) url.openStream();
            InputSource source = new InputSource(is);
            source.setSystemId(url.toString());
            return getDocument((URL)(Object)source, resolver, validating);
        } finally {
            try {
                if (is != null) is.close();
            } catch (UncheckedIOException ioe) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class EntityResolver {

}

class Document {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}
	public MyHelperClass setSystemId(String o0){ return null; }}
