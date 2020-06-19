import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c8401358 {
public MyHelperClass srcName;
	public MyHelperClass maxSize;

    public void run() {
        FileInputStream src;
        try {
            MyHelperClass srcName = new MyHelperClass();
            src = new FileInputStream((String)(Object)srcName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        FileOutputStream dest;
        FileChannel srcC =(FileChannel)(Object) src.getChannel();
        MyHelperClass BUFFER_SIZE = new MyHelperClass();
        ByteBuffer buf =(ByteBuffer)(Object) ByteBuffer.allocateDirect(BUFFER_SIZE);
        try {
            int i = 1;
            int fileNo = 0;
            long maxByte =(int)(Object) this.maxSize << 10;
            long nbByte =(long)(Object) srcC.size();
            long nbFile = (nbByte / maxByte) + 1;
            for (fileNo = 0; fileNo < nbFile; fileNo++) {
                long fileByte = 0;
                String destName = srcName + "_" + fileNo;
                dest = new FileOutputStream(destName);
                FileChannel destC =(FileChannel)(Object) dest.getChannel();
                while ((i > 0) && fileByte < maxByte) {
                    i =(int)(Object) srcC.read(buf);
                    buf.flip();
                    fileByte += i;
                    destC.write(buf);
                    buf.compact();
                }
                destC.close();
                dest.close();
            }
        } catch (IOException e1) {
            e1.printStackTrace();
            return;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass read(ByteBuffer o0){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }}

class ByteBuffer {

public static MyHelperClass allocateDirect(MyHelperClass o0){ return null; }
	public MyHelperClass flip(){ return null; }
	public MyHelperClass compact(){ return null; }}
