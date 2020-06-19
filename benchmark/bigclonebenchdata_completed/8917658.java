
import java.io.UncheckedIOException;


class c8917658 {
public static MyHelperClass close(Reader o0){ return null; }
//public MyHelperClass close(Reader o0){ return null; }

    public static void copyAll(URL url, Writer out) {
        Reader in = null;
        try {
            in =(Reader)(Object) new InputStreamReader(new BufferedInputStream(url.openStream()));
            copyAll((URL)(Object)in, out);
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        } finally {
            close(in);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class Writer {

}

class Reader {

}

class InputStreamReader {

InputStreamReader(BufferedInputStream o0){}
	InputStreamReader(){}}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
