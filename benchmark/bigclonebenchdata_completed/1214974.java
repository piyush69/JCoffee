import java.io.*;
import java.lang.*;
import java.util.*;



class c1214974 {

    public static String computeMD5(InputStream input) {
        InputStream digestStream = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            digestStream =(InputStream)(Object) new DigestInputStream(input, md5);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(digestStream, new NullOutputStream());
            return new String((byte[])(Object)Base64.encodeBase64(md5.digest()), "UTF-8");
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(digestStream);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, NullOutputStream o1){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }}

class DigestInputStream {

DigestInputStream(InputStream o0, MessageDigest o1){}
	DigestInputStream(){}}

class NullOutputStream {

}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class Base64 {

public static MyHelperClass encodeBase64(MyHelperClass o0){ return null; }}
