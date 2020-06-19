
import java.io.UncheckedIOException;


class c22422244 {

    protected Source getStylesheetSource(Resource stylesheetLocation) throws ApplicationContextException {
        MyHelperClass logger = new MyHelperClass();
        if ((boolean)(Object)logger.isDebugEnabled()) {
//            MyHelperClass logger = new MyHelperClass();
            logger.debug("Loading XSLT stylesheet from " + stylesheetLocation);
        }
        try {
            URL url =(URL)(Object) stylesheetLocation.getURL();
            String urlPath = url.toString();
            String systemId = urlPath.substring(0, urlPath.lastIndexOf('/') + 1);
            return (Source)(Object)new StreamSource(url.openStream(), systemId);
        } catch (UncheckedIOException ex) {
            throw new ApplicationContextException("Can't load XSLT stylesheet from " + stylesheetLocation,(IOException)(Object) ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class Resource {

public MyHelperClass getURL(){ return null; }}

class Source {

}

class ApplicationContextException extends Exception{
	public ApplicationContextException(String errorMessage) { super(errorMessage); }
	ApplicationContextException(){}
	ApplicationContextException(String o0, IOException o1){}
}

class URL {

public MyHelperClass openStream(){ return null; }}

class StreamSource {

StreamSource(){}
	StreamSource(MyHelperClass o0, String o1){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
