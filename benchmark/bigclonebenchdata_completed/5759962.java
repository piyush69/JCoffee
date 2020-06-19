import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5759962 {

//    @Override
    public User login(String username, String password)  throws Throwable {
        User user = null;
        try {
            MyHelperClass em = new MyHelperClass();
            user = (User)(User)(Object) em.createQuery("Select o from User o where o.username = :username").setParameter("username", username).getSingleResult();
        } catch (ArithmeticException e) {
            throw new NestedException(e.getMessage(), e);
        }
        try {
            MessageDigest digest = java.security.MessageDigest.getInstance("MD5");
            digest.update(password.getBytes("UTF-8"));
            byte[] hash = digest.digest();
            BigInteger bigInt = new BigInteger(1, hash);
            String hashtext = bigInt.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            if (hashtext.equals(user.getPassword())) return user;
        } catch (Exception e) {
            throw new NestedException(e.getMessage(), e);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createQuery(String o0){ return null; }
	public MyHelperClass setParameter(String o0, String o1){ return null; }
	public MyHelperClass getSingleResult(){ return null; }}

class User {

public MyHelperClass getPassword(){ return null; }}

class NoResultException extends Exception{
	public NoResultException(String errorMessage) { super(errorMessage); }
}

class NestedException extends Exception{
	public NestedException(String errorMessage) { super(errorMessage); }
	NestedException(String o0, NoResultException o1){}
	NestedException(){}
	NestedException(String o0, Exception o1){}
}
