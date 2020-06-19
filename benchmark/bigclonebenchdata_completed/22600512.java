import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22600512 {

        public void readFully(String urlS) throws Throwable, Exception {
            URL url = new URL(urlS);
            URLConnection conn = url.openConnection();
            InputStream is = conn.getInputStream();
            byte[] data = new byte[10240];
            int b = is.read(data);
            while (b > 0) {
                MyHelperClass size = new MyHelperClass();
               (int)(Object) size += b;
                b = is.read(data);
            }
            is.close();
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
