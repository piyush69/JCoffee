
import java.io.UncheckedIOException;


class c21009956 {

//    @Override
    public Reader openReader(final Charset charset) throws LocatorException {
        try {
            if (charset != null) {
                MyHelperClass url = new MyHelperClass();
                return (Reader)(Object)new InputStreamReader(url.openStream(), charset);
            }
            MyHelperClass url = new MyHelperClass();
            return (Reader)(Object)new InputStreamReader(url.openStream());
        } catch (final UncheckedIOException e) {
            MyHelperClass url = new MyHelperClass();
            throw new LocatorException("Failed to read from URL: " + url,(IOException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }}

class Charset {

}

class Reader {

}

class LocatorException extends Exception{
	public LocatorException(String errorMessage) { super(errorMessage); }
	LocatorException(String o0, IOException o1){}
	LocatorException(){}
}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, Charset o1){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
