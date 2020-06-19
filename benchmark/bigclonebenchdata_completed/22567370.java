import java.io.*;
import java.lang.*;
import java.util.*;



class c22567370 {

    public static Reader createReader(TreeLogger logger, URL url) throws UnableToCompleteException {
        try {
            return new InputStreamReader((InputStream)(Object)url.openStream());
        } catch (UncheckedIOException e) {
            MyHelperClass TreeLogger = new MyHelperClass();
            logger.log(TreeLogger.ERROR, "Unable to open resource: " + url,(IOException)(Object) e);
            throw new UnableToCompleteException();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
}

class TreeLogger {

public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class UnableToCompleteException extends Exception{
	public UnableToCompleteException(String errorMessage) { super(errorMessage); }
	UnableToCompleteException(){}
}
