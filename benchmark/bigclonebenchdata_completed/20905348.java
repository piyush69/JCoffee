import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20905348 {

    public static String SHA1(String password) throws Throwable, BusinessException {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.update(password.getBytes());
            BigInteger hash = new BigInteger(1, digest.digest());
            return hash.toString(16);
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new BusinessException();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BusinessException extends Exception{
	public BusinessException(String errorMessage) { super(errorMessage); }
	BusinessException(){}
}
