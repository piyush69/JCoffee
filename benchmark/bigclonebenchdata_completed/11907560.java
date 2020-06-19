import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11907560 {

    public static String hash(String text)  throws Throwable {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(text.getBytes());
            byte[] digest = md.digest();
            StringBuffer sb = new StringBuffer(digest.length * 2);
            for (int i = 0; i < digest.length; ++i) {
                byte b = digest[i];
                int high = (b & 0xF0) >> 4;
                int low = b & 0xF;
MyHelperClass[] DECIMAL_HEX = new MyHelperClass[5];
                sb.append(DECIMAL_HEX[high]);
//                MyHelperClass DECIMAL_HEX = new MyHelperClass();
                sb.append(DECIMAL_HEX[low]);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new NonBusinessException("Error hashing string", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] DECIMAL_HEX;
}

class NonBusinessException extends Exception{
	public NonBusinessException(String errorMessage) { super(errorMessage); }
	NonBusinessException(){}
	NonBusinessException(String o0, NoSuchAlgorithmException o1){}
}
