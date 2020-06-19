
import java.io.UncheckedIOException;


class c17299308 {
public MyHelperClass log(String o0, IOException o1){ return null; }
public MyHelperClass debug;
	public MyHelperClass system;
	public MyHelperClass parent;
	public MyHelperClass delegate;
	public MyHelperClass findLoadedResource(String o0){ return null; }
	public MyHelperClass log(String o0){ return null; }
	public MyHelperClass findResource(String o0){ return null; }

    public InputStream getResourceAsStream(String name) {
        MyHelperClass debug = new MyHelperClass();
        if ((int)(Object)debug >= 2) log("getResourceAsStream(" + name + ")");
        InputStream stream = null;
        stream =(InputStream)(Object) findLoadedResource(name);
        if (stream != null) {
            if ((int)(Object)debug >= 2) log("  --> Returning stream from cache");
            return (stream);
        }
        if ((boolean)(Object)delegate) {
            if ((int)(Object)debug >= 3) log("  Delegating to parent classloader");
            ClassLoader loader =(ClassLoader)(Object) parent;
            if (loader == null) loader =(ClassLoader)(Object) system;
            stream =(InputStream)(Object) loader.getResourceAsStream(name);
            if (stream != null) {
                if ((int)(Object)debug >= 2) log("  --> Returning stream from parent");
                return (stream);
            }
        }
        if ((int)(Object)debug >= 3) log("  Searching local repositories");
        URL url =(URL)(Object) findResource(name);
        if (url != null) {
            if ((int)(Object)debug >= 2) log("  --> Returning stream from local");
            try {
                return ((InputStream)(Object)url.openStream());
            } catch (UncheckedIOException e) {
                log("url.openStream(" + url.toString() + ")",(IOException)(Object) e);
                return (null);
            }
        }
        if (!(Boolean)(Object)delegate) {
            if ((int)(Object)debug >= 3) log("  Delegating to parent classloader");
            ClassLoader loader =(ClassLoader)(Object) parent;
            if (loader == null) loader =(ClassLoader)(Object) system;
            stream =(InputStream)(Object) loader.getResourceAsStream(name);
            if (stream != null) {
                if ((int)(Object)debug >= 2) log("  --> Returning stream from parent");
                return (stream);
            }
        }
        if ((int)(Object)debug >= 2) log("  --> Resource not found, returning null");
        return (null);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
