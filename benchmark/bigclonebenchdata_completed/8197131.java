
import java.io.UncheckedIOException;


class c8197131 {
public static MyHelperClass LOGGER;
	public static MyHelperClass getResource(String o0, Object o1, boolean o2){ return null; }
//public MyHelperClass LOGGER;
//	public MyHelperClass getResource(String o0, Object o1, boolean o2){ return null; }

    private static InputStream getResourceAsStream(String pResourcePath, Object pResourceLoader, boolean pThrow) {
        URL url =(URL)(Object) getResource(pResourcePath, pResourceLoader, pThrow);
        InputStream stream = null;
        if (url != null) {
            try {
                stream =(InputStream)(Object) url.openStream();
            } catch (UncheckedIOException e) {
                LOGGER.warn(null,(IOException)(Object) e);
            }
        }
        return stream;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(Object o0, IOException o1){ return null; }}

class InputStream {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
