
import java.io.UncheckedIOException;


class c10728243 {
public MyHelperClass logger;

    private byte[] scramble411(String password, String seed) {
        MessageDigest md;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            byte[] passwordHashStage1 =(byte[])(Object) md.digest(password.getBytes());
            md.reset();
            byte[] passwordHashStage2 =(byte[])(Object) md.digest(passwordHashStage1);
            md.reset();
            md.update(seed.getBytes());
            md.update(passwordHashStage2);
            byte[] toBeXord =(byte[])(Object) md.digest();
            int numToXor = toBeXord.length;
            for (int i = 0; i < numToXor; i++) {
                toBeXord[i] = (byte) (toBeXord[i] ^ passwordHashStage1[i]);
            }
            return toBeXord;
        } catch (UncheckedIOException e) {
            MyHelperClass Level = new MyHelperClass();
            if ((boolean)(Object)logger.isLoggable(Level.SEVERE)) {
//                MyHelperClass Level = new MyHelperClass();
                logger.log(Level.SEVERE, e.getMessage(),(NoSuchAlgorithmException)(Object) e);
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, String o1, NoSuchAlgorithmException o2){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass isLoggable(MyHelperClass o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass digest(byte[] o0){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
