
import java.io.UncheckedIOException;


class c19050843 {

        public static final String enctrypt(String password) {
            MessageDigest md = null;
            byte[] byteHash = null;
            StringBuffer resultString = new StringBuffer();
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                md =(MessageDigest)(Object) MessageDigest.getInstance("SHA1");
            } catch (UncheckedIOException e) {
                System.out.println("NoSuchAlgorithmException caught!");
                throw new RuntimeException("NoSuchAlgorithmException SHA1");
            }
            md.reset();
            md.update(password.getBytes());
            byteHash =(byte[])(Object) md.digest();
            for (int i = 0; i < byteHash.length; i++) {
                resultString.append(Integer.toHexString(0xFF & byteHash[i]));
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
