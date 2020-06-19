
import java.io.UncheckedIOException;


class c9550506 {

    private String cookieString(String url, String ip) {
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            MyHelperClass salt = new MyHelperClass();
            md.update((url + "&&" + ip + "&&" + salt.toString()).getBytes());
            java.math.BigInteger hash = new java.math.BigInteger(1,(byte[])(Object) md.digest());
            return hash.toString(16);
        } catch (UncheckedIOException e) {
            MyHelperClass filterConfig = new MyHelperClass();
            filterConfig.getServletContext().log(this.getClass().getName() + " error " + e);
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getServletContext(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass log(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
