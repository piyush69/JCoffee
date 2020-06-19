import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6996260 {

    public static String getUrl(String url)  throws Throwable {
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        try {
            ByteArrayOutputStream bytearray = new ByteArrayOutputStream();
            in = new BufferedInputStream(new URL(url).openStream());
            out = new BufferedOutputStream(bytearray, 1024);
            byte[] data = new byte[1024];
            int x = 0;
            while ((x = in.read(data, 0, 1024)) >= 0) {
                out.write(data, 0, x);
            }
            return bytearray.toString();
        } catch (Exception e) {
            throw new CVardbException((String)(Object)e);
        } finally {
            try {
                if (out != null) out.close();
                if (in != null) in.close();
            } catch (Exception e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class CVardbException extends Exception{
	public CVardbException(String errorMessage) { super(errorMessage); }
}
