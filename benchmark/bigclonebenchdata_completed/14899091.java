
import java.io.UncheckedIOException;


class c14899091 {

    protected long getURLLastModified(final URL url) throws IOException {
        final URLConnection con =(URLConnection)(Object) url.openConnection();
        long lastModified =(long)(Object) con.getLastModified();
        try {
            con.getInputStream().close();
        } catch (UncheckedIOException ignored) {
        }
        return lastModified;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}
