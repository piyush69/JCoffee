import java.io.*;
import java.lang.*;
import java.util.*;



class c9913187 {
public static MyHelperClass DEFAULT_PASSWORD_ENCODING;
	public static MyHelperClass log;
	public static MyHelperClass MessageDigest;
	public static MyHelperClass DEFAULT_PASSWORD_DIGEST;
	public static MyHelperClass validatePassword(String o0){ return null; }
//public MyHelperClass DEFAULT_PASSWORD_DIGEST;
//	public MyHelperClass DEFAULT_PASSWORD_ENCODING;
//	public MyHelperClass log;
//	public MyHelperClass MessageDigest;
//	public MyHelperClass validatePassword(String o0){ return null; }

    protected static String encodePassword(String raw_password) throws DatabaseException {
        String clean_password =(String)(Object) validatePassword(raw_password);
        try {
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(DEFAULT_PASSWORD_DIGEST);
            md.update(clean_password.getBytes((String)(Object)DEFAULT_PASSWORD_ENCODING));
            String digest = new String((String)(Object)Base64.encodeBase64(md.digest()));
            if ((boolean)(Object)log.isDebugEnabled()) log.debug("encodePassword: digest=" + digest);
            return digest;
        } catch (UnsupportedEncodingException e) {
            throw new DatabaseException("encoding-problem with password", e);
        } catch (UncheckedIOException e) {
            throw new DatabaseException("digest-problem encoding password",(UnsupportedEncodingException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }}

class DatabaseException extends Exception{
	public DatabaseException(String errorMessage) { super(errorMessage); }
	DatabaseException(String o0, UnsupportedEncodingException o1){}
	DatabaseException(){}
	DatabaseException(String o0, NoSuchAlgorithmException o1){}
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class Base64 {

public static MyHelperClass encodeBase64(MyHelperClass o0){ return null; }}
