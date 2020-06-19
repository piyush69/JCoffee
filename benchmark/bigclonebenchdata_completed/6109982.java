
import java.io.UncheckedIOException;


class c6109982 {

    private String mkSid() {
        String temp = toString();
        MessageDigest messagedigest = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            messagedigest =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return null;
        }
        messagedigest.update(temp.getBytes());
        byte digest[] =(byte[])(Object) messagedigest.digest();
        String chk = "";
        for (int i = 0; i < digest.length; i++) {
            String s = Integer.toHexString(digest[i] & 0xFF);
            chk += ((s.length() == 1) ? "0" + s : s);
        }
        return chk.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
