import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c7752928 {
public MyHelperClass url;
	public MyHelperClass openStreamWithCancel(MyHelperClass o0, IProgressMonitor o1){ return null; }
public MyHelperClass in;
	public MyHelperClass lastModified;

    public InputStream getInputStream(IProgressMonitor monitor) throws IOException, CoreException {
        MyHelperClass in = new MyHelperClass();
        if (in == null && url != null) {
            MyHelperClass connection = new MyHelperClass();
            if (connection == null) connection = url.openConnection();
            if (monitor != null) {
                this.in = openStreamWithCancel(connection, monitor);
            } else {
                this.in = connection.getInputStream();
            }
            if (in != null) {
                this.lastModified = connection.getLastModified();
            }
        }
        return (InputStream)(Object)in;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getLastModified(){ return null; }}

class IProgressMonitor {

}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}
