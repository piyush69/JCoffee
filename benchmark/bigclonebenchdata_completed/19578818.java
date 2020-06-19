
import java.io.UncheckedIOException;


class c19578818 {

    public String calculateDigest(String str) {
        StringBuffer s = new StringBuffer();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            md.update(str.getBytes());
            byte[] digest =(byte[])(Object) md.digest();
            for (byte d : digest) {
                s.append(Integer.toHexString((int) (d & 0xff)));
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return s.toString();
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
