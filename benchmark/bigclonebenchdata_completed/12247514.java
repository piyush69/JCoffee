import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c12247514 {

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            MyHelperClass PrintUtil = new MyHelperClass();
            PrintUtil.prt("arguments: sourcefile, destfile");
            System.exit(1);
        }
        FileChannel in = (FileChannel)(Object)new FileInputStream(args[0]).getChannel(), out = (FileChannel)(Object)new FileOutputStream(args[1]).getChannel();
        MyHelperClass BSIZE = new MyHelperClass();
        ByteBuffer buff =(ByteBuffer)(Object) ByteBuffer.allocate(BSIZE);
        while ((int)(Object)in.read(buff) != -1) {
            MyHelperClass PrintUtil = new MyHelperClass();
            PrintUtil.prt("%%%");
            buff.flip();
            out.write(buff);
            buff.clear();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass prt(String o0){ return null; }}

class FileChannel {

public MyHelperClass read(ByteBuffer o0){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }}

class ByteBuffer {

public MyHelperClass flip(){ return null; }
	public static MyHelperClass allocate(MyHelperClass o0){ return null; }
	public MyHelperClass clear(){ return null; }}
