
import java.io.UncheckedIOException;


class c22622804 {
public MyHelperClass m_key;
	public MyHelperClass MessageDigest;
	public MyHelperClass createString(boolean o0){ return null; }

    protected byte[] generateHashBytes() {
        String s =(String)(Object) createString(false);
        MessageDigest md;
        try {
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException nsa) {
            System.out.println("Can't get MD5 implementation " + nsa);
            throw new RuntimeException("DynanmicAddress2: Can't get MD5 implementation");
        }
        if (m_key != null) md.update((byte[])(Object)m_key.getBytes(), 0,(int)(Object) m_key.length());
        md.update(s.getBytes(), 0, s.length());
        byte[] hash =(byte[])(Object) md.digest();
        return hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass length(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
