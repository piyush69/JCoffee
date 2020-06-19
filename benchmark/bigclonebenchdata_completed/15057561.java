import java.io.*;
import java.lang.*;
import java.util.*;



class c15057561 {
public static MyHelperClass DEFAULT_CHARACTER_ENCODING;
//public MyHelperClass DEFAULT_CHARACTER_ENCODING;

    public static byte[] hash(final byte[] saltBefore, final String content, final byte[] saltAfter, final int repeatedHashingCount) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        if (content == null) return null;
        MyHelperClass DIGEST = new MyHelperClass();
        final MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance(DIGEST);
        MyHelperClass digestLength = new MyHelperClass();
        if ((int)(Object)digestLength == -1) digestLength = digest.getDigestLength();
        for (int i = 0; i < repeatedHashingCount; i++) {
            if (i > 0) digest.update((byte[])(Object)digest.digest());
            digest.update(saltBefore);
            digest.update(content.getBytes((String)(Object)DEFAULT_CHARACTER_ENCODING.getValue()));
            digest.update(saltAfter);
        }
        return(byte[])(Object) digest.digest();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getValue(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass getDigestLength(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }
	public static MyHelperClass getInstance(MyHelperClass o0){ return null; }}
