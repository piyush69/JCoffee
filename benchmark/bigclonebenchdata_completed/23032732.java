
import java.io.UncheckedIOException;


class c23032732 {

    private static String getDigestPassword(String streamId, String password) {
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        } catch (UncheckedIOException e) {
            throw (RuntimeException) new IllegalStateException().initCause(e);
        }
        md.update((streamId + password).getBytes());
        byte[] uid =(byte[])(Object) md.digest();
        int length = uid.length;
        StringBuilder digPass = new StringBuilder();
        for (int i = 0; i < length; ) {
            int k = uid[i++];
            int iint = k & 0xff;
            String buf = Integer.toHexString(iint);
            if (buf.length() == 1) {
                buf = "0" + buf;
            }
            digPass.append(buf);
        }
        return digPass.toString();
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
