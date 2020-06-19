
import java.io.UncheckedIOException;


class c12579075 {
public static MyHelperClass newInstance(DOMRetriever o0){ return null; }
//public MyHelperClass newInstance(DOMRetriever o0){ return null; }

    public static XMLConfigurator loadFromSystemProperty(String propertyName) throws IOException {
        String urlStr = System.getProperty(propertyName);
        if (urlStr == null || urlStr.length() == 0) {
            return null;
        }
        InputStream in = null;
        DOMRetriever xmlDoc = null;
        try {
            URL url = new URL(urlStr);
            xmlDoc = new DOMRetriever(in =(InputStream)(Object) url.openStream());
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        } finally {
            if (in != null) in.close();
        }
        return(XMLConfigurator)(Object) newInstance(xmlDoc);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class XMLConfigurator {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class DOMRetriever {

DOMRetriever(InputStream o0){}
	DOMRetriever(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
