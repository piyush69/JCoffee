


class c18114701 {
public MyHelperClass debug;
public MyHelperClass getResolvedEntity(String o0, String o1){ return null; }

    public InputSource resolveEntity(String publicId, String systemId) {
        String resolved =(String)(Object) getResolvedEntity(publicId, systemId);
        if (resolved != null) {
            try {
                InputSource iSource = new InputSource(resolved);
                iSource.setPublicId(publicId);
                URL url = new URL(resolved);
                InputStream iStream =(InputStream)(Object) url.openStream();
                iSource.setByteStream(iStream);
                return iSource;
            } catch (Exception e) {
                debug.message(1, "Failed to create InputSource (" + e.toString() + ")", resolved);
                return null;
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass message(int o0, String o1, String o2){ return null; }}

class InputSource {

InputSource(String o0){}
	InputSource(){}
	public MyHelperClass setPublicId(String o0){ return null; }
	public MyHelperClass setByteStream(InputStream o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}
