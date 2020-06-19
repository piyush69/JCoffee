import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20638313 {
public MyHelperClass url;
public MyHelperClass inputStream;

    public void init() throws Throwable, IOException {
        if (this.inputStream == null) this.inputStream =(MyHelperClass)(Object) new BufferedInputStream((InputStream)(Object)url.openStream()); else {
            this.inputStream.close();
            this.inputStream =(MyHelperClass)(Object) new BufferedInputStream((InputStream)(Object)url.openStream());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass close(){ return null; }}
