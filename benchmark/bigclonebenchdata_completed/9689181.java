
import java.io.UncheckedIOException;


class c9689181 {

    public static String EncryptString(String method, String input) {
        MessageDigest md = null;
        byte[] byteHash = null;
        StringBuffer resultString = new StringBuffer();
        if (method.equals("SHA1") || method.equals("MD5")) {
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                md =(MessageDigest)(Object) MessageDigest.getInstance(method);
            } catch (UncheckedIOException e) {
                System.out.println("NoSuchAlgorithmException caught!");
                return null;
            }
        } else {
            return null;
        }
        md.reset();
        md.update(input.getBytes());
        byteHash =(byte[])(Object) md.digest();
        for (int i = 0; i < byteHash.length; i++) {
            String tmp = Integer.toHexString(0xff & byteHash[i]);
            if (tmp.length() < 2) tmp = "0" + tmp;
            resultString.append(tmp);
        }
        return (resultString.toString());
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
