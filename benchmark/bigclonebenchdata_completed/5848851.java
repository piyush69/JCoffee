
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5848851 {

    private static InputStream stream(String input) {
        try {
            MyHelperClass URIFactory = new MyHelperClass();
            if (input.startsWith("http://")) return(InputStream)(Object) URIFactory.url(input).openStream(); else return stream((String)(Object)new File(input));
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass url(String o0){ return null; }
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}}
