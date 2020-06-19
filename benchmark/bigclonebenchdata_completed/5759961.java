import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5759961 {

//    @Override
    public User saveUser(User user)  throws Throwable {
        try {
            MessageDigest digest = java.security.MessageDigest.getInstance("MD5");
            digest.update((byte)(Object)user.getPassword().getBytes("UTF-8"));
            byte[] hash = digest.digest();
            BigInteger bigInt = new BigInteger(1, hash);
            String hashtext = bigInt.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            user.setPassword(hashtext);
            user.setDataRegjistrimit(new Date());
            MyHelperClass em = new MyHelperClass();
            return(User)(Object) em.merge(user);
        } catch (Exception e) {
            throw new NestedException(e.getMessage(), e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(String o0){ return null; }
	public MyHelperClass merge(User o0){ return null; }}

class User {

public MyHelperClass setPassword(String o0){ return null; }
	public MyHelperClass setDataRegjistrimit(Date o0){ return null; }
	public MyHelperClass getPassword(){ return null; }}

class NestedException extends Exception{
	public NestedException(String errorMessage) { super(errorMessage); }
	NestedException(){}
	NestedException(String o0, Exception o1){}
}
