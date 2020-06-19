


class c1848738 {
public MyHelperClass getCisUtils(){ return null; }

    public InputSource resolveEntity(String pPublicId, String pSystemId) throws SAXException, IOException {
        getCisUtils().debug("Resolving entity publicId=" + pPublicId + ", systemId=" + pSystemId);
        final String res;
        if ("-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN".equals(pPublicId)) {
            res = "resources/web-app_2_3.dtd";
        } else {
            return null;
        }
        URL url =(URL)(Object) getClass().getResource(res);
        if (url == null) {
            throw new SAXException("Failed to locate resource: " + res);
        }
        InputSource isource = new InputSource(url.openStream());
        isource.setSystemId(url.toExternalForm());
        return isource;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}

class InputSource {

InputSource(MyHelperClass o0){}
	InputSource(){}
	public MyHelperClass setSystemId(MyHelperClass o0){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass toExternalForm(){ return null; }}
