
import java.io.UncheckedIOException;


class c13946197 {

    public String transformByMD5(String password) throws XSServiceException {
        MessageDigest md5;
        byte[] output;
        StringBuffer bufferPass;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.warn("DataAccessException thrown while getting MD5 algorithm:" + e.getMessage(),(NoSuchAlgorithmException)(Object) e);
            throw new XSServiceException("Database error while saving user");
        }
        md5.reset();
        md5.update(password.getBytes());
        output =(byte[])(Object) md5.digest();
        bufferPass = new StringBuffer();
        for (byte b : output) {
            bufferPass.append(Integer.toHexString(0xff & b).length() == 1 ? "0" + Integer.toHexString(0xff & b) : Integer.toHexString(0xff & b));
        }
        return bufferPass.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass warn(String o0, NoSuchAlgorithmException o1){ return null; }}

class XSServiceException extends Exception{
	public XSServiceException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
