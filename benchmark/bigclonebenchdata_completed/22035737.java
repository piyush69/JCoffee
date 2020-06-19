
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22035737 {
public static MyHelperClass configureModuleMappings(Configuration o0, MyHelperClass o1){ return null; }
public static MyHelperClass LoadingUtils;
	public static MyHelperClass loadModuleMappings(InputStream o0){ return null; }
//	public MyHelperClass configureModuleMappings(Configuration o0, MyHelperClass o1){ return null; }
//public MyHelperClass LoadingUtils;
//	public MyHelperClass loadModuleMappings(InputStream o0){ return null; }

    private static void loadMappings(Configuration cfg) {
        try {
            MyHelperClass MAPPINGS_FILE = new MyHelperClass();
            Enumeration en =(Enumeration)(Object) LoadingUtils.getResources(MAPPINGS_FILE);
            while ((boolean)(Object)en.hasMoreElements()) {
                URL url = (URL)(URL)(Object) en.nextElement();
                MyHelperClass logger = new MyHelperClass();
                logger.info("Found mapping module " + url.toExternalForm());
                InputStream inputStream = null;
                try {
                    inputStream =(InputStream)(Object) url.openStream();
                    HibConfiguration hm =(HibConfiguration)(Object) loadModuleMappings(inputStream);
                    configureModuleMappings(cfg, hm.getSessionFactory());
                } catch (UncheckedIOException e) {
//                    MyHelperClass logger = new MyHelperClass();
                    logger.warn("Could not load mappings file \"" + url.toExternalForm() + "\"",(JAXBException)(Object) e);
                } catch (ArithmeticException e) {
//                    MyHelperClass logger = new MyHelperClass();
                    logger.warn("Unable to instantiate JAXBContext ",(JAXBException)(Object) e);
                } finally {
                    try {
                        if (inputStream != null) inputStream.close();
                    } catch (UncheckedIOException e) {
//                        MyHelperClass logger = new MyHelperClass();
                        logger.debug((IOException)(Object)e);
                    }
                }
            }
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.warn("Could not find any mappings file hibernate.mappings.xml",(JAXBException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResources(MyHelperClass o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass warn(String o0, JAXBException o1){ return null; }
	public MyHelperClass warn(String o0, IOException o1){ return null; }
	public MyHelperClass debug(IOException o0){ return null; }}

class Configuration {

}

class Enumeration {

public MyHelperClass hasMoreElements(){ return null; }
	public MyHelperClass nextElement(){ return null; }}

class URL {

public MyHelperClass toExternalForm(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class HibConfiguration {

public MyHelperClass getSessionFactory(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class JAXBException extends Exception{
	public JAXBException(String errorMessage) { super(errorMessage); }
}
