
import java.io.UncheckedIOException;


class c21295980 {
public MyHelperClass getMediaLocator(){ return null; }

    protected URLConnection openURLConnection() throws IOException {
        final String locator =(String)(Object) getMediaLocator();
        if (locator == null) {
            return null;
        }
        final URL url;
        try {
            url = new URL(locator);
        } catch (UncheckedIOException ex) {
            throw new IllegalArgumentException(ex);
        }
        final URLConnection connection =(URLConnection)(Object) url.openConnection();
        connection.connect();
        return connection;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URLConnection {

public MyHelperClass connect(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
