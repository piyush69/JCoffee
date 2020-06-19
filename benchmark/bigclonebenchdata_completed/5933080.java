
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5933080 {
public MyHelperClass file;
	public MyHelperClass MessageDigest;
	public MyHelperClass close(){ return null; }
	public MyHelperClass open(String o0){ return null; }

    public void addUser(String username, String password, String filename) {
        String data = "";
        try {
            open(filename);
            MessageDigest mdAlgorithm =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            mdAlgorithm.update(password.getBytes());
            byte[] digest =(byte[])(Object) mdAlgorithm.digest();
            StringBuffer encPasswd = new StringBuffer();
            for (int i = 0; i < digest.length; i++) {
                password = Integer.toHexString(255 & digest[i]);
                if (password.length() < 2) {
                    password = "0" + password;
                }
                encPasswd.append(password);
                data = username + " " + encPasswd + "\r\n";
            }
            try {
                long length =(long)(Object) file.length();
                file.seek(length);
                file.write(data.getBytes());
            } catch (UncheckedIOException ex) {
                ex.printStackTrace();
            }
            close();
        } catch (UncheckedIOException ex) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass seek(long o0){ return null; }
	public MyHelperClass length(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
