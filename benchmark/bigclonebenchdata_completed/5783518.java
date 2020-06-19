import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c5783518 {
public MyHelperClass endpoint;
	public MyHelperClass LOGGER;
	public MyHelperClass toHex(byte[] o0, int o1, int o2){ return null; }

//    @Override
    protected boolean sendBytes(byte[] data, int offset, int length) {
        try {
            String hex =(String)(Object) toHex(data, offset, length);
            URL url = new URL((URL)(Object)this.endpoint, "?raw=" + hex);
            System.out.println("Connecting to " + url);
            URLConnection conn = url.openConnection();
            conn.connect();
            Object content = conn.getContent();
            return true;
        } catch (IOException ex) {
            LOGGER.warning(ex.getMessage());
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warning(String o0){ return null; }}
