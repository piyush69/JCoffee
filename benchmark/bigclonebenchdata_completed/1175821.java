
import java.io.UncheckedIOException;


class c1175821 {
public static MyHelperClass LoggerFactory;
//public MyHelperClass LoggerFactory;

    public static String criptografar(String senha) {
        if (senha == null) {
            return null;
        }
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            digest.update(senha.getBytes());
            BASE64Encoder encoder = new BASE64Encoder();
            return(String)(Object) encoder.encode(digest.digest());
        } catch (UncheckedIOException ns) {
            MyHelperClass Msg = new MyHelperClass();
            LoggerFactory.getLogger(UtilAdrs.class).error(Msg.EXCEPTION_MESSAGE, UtilAdrs.class.getSimpleName(),(NoSuchAlgorithmException)(Object) ns);
            return senha;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass EXCEPTION_MESSAGE;
public MyHelperClass error(MyHelperClass o0, String o1, NoSuchAlgorithmException o2){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getLogger(Class<UtilAdrs> o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(MyHelperClass o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class UtilAdrs {

}
