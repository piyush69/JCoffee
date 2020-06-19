import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6936843 {
public static MyHelperClass getRandomNumber(){ return null; }
	public static MyHelperClass isEmpty(String o0){ return null; }
//public MyHelperClass getRandomNumber(){ return null; }
//	public MyHelperClass isEmpty(String o0){ return null; }

    private static String getVisitorId(String guid, String account, String userAgent, Cookie cookie) throws Throwable, NoSuchAlgorithmException, UnsupportedEncodingException {
        if (cookie != null && cookie.getValue() != null) {
            return(String)(Object) cookie.getValue();
        }
        String message;
        if (!(Boolean)(Object)isEmpty(guid)) {
            message = guid + account;
        } else {
            message = userAgent + getRandomNumber() + UUID.randomUUID().toString();
        }
        MessageDigest m = MessageDigest.getInstance("MD5");
        m.update(message.getBytes("UTF-8"), 0, message.length());
        byte[] sum = m.digest();
        BigInteger messageAsNumber = new BigInteger(1, sum);
        String md5String = messageAsNumber.toString(16);
        while (md5String.length() < 32) {
            md5String = "0" + md5String;
        }
        return "0x" + md5String.substring(0, 16);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Cookie {

public MyHelperClass getValue(){ return null; }}
