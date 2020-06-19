
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2306483 {

    private InputStream getConnection(final String url) {
        InputStream is = null;
        try {
            final URLConnection conn =(URLConnection)(Object) (new URL(url).openConnection());
            is =(InputStream)(Object) conn.getInputStream();
        } catch (final UncheckedIOException e) {
            e.printStackTrace();
        } catch (final ArithmeticException e) {
            e.printStackTrace();
        }
        return is;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
