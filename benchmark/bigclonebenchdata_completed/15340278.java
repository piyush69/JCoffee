
import java.io.UncheckedIOException;


class c15340278 {

//    @Override
    public String encode(String password) {
        String hash = null;
        MessageDigest m;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            m =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            m.update(password.getBytes(), 0, password.length());
            hash = String.format("%1$032X", new BigInteger(1, m.digest()));
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return hash;
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
