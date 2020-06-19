
import java.io.UncheckedIOException;


class c8831187 {
public static MyHelperClass getResourceRelative(String o0, Class o1){ return null; }
//public MyHelperClass getResourceRelative(String o0, Class o1){ return null; }

    public static InputStream getResourceRelativeAsStream(final String name, final Class context) {
        final URL url =(URL)(Object) getResourceRelative(name, context);
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
