
import java.io.UncheckedIOException;


class c2188303 {

    @SuppressWarnings(value = "RetentionPolicy.SOURCE")
    public static byte[] getHashMD5(String chave) {
        byte[] hashMd5 = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(chave.getBytes());
            hashMd5 =(byte[])(Object) md.digest();
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
            MyHelperClass Dialog = new MyHelperClass();
            Dialog.erro(ex.getMessage(), null);
        }
        return (hashMd5);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass erro(String o0, Object o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
