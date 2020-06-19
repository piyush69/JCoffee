
import java.io.UncheckedIOException;


class c16646632 {
public static MyHelperClass getResource(int o0){ return null; }
//public MyHelperClass getResource(int o0){ return null; }

    public static BufferedReader getReader(int license) {
        URL url =(URL)(Object) getResource(license);
        if (url == null) return null;
        InputStream inStream;
        try {
            inStream =(InputStream)(Object) url.openStream();
        } catch (UncheckedIOException e) {
            return null;
        }
        return new BufferedReader(new InputStreamReader(inStream));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
