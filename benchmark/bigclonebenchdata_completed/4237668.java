
import java.io.UncheckedIOException;


class c4237668 {

    private boolean dependencyOutOfDate(ScriptCacheEntry entry) {
        if (entry != null) {
            for (Iterator i =(Iterator)(Object) entry.dependencies.keySet().iterator();(boolean)(Object) i.hasNext(); ) {
                URLConnection urlc = null;
                URL url = (URL)(URL)(Object) i.next();
                try {
                    urlc =(URLConnection)(Object) url.openConnection();
                    urlc.setDoInput(false);
                    urlc.setDoOutput(false);
                    long dependentLastModified =(long)(Object) urlc.getLastModified();
                    if (dependentLastModified > ((Long)(Long)(Object) entry.dependencies.get(url)).longValue()) {
                        return true;
                    }
                } catch (UncheckedIOException ioe) {
                    return true;
                }
            }
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass iterator(){ return null; }
	public MyHelperClass get(URL o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class ScriptCacheEntry {
public MyHelperClass dependencies;
}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class URLConnection {

public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
