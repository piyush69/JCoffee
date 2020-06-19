import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7794666 {

    private static String getUnsaltedHash(String algorithm, String input) throws Throwable, NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.reset();
        MyHelperClass Main = new MyHelperClass();
        messageDigest.update(input.getBytes((String)(Object)Main.DEFAULT_CHARSET));
        byte[] digest = messageDigest.digest();
//        MyHelperClass Main = new MyHelperClass();
        return String.format((String)(Object)Main.DEFAULT_LOCALE, "%0" + (digest.length << 1) + "x", new BigInteger(1, digest));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEFAULT_LOCALE;
	public MyHelperClass DEFAULT_CHARSET;
}

class BigInteger {

BigInteger(){}
	BigInteger(int o0, byte[] o1){}}
