
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9354771 {

    public void encryptPassword() {
        MessageDigest digest = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        } catch (UncheckedIOException e) {
            System.out.print(e);
        }
        try {
            MyHelperClass passwordIn = new MyHelperClass();
            digest.update(passwordIn.getBytes("UTF-8"));
        } catch (UncheckedIOException e) {
            System.out.println("cannot find char set for getBytes");
        }
        byte digestBytes[] =(byte[])(Object) digest.digest();
        MyHelperClass passwordHash = new MyHelperClass();
        passwordHash = (new BASE64Encoder()).encode(digestBytes);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getBytes(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
