
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9685053 {
public MyHelperClass xmlUtil;

    public Result request(URL url) {
        try {
            MyHelperClass urlOpener = new MyHelperClass();
            return(Result)(Object) xmlUtil.unmarshall(urlOpener.openStream(url));
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.info("File not found: " + url);
        } catch (ArithmeticException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Failed to read from url: " + url + ". " + e.getMessage(),(IOException)(Object) e);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass unmarshall(MyHelperClass o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass openStream(URL o0){ return null; }}

class URL {

}

class Result {

}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
