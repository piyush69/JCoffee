import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6840241 {

    private static long copy(InputStream source, OutputStream sink)  throws Throwable {
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            return(long)(Object) IOUtils.copyLarge(source, sink);
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(e.toString(),(IOException)(Object) e);
            throw new FaultException("System error copying stream",(IOException)(Object) e);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(source);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(sink);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass copyLarge(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class FaultException extends Exception{
	public FaultException(String errorMessage) { super(errorMessage); }
	FaultException(){}
	FaultException(String o0, IOException o1){}
}
