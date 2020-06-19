
import java.io.UncheckedIOException;


class c3346748 {
public static MyHelperClass NLS;
//public MyHelperClass NLS;

    public static Dictionary loadManifestFrom(BaseData bundledata) throws BundleException {
        MyHelperClass Constants = new MyHelperClass();
        URL url =(URL)(Object) bundledata.getEntry(Constants.OSGI_BUNDLE_MANIFEST);
        if (url == null) return null;
        try {
            MyHelperClass Headers = new MyHelperClass();
            return(Dictionary)(Object) Headers.parseManifest(url.openStream());
        } catch (UncheckedIOException e) {
            MyHelperClass EclipseAdaptorMsg = new MyHelperClass();
            throw new BundleException(NLS.bind(EclipseAdaptorMsg.ECLIPSE_DATA_ERROR_READING_MANIFEST, bundledata.getLocation()),(IOException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ECLIPSE_DATA_ERROR_READING_MANIFEST;
	public MyHelperClass OSGI_BUNDLE_MANIFEST;
public MyHelperClass parseManifest(MyHelperClass o0){ return null; }
	public MyHelperClass bind(MyHelperClass o0, MyHelperClass o1){ return null; }}

class BaseData {

public MyHelperClass getEntry(MyHelperClass o0){ return null; }
	public MyHelperClass getLocation(){ return null; }}

class Dictionary {

}

class BundleException extends Exception{
	public BundleException(String errorMessage) { super(errorMessage); }
	BundleException(){}
	BundleException(MyHelperClass o0, IOException o1){}
}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
