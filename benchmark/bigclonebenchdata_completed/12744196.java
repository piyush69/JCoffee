import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12744196 {
public MyHelperClass s_id;
	public MyHelperClass myRand;
	public MyHelperClass valueAfterMD5;

    public  void RandomGUID()  throws Throwable {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e.getClass().getName() + ": " + e.getMessage());
        }
        try {
            long time = System.currentTimeMillis();
            long rand = 0;
            rand =(long)(Object) myRand.nextLong();
            StringBuffer sb = new StringBuffer();
            sb.append(s_id);
            sb.append(":");
            sb.append(Long.toString(time));
            sb.append(":");
            sb.append(Long.toString(rand));
            md5.update(sb.toString().getBytes());
            byte[] array = md5.digest();
            sb.setLength(0);
            for (int j = 0; j < array.length; ++j) {
                int b = array[j] & 0xFF;
                if (b < 0x10) sb.append('0');
                sb.append(Integer.toHexString(b));
            }
            valueAfterMD5 =(MyHelperClass)(Object) sb.toString();
        } catch (Exception e) {
            throw new RuntimeException(e.getClass().getName() + ": " + e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass nextLong(){ return null; }}
