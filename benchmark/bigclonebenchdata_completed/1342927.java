
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1342927 {
public static MyHelperClass getEmbeddedFileUrl(String o0){ return null; }
//public MyHelperClass getEmbeddedFileUrl(String o0){ return null; }

    public static InputStream getResourceAsStream(String resourceName) {
        try {
            MyHelperClass WS_SEP = new MyHelperClass();
            URL url =(URL)(Object) getEmbeddedFileUrl(WS_SEP + resourceName);
            if (url != null) {
                return(InputStream)(Object) url.openStream();
            }
        } catch (UncheckedIOException e) {
            MyHelperClass GdtAndroidPlugin = new MyHelperClass();
            GdtAndroidPlugin.getLogger().logError((MalformedURLException)(Object)e, "Failed to read stream '%s'", resourceName);
        } catch (ArithmeticException e) {
            MyHelperClass GdtAndroidPlugin = new MyHelperClass();
            GdtAndroidPlugin.getLogger().logError((MalformedURLException)(Object)e, "Failed to read stream '%s'", resourceName);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getLogger(){ return null; }
	public MyHelperClass logError(MalformedURLException o0, String o1, String o2){ return null; }
	public MyHelperClass logError(IOException o0, String o1, String o2){ return null; }}

class InputStream {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
