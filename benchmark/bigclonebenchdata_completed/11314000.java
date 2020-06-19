import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11314000 {

    public static String getFileText(URL _url)  throws Throwable {
        try {
            InputStream input = _url.openStream();
            MyHelperClass IOUtils = new MyHelperClass();
            String content = IOUtils.toString(input);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(input);
            return content;
        } catch (Exception err) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.error(_url.toString(), err);
            return "";
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }}

class Object {

public MyHelperClass toString(InputStream o0){ return null; }}
