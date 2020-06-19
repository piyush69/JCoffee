import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8983115 {
public MyHelperClass[] files;
public MyHelperClass PARTS;
//public MyHelperClass files;
	public MyHelperClass j;
	public MyHelperClass ObjectClone;

                public void run()  throws Throwable {
MyHelperClass[] readers = new MyHelperClass[5];
                    ShareFolder part = (ShareFolder) ObjectClone.clone(readers[(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)j]);
//                    MyHelperClass readers = new MyHelperClass();
                    ShareFileReader reader = new ShareFileReader(readers[(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)j], files[0]);
//                    MyHelperClass readers = new MyHelperClass();
                    ShareFileWriter writer = new ShareFileWriter(part, new File("Downloads/" + readers[(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)j].getName()));
                    long tot = 0;
                    byte[] b = new byte[(int) (Math.random() * 10000)];
//                    MyHelperClass readers = new MyHelperClass();
                    while (tot < readers[(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)j].getSize()) {
                        reader.read(b);
                        byte[] bwrite = new byte[(int) (Math.random() * 10000) + b.length];
                        System.arraycopy(b, 0, bwrite, 0, b.length);
                        writer.write(bwrite, b.length);
                        tot += b.length;
                    }
                    MyHelperClass done = new MyHelperClass();
                    done++;
//                    MyHelperClass done = new MyHelperClass();
                    System.out.println((int) ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(double)(Object)done * 100.0 / (double)(Object)PARTS) + "% Complete");
                }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public int done;
	public MyHelperClass[] readers;
public MyHelperClass getName(){ return null; }
	public MyHelperClass getSize(){ return null; }}

class ShareFolder {

}

class ShareFileReader {

public MyHelperClass read(byte[] o0){ return null; }}

class ShareFileWriter {

ShareFileWriter(){}
	ShareFileWriter(ShareFolder o0, File o1){}
	public MyHelperClass write(byte[] o0, int o1){ return null; }}

class Object {

public MyHelperClass clone(MyHelperClass o0){ return null; }}
