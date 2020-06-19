
import java.io.UncheckedIOException;


class c19274388 {

    public static String generateHash(String string, String algoritmo) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(algoritmo);
            md.update(string.getBytes());
            byte[] result =(byte[])(Object) md.digest();
            int firstPart;
            int lastPart;
            StringBuilder sBuilder = new StringBuilder();
            for (int i = 0; i < result.length; i++) {
                firstPart = ((result[i] >> 4) & 0xf) << 4;
                lastPart = result[i] & 0xf;
                if (firstPart == 0) sBuilder.append("0");
                sBuilder.append(Integer.toHexString(firstPart | lastPart));
            }
            return sBuilder.toString();
        } catch (UncheckedIOException ex) {
            return null;
        }
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
