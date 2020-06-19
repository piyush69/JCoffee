import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19394412 {

    public static long checksum(IFile file) throws Throwable, IOException {
        InputStream contents;
        try {
            contents =(InputStream)(Object) file.getContents();
        } catch (UncheckedIOException e) {
            throw new CausedIOException("Failed to calculate checksum.",(CoreException)(Object) e);
        }
        CheckedInputStream in = new CheckedInputStream(contents, new Adler32());
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, new NullOutputStream());
        } catch (UncheckedIOException e) {
            throw new CausedIOException("Failed to calculate checksum.",(CoreException)(Object) e);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(in);
        }
        return(long)(Object) in.getChecksum().getValue();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getValue(){ return null; }
	public MyHelperClass copy(CheckedInputStream o0, NullOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(CheckedInputStream o0){ return null; }}

class IFile {

public MyHelperClass getContents(){ return null; }}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}

class CausedIOException extends Exception{
	public CausedIOException(String errorMessage) { super(errorMessage); }
	CausedIOException(String o0, CoreException o1){}
	CausedIOException(){}
	CausedIOException(String o0, IOException o1){}
}

class CheckedInputStream {

CheckedInputStream(){}
	CheckedInputStream(InputStream o0, Adler32 o1){}
	public MyHelperClass getChecksum(){ return null; }}

class Adler32 {

}

class NullOutputStream {

}
