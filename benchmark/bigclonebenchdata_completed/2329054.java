
import java.io.UncheckedIOException;


class c2329054 {

    public static String MD5(String str) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("md5");
            md5.update(str.getBytes(), 0, str.length());
            String sig = new BigInteger(1, md5.digest()).toString();
            return sig;
        } catch (UncheckedIOException e) {
            System.err.println("Can not use md5 algorithm");
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}

class BigInteger {

BigInteger(int o0, MyHelperClass o1){}
	BigInteger(){}}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
