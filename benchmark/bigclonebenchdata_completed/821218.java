
import java.io.UncheckedIOException;


class c821218 {
public MyHelperClass load(InputStream o0){ return null; }

    public void Configuration(URL url) {
        InputStream in = null;
        try {
            load(in =(InputStream)(Object) url.openStream());
        } catch (Exception e) {
            throw new RuntimeException("Could not load configuration from " + url, e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (UncheckedIOException ignore) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
