import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13337915 {

    private static String calculateMD5(String s)  throws Throwable {
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.reset();
            m.update(s.getBytes());
            return new BigInteger(1, m.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            throw new UndeclaredThrowableException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class UndeclaredThrowableException extends Exception{
	public UndeclaredThrowableException(String errorMessage) { super(errorMessage); }
}
