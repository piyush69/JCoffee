
import java.io.UncheckedIOException;


class c16466743 {

    public String getmd5(String password) {
        String pwHash = "";
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.reset();
            md.update(password.getBytes());
            byte[] b =(byte[])(Object) md.digest();
            for (int i = 0; i < b.length; i++) {
                pwHash += Integer.toString((b[i] & 0xFF) + 0x100, 16).substring(1);
            }
        } catch (UncheckedIOException ex) {
            MyHelperClass Logger = new MyHelperClass();
            Logger.fatal("MD5 Hash Algorithm not found",(NoSuchAlgorithmException)(Object) ex);
        }
        MyHelperClass Logger = new MyHelperClass();
        Logger.info("PWHash erzeugt und wird übergeben");
        return pwHash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass fatal(String o0, NoSuchAlgorithmException o1){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
