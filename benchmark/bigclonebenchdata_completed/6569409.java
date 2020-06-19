
import java.io.UncheckedIOException;


class c6569409 {
public MyHelperClass Base64;

    public String obfuscateString(String string) {
        String obfuscatedString = null;
        try {
            MyHelperClass ENCRYPTION_ALGORITHM = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(ENCRYPTION_ALGORITHM);
            md.update(string.getBytes());
            byte[] digest =(byte[])(Object) md.digest();
            MyHelperClass DELIM_PATH = new MyHelperClass();
            obfuscatedString = new String((String)(Object)Base64.encode(digest)).replace((char)(Object)DELIM_PATH, '=');
        } catch (UncheckedIOException e) {
            MyHelperClass StatusHandler = new MyHelperClass();
            StatusHandler.log("SHA not available", null);
            MyHelperClass LABEL_FAILED_TO_OBFUSCATE = new MyHelperClass();
            obfuscatedString =(String)(Object) LABEL_FAILED_TO_OBFUSCATE;
        }
        return obfuscatedString;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(byte[] o0){ return null; }
	public MyHelperClass log(String o0, Object o1){ return null; }}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
