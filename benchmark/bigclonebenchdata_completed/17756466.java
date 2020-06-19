
import java.io.UncheckedIOException;


class c17756466 {
public MyHelperClass readModels(InputSource o0){ return null; }

    public synchronized void readModels(URL url, XmiExtensionParser xmiExtensionParser) throws OpenException {
        MyHelperClass LOG = new MyHelperClass();
        LOG.info("=======================================");
//        MyHelperClass LOG = new MyHelperClass();
        LOG.info("== READING MODEL " + url);
        try {
            InputSource source = new InputSource(new XmiInputStream(url.openStream(), xmiExtensionParser, 100000, null));
            source.setSystemId(url.toString());
            readModels(source);
        } catch (UncheckedIOException ex) {
            throw new OpenException((String)(Object)ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class XmiExtensionParser {

}

class OpenException extends Exception{
	public OpenException(String errorMessage) { super(errorMessage); }
}

class InputSource {

InputSource(XmiInputStream o0){}
	InputSource(){}
	public MyHelperClass setSystemId(String o0){ return null; }}

class XmiInputStream {

XmiInputStream(MyHelperClass o0, XmiExtensionParser o1, int o2, Object o3){}
	XmiInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
