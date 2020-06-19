import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4579115 {
public MyHelperClass IOUtils;
	public MyHelperClass Message;
	public MyHelperClass openFileInputStream(String o0){ return null; }
	public MyHelperClass openFileOutputStream(String o0, boolean o1){ return null; }

    public void copy(String original, String copy) throws Throwable, SQLException {
        try {
            OutputStream out =(OutputStream)(Object) openFileOutputStream(copy, false);
            InputStream in =(InputStream)(Object) openFileInputStream(original);
            IOUtils.copyAndClose(in, out);
        } catch (UncheckedIOException e) {
            throw(Throwable)(Object) Message.convertIOException((IOException)(Object)e, "Can not copy " + original + " to " + copy);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyAndClose(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass convertIOException(IOException o0, String o1){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
