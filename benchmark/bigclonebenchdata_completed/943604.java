
import java.io.UncheckedIOException;


class c943604 {

    public String encryptPassword(String clearPassword) throws NullPointerException {
        MessageDigest sha;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            sha =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        } catch (UncheckedIOException e) {
            throw new NullPointerException("NoSuchAlgorithmException: " + e.toString());
        }
        sha.update(clearPassword.getBytes());
        byte encryptedPassword[] =(byte[])(Object) sha.digest();
        sha = null;
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < encryptedPassword.length; i++) {
            result.append(Byte.toString(encryptedPassword[i]));
        }
        return (result.toString());
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
