
import java.io.UncheckedIOException;


class c16250771 {
public static MyHelperClass byte2hex(byte[] o0){ return null; }
//public MyHelperClass byte2hex(byte[] o0){ return null; }

    public static String genDigest(String info) {
        MessageDigest alga;
        byte[] digesta = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            alga =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            alga.update(info.getBytes());
            digesta =(byte[])(Object) alga.digest();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return(String)(Object) byte2hex(digesta);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
