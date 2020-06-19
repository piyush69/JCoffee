
import java.io.UncheckedIOException;


class c21266476 {
public static MyHelperClass Logger;
//public MyHelperClass Logger;

    public static String md5(String word) {
        MessageDigest alg = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            alg =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(ServletUtils.class.getName()).log(Level.SEVERE, null,(NoSuchAlgorithmException)(Object) ex);
        }
        alg.reset();
        alg.update(word.getBytes());
        byte[] digest =(byte[])(Object) alg.digest();
        StringBuilder hashedWord = new StringBuilder();
        String hx;
        for (int i = 0; i < digest.length; i++) {
            hx = Integer.toHexString(0xFF & digest[i]);
            if (hx.length() == 1) {
                hx = "0" + hx;
            }
            hashedWord.append(hx);
        }
        return hashedWord.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, NoSuchAlgorithmException o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class ServletUtils {

}
