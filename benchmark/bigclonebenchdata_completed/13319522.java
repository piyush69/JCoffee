
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13319522 {
public MyHelperClass factory;

    protected void loadXslFromUri(URI uri) {
        URLConnection urlc;
        try {
            urlc =(URLConnection)(Object) uri.toURL().openConnection();
            InputStream is =(InputStream)(Object) urlc.getInputStream();
            Reader rd =(Reader)(Object) new InputStreamReader(is);
            Source xslSource =(Source)(Object) new StreamSource(rd);
            try {
                MyHelperClass xslTemplate = new MyHelperClass();
                xslTemplate = factory.newTemplates(xslSource);
            } catch (UncheckedIOException tce) {
                tce.printStackTrace();
            }
        } catch (UncheckedIOException ioe) {
            ioe.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass newTemplates(Source o0){ return null; }}

class URI {

public MyHelperClass toURL(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class Reader {

}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class Source {

}

class StreamSource {

StreamSource(Reader o0){}
	StreamSource(){}}

class TransformerConfigurationException extends Exception{
	public TransformerConfigurationException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
