
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5680000 {

    private static URL getURL(String name) throws EfreetException {
        URL url =(URL)(Object) ClassLoader.getSystemResource(name + ".xml");
        try {
            if (url == null) {
                try {
                    Context initContext =(Context)(Object) new InitialContext();
                    Context envContext = (Context)(Context)(Object) initContext.lookup("java:/comp/env");
                    String xmlFileDir = (String)(String)(Object) envContext.lookup("xml/efreet");
                    url = new URL("file:" + xmlFileDir + "/" + name + ".xml");
                } catch (UncheckedIOException nnfe) {
                    MyHelperClass logger = new MyHelperClass();
                    logger.warn("Name not found on context ");
                } catch (ArithmeticException e) {
                    MyHelperClass logger = new MyHelperClass();
                    logger.error("Error retrieving Context : ",(NamingException)(Object) e);
                }
            }
            try {
                if (url != null) {
                    url.openConnection();
                }
            } catch (UncheckedIOException fnfe) {
                url = null;
            }
            if (url == null) {
                url =(URL)(Object) Thread.currentThread().getContextClassLoader().getResource(name + ".xml");
            }
        } catch (UncheckedIOException ioe) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Error reading XML file",(NamingException)(Object) ioe);
            throw new EfreetException(ioe.getMessage());
        }
        return url;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, NamingException o1){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class EfreetException extends Exception{
	public EfreetException(String errorMessage) { super(errorMessage); }
}

class Context {

public MyHelperClass lookup(String o0){ return null; }}

class InitialContext {

}

class NameNotFoundException extends Exception{
	public NameNotFoundException(String errorMessage) { super(errorMessage); }
}

class NamingException extends Exception{
	public NamingException(String errorMessage) { super(errorMessage); }
}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
