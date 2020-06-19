
import java.io.UncheckedIOException;


class c22913402 {

    protected Properties load(URL url) {
        try {
            InputStream i =(InputStream)(Object) url.openStream();
            Properties p = new Properties();
            p.load(i);
            i.close();
            return p;
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class Properties {

public MyHelperClass load(InputStream o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
