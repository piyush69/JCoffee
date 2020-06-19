import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c20286589 {

    public static void copyFile(final File source, final File target) throws FileNotFoundException, IOException {
        FileChannel in = (FileChannel)(Object)new FileInputStream(source).getChannel(), out = (FileChannel)(Object)new FileOutputStream(target).getChannel();
        MyHelperClass ByteBuffer = new MyHelperClass();
        ByteBuffer buffer =(ByteBuffer)(Object) ByteBuffer.allocate(1024);
        while ((int)(Object)in.read(buffer) != -1) {
            buffer.flip();
            out.write(buffer);
            buffer.clear();
        }
        out.close();
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass allocate(int o0){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(ByteBuffer o0){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }}

class ByteBuffer {

public MyHelperClass flip(){ return null; }
	public MyHelperClass clear(){ return null; }}
