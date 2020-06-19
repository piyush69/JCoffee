
import java.io.UncheckedIOException;


class c9062063 {

    public String setEncryptedPassword(String rawPassword) {
        String out = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.reset();
            md.update(rawPassword.getBytes());
            byte raw[] =(byte[])(Object) md.digest();
            out = new String();
            for (int x = 0; x < raw.length; x++) {
                String hex2 = Integer.toHexString((int) raw[x] & 0xFF);
                if (1 == hex2.length()) {
                    hex2 = "0" + hex2;
                }
                out += hex2;
                int a = 1;
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return out;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
