import java.io.*;
import java.lang.*;
import java.util.*;



class c3980744 {

    private InputStream getManifestAsResource() {
        ClassLoader cl = getClass().getClassLoader();
        try {
            MyHelperClass Constants = new MyHelperClass();
            Enumeration manifests = cl != null ? cl.getResources((String)(Object)Constants.OSGI_BUNDLE_MANIFEST) : ClassLoader.getSystemResources((String)(Object)Constants.OSGI_BUNDLE_MANIFEST);
            while (manifests.hasMoreElements()) {
                URL url = (URL) manifests.nextElement();
                try {
                    MyHelperClass Headers = new MyHelperClass();
                    Headers headers =(Headers)(Object) Headers.parseManifest(url.openStream());
//                    MyHelperClass Constants = new MyHelperClass();
                    if ("true".equals(headers.get(Constants.ECLIPSE_SYSTEMBUNDLE))) return(InputStream)(Object) url.openStream();
                } catch (UncheckedIOException e) {
                }
            }
        } catch (IOException e) {
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ECLIPSE_SYSTEMBUNDLE;
	public MyHelperClass OSGI_BUNDLE_MANIFEST;
public MyHelperClass parseManifest(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Headers {

public MyHelperClass get(MyHelperClass o0){ return null; }}

class BundleException extends Exception{
	public BundleException(String errorMessage) { super(errorMessage); }
}
