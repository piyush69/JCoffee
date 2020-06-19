import java.io.*;
import java.lang.*;
import java.util.*;



class c5935063 {

    public String generateKey(Message msg) {
        String text =(String)(Object) msg.getDefaultMessage();
        String meaning =(String)(Object) msg.getMeaning();
        if (text == null) {
            return null;
        }
        MessageDigest md5;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            throw new RuntimeException("Error initializing MD5", e);
        }
        try {
            md5.update(text.getBytes("UTF-8"));
            if (meaning != null) {
                md5.update(meaning.getBytes("UTF-8"));
            }
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 unsupported", e);
        }
        MyHelperClass StringUtils = new MyHelperClass();
        return(String)(Object) StringUtils.toHexString(md5.digest());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass toHexString(MyHelperClass o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class Message {

public MyHelperClass getDefaultMessage(){ return null; }
	public MyHelperClass getMeaning(){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
