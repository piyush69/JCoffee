import java.io.*;
import java.lang.*;
import java.util.*;



class c17486397 {

    public static String getUserToken(String userName) {
        if (userName != null && userName.trim().length() > 0) try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            MyHelperClass seed = new MyHelperClass();
            md.update((userName + seed).getBytes("ISO-8859-1"));
            MyHelperClass BaseController = new MyHelperClass();
            return(String)(Object) BaseController.bytesToHex(md.digest());
        } catch (NullPointerException npe) {
        } catch (UncheckedIOException e) {
        } catch (UnsupportedEncodingException e) {
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass bytesToHex(MyHelperClass o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
