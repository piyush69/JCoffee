
import java.io.UncheckedIOException;


class c11992308 {
public static MyHelperClass Logger;
//public MyHelperClass Logger;

    public static String generateStringSHA256(String content) {
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-256");
        } catch (UncheckedIOException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(ScannerChecksum.class.getName()).log(Level.SEVERE, null,(NoSuchAlgorithmException)(Object) ex);
        }
        md.update(content.getBytes());
        byte byteData[] =(byte[])(Object) md.digest();
        @SuppressWarnings("StringBufferMayBeStringBuilder") StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        @SuppressWarnings("StringBufferMayBeStringBuilder") StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            String hex = Integer.toHexString(0xff & byteData[i]);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, NoSuchAlgorithmException o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class ScannerChecksum {

}
