
import java.io.UncheckedIOException;


class c15202804 {
public static MyHelperClass getHexString(MyHelperClass o0){ return null; }
//public MyHelperClass getHexString(MyHelperClass o0){ return null; }

    public static String getDigest(String user, String realm, String password, String method, String uri, String nonce) {
        String digest1 = user + ":" + realm + ":" + password;
        String digest2 = method + ":" + uri;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digestOne =(MessageDigest)(Object) MessageDigest.getInstance("md5");
            digestOne.update(digest1.getBytes());
            String hexDigestOne =(String)(Object) getHexString(digestOne.digest());
//            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digestTwo =(MessageDigest)(Object) MessageDigest.getInstance("md5");
            digestTwo.update(digest2.getBytes());
            String hexDigestTwo =(String)(Object) getHexString(digestTwo.digest());
            String digest3 = hexDigestOne + ":" + nonce + ":" + hexDigestTwo;
//            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digestThree =(MessageDigest)(Object) MessageDigest.getInstance("md5");
            digestThree.update(digest3.getBytes());
            String hexDigestThree =(String)(Object) getHexString(digestThree.digest());
            return hexDigestThree;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
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
