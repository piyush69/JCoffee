import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c16830117 {

    public InputStream openAsStream() throws IOException {
        MyHelperClass _preferredClassLoader = new MyHelperClass();
        ClassLoader cl =(ClassLoader)(Object) _preferredClassLoader;
        if (cl == null) {
            cl = Thread.currentThread().getContextClassLoader();
        }
        MyHelperClass _path = new MyHelperClass();
        final URL url = (cl == null) ? null : cl.getResource((String)(Object)_path);
        return (url == null) ? null : url.openStream();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
