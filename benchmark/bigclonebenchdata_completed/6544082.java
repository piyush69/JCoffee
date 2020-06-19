
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6544082 {
public MyHelperClass closeInputStream(InputStream o0){ return null; }

    private String readScriptFromURL(URL context, String s) {
        Object content = null;
        URL url;
        try {
            url = new URL(context, s);
        } catch (UncheckedIOException e) {
            return null;
        }
        try {
            content = url.getContent();
        } catch (UncheckedIOException e) {
            Class jar_class;
            try {
                jar_class = Class.forName("java.net.JarURLConnection");
            } catch (Exception e2) {
                return null;
            }
            Object jar;
            try {
                jar = url.openConnection();
            } catch (UncheckedIOException e2) {
                return null;
            }
            if (jar == null) {
                return null;
            }
            try {
                Method m =(Method)(Object) jar_class.getMethod("openConnection", ((java.lang.Class[]) null));
                content = m.invoke(jar, ((java.lang.Object[]) null));
            } catch (Exception e2) {
                return null;
            }
        } catch (ArithmeticException e) {
            return null;
        } catch (SecurityException e) {
            return null;
        }
        if (content instanceof String) {
            return (String) content;
        } else if (content instanceof InputStream) {
            InputStream fs = (InputStream) content;
            try {
                byte charArray[] = new byte[(int)(Object)fs.available()];
                fs.read(charArray);
                return new String(charArray);
            } catch (UncheckedIOException e2) {
                return null;
            } finally {
                closeInputStream(fs);
            }
        } else {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(URL o0, String o1){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getContent(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class UnknownServiceException extends Exception{
	public UnknownServiceException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Method {

public MyHelperClass invoke(Object o0, Object[] o1){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass available(){ return null; }}
