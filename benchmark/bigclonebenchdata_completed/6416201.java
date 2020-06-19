import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6416201 {
public MyHelperClass IOUtils;
	public MyHelperClass ManagedIOException;
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass getPath(){ return null; }

//    @Override
    public void copyTo(ManagedFile other) throws Throwable, ManagedIOException {
        try {
            MyHelperClass ManagedFileType = new MyHelperClass();
            if (other.getType() == ManagedFileType.FILE) {
                IOUtils.copy(this.getContent().getInputStream(), other.getContent().getOutputStream());
            } else {
                ManagedFile newFile =(ManagedFile)(Object) other.retrive(this.getPath());
                newFile.createFile();
                IOUtils.copy(this.getContent().getInputStream(), newFile.getContent().getOutputStream());
            }
        } catch (UncheckedIOException ioe) {
            throw(Throwable)(Object) ManagedIOException.manage((IOException)(Object)ioe);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FILE;
public MyHelperClass manage(IOException o0){ return null; }
	public MyHelperClass copy(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class ManagedFile {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass createFile(){ return null; }
	public MyHelperClass getType(){ return null; }
	public MyHelperClass retrive(MyHelperClass o0){ return null; }}

class ManagedIOException extends Exception{
	public ManagedIOException(String errorMessage) { super(errorMessage); }
}
