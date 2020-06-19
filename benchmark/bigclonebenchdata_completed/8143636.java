import java.io.*;
import java.lang.*;
import java.util.*;



class c8143636 {
public MyHelperClass GlobalUITools;

    public boolean validatePassword(UserType nameMatch, String password) {
        try {
            MyHelperClass HASH_ALGORITHM = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(HASH_ALGORITHM);
            md.reset();
            md.update((byte[])(Object)nameMatch.getSalt().getBytes("UTF-8"));
            md.update(password.getBytes("UTF-8"));
            String encodedString = new String((String)(Object)Base64.encode(md.digest()));
            return encodedString.equals(nameMatch.getPassword());
        } catch (UnsupportedEncodingException ex) {
            MyHelperClass logger = new MyHelperClass();
            logger.fatal("Your computer does not have UTF-8 support for Java installed.", ex);
//            MyHelperClass logger = new MyHelperClass();
            logger.fatal("Shutting down...");
            MyHelperClass GlobalUITools = new MyHelperClass();
            GlobalUITools.displayFatalExceptionMessage(null, "UTF-8 for Java not installed", ex, true);
            assert false : "This should never happen";
            return false;
        } catch (UncheckedIOException ex) {
            MyHelperClass HASH_ALGORITHM = new MyHelperClass();
            String errorMessage = "Could not use algorithm " + HASH_ALGORITHM;
            MyHelperClass logger = new MyHelperClass();
            logger.fatal(ex.getMessage());
//            MyHelperClass logger = new MyHelperClass();
            logger.fatal(errorMessage);
//            MyHelperClass HASH_ALGORITHM = new MyHelperClass();
            GlobalUITools.displayFatalExceptionMessage(null, "Could not use algorithm " + HASH_ALGORITHM,(UnsupportedEncodingException)(Object) ex, true);
            assert false : "This could should never be reached";
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fatal(String o0){ return null; }
	public MyHelperClass getBytes(String o0){ return null; }
	public MyHelperClass fatal(String o0, UnsupportedEncodingException o1){ return null; }
	public MyHelperClass displayFatalExceptionMessage(Object o0, String o1, UnsupportedEncodingException o2, boolean o3){ return null; }}

class UserType {

public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getSalt(){ return null; }}

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
