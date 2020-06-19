
import java.io.UncheckedIOException;


class c18616801 {
public MyHelperClass getAudioURL(){ return null; }

    protected InputStream getAudioStream() {
        InputStream in = null;
        try {
            URL url =(URL)(Object) getAudioURL();
            if (url != null) in =(InputStream)(Object) url.openStream();
        } catch (UncheckedIOException ex) {
            System.err.println(ex);
        }
        return in;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
