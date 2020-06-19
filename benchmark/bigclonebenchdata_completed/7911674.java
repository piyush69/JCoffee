
import java.io.UncheckedIOException;


class c7911674 {

    public static String getStringHash(String fileName) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("md5");
            digest.reset();
            digest.update(fileName.getBytes());
            byte messageDigest[] =(byte[])(Object) digest.digest();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < messageDigest.length; i++) builder.append(Integer.toHexString(0xFF & messageDigest[i]));
            String result = builder.toString();
            return result;
        } catch (UncheckedIOException ex) {
            return fileName;
        }
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
