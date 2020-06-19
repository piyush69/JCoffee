
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16548896 {
public MyHelperClass Errors;
	public MyHelperClass Auth;
public MyHelperClass BaculaBase64;
	public MyHelperClass Mac;
	public MyHelperClass toHexString(byte[] o0){ return null; }

    private String generateHash(String key, String data) throws ChiropteraException {
        try {
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(Auth.MD5);
            md.update(key.getBytes());
            byte[] raw =(byte[])(Object) md.digest();
            String s =(String)(Object) toHexString(raw);
            SecretKey skey =(SecretKey)(Object) new SecretKeySpec(s.getBytes(), Auth.HMACMD5);
            Mac mac =(Mac)(Object) Mac.getInstance(skey.getAlgorithm());
            mac.init(skey);
            byte digest[] =(byte[])(Object) mac.doFinal(data.getBytes());
            String digestB64 =(String)(Object) BaculaBase64.binToBase64(digest);
            return digestB64.substring(0, digestB64.length());
        } catch (UncheckedIOException e) {
            throw new ChiropteraException(Errors.HASH, e.getMessage(),(NoSuchAlgorithmException)(Object) e);
        } catch (ArithmeticException e) {
            throw new ChiropteraException(Errors.HASH, e.getMessage(),(NoSuchAlgorithmException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MD5;
	public MyHelperClass HASH;
	public MyHelperClass HMACMD5;
public MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass binToBase64(byte[] o0){ return null; }}

class ChiropteraException extends Exception{
	public ChiropteraException(String errorMessage) { super(errorMessage); }
	ChiropteraException(){}
	ChiropteraException(MyHelperClass o0, String o1, NoSuchAlgorithmException o2){}
	ChiropteraException(MyHelperClass o0, String o1, InvalidKeyException o2){}
}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class SecretKey {

public MyHelperClass getAlgorithm(){ return null; }}

class SecretKeySpec {

SecretKeySpec(){}
	SecretKeySpec(byte[] o0, MyHelperClass o1){}}

class Mac {

public MyHelperClass doFinal(byte[] o0){ return null; }
	public MyHelperClass init(SecretKey o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class InvalidKeyException extends Exception{
	public InvalidKeyException(String errorMessage) { super(errorMessage); }
}
