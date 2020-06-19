import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3538760 {
public MyHelperClass url;

//    @Override
    public InputStream getDataStream(int bufferSize) throws Throwable, IOException {
        MyHelperClass manager = new MyHelperClass();
        InputStream in = manager == null ? url.openStream() : manager.getResourceInputStream(this);
        if (in instanceof ByteArrayInputStream || in instanceof BufferedInputStream) {
            return in;
        }
        return bufferSize == 0 ? new BufferedInputStream(in) : new BufferedInputStream(in, bufferSize);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResourceInputStream(c3538760 o0){ return null; }
	public MyHelperClass openStream(){ return null; }}
