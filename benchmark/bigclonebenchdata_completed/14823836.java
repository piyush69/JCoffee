import java.io.*;
import java.lang.*;
import java.util.*;



class c14823836 {

    protected static String getInitialUUID() {
        MyHelperClass myRand = new MyHelperClass();
        if (myRand == null) {
//            MyHelperClass myRand = new MyHelperClass();
            myRand =(MyHelperClass)(Object) new Random();
        }
//        MyHelperClass myRand = new MyHelperClass();
        long rand =(long)(Object) myRand.nextLong();
        String sid;
        try {
            MyHelperClass InetAddress = new MyHelperClass();
            sid = InetAddress.getLocalHost().toString();
        } catch (UncheckedIOException e) {
            sid = Thread.currentThread().getName();
        }
        StringBuffer sb = new StringBuffer();
        sb.append(sid);
        sb.append(":");
        sb.append(Long.toString(rand));
        MessageDigest md5 = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
        }
        md5.update(sb.toString().getBytes());
        byte[] array =(byte[])(Object) md5.digest();
        StringBuffer sb2 = new StringBuffer();
        for (int j = 0; j < array.length; ++j) {
            int b = array[j] & 0xFF;
            sb2.append(Integer.toHexString(b));
        }
//        MyHelperClass myRand = new MyHelperClass();
        int begin =(int)(Object) myRand.nextInt();
        if (begin < 0) begin = begin * -1;
        begin = begin % 8;
        return sb2.toString().substring(begin, begin + 18).toUpperCase();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getLocalHost(){ return null; }
	public MyHelperClass nextLong(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass nextInt(){ return null; }}

class UnknownHostException extends Exception{
	public UnknownHostException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
