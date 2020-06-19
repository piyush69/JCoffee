import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6150059 {
public MyHelperClass setState(String o0, MyHelperClass o1){ return null; }

    private void nioBuild()  throws Throwable {
        try {
            MyHelperClass ByteBuffer = new MyHelperClass();
            final ByteBuffer buffer =(ByteBuffer)(Object) ByteBuffer.allocateDirect(1024 * 4);
            MyHelperClass dest = new MyHelperClass();
            final FileChannel out = (FileChannel)(Object)new FileOutputStream((String)(Object)dest).getChannel();
            MyHelperClass parts = new MyHelperClass();
            for (File part :(File[])(Object) (Object[])(Object)parts) {
                MyHelperClass BUILDING = new MyHelperClass();
                setState(part.getName(), BUILDING);
                FileChannel in = (FileChannel)(Object)new FileInputStream(part).getChannel();
                while ((int)(Object)in.read(buffer) > 0) {
                    buffer.flip();
                    MyHelperClass written = new MyHelperClass();
                   (int)(Object) written += (int)(Object)out.write(buffer);
                    buffer.clear();
                }
                in.close();
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass allocateDirect(int o0){ return null; }}

class ByteBuffer {

public MyHelperClass clear(){ return null; }
	public MyHelperClass flip(){ return null; }}

class FileChannel {

public MyHelperClass read(ByteBuffer o0){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }
	public MyHelperClass close(){ return null; }}
