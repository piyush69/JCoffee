
import java.io.UncheckedIOException;


class c3732503 {
public MyHelperClass KMZ_MIME_TYPE;
	public MyHelperClass WWIO;

    protected KMLRoot parseCachedKMLFile(URL url, String linkBase, String contentType, boolean namespaceAware) throws IOException, XMLStreamException {
        KMLDoc kmlDoc;
        InputStream refStream =(InputStream)(Object) url.openStream();
        if (KMZ_MIME_TYPE.equals(contentType)) kmlDoc =(KMLDoc)(Object) new KMZInputStream(refStream); else kmlDoc =(KMLDoc)(Object) new KMLInputStream(refStream, WWIO.makeURI(linkBase));
        try {
            KMLRoot refRoot = new KMLRoot(kmlDoc, namespaceAware);
            refRoot.parse();
            return refRoot;
        } catch (UncheckedIOException e) {
            refStream.close();
            throw e;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass makeURI(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class KMLRoot {

KMLRoot(){}
	KMLRoot(KMLDoc o0, boolean o1){}
	public MyHelperClass parse(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class XMLStreamException extends Exception{
	public XMLStreamException(String errorMessage) { super(errorMessage); }
}

class KMLDoc {

}

class InputStream {

public MyHelperClass close(){ return null; }}

class KMZInputStream {

KMZInputStream(InputStream o0){}
	KMZInputStream(){}}

class KMLInputStream {

KMLInputStream(InputStream o0, MyHelperClass o1){}
	KMLInputStream(){}}
