import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c658771 {

    public static void main(String[] args) throws Throwable, Exception {
        String codecClassname = args[0];
        Class<?> codecClass = Class.forName(codecClassname);
        Configuration conf = new Configuration();
        MyHelperClass ReflectionUtils = new MyHelperClass();
        CompressionCodec codec = (CompressionCodec)(CompressionCodec)(Object) ReflectionUtils.newInstance(codecClass, conf);
        CompressionOutputStream out =(CompressionOutputStream)(Object) codec.createOutputStream(System.out);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copyBytes(System.in, out, 4096, false);
        out.finish();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyBytes(InputStream o0, CompressionOutputStream o1, int o2, boolean o3){ return null; }
	public MyHelperClass newInstance(Class o0, Configuration o1){ return null; }}

class Configuration {

}

class CompressionCodec {

public MyHelperClass createOutputStream(PrintStream o0){ return null; }}

class CompressionOutputStream {

public MyHelperClass finish(){ return null; }}
