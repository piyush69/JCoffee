import java.io.*;
import java.lang.*;
import java.util.*;



class c15629443 {

    public static String encryptPassword(String password) throws PasswordException {
        String hash = null;
        if (password != null && !password.equals("")) {
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
                md.update(password.getBytes("UTF-8"));
                byte raw[] =(byte[])(Object) md.digest();
                hash =(String)(Object) (new BASE64Encoder()).encode(raw);
            } catch (UncheckedIOException nsae) {
                MyHelperClass PasswordException = new MyHelperClass();
                throw new PasswordException((String)(Object)PasswordException.SYSTEM_ERROR);
            } catch (UnsupportedEncodingException uee) {
                MyHelperClass PasswordException = new MyHelperClass();
                throw new PasswordException((String)(Object)PasswordException.SYSTEM_ERROR);
            }
        }
        return hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SYSTEM_ERROR;
public MyHelperClass getInstance(String o0){ return null; }}

class PasswordException extends Exception{
	public PasswordException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
