import java.io.*;
import java.lang.*;
import java.util.*;



class c2275418 {

    private String calculateCredential(Account account) {
        MessageDigest md5 = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            return null;
        }
        try {
            md5.update((byte[])(Object)account.getUsername().getBytes("UTF-8"));
            md5.update((byte[])(Object)account.getCryptPassword().getBytes("UTF-8"));
            md5.update(String.valueOf(account.getObjectId()).getBytes("UTF-8"));
            md5.update((byte[])(Object)account.getUid().getBytes("UTF-8"));
            byte[] digest =(byte[])(Object) md5.digest();
            MyHelperClass TextUtils = new MyHelperClass();
            return(String)(Object) TextUtils.calculateMD5(digest);
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass calculateMD5(byte[] o0){ return null; }
	public MyHelperClass getBytes(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class Account {

public MyHelperClass getObjectId(){ return null; }
	public MyHelperClass getCryptPassword(){ return null; }
	public MyHelperClass getUsername(){ return null; }
	public MyHelperClass getUid(){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
