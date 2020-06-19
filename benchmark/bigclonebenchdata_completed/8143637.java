import java.io.*;
import java.lang.*;
import java.util.*;



class c8143637 {
public MyHelperClass markModified(UserType o0){ return null; }

    public void setPassword(UserType user, String clearPassword) {
        try {
            Random r = new Random();
            String newSalt = Long.toString(Math.abs(r.nextLong()));
            MyHelperClass HASH_ALGORITHM = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(HASH_ALGORITHM);
            md.reset();
            md.update(newSalt.getBytes("UTF-8"));
            md.update(clearPassword.getBytes("UTF-8"));
            String encodedString = new String((String)(Object)Base64.encode(md.digest()));
            user.setPassword(encodedString);
            user.setSalt(newSalt);
            this.markModified(user);
        } catch (UnsupportedEncodingException ex) {
            MyHelperClass logger = new MyHelperClass();
            logger.fatal("Your computer does not have UTF-8 support for Java installed.", ex);
            MyHelperClass GlobalUITools = new MyHelperClass();
            GlobalUITools.displayFatalExceptionMessage(null, "UTF-8 for Java not installed", ex, true);
        } catch (UncheckedIOException ex) {
            MyHelperClass HASH_ALGORITHM = new MyHelperClass();
            String errorMessage = "Could not use algorithm " + HASH_ALGORITHM;
            MyHelperClass logger = new MyHelperClass();
            logger.fatal(errorMessage,(NoSuchAlgorithmException)(Object) ex);
            MyHelperClass GlobalUITools = new MyHelperClass();
            GlobalUITools.displayFatalExceptionMessage((Object)(Object)null, errorMessage,(NoSuchAlgorithmException)(Object) ex, true);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fatal(String o0, NoSuchAlgorithmException o1){ return null; }
	public MyHelperClass fatal(String o0, UnsupportedEncodingException o1){ return null; }
	public MyHelperClass displayFatalExceptionMessage(Object o0, String o1, NoSuchAlgorithmException o2, boolean o3){ return null; }
	public MyHelperClass displayFatalExceptionMessage(Object o0, String o1, UnsupportedEncodingException o2, boolean o3){ return null; }}

class UserType {

public MyHelperClass setSalt(String o0){ return null; }
	public MyHelperClass setPassword(String o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }
	public static MyHelperClass getInstance(MyHelperClass o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class Base64 {

public static MyHelperClass encode(MyHelperClass o0){ return null; }}
