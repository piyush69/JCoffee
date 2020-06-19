
import java.io.UncheckedIOException;


class c7952920 {
public static MyHelperClass getURL(String o0){ return null; }
//public MyHelperClass getURL(String o0){ return null; }

    public static InputStream getInputStream(String path) throws ResourceException {
        URL url =(URL)(Object) getURL(path);
        if (url != null) {
            try {
                return(InputStream)(Object) url.openConnection().getInputStream();
            } catch (UncheckedIOException e) {
                throw new ResourceException((String)(Object)e);
            }
        } else {
            throw new ResourceException("Error obtaining resource, invalid path: " + path);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class ResourceException extends Exception{
	public ResourceException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
