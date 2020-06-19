import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12120684 {
public MyHelperClass NULL;

    private void getRandomGUID(boolean secure)  throws Throwable {
        MessageDigest md5;
        StringBuilder sbValueBeforeHash = new StringBuilder();
        try {
            md5 = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            throw new ApplicationIllegalArgumentException((String)(Object)e);
        }
        long time = System.nanoTime();
        long rand = 0;
        if (secure) {
            MyHelperClass MySecureRand = new MyHelperClass();
            rand =(long)(Object) MySecureRand.nextLong();
        } else {
            MyHelperClass MyRand = new MyHelperClass();
            rand =(long)(Object) MyRand.nextLong();
        }
        MyHelperClass SId = new MyHelperClass();
        sbValueBeforeHash.append(SId);
        sbValueBeforeHash.append(":");
        sbValueBeforeHash.append(Long.toString(time));
        sbValueBeforeHash.append(":");
        sbValueBeforeHash.append(Long.toString(rand));
        String valueBeforeHash =(String)(Object) NULL; //new String();
        valueBeforeHash = sbValueBeforeHash.toString();
//        MyHelperClass valueBeforeHash = new MyHelperClass();
        md5.update(valueBeforeHash.getBytes());
        byte[] array = md5.digest();
        StringBuffer sb = new StringBuffer();
        for (int j = 0; j < array.length; ++j) {
            int b = array[j] & 0xFF;
            if (b < 0x10) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(b));
        }
        String valueAfterHash =(String)(Object) NULL; //new String();
        valueAfterHash = sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass nextLong(){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class ApplicationIllegalArgumentException extends Exception{
	public ApplicationIllegalArgumentException(String errorMessage) { super(errorMessage); }
}
