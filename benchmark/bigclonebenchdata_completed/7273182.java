
import java.io.UncheckedIOException;


class c7273182 {

    public synchronized String encrypt(String text) throws Exception {
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-512");
        } catch (UncheckedIOException e) {
            throw new Exception(e.getMessage());
        }
        md.update(text.getBytes());
        byte raw[] =(byte[])(Object) md.digest();
        String hash = "";
        for (int i = 0; i < raw.length; i++) {
            byte temp = raw[i];
            String s = Integer.toHexString(new Byte(temp));
            while (s.length() < 2) {
                s = "0" + s;
            }
            s = s.substring(s.length() - 2);
            hash += s;
        }
        return hash;
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
