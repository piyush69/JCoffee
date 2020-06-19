
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6036012 {

    public byte[] getClassBytes(String className, ClassLoader classLoader) {
        MyHelperClass urls = new MyHelperClass();
        URLClassLoader cl = new URLClassLoader(urls, classLoader);
        String resource = className.replace('.', '/') + ".class";
        InputStream is = null;
        try {
            URL url =(URL)(Object) cl.getResource(resource);
            if (url == null) {
                throw new RuntimeException("Class Resource not found for " + resource);
            }
            is =(InputStream)(Object) url.openStream();
            MyHelperClass InputStreamTransform = new MyHelperClass();
            byte[] classBytes =(byte[])(Object) InputStreamTransform.readBytes(is);
            return classBytes;
        } catch (UncheckedIOException e) {
            throw new RuntimeException("IOException reading bytes for " + className, e);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (UncheckedIOException e) {
                    throw new RuntimeException("Error closing InputStream for " + className, e);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass readBytes(InputStream o0){ return null; }}

class URLClassLoader {

URLClassLoader(){}
	URLClassLoader(MyHelperClass o0, ClassLoader o1){}
	public MyHelperClass getResource(String o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
