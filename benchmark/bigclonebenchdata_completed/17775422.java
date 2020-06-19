import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17775422 {

    public void validateClassPath()  throws Throwable {
        try {
            MyHelperClass classLoader = new MyHelperClass();
            URL[] urls = ((URLClassLoader)(URLClassLoader)(Object) classLoader).getURLs();
            for (int i = 0; i < urls.length; i++) {
                try {
                    urls[i].openStream();
                    new DebugWriter().writeMessage(urls[i].getFile() + "\n");
                } catch (IllegalArgumentException iae) {
                    throw new LinkageError("malformed class path url:\n " + urls[i]);
                } catch (IOException ioe) {
                    throw new LinkageError("invalid class path url:\n " + urls[i]);
                }
            }
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("The current VM's System classloader is not a " + "subclass of java.net.URLClassLoader");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class DebugWriter {

public MyHelperClass writeMessage(String o0){ return null; }}
