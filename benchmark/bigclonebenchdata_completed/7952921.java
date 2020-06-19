
import java.io.UncheckedIOException;


class c7952921 {
public static MyHelperClass getURL(String o0){ return null; }
//public MyHelperClass getURL(String o0){ return null; }

    public static OutputStream getOutputStream(String path) throws ResourceException {
        URL url =(URL)(Object) getURL(path);
        if (url != null) {
            try {
                return(OutputStream)(Object) url.openConnection().getOutputStream();
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

public MyHelperClass getOutputStream(){ return null; }}

class OutputStream {

}

class ResourceException extends Exception{
	public ResourceException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
