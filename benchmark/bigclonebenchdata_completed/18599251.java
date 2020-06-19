import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18599251 {

    public static String hash(String plainTextPwd)  throws Throwable {
        MessageDigest hashAlgo;
        try {
            hashAlgo = java.security.MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new QwickException((String)(Object)e);
        }
        hashAlgo.update(plainTextPwd.getBytes());
        return new String(hashAlgo.digest());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class QwickException extends Exception{
	public QwickException(String errorMessage) { super(errorMessage); }
}
