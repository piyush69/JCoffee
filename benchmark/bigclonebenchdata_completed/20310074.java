
import java.io.UncheckedIOException;


class c20310074 {
public static MyHelperClass MessageDigest;
	public static MyHelperClass PASSWORD_ENCRYPTION_TYPE;
	public static MyHelperClass log;
	public static MyHelperClass randomPassword(){ return null; }
//public MyHelperClass PASSWORD_ENCRYPTION_TYPE;
//	public MyHelperClass log;
//	public MyHelperClass MessageDigest;
//	public MyHelperClass randomPassword(){ return null; }

    public static String encryptPassword(String originalPassword) {
        MyHelperClass StringUtils = new MyHelperClass();
        if (!(Boolean)(Object)StringUtils.hasText(originalPassword)) {
            originalPassword =(String)(Object) randomPassword();
        }
        try {
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance(PASSWORD_ENCRYPTION_TYPE);
            md5.update(originalPassword.getBytes());
            byte[] bytes =(byte[])(Object) md5.digest();
            int value;
            StringBuilder buf = new StringBuilder();
            for (byte aByte : bytes) {
                value = aByte;
                if (value < 0) {
                    value += 256;
                }
                if (value < 16) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(value));
            }
            return buf.toString();
        } catch (UncheckedIOException e) {
            log.debug("Do not encrypt password,use original password",(NoSuchAlgorithmException)(Object) e);
            return originalPassword;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass debug(String o0, NoSuchAlgorithmException o1){ return null; }
	public MyHelperClass hasText(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
