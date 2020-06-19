import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16588230 {

    public static void main(String[] args) throws Throwable, IOException {
        MSPack pack = new MSPack(new FileInputStream(args[0]));
        String[] files = pack.getFileNames();
        for (int i = 0; i < files.length; i++) System.out.println(i + ": " + files[i] + ": " + pack.getLengths()[i]);
        System.out.println("Writing " + files[files.length - 1]);
        InputStream is = pack.getInputStream(files.length - 1);
        OutputStream os = new FileOutputStream(files[files.length - 1]);
        int n;
        byte[] buf = new byte[4096];
        while ((n = is.read(buf)) != -1) os.write(buf, 0, n);
        os.close();
        is.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MSPack {

MSPack(FileInputStream o0){}
	MSPack(){}
	public MyHelperClass getInputStream(int o0){ return null; }
	public MyHelperClass getFileNames(){ return null; }
	public MyHelperClass getLengths(){ return null; }}
