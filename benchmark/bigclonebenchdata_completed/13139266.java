
import java.io.UncheckedIOException;


class c13139266 {
public static MyHelperClass LOGGER;
//public MyHelperClass LOGGER;

    public static String encripta(String senha) throws GCIException {
        MyHelperClass INICIANDO_METODO = new MyHelperClass();
        LOGGER.debug(INICIANDO_METODO + "encripta(String)");
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            digest.update(senha.getBytes());
            BASE64Encoder encoder = new BASE64Encoder();
            return(String)(Object) encoder.encode(digest.digest());
        } catch (UncheckedIOException e) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.fatal(e.getMessage(),(NoSuchAlgorithmException)(Object) e);
            throw new GCIException((String)(Object)e);
        } finally {
            MyHelperClass FINALIZANDO_METODO = new MyHelperClass();
            LOGGER.debug(FINALIZANDO_METODO + "encripta(String)");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass fatal(String o0, NoSuchAlgorithmException o1){ return null; }}

class GCIException extends Exception{
	public GCIException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(MyHelperClass o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
