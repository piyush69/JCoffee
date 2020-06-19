
import java.io.UncheckedIOException;


class c22431492 {

    public static String generateNonce(boolean is32) {
        Random random = new Random();
        String result = String.valueOf((int)(Object)random.nextInt(9876599) + 123400);
        if (is32) {
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
                md.update(result.getBytes());
                byte b[] =(byte[])(Object) md.digest();
                int i;
                StringBuffer buf = new StringBuffer("");
                for (int offset = 0; offset < b.length; offset++) {
                    i = b[offset];
                    if (i < 0) i += 256;
                    if (i < 16) buf.append("0");
                    buf.append(Integer.toHexString(i));
                }
                result = buf.toString();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class Random {

public MyHelperClass nextInt(int o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
