
import java.io.UncheckedIOException;


class c17716716 {
public static MyHelperClass Level;
//public MyHelperClass Level;

    public static String plainToMD(LoggerCollection loggerCol, String input) {
        byte[] byteHash = null;
        MessageDigest md = null;
        StringBuilder md5result = new StringBuilder();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.reset();
            md.update(input.getBytes());
            byteHash =(byte[])(Object) md.digest();
            for (int i = 0; i < byteHash.length; i++) {
                md5result.append(Integer.toHexString(0xFF & byteHash[i]));
            }
        } catch (UncheckedIOException ex) {
            MyHelperClass CLASSDEBUG = new MyHelperClass();
            loggerCol.logException(CLASSDEBUG, "de.searchworkorange.lib.misc.hash.MD5Hash", Level.FATAL,(NoSuchAlgorithmException)(Object) ex);
        }
        return (md5result.toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FATAL;
public MyHelperClass getInstance(String o0){ return null; }}

class LoggerCollection {

public MyHelperClass logException(MyHelperClass o0, String o1, MyHelperClass o2, NoSuchAlgorithmException o3){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
