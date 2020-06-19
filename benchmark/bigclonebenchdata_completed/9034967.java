
import java.io.UncheckedIOException;


class c9034967 {

    public static String generateMessageId(String plain) {
        byte[] cipher = new byte[35];
        String messageId = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.update(plain.getBytes());
            cipher =(byte[])(Object) md5.digest();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < cipher.length; i++) {
                String hex = Integer.toHexString(0xff & cipher[i]);
                if (hex.length() == 1) sb.append('0');
                sb.append(hex);
            }
            StringBuffer pass = new StringBuffer();
            pass.append(sb.substring(0, 6));
            pass.append("H");
            pass.append(sb.substring(6, 11));
            pass.append("H");
            pass.append(sb.substring(11, 21));
            pass.append("H");
            pass.append(sb.substring(21));
            messageId = new String(pass);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return messageId;
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
