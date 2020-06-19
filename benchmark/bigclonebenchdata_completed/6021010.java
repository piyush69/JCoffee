
import java.io.UncheckedIOException;


class c6021010 {

    public static Dictionary parseVertices(URL url, Graph g) throws FileNotFoundException, FlightException {
        InputStream is = null;
        try {
            is =(InputStream)(Object) url.openStream();
        } catch (UncheckedIOException e) {
            throw new FlightException("IO Error: cannot read from URL " + url.toString());
        }
        Reader reader =(Reader)(Object) new BufferedReader(new InputStreamReader(is));
        MyHelperClass Parser = new MyHelperClass();
        return(Dictionary)(Object) Parser.parseVertices(reader, g);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass parseVertices(Reader o0, Graph o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Graph {

}

class Dictionary {

}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class FlightException extends Exception{
	public FlightException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Reader {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
