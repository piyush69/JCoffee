
import java.io.UncheckedIOException;


class c22289763 {

    InputStream openReader(String s) {
        System.err.println("Fetcher: trying url " + s);
        try {
            URL url = new URL(s);
            HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            return(InputStream)(Object) url.openStream();
        } catch (UncheckedIOException e) {
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
