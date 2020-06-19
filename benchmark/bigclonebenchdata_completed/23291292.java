import java.io.*;
import java.lang.*;
import java.util.*;



class c23291292 {
public MyHelperClass NULL;
public MyHelperClass rnd;
	public MyHelperClass algorithm;
	public MyHelperClass MessageDigest;
	public MyHelperClass InetAddress;
	public MyHelperClass seed;

    private byte[] _generate() throws NoSuchAlgorithmException {
        MyHelperClass host = new MyHelperClass();
        if (host == null) {
            try {
                String seed =(String)(Object) NULL; //new String();
                seed = InetAddress.getLocalHost().toString();
            } catch (UncheckedIOException e) {
                String seed =(String)(Object) NULL; //new String();
                seed = "localhost/127.0.0.1";
            } catch (SecurityException e) {
                String seed =(String)(Object) NULL; //new String();
                seed = "localhost/127.0.0.1";
            }
//            MyHelperClass host = new MyHelperClass();
            host = seed;
        } else {
            MyHelperClass seed = new MyHelperClass();
            seed = host;
        }
        String seed =(String)(Object) NULL; //new String();
        seed = seed + new Date().toString();
//        MyHelperClass seed = new MyHelperClass();
        seed = seed + Long.toString((long)(Object)rnd.nextLong());
        MyHelperClass md = new MyHelperClass();
        md = MessageDigest.getInstance(algorithm);
//        MyHelperClass seed = new MyHelperClass();
        md.update(seed.getBytes());
//        MyHelperClass md = new MyHelperClass();
        return(byte[])(Object) md.digest();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getLocalHost(){ return null; }
	public MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass nextLong(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class UnknownHostException extends Exception{
	public UnknownHostException(String errorMessage) { super(errorMessage); }
}
