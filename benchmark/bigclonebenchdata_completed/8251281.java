
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8251281 {

    protected InputStream openInputStream(String filename) throws FileNotFoundException {
        InputStream in = null;
        try {
            URL url = new URL(filename);
            in =(InputStream)(Object) url.openConnection().getInputStream();
            MyHelperClass logger = new MyHelperClass();
            logger.info("Opening file " + filename);
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Resource file not found: " + filename);
            throw e;
        } catch (ArithmeticException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Resource file can not be readed: " + filename);
            throw new FileNotFoundException("Resource file can not be readed: " + filename);
        }
        if (in == null) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Resource file not found: " + filename);
            throw new FileNotFoundException(filename);
        }
        return in;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
