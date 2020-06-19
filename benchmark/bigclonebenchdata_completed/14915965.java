import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14915965 {

    protected static String getInitialUUID()  throws Throwable {
        MyHelperClass myRand = new MyHelperClass();
        if (myRand == null) {
//            MyHelperClass myRand = new MyHelperClass();
            myRand =(MyHelperClass)(Object) new Random();
        }
//        MyHelperClass myRand = new MyHelperClass();
        long rand =(long)(Object) myRand.nextLong();
        String sid;
        try {
            sid = InetAddress.getLocalHost().toString();
        } catch (UnknownHostException e) {
            sid = Thread.currentThread().getName();
        }
        StringBuffer sb = new StringBuffer();
        sb.append(sid);
        sb.append(":");
        sb.append(Long.toString(rand));
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new OMException((String)(Object)e);
        }
        md5.update(sb.toString().getBytes());
        byte[] array = md5.digest();
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

public MyHelperClass nextLong(){ return null; }
	public MyHelperClass nextInt(){ return null; }}

class OMException extends Exception{
	public OMException(String errorMessage) { super(errorMessage); }
}
