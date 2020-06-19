
import java.io.UncheckedIOException;


class c9935769 {
public static MyHelperClass findResource(String o0){ return null; }
//public MyHelperClass findResource(String o0){ return null; }

    public static InputSource openInputSource(String resource) {
        InputSource src = null;
        URL url =(URL)(Object) findResource(resource);
        if (url != null) {
            try {
                InputStream in =(InputStream)(Object) url.openStream();
                src = new InputSource(in);
                src.setSystemId(url.toExternalForm());
            } catch (UncheckedIOException e) {
            }
        }
        return src;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}
	public MyHelperClass setSystemId(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass toExternalForm(){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
