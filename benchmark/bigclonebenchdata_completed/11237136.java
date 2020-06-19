
import java.io.UncheckedIOException;


class c11237136 {
public MyHelperClass Logger;

    public String hash(String senha) {
        String result = "";
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(senha.getBytes());
            byte[] hashMd5 =(byte[])(Object) md.digest();
            for (int i = 0; i < hashMd5.length; i++) result += Integer.toHexString((((hashMd5[i] >> 4) & 0xf) << 4) | (hashMd5[i] & 0xf));
        } catch (UncheckedIOException ex) {
            MyHelperClass TipoLog = new MyHelperClass();
            Logger.getInstancia().log(TipoLog.ERRO,(NoSuchAlgorithmException)(Object) ex);
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERRO;
public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, NoSuchAlgorithmException o1){ return null; }
	public MyHelperClass getInstancia(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
