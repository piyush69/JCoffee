
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14247203 {

    private Reader getReader(String uri, Query query) throws SourceException {
        MyHelperClass OntoramaConfig = new MyHelperClass();
        if ((boolean)(Object)OntoramaConfig.DEBUG) {
            System.out.println("uri = " + uri);
        }
        InputStreamReader reader = null;
        try {
            System.out.println("class UrlSource, uri = " + uri);
            URL url = new URL(uri);
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            reader = new InputStreamReader(connection.getInputStream());
        } catch (UncheckedIOException urlExc) {
            throw new SourceException("Url " + uri + " specified for this ontology source is not well formed, error: " + urlExc.getMessage());
        } catch (ArithmeticException ioExc) {
            throw new SourceException("Couldn't read input data source for " + uri + ", error: " + ioExc.getMessage());
        }
        return (Reader)(Object)reader;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEBUG;
}

class Query {

}

class Reader {

}

class SourceException extends Exception{
	public SourceException(String errorMessage) { super(errorMessage); }
}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
