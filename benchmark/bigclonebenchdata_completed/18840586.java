import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c18840586 {

    public static String encodeString(String encodeType, String str) {
        if (encodeType.equals("md5of16")) {
            MD5 m = new MD5();
            return(String)(Object) m.getMD5ofStr16(str);
        } else if (encodeType.equals("md5of32")) {
            MD5 m = new MD5();
            return(String)(Object) m.getMD5ofStr(str);
        } else {
            try {
                MessageDigest gv = MessageDigest.getInstance(encodeType);
                gv.update(str.getBytes());
                return (String)(Object)new BASE64Encoder().encode(gv.digest());
            } catch (java.security.NoSuchAlgorithmException e) {
                MyHelperClass logger = new MyHelperClass();
                logger.error("BASE64加密失败", e);
                return null;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, NoSuchAlgorithmException o1){ return null; }}

class MD5 {

public MyHelperClass getMD5ofStr16(String o0){ return null; }
	public MyHelperClass getMD5ofStr(String o0){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
