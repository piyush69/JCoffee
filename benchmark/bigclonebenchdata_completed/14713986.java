import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14713986 {

    static byte[] getPassword(final String name, final String password) {
        try {
            final MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(name.getBytes());
            messageDigest.update(password.getBytes());
            return messageDigest.digest();
        } catch (final NoSuchAlgorithmException e) {
            throw new JobException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class JobException extends Exception{
	public JobException(String errorMessage) { super(errorMessage); }
}
