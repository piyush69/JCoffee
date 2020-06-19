import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8983114 {
public MyHelperClass NULL;
public MyHelperClass assertEquals(String o0, String o1){ return null; }

//    @Test
    public void testWrite()  throws Throwable {
        System.out.println("write");
        MyHelperClass sharePath = new MyHelperClass();
        final File[] files = { new File((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)sharePath) };
        System.out.println("Creating hash...");
        MyHelperClass MD5File = new MyHelperClass();
        String initHash =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) MD5File.MD5Directory(files[0]);
        System.out.println("Hash: " + initHash);
        MyHelperClass ShareUtility = new MyHelperClass();
        Share readShare =(Share)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) ShareUtility.createShare(files, "TestShare");
        System.out.println("Creating shares...");
        MyHelperClass PARTS = new MyHelperClass();
        final ShareFolder[] readers =(ShareFolder[])(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) ShareUtility.cropShareToParts(readShare, PARTS);
        System.out.println("Reading and writing shares...");
        int done =(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) NULL; //new int();
        done = 0;
//        MyHelperClass PARTS = new MyHelperClass();
        for (int i = 0; i <(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) (int)(Object)PARTS; i++) {
            final int j = i;
            new Thread() {

                public void run() {
                    MyHelperClass ObjectClone = new MyHelperClass();
                    ShareFolder part = (ShareFolder) ObjectClone.clone(readers[j]);
                    ShareFileReader reader = new ShareFileReader(readers[j], files[0]);
                    ShareFileWriter writer = new ShareFileWriter(part, new File("Downloads/" + readers[j].getName()));
                    long tot = 0;
                    byte[] b = new byte[(int) (Math.random() * 10000)];
                    while (tot <(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) (long)(Object)readers[j].getSize()) {
                        reader.read(b);
                        byte[] bwrite = new byte[(int) (Math.random() * 10000) + b.length];
                        System.arraycopy(b, 0, bwrite, 0, b.length);
                        writer.write(bwrite, b.length);
                        tot += b.length;
                    }
                    MyHelperClass done = new MyHelperClass();
                    done++;
//                    MyHelperClass done = new MyHelperClass();
                    System.out.println((int) ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(double)(Object)done * 100.0 / PARTS) + "% Complete");
                }
            }.start();
        }
//        MyHelperClass done = new MyHelperClass();
        while (done <(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) (int)(Object)PARTS) {
            Thread.yield();
        }
        File resultFile = new File("Downloads/" + readShare.getName());
        System.out.println("Creating hash of written share...");
//        MyHelperClass MD5File = new MyHelperClass();
        String resultHash =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) MD5File.MD5Directory(resultFile);
        System.out.println("Init hash:   " + initHash);
        System.out.println("Result hash: " + resultHash);
        assertEquals(initHash, resultHash);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public int done;
public MyHelperClass createShare(File[] o0, String o1){ return null; }
	public MyHelperClass cropShareToParts(Share o0, MyHelperClass o1){ return null; }
	public MyHelperClass MD5Directory(File o0){ return null; }}

class Test {

}

class Share {

public MyHelperClass getName(){ return null; }}

class ShareFolder {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getSize(){ return null; }}

class ShareFileReader {

ShareFileReader(){}
	ShareFileReader(ShareFolder o0, File o1){}
	public MyHelperClass read(byte[] o0){ return null; }}

class ShareFileWriter {

ShareFileWriter(){}
	ShareFileWriter(ShareFolder o0, File o1){}
	public MyHelperClass write(byte[] o0, int o1){ return null; }}

class Object {

public MyHelperClass clone(ShareFolder o0){ return null; }}
