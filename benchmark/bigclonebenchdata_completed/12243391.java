import java.io.*;
import java.lang.*;
import java.util.*;



class c12243391 {
public MyHelperClass getHexString(byte[] o0){ return null; }

    private byte[] getMD5(String string) throws IMException {
        byte[] buffer = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(string.getBytes("utf-8"));
            buffer =(byte[])(Object) md.digest();
            buffer =(byte[])(Object) getHexString(buffer);
        } catch (UncheckedIOException e) {
            throw new IMException((String)(Object)e);
        } catch (UnsupportedEncodingException ue) {
            throw new IMException((String)(Object)ue);
        }
        return buffer;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class IMException extends Exception{
	public IMException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
