import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c21386162 {
public MyHelperClass streamLength;

    public void writeToFile(File file, File source) throws IOException {
        BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(file));
        BufferedInputStream bin = new BufferedInputStream(new FileInputStream(source));
        MyHelperClass header = new MyHelperClass();
        bin.skip((long)(Object)header.getHeaderEndingOffset());
        for (long i = 0; i < (long)(Object)this.streamLength; i++) {
            bout.write(bin.read());
        }
        bin.close();
        bout.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getHeaderEndingOffset(){ return null; }}
