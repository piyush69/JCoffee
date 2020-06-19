
import java.io.UncheckedIOException;


class c19606201 {

    public static Collection readXML(Bundle declaringBundle, URL url) throws XmlPullParserException {
        try {
            return readXML(declaringBundle,(URL)(Object) url.openStream());
        } catch (UncheckedIOException e) {
            throw new XmlPullParserException("Could not open \"" + url + "\" got exception:" + e.getLocalizedMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Bundle {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class Collection {

}

class XmlPullParserException extends Exception{
	public XmlPullParserException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
