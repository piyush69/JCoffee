import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5659863 {
public static MyHelperClass MODE_APPEND;
	public static MyHelperClass MODE_READ_WRITE;
	public static MyHelperClass MODE_WRITE;
	public static MyHelperClass setObjectMap(int o0, FileOutputStream o1, MyHelperClass o2){ return null; }
	public static MyHelperClass setObjectMap(int o0, FileInputStream o1, MyHelperClass o2){ return null; }
	public static MyHelperClass setObjectMap(int o0, RandomAccessFile o1, MyHelperClass o2){ return null; }
//public MyHelperClass MODE_READ_WRITE;
//	public MyHelperClass MODE_APPEND;
//	public MyHelperClass MODE_WRITE;
//	public MyHelperClass setObjectMap(int o0, FileInputStream o1, MyHelperClass o2){ return null; }
//	public MyHelperClass setObjectMap(int o0, FileOutputStream o1, MyHelperClass o2){ return null; }
//	public MyHelperClass setObjectMap(int o0, RandomAccessFile o1, MyHelperClass o2){ return null; }

    public static FileChannel newFileChannel(File file, String rw, boolean enableException) throws Throwable, IOException {
        if (file == null) return null;
        if (rw == null || rw.length() == 0) {
            return null;
        }
        rw = rw.toLowerCase();
        MyHelperClass MODE_READ = new MyHelperClass();
        if (rw.equals(MODE_READ)) {
            MyHelperClass FileUtil = new MyHelperClass();
            if ((boolean)(Object)FileUtil.exists(file, enableException)) {
                FileInputStream fis = new FileInputStream(file);
                FileChannel ch =(FileChannel)(Object) fis.getChannel();
                MyHelperClass FIS = new MyHelperClass();
                setObjectMap(ch.hashCode(), fis, FIS);
                return ch;
            }
        MyHelperClass MODE_WRITE = new MyHelperClass();
        } else if (rw.equals(MODE_WRITE)) {
            FileOutputStream fos = new FileOutputStream(file);
            FileChannel ch =(FileChannel)(Object) fos.getChannel();
            MyHelperClass FOS_W = new MyHelperClass();
            setObjectMap(ch.hashCode(), fos, FOS_W);
            return ch;
        MyHelperClass MODE_APPEND = new MyHelperClass();
        } else if (rw.equals(MODE_APPEND)) {
            MyHelperClass FileUtil = new MyHelperClass();
            if ((boolean)(Object)FileUtil.exists(file, enableException)) {
                RandomAccessFile raf = new RandomAccessFile(file, "rw");
                FileChannel ch =(FileChannel)(Object) raf.getChannel();
                ch.position(ch.size());
                MyHelperClass FOS_A = new MyHelperClass();
                setObjectMap(ch.hashCode(), raf, FOS_A);
                return ch;
            }
        MyHelperClass MODE_READ_WRITE = new MyHelperClass();
        } else if (rw.equals(MODE_READ_WRITE)) {
            MyHelperClass FileUtil = new MyHelperClass();
            if ((boolean)(Object)FileUtil.exists(file, enableException)) {
                RandomAccessFile raf = new RandomAccessFile(file, rw);
                FileChannel ch =(FileChannel)(Object) raf.getChannel();
                MyHelperClass RAF = new MyHelperClass();
                setObjectMap(ch.hashCode(), raf, RAF);
                return ch;
            }
        } else {
            throw new IllegalArgumentException("Illegal read/write type : [" + rw + "]\n" + "You can use following types for: \n" + "  (1) Read Only  = \"r\"\n" + "  (2) Write Only = \"w\"\n" + "  (3) Read/Write = \"rw\"\n" + "  (4) Append     = \"a\"");
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass exists(File o0, boolean o1){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass position(MyHelperClass o0){ return null; }}
