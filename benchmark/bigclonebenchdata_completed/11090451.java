import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c11090451 {

    public static String md5(String str) {
        try {
            MessageDigest digest = java.security.MessageDigest.getInstance("MD5");
            digest.update(str.getBytes());
            byte messageDigest[] = digest.digest();
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < messageDigest.length; i++) hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
            String md5 = hexString.toString();
            MyHelperClass Log = new MyHelperClass();
            Log.v(FileUtil.class.getName(), md5);
            return md5;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass v(String o0, String o1){ return null; }}

class FileUtil {

}
