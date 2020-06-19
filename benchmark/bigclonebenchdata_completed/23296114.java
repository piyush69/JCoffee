
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23296114 {

    private static int computeNativesHash() {
        try {
            String classpath = System.getProperty("java.class.path");
            URL url =(URL)(Object) Thread.currentThread().getContextClassLoader().getResource("com/jme3/system/Natives.class");
            StringBuilder sb = new StringBuilder(url.toString());
            if (sb.indexOf("jar:") == 0) {
                sb.delete(0, 4);
                sb.delete(sb.indexOf("!"), sb.length());
                sb.delete(sb.lastIndexOf("/") + 1, sb.length());
            }
            try {
                url = new URL(sb.toString());
            } catch (UncheckedIOException ex) {
                throw new UnsupportedOperationException(ex);
            }
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            int hash = classpath.hashCode() ^ (int)(int)(Object) conn.getLastModified();
            return hash;
        } catch (UncheckedIOException ex) {
            throw new UnsupportedOperationException(ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getLastModified(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
