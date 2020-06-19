
import java.io.UncheckedIOException;


class c23517481 {

    private String md5(String uri) throws ConnoteaRuntimeException {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest messageDigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            messageDigest.update(uri.getBytes());
            byte[] bytes =(byte[])(Object) messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    stringBuffer.append('0');
                }
                stringBuffer.append(hex);
            }
            return stringBuffer.toString();
        } catch (UncheckedIOException e) {
            throw new ConnoteaRuntimeException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class ConnoteaRuntimeException extends Exception{
	public ConnoteaRuntimeException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
