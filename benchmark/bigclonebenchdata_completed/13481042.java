
import java.io.UncheckedIOException;


class c13481042 {

    public String hasheMotDePasse(String mdp) {
        MessageDigest sha = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            sha =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
        } catch (UncheckedIOException ex) {
        }
        sha.reset();
        sha.update(mdp.getBytes());
        byte[] digest =(byte[])(Object) sha.digest();
        MyHelperClass Base64 = new MyHelperClass();
        String pass = new String((String)(Object)Base64.encode(digest));
        pass = "{SHA}" + pass;
        return pass;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass encode(byte[] o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
