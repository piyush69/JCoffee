
import java.io.UncheckedIOException;


class c1685861 {

    public static String SHA(String s) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            md.update(s.getBytes(), 0, s.getBytes().length);
            byte[] hash =(byte[])(Object) md.digest();
            StringBuilder sb = new StringBuilder();
            int msb;
            int lsb = 0;
            int i;
            for (i = 0; i < hash.length; i++) {
                msb = ((int) hash[i] & 0x000000FF) / 16;
                lsb = ((int) hash[i] & 0x000000FF) % 16;
MyHelperClass[] hexChars = new MyHelperClass[5];
                sb.append(hexChars[msb]);
//                MyHelperClass hexChars = new MyHelperClass();
                sb.append(hexChars[lsb]);
            }
            return sb.toString();
        } catch (UncheckedIOException e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] hexChars;
public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
