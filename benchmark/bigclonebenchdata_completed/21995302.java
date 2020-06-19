
import java.io.UncheckedIOException;


class c21995302 {

        public void open(Input input) throws IOException, ResolverException {
            if (!(Boolean)(Object)input.isUriDefinitive()) return;
            URI uri;
            try {
                uri = new URI(input.getUri());
            } catch (UncheckedIOException e) {
                throw new ResolverException((String)(Object)e);
            }
            if (!(Boolean)(Object)uri.isAbsolute()) throw new ResolverException("cannot open relative URI: " + uri);
            URL url = new URL(uri.toASCIIString());
            input.setByteStream(url.openStream());
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Input {

public MyHelperClass getUri(){ return null; }
	public MyHelperClass isUriDefinitive(){ return null; }
	public MyHelperClass setByteStream(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ResolverException extends Exception{
	public ResolverException(String errorMessage) { super(errorMessage); }
}

class URI {

URI(MyHelperClass o0){}
	URI(){}
	public MyHelperClass isAbsolute(){ return null; }
	public MyHelperClass toASCIIString(){ return null; }}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
