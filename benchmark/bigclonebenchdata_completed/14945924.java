import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14945924 {
public static MyHelperClass logger;
//public MyHelperClass logger;
	public static MyHelperClass pad(String o0, int o1, char o2){ return null; }
//public MyHelperClass pad(String o0, int o1, char o2){ return null; }

    public static String hashPassword(String password)  throws Throwable {
        String hashword = null;
        try {
            MyHelperClass MESSAGE_DIGEST_ALGORITHM_MD5 = new MyHelperClass();
            MessageDigest md5 = MessageDigest.getInstance((String)(Object)MESSAGE_DIGEST_ALGORITHM_MD5);
            md5.update(password.getBytes());
            BigInteger hash = new BigInteger(1, md5.digest());
            hashword = hash.toString(16);
        } catch (NoSuchAlgorithmException e) {
            MyHelperClass MESSAGE_DIGEST_ALGORITHM_MD5 = new MyHelperClass();
            logger.error("Cannot find algorithm = '" + MESSAGE_DIGEST_ALGORITHM_MD5 + "'", e);
            throw new IllegalStateException(e);
        }
        return(String)(Object) pad(hashword, 32, '0');
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, NoSuchAlgorithmException o1){ return null; }}
