import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4491298 {
public MyHelperClass log;

//    @Transient
    public byte[] getData()  throws Throwable {
        InputStream is = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            MyHelperClass urlInstance = new MyHelperClass();
            is =(InputStream)(Object) urlInstance.openStream();
            byte[] bytes = new byte[1024 * 20];
            while (is.available() > 0) {
                int bytesRead = is.read(bytes);
                bos.write(bytes, 0, bytesRead);
            }
            return bos.toByteArray();
        } catch (Exception e) {
            MyHelperClass url = new MyHelperClass();
            log.error("Error reading URL: " + url, e);
            return null;
        } finally {
            if (is != null) try {
                is.close();
            } catch (Exception e) {
                MyHelperClass url = new MyHelperClass();
                log.debug("Error closing URL input stream: " + url, e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass debug(String o0, Exception o1){ return null; }}

class Transient {

}
