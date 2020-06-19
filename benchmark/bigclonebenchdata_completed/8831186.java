
import java.io.UncheckedIOException;


class c8831186 {
public static MyHelperClass getResource(String o0, Class o1){ return null; }
//public MyHelperClass getResource(String o0, Class o1){ return null; }

    public static InputStream getResourceAsStream(final String name, final Class context) {
        final URL url =(URL)(Object) getResource(name, context);
        if (url == null) {
            return null;
        }
        try {
            return(InputStream)(Object) url.openStream();
        } catch (UncheckedIOException e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
