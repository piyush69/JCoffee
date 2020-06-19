import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c2217889 {
public static MyHelperClass ZMLog;
	public static MyHelperClass findResource(String o0){ return null; }
//public MyHelperClass ZMLog;
//	public MyHelperClass findResource(String o0){ return null; }

    public static InputStream getResourceAsStreamIfAny(String resPath) {
        URL url =(URL)(Object) findResource(resPath);
        try {
            return url == null ? null : url.openStream();
        } catch (IOException e) {
            ZMLog.warn(e, " URL open Connection got an exception!");
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(IOException o0, String o1){ return null; }}
