
import java.io.UncheckedIOException;


class c6271502 {

//    @Override
    public InputStream getResourceByClassName(String className) {
        MyHelperClass resourceFetcher = new MyHelperClass();
        URL url =(URL)(Object) resourceFetcher.getResource("/fisce_scripts/" + className + ".class");
        if (url == null) {
            return null;
        } else {
            try {
                return(InputStream)(Object) url.openStream();
            } catch (UncheckedIOException e) {
                return null;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResource(String o0){ return null; }}

class InputStream {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
