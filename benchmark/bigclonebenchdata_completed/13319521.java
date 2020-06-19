
import java.io.UncheckedIOException;


class c13319521 {

    protected void loadXmlFromUri(URI uri) {
        URLConnection urlc;
        try {
            urlc =(URLConnection)(Object) uri.toURL().openConnection();
            InputStream is =(InputStream)(Object) urlc.getInputStream();
            Reader rd =(Reader)(Object) new InputStreamReader(is);
            StreamSource xmlSource;// = new StreamSource();
            xmlSource = new StreamSource(rd);
        } catch (UncheckedIOException ioe) {
            ioe.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }}

class URI {

public MyHelperClass toURL(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class Reader {

}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class StreamSource {

StreamSource(){}
	StreamSource(Reader o0){}}
