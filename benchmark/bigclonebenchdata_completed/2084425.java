
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2084425 {

    private static boolean isUrlResourceExists(final URL url) {
        try {
            InputStream is =(InputStream)(Object) url.openStream();
            try {
                is.close();
            } catch (UncheckedIOException ioe) {
            }
            return true;
        } catch (UncheckedIOException ioe) {
            return false;
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
