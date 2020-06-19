
import java.io.UncheckedIOException;


class c5933078 {
public MyHelperClass MessageDigest;
	public MyHelperClass getPassword(String o0){ return null; }
	public MyHelperClass open(String o0){ return null; }
	public MyHelperClass close(){ return null; }

    public boolean authorize(String username, String password, String filename) {
        open(filename);
        boolean isAuthorized = false;
        StringBuffer encPasswd = null;
        try {
            MessageDigest mdAlgorithm =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            mdAlgorithm.update(password.getBytes());
            byte[] digest =(byte[])(Object) mdAlgorithm.digest();
            encPasswd = new StringBuffer();
            for (int i = 0; i < digest.length; i++) {
                password = Integer.toHexString(255 & digest[i]);
                if (password.length() < 2) {
                    password = "0" + password;
                }
                encPasswd.append(password);
            }
        } catch (UncheckedIOException ex) {
        }
        String encPassword = encPasswd.toString();
        String tempPassword =(String)(Object) getPassword(username);
        System.out.println("epass" + encPassword);
        System.out.println("pass" + tempPassword);
        if (tempPassword.equals(encPassword)) {
            isAuthorized = true;
        } else {
            isAuthorized = false;
        }
        close();
        return isAuthorized;
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
