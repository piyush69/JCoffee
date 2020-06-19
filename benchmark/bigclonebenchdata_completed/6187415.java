import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6187415 {
public MyHelperClass originalFilename;

    protected InputStream acquireInputStream(String filename) throws Throwable, IOException {
        MyHelperClass Validate = new MyHelperClass();
        Validate.notEmpty(filename);
        File f = new File(filename);
        if (f.exists()) {
            this.originalFilename =(MyHelperClass)(Object) f.getName();
            return new FileInputStream(f);
        }
        URL url = getClass().getClassLoader().getResource(filename);
        if (url == null) {
            if (!filename.startsWith("/")) {
                url = getClass().getClassLoader().getResource("/" + filename);
                if (url == null) {
                    throw new IllegalArgumentException("File [" + filename + "] not found in classpath via " + getClass().getClassLoader().getClass());
                }
            }
        }
        this.originalFilename =(MyHelperClass)(Object) filename;
        return url.openStream();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass notEmpty(String o0){ return null; }}
