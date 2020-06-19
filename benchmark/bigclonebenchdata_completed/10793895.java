
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10793895 {
public MyHelperClass addComponentsFromProperties(Properties o0, MyHelperClass o1){ return null; }
public MyHelperClass classLoader;
	public MyHelperClass log;
	public MyHelperClass binder(){ return null; }

    protected void configure() {
        Enumeration resources = null;
        try {
            MyHelperClass resourceName = new MyHelperClass();
            resources =(Enumeration)(Object) classLoader.getResources(resourceName);
        } catch (UncheckedIOException e) {
            binder().addError(e.getMessage(),(IOException)(Object) e);
            return;
        }
        int resourceCount = 0;
        while ((boolean)(Object)resources.hasMoreElements()) {
            URL url =(URL)(Object) resources.nextElement();
            log.debug(url + " ...");
            try {
                InputStream stream =(InputStream)(Object) url.openStream();
                Properties props = new Properties();
                props.load(stream);
                resourceCount++;
                addComponentsFromProperties(props, classLoader);
            } catch (UncheckedIOException e) {
                binder().addError(e.getMessage(),(IOException)(Object) e);
            }
        }
        log.info("Added components from " + resourceCount + " resources.");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass addError(String o0, IOException o1){ return null; }
	public MyHelperClass getResources(MyHelperClass o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class Properties {

public MyHelperClass load(InputStream o0){ return null; }}
