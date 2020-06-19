
import java.io.UncheckedIOException;


class c20073617 {

    public static String digest(String pBase, String pCharSet) {
        String wdgs = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest wmd =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            wmd.reset();
            wmd.update(pBase.getBytes(pCharSet));
            byte[] wdg =(byte[])(Object) wmd.digest();
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < wdg.length; i++) {
                String w_dup = Integer.toHexString(0xFF & wdg[i]);
                if (w_dup.length() < 2) {
                    w_dup = "0" + w_dup;
                }
                hexString.append(w_dup);
            }
            wdgs = hexString.toString();
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
        } finally {
            return wdgs;
        }
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
