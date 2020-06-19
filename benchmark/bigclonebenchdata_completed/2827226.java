


class c2827226 {
public MyHelperClass debug;

    public InputSource resolveEntity(String publicId, String systemId) {
        boolean allowXMLCatalogPI;// = new boolean();
        allowXMLCatalogPI = false;
        MyHelperClass catalogResolver = new MyHelperClass();
        String resolved =(String)(Object) catalogResolver.getResolvedEntity(publicId, systemId);
        MyHelperClass piCatalogResolver = new MyHelperClass();
        if (resolved == null && piCatalogResolver != null) {
//            MyHelperClass piCatalogResolver = new MyHelperClass();
            resolved =(String)(Object) piCatalogResolver.getResolvedEntity(publicId, systemId);
        }
        if (resolved != null) {
            try {
                InputSource iSource = new InputSource(resolved);
                iSource.setPublicId(publicId);
                URL url = new URL(resolved);
                InputStream iStream =(InputStream)(Object) url.openStream();
                iSource.setByteStream(iStream);
                return iSource;
            } catch (Exception e) {
                debug.message(1, "Failed to create InputSource", resolved);
                return null;
            }
        } else {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResolvedEntity(String o0, String o1){ return null; }
	public MyHelperClass message(int o0, String o1, String o2){ return null; }}

class InputSource {

InputSource(String o0){}
	InputSource(){}
	public MyHelperClass setByteStream(InputStream o0){ return null; }
	public MyHelperClass setPublicId(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}
