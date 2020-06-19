
import java.io.UncheckedIOException;


class c21879268 {
public MyHelperClass Locators;
	public MyHelperClass log;

    protected InputSource defaultResolveEntity(String publicId, String systemId) throws SAXException {
        if (systemId == null) return null;
        if (systemId.indexOf("file:/") >= 0) {
            try {
                final InputSource is = new InputSource(new URL(systemId).openStream());
                is.setSystemId(systemId);
                MyHelperClass D = new MyHelperClass();
                if ((Boolean)(Object)D.ON && (Boolean)(Object)log.finerable()) log.finer("Entity found " + systemId);
                return is;
            } catch (Exception ex) {
                MyHelperClass D = new MyHelperClass();
                if ((Boolean)(Object)D.ON && (Boolean)(Object)log.finerable()) log.finer("Unable to open " + systemId);
            }
        }
        final String PREFIX = "/metainfo/xml";
        final Locator loader =(Locator)(Object) Locators.getDefault();
        URL url = null;
        int j = systemId.indexOf("://");
        if (j > 0) {
            final String resId = PREFIX + systemId.substring(j + 2);
            url =(URL)(Object) loader.getResource(resId);
        }
        if (url == null) {
            j = systemId.lastIndexOf('/');
            final String resId = j >= 0 ? PREFIX + systemId.substring(j) : PREFIX + '/' + systemId;
            url =(URL)(Object) loader.getResource(resId);
        }
        if (url != null) {
            MyHelperClass D = new MyHelperClass();
            if ((Boolean)(Object)D.ON && (Boolean)(Object)log.finerable()) log.finer("Entity resovled to " + url);
            try {
                final InputSource is = new InputSource(url.openStream());
                is.setSystemId((String)(Object)url.toExternalForm());
                return is;
            } catch (UncheckedIOException ex) {
                throw new SAXException((String)(Object)ex);
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ON;
public MyHelperClass getDefault(){ return null; }
	public MyHelperClass finerable(){ return null; }
	public MyHelperClass finer(String o0){ return null; }}

class InputSource {

InputSource(){}
	InputSource(MyHelperClass o0){}
	public MyHelperClass setSystemId(String o0){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass toExternalForm(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Locator {

public MyHelperClass getResource(String o0){ return null; }}
