import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21068911 {

    protected ResourceBundle loadBundle(String prefix)  throws Throwable {
        URL url = Thread.currentThread().getContextClassLoader().getResource(prefix + ".properties");
        if (url != null) {
            try {
                return new PropertyResourceBundle(url.openStream());
            } catch (IOException e) {
                MyHelperClass ThrowableManagerRegistry = new MyHelperClass();
                throw(Throwable)(Object) ThrowableManagerRegistry.caught(e);
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass caught(IOException o0){ return null; }}
