
import java.io.UncheckedIOException;


class c22621958 {
public MyHelperClass findResource(String o0){ return null; }

    public InputStream getResourceAsStream(String name) {
        MyHelperClass parent = new MyHelperClass();
        InputStream is =(InputStream)(Object) parent.getResourceAsStream(name);
        if (is == null) {
            URL url =(URL)(Object) findResource(name);
            if (url != null) {
                try {
                    is =(InputStream)(Object) url.openStream();
                } catch (UncheckedIOException e) {
                    is = null;
                }
            }
        }
        return is;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResourceAsStream(String o0){ return null; }}

class InputStream {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
