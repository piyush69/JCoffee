
import java.io.UncheckedIOException;


class c4948580 {
public MyHelperClass getResource(String o0){ return null; }

        public InputStream getResourceAsStream(String path) {
            try {
                URL url =(URL)(Object) getResource(path);
                if (url != null) {
                    return(InputStream)(Object) url.openStream();
                } else {
                    return null;
                }
            } catch (UncheckedIOException ioe) {
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
