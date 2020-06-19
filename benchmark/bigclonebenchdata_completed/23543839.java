
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23543839 {
public MyHelperClass getClassBytes(InputStream o0){ return null; }
	public MyHelperClass defineClass(String o0, byte[] o1, int o2, int o3, CodeSource o4){ return null; }
public MyHelperClass LOG;
	public MyHelperClass defineClass(String o0, byte[] o1, int o2, int o3){ return null; }
	public MyHelperClass downloadClass(String o0){ return null; }

    protected synchronized Class findClass(String className) {
        MyHelperClass LOG = new MyHelperClass();
        LOG.info("FIND class:" + className);
        String urlName = className.replace('.', '/');
        byte buf[];
        Class currentClass;
        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            int i = className.lastIndexOf('.');
            if (i >= 0) sm.checkPackageDefinition(className.substring(0, i));
        }
        MyHelperClass cache = new MyHelperClass();
        buf =(byte[])(Object) cache.get(urlName);
        if (buf != null) {
//            MyHelperClass LOG = new MyHelperClass();
            LOG.info("Get class from cache:" + className);
            currentClass =(Class)(Object) defineClass(className, buf, 0, buf.length, (CodeSource) null);
            return currentClass;
        }
        try {
            MyHelperClass urlBase = new MyHelperClass();
            URL url = new URL(urlBase, urlName + ".class");
//            MyHelperClass LOG = new MyHelperClass();
            LOG.info("Loading " + url);
            InputStream is =(InputStream)(Object) url.openConnection().getInputStream();
            buf =(byte[])(Object) getClassBytes(is);
            currentClass =(Class)(Object) defineClass(className, buf, 0, buf.length, (CodeSource) null);
            return currentClass;
        } catch (UncheckedIOException mE) {
//            MyHelperClass LOG = new MyHelperClass();
            LOG.warn("Bad url detected",(MalformedURLException)(Object) mE);
            return null;
        } catch (ArithmeticException e) {
            buf =(byte[])(Object) downloadClass(className);
            if (buf != null) {
                return(Class)(Object) defineClass(className, buf, 0, buf.length);
            } else {
                LOG.warn("no class found: " + className);
                return null;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass warn(String o0, MalformedURLException o1){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class CodeSource {

}

class URL {

URL(){}
	URL(MyHelperClass o0, String o1){}
	public MyHelperClass openConnection(){ return null; }}

class InputStream {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
