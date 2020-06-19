import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c746929 {

    public static void main(String[] args) throws Throwable, Exception {
        String localSrc = args[0];
        String dst = args[1];
        InputStream in = new BufferedInputStream(new FileInputStream(localSrc));
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(URI.create(dst), conf);
        OutputStream out = fs.create(new Path(dst), new Progressable() {

            public void progress() {
                System.out.print(".");
            }
        });
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copyBytes(in, out, 4096, true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyBytes(InputStream o0, OutputStream o1, int o2, boolean o3){ return null; }}

class Configuration {

}

class Path {

Path(String o0){}
	Path(){}}

class Progressable {

}
