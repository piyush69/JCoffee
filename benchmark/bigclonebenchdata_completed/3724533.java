
import java.io.UncheckedIOException;


class c3724533 {
public static MyHelperClass getDocumentBuilder(){ return null; }
//public MyHelperClass getDocumentBuilder(){ return null; }

    public static Document getDocument(URL url) throws Exception {
        InputStream is = null;
        try {
            is =(InputStream)(Object) new BufferedInputStream(url.openStream());
            return(Document)(Object) getDocumentBuilder().parse(is);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (UncheckedIOException e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass parse(InputStream o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Document {

}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
