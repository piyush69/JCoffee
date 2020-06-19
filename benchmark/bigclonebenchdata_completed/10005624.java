
import java.io.UncheckedIOException;


class c10005624 {
public MyHelperClass securityLogger;

            public Object run() {
                try {
                    MyHelperClass MessageDigest = new MyHelperClass();
                    MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
                    MyHelperClass buf = new MyHelperClass();
                    digest.update(buf.toString().getBytes());
                    byte[] data =(byte[])(Object) digest.digest();
                    MyHelperClass serialNum = new MyHelperClass();
                    serialNum = new BASE64Encoder().encode(data);
//                    MyHelperClass serialNum = new MyHelperClass();
                    return serialNum;
                } catch (UncheckedIOException exp) {
                    MyHelperClass Level = new MyHelperClass();
                    securityLogger.log(Level.SEVERE, exp.getMessage(),(NoSuchAlgorithmException)(Object) exp);
                    MyHelperClass buf = new MyHelperClass();
                    return buf.toString();
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, String o1, NoSuchAlgorithmException o2){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
