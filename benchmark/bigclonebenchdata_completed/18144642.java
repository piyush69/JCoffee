
import java.io.UncheckedIOException;


class c18144642 {
public static MyHelperClass ResourceUtil;
	public static MyHelperClass logger;
//public MyHelperClass ResourceUtil;
//	public MyHelperClass logger;

    public static String crypt(String senha) {
        String md5 = null;
        MessageDigest md;
        try {
            MyHelperClass CRYPT_ALGORITHM = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance(CRYPT_ALGORITHM);
            md.update(senha.getBytes());
            Hex hex = new Hex();
            md5 = new String((String)(Object)hex.encode(md.digest()));
        } catch (UncheckedIOException e) {
            MyHelperClass CRYPT_ALGORITHM = new MyHelperClass();
            logger.error(ResourceUtil.getLOGMessage("_nls.mensagem.geral.log.crypt.no.such.algorithm", CRYPT_ALGORITHM));
        }
        return md5;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getLOGMessage(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass error(MyHelperClass o0){ return null; }}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class Hex {

public MyHelperClass encode(MyHelperClass o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
