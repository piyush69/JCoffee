
import java.io.UncheckedIOException;


class c3990018 {

    private InputStream getStreamFromUrl(URL url, String notFoundMessage) throws ApolloAdapterException {
        InputStream stream = null;
        if (url == null) {
            MyHelperClass filename = new MyHelperClass();
            String message = "Couldn't find url for " + filename;
            MyHelperClass logger = new MyHelperClass();
            logger.error(message);
            throw new ApolloAdapterException(message);
        }
        if (url != null) {
            try {
                stream =(InputStream)(Object) url.openStream();
            } catch (UncheckedIOException e) {
                MyHelperClass logger = new MyHelperClass();
                logger.error(e.getMessage(),(IOException)(Object) e);
                stream = null;
                throw new ApolloAdapterException((String)(Object)e);
            }
        }
        return stream;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class ApolloAdapterException extends Exception{
	public ApolloAdapterException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
