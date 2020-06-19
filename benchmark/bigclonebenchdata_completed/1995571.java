
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1995571 {

    protected Source resolveRepositoryURI(String path) throws TransformerException {
        Source resolvedSource = null;
        try {
            if (path != null) {
                URL url = new URL(path);
                InputStream in =(InputStream)(Object) url.openStream();
                if (in != null) {
                    resolvedSource =(Source)(Object) new StreamSource(in);
                }
            } else {
                throw new TransformerException("Resource does not exist. \"" + path + "\" is not accessible.");
            }
        } catch (UncheckedIOException mfue) {
            throw new TransformerException("Error accessing resource using servlet context: " + path,(IOException)(Object) mfue);
        } catch (ArithmeticException ioe) {
            throw new TransformerException("Unable to access resource at: " + path,(IOException)(Object) ioe);
        }
        return resolvedSource;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Source {

}

class TransformerException extends Exception{
	public TransformerException(String errorMessage) { super(errorMessage); }
	TransformerException(){}
	TransformerException(String o0, IOException o1){}
	TransformerException(String o0, MalformedURLException o1){}
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class StreamSource {

StreamSource(){}
	StreamSource(InputStream o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
