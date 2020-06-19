import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13927065 {

    void copyFile(File src, File dst) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        byte[] buf = new byte[10000];
        int n;
        FileOutputStream fos = new FileOutputStream(dst);
        while ((n = fis.read(buf)) > 0) fos.write(buf, 0, n);
        fis.close();
        fos.close();
        MyHelperClass copied = new MyHelperClass();
        copied++;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public int copied;
}
