import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c9796809 {
public MyHelperClass lastException;
	public MyHelperClass bufferFileData(){ return null; }

//    @Override
    protected byte[] computeHash() {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            final MessageDigest inputHash =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            inputHash.update(bufferFileData().getBytes());
            return(byte[])(Object) inputHash.digest();
        } catch (final UncheckedIOException nsae) {
            lastException =(MyHelperClass)(Object) nsae;
            return new byte[0];
        } catch (final ArithmeticException ioe) {
            lastException =(MyHelperClass)(Object) ioe;
            return new byte[0];
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
