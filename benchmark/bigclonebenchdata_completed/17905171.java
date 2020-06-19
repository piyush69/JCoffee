import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c17905171 {
public static MyHelperClass getResource(String o0, Class o1){ return null; }
//public MyHelperClass getResource(String o0, Class o1){ return null; }

    public static InputStream getResourceAsStream(String resourceName, Class callingClass) {
        URL url =(URL)(Object) getResource(resourceName, callingClass);
        try {
            return (url != null) ? url.openStream() : null;
        } catch (IOException e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
