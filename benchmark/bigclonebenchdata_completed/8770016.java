
import java.io.UncheckedIOException;


class c8770016 {
public MyHelperClass getURL(String o0){ return null; }

    public InputStream loadResource(String location) throws GenericConfigException {
        URL url =(URL)(Object) getURL(location);
        try {
            return(InputStream)(Object) url.openStream();
        } catch (java.io.UncheckedIOException e) {
            throw new GenericConfigException("Error opening URL resource at location [" + url.toExternalForm() + "]",(IOException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

}

class GenericConfigException extends Exception{
	public GenericConfigException(String errorMessage) { super(errorMessage); }
	GenericConfigException(String o0, IOException o1){}
	GenericConfigException(){}
}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass toExternalForm(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
