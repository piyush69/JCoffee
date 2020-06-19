import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20586748 {

    public static String getMD5(String text)  throws Throwable {
        if (text == null) {
            return null;
        }
        String result = null;
        try {
            MyHelperClass ALG_MD5 = new MyHelperClass();
            MessageDigest md5 = MessageDigest.getInstance((String)(Object)ALG_MD5);
            MyHelperClass ENCODING = new MyHelperClass();
            md5.update(text.getBytes((String)(Object)ENCODING));
            result = "" + new BigInteger(1, md5.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
