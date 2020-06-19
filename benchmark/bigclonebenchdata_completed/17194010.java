import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17194010 {
public MyHelperClass IOUtils;
	public MyHelperClass Assert;
	public MyHelperClass getBase(){ return null; }

    public void compareResult(String path, String expected) throws Throwable, IOException {
        if (path.length() == 0 || path.charAt(0) != '/') path = "/" + path;
        URL url = new URL(getBase() + path);
        String actual = IOUtils.toString(url.openStream());
        Assert.assertEquals(url.toString(), expected, actual);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass assertEquals(String o0, String o1, String o2){ return null; }}

class Object {

public MyHelperClass toString(InputStream o0){ return null; }}
