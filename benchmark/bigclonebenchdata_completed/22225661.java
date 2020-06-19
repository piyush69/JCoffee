
// import java.io.ArithmeticException;
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22225661 {
public MyHelperClass retryBadSystemIds;
	public MyHelperClass catalog;
	public MyHelperClass debug(int o0, String o1){ return null; }
	public MyHelperClass debug(int o0, String o1, String o2){ return null; }
	public MyHelperClass debug(int o0, String o1, String o2, String o3){ return null; }

    public InputSource resolveEntity(String publicId, String systemId) {
        String resolved = null;
        if (systemId != null) {
            try {
                MyHelperClass catalog = new MyHelperClass();
                resolved =(String)(Object) catalog.resolveSystem(systemId);
            } catch (UncheckedIOException me) {
                debug(1, "Malformed URL exception trying to resolve", publicId);
                resolved = null;
            } catch (ArithmeticException ie) {
                debug(1, "I/O exception trying to resolve", publicId);
                resolved = null;
            }
        }
        if (resolved == null) {
            if (publicId != null) {
                try {
                    resolved =(String)(Object) catalog.resolvePublic(publicId, systemId);
                } catch (UncheckedIOException me) {
                    debug(1, "Malformed URL exception trying to resolve", publicId);
                } catch (ArithmeticException ie) {
                    debug(1, "I/O exception trying to resolve", publicId);
                }
            }
            if (resolved != null) {
                debug(2, "Resolved", publicId, resolved);
            }
        } else {
            debug(2, "Resolved", systemId, resolved);
        }
        if (resolved == null && (boolean)(Object)retryBadSystemIds && publicId != null && systemId != null) {
            URL systemURL = null;
            try {
                systemURL = new URL(systemId);
            } catch (UncheckedIOException e) {
                try {
                    systemURL = new URL("file:///" + systemId);
                } catch (UncheckedIOException e2) {
                    systemURL = null;
                }
            }
            if (systemURL != null) {
                try {
                    InputStream iStream =(InputStream)(Object) systemURL.openStream();
                    InputSource iSource = new InputSource(systemId);
                    iSource.setPublicId(publicId);
                    iSource.setByteStream(iStream);
                    return iSource;
                } catch (Exception e) {
                }
            }
            debug(2, "Failed to open", systemId);
            debug(2, "\tAttempting catalog lookup without system identifier.");
            return resolveEntity(publicId, null);
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
                debug(1, "Failed to create InputSource", resolved);
                return null;
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass resolvePublic(String o0, String o1){ return null; }
	public MyHelperClass resolveSystem(String o0){ return null; }}

class InputSource {

InputSource(String o0){}
	InputSource(){}
	public MyHelperClass setByteStream(InputStream o0){ return null; }
	public MyHelperClass setPublicId(String o0){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}
