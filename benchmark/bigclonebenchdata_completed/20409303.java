import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20409303 {

    private String md5(String input)  throws Throwable {
        MessageDigest md5Digest;
        try {
            md5Digest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new UserException("could not get a md5 message digest", e);
        }
        md5Digest.update(input.getBytes());
        return new String(md5Digest.digest());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class UserException extends Exception{
	public UserException(String errorMessage) { super(errorMessage); }
	UserException(){}
	UserException(String o0, NoSuchAlgorithmException o1){}
}
