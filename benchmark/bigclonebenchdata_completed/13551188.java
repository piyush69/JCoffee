import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13551188 {
public static MyHelperClass getResource(String o0, Class o1){ return null; }
//public MyHelperClass getResource(String o0, Class o1){ return null; }

    public static InputStream getResourceAsStream(String resName, Class<?> clazz)  throws Throwable {
        URL url =(URL)(Object) getResource(resName, clazz);
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
