import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3471479 {
public MyHelperClass path;
	public MyHelperClass properties;

    protected  void ResourceManager(URL url, String s)  throws Throwable {
        try {
            properties.load(url.openStream());
            path =(MyHelperClass)(Object) s;
        } catch (Exception e) {
            throw new Error(e.getMessage() + ": trying to load url \"" + url + "\"", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass load(InputStream o0){ return null; }}
