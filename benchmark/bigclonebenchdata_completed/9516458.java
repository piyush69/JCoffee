import java.io.*;
import java.lang.*;
import java.util.*;



class c9516458 {
public MyHelperClass convertToHex(byte[] o0){ return null; }

    public String getHash(String type, String text, String salt) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md;
        MyHelperClass MessageDigest = new MyHelperClass();
        md =(MessageDigest)(Object) MessageDigest.getInstance(type);
        byte[] hash = new byte[(int)(Object)md.getDigestLength()];
        if (!salt.isEmpty()) {
            md.update(salt.getBytes("iso-8859-1"), 0, salt.length());
        }
        md.update(text.getBytes("iso-8859-1"), 0, text.length());
        hash =(byte[])(Object) md.digest();
        return(String)(Object) convertToHex(hash);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass getDigestLength(){ return null; }
	public MyHelperClass digest(){ return null; }}
