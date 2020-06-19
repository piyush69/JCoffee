import java.io.*;
import java.lang.*;
import java.util.*;



class c4164833 {
public static MyHelperClass DEBIAN_BINARY_CONTENT;
	public static MyHelperClass startFileEntry(OutputStream o0, MyHelperClass o1, long o2, long o3){ return null; }
public static MyHelperClass DATA_NAME;
//	public MyHelperClass DEBIAN_BINARY_CONTENT;
//	public MyHelperClass startFileEntry(OutputStream o0, MyHelperClass o1, long o2, long o3){ return null; }
	public static MyHelperClass endFileEntry(OutputStream o0, long o1){ return null; }
//public MyHelperClass DATA_NAME;
//	public MyHelperClass endFileEntry(OutputStream o0, long o1){ return null; }

    public static void buildDeb(File debFile, File controlFile, File dataFile) throws IOException {
        long now = new Date().getTime() / 1000;
        OutputStream deb = new FileOutputStream(debFile);
        deb.write("!<arch>\n".getBytes());
        MyHelperClass DEBIAN_BINARY_NAME = new MyHelperClass();
        startFileEntry(deb, DEBIAN_BINARY_NAME, now,(long)(Object) DEBIAN_BINARY_CONTENT.length());
        MyHelperClass DEBIAN_BINARY_CONTENT = new MyHelperClass();
        deb.write((int)(Object)DEBIAN_BINARY_CONTENT.getBytes());
//        MyHelperClass DEBIAN_BINARY_CONTENT = new MyHelperClass();
        endFileEntry(deb,(long)(Object) DEBIAN_BINARY_CONTENT.length());
        MyHelperClass CONTROL_NAME = new MyHelperClass();
        startFileEntry(deb, CONTROL_NAME, now, controlFile.length());
        FileInputStream control = new FileInputStream(controlFile);
        byte[] buffer = new byte[1024];
        while (true) {
            int read = control.read(buffer);
            if (read == -1) break;
            deb.write(buffer, 0, read);
        }
        control.close();
        endFileEntry(deb, controlFile.length());
        startFileEntry(deb, DATA_NAME, now, dataFile.length());
        FileInputStream data = new FileInputStream(dataFile);
        while (true) {
            int read = data.read(buffer);
            if (read == -1) break;
            deb.write(buffer, 0, read);
        }
        data.close();
        endFileEntry(deb, dataFile.length());
        deb.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(){ return null; }
	public MyHelperClass length(){ return null; }}
