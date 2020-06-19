
import java.io.UncheckedIOException;


class c23205763 {

    private static synchronized byte[] gerarHash(String frase) {
        try {
            MyHelperClass algoritmo = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(algoritmo);
            md.update(frase.getBytes());
            return(byte[])(Object) md.digest();
        } catch (UncheckedIOException e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
