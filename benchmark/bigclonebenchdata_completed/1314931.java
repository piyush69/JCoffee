
import java.io.UncheckedIOException;


class c1314931 {

    private InputStream classpathStream(String path) {
        InputStream in = null;
        URL url =(URL)(Object) getClass().getClassLoader().getResource(path);
        if (url != null) {
            try {
                in =(InputStream)(Object) url.openStream();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
        return in;
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
