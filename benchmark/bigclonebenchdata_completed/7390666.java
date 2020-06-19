
import java.io.UncheckedIOException;


class c7390666 {

    private Source getStylesheetSource(String stylesheetResource) throws ApplicationContextException {
        MyHelperClass LOG = new MyHelperClass();
        if ((boolean)(Object)LOG.isDebugEnabled()) {
//            MyHelperClass LOG = new MyHelperClass();
            LOG.debug("Loading XSLT stylesheet from " + stylesheetResource);
        }
        try {
            URL url =(URL)(Object) this.getClass().getClassLoader().getResource(stylesheetResource);
            String urlPath = url.toString();
            String systemId = urlPath.substring(0, urlPath.lastIndexOf('/') + 1);
            return (Source)(Object)new StreamSource(url.openStream(), systemId);
        } catch (UncheckedIOException e) {
            throw new RuntimeException("Can't load XSLT stylesheet from " + stylesheetResource, e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class Source {

}

class ApplicationContextException extends Exception{
	public ApplicationContextException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class StreamSource {

StreamSource(){}
	StreamSource(MyHelperClass o0, String o1){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
