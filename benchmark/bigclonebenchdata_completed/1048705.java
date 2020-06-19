
import java.io.UncheckedIOException;


class c1048705 {

    public static String encriptarPassword(String aPassword) throws BusinessException {
        MyHelperClass LogFactory = new MyHelperClass();
        ILogger logger =(ILogger)(Object) LogFactory.getLogger(User.class);
        String methodId = "encriptarPassword";
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest currentAlgorithm =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            currentAlgorithm.reset();
            currentAlgorithm.update(aPassword.getBytes());
            byte[] hash =(byte[])(Object) currentAlgorithm.digest();
            String d = "";
            for (int i = 0; i < hash.length; i++) {
                int v = hash[i] & 0xFF;
                if (v < 16) d += "0";
                d += Integer.toString(v, 16).toUpperCase();
            }
            return d.toLowerCase();
        } catch (UncheckedIOException nsae) {
            logger.logError(methodId + "error al encriptar password:" + nsae,(NoSuchAlgorithmException)(Object) nsae);
            throw new BusinessException("Error al encriptar password");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getLogger(Class<User> o0){ return null; }}

class BusinessException extends Exception{
	public BusinessException(String errorMessage) { super(errorMessage); }
}

class ILogger {

public MyHelperClass logError(String o0, NoSuchAlgorithmException o1){ return null; }}

class User {

}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
