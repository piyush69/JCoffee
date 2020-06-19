
import java.io.UncheckedIOException;


class c1858117 {
public MyHelperClass drain;

    public void putChunk(String chunk) throws JacsonException {
        try {
            URL url = new URL(chunk);
            InputStream is =(InputStream)(Object) url.openStream();
            MyHelperClass inverse = new MyHelperClass();
            if ((boolean)(Object)inverse) drain.putChunk(chunk);
            is.close();
        } catch (UncheckedIOException broken) {
            MyHelperClass inverse = new MyHelperClass();
            if (!(Boolean)(Object)inverse) drain.putChunk(chunk);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass putChunk(String o0){ return null; }}

class JacsonException extends Exception{
	public JacsonException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
