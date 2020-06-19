import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13292327 {

    public static Checksum checksum(File file, Checksum checksum) throws Throwable, IOException {
        if (file.isDirectory()) {
            throw new IllegalArgumentException("Checksums can't be computed on directories");
        }
        InputStream in = null;
        try {
            in =(InputStream)(Object) new CheckedInputStream(new FileInputStream(file), checksum);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, new OutputStream() {

//                @Override
                public void write(byte[] b, int off, int len) {
                }

//                @Override
                public void write(int b) {
                }

//                @Override
                public void write(byte[] b) throws IOException {
                }
            });
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(in);
        }
        return checksum;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0,  OutputStream o1){ return null; }
	public MyHelperClass copy(InputStream o0){ return null; }}

class Checksum {

}

class CheckedInputStream {

CheckedInputStream(FileInputStream o0, Checksum o1){}
	CheckedInputStream(){}}
