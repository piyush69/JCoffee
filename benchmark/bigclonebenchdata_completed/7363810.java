import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c7363810 {
public MyHelperClass InputStreamToArray(InputStream o0){ return null; }
public MyHelperClass arrayIn;

    public void RandomAccessFileOrArray(URL url) throws IOException {
        InputStream is = url.openStream();
        try {
            this.arrayIn = InputStreamToArray(is);
        } finally {
            try {
                is.close();
            } catch (IOException ioe) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
