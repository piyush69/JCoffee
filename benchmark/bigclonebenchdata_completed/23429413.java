import java.io.*;
import java.lang.*;
import java.util.*;



class c23429413 {
public static MyHelperClass Level;
//public MyHelperClass Level;

    public static String plainToMD(LoggerCollection loggerCol, String input) {
        byte[] byteHash = null;
        MessageDigest md = null;
        StringBuilder md4result = new StringBuilder();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD4", new BouncyCastleProvider());
            md.reset();
            md.update(input.getBytes("UnicodeLittleUnmarked"));
            byteHash =(byte[])(Object) md.digest();
            for (int i = 0; i < byteHash.length; i++) {
                md4result.append(Integer.toHexString(0xFF & byteHash[i]));
            }
        } catch (UnsupportedEncodingException ex) {
            MyHelperClass CLASSDEBUG = new MyHelperClass();
            loggerCol.logException(CLASSDEBUG, "de.searchworkorange.lib.misc.hash.MD4Hash", Level.FATAL, ex);
        } catch (UncheckedIOException ex) {
            MyHelperClass CLASSDEBUG = new MyHelperClass();
            loggerCol.logException(CLASSDEBUG, "de.searchworkorange.lib.misc.hash.MD4Hash", Level.FATAL,(NoSuchAlgorithmException)(Object) ex);
        }
        return (md4result.toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FATAL;
public MyHelperClass getInstance(String o0, BouncyCastleProvider o1){ return null; }}

class LoggerCollection {

public MyHelperClass logException(MyHelperClass o0, String o1, MyHelperClass o2, NoSuchAlgorithmException o3){ return null; }
	public MyHelperClass logException(MyHelperClass o0, String o1, MyHelperClass o2, UnsupportedEncodingException o3){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass reset(){ return null; }}

class BouncyCastleProvider {

}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
