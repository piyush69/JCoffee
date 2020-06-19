
import java.io.UncheckedIOException;


class c15743707 {

    public static String encriptaSenha(String string) throws ApplicationException {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            digest.update(string.getBytes());
            BASE64Encoder encoder = new BASE64Encoder();
            return(String)(Object) encoder.encode(digest.digest());
        } catch (UncheckedIOException ns) {
            ns.printStackTrace();
            throw new ApplicationException("Erro ao Encriptar Senha");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class ApplicationException extends Exception{
	public ApplicationException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(MyHelperClass o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
