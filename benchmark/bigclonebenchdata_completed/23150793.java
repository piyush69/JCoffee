
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23150793 {

    private boolean canReadSource(String fileURL) {
        URL url;
        try {
            url = new URL(fileURL);
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Error accessing URL " + fileURL + ".");
            return false;
        }
        InputStream is;
        try {
            is =(InputStream)(Object) url.openStream();
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Error creating Input Stream from URL '" + fileURL + "'.");
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
