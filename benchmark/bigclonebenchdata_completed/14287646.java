
import java.io.UncheckedIOException;


class c14287646 {

    private String getStoreName() {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            final MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            MyHelperClass protectionDomain = new MyHelperClass();
            digest.update(protectionDomain.getBytes());
            final byte[] bs =(byte[])(Object) digest.digest();
            final StringBuffer sb = new StringBuffer(bs.length * 2);
            for (int i = 0; i < bs.length; i++) {
                final String s = Integer.toHexString(bs[i] & 0xff);
                if (s.length() < 2) sb.append('0');
                sb.append(s);
            }
            return sb.toString();
        } catch (final UncheckedIOException e) {
            throw new RuntimeException("Can't save credentials: digest method MD5 unavailable.");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class MessageDigest {

public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
