import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c20247400 {

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("arguments: sourcefile destfile");
            System.exit(1);
        }
        FileChannel in = (FileChannel)(Object)new FileInputStream(args[0]).getChannel(), out = (FileChannel)(Object)new FileOutputStream(args[1]).getChannel();
        MyHelperClass BSIZE = new MyHelperClass();
        ByteBuffer buffer =(ByteBuffer)(Object) ByteBuffer.allocate(BSIZE);
        while ((int)(Object)in.read(buffer) != -1) {
            buffer.flip();
            out.write(buffer);
            buffer.clear();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileChannel {

public MyHelperClass read(ByteBuffer o0){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }}

class ByteBuffer {

public MyHelperClass flip(){ return null; }
	public static MyHelperClass allocate(MyHelperClass o0){ return null; }
	public MyHelperClass clear(){ return null; }}
