import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7847872 {
public MyHelperClass Cipher;
	public MyHelperClass encodeStringNew(String o0){ return null; }
	public MyHelperClass getCharset(){ return null; }

    public String encrypt(String text, String passphrase, int keylen)  throws Throwable {
        RC2ParameterSpec parm = new RC2ParameterSpec(keylen);
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(passphrase.getBytes((String)(Object)getCharset()));
            SecretKeySpec skeySpec = new SecretKeySpec(md.digest(), "RC2");
            Cipher cipher =(Cipher)(Object) Cipher.getInstance("RC2/ECB/NoPadding");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, parm);
            byte[] newBytes =(byte[])(Object) encodeStringNew(text);
            byte[] d =(byte[])(Object) cipher.doFinal(newBytes);
            return(String)(Object) Base64.encodeBytes(d);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (ArrayStoreException e) {
            e.printStackTrace();
        } catch (ClassCastException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ENCRYPT_MODE;
public MyHelperClass getInstance(String o0){ return null; }}

class RC2ParameterSpec {

RC2ParameterSpec(){}
	RC2ParameterSpec(int o0){}}

class SecretKeySpec {

SecretKeySpec(byte[] o0, String o1){}
	SecretKeySpec(){}}

class Cipher {

public MyHelperClass doFinal(byte[] o0){ return null; }
	public MyHelperClass init(MyHelperClass o0, SecretKeySpec o1, RC2ParameterSpec o2){ return null; }}

class Base64 {

public static MyHelperClass encodeBytes(byte[] o0){ return null; }}

class NoSuchPaddingException extends Exception{
	public NoSuchPaddingException(String errorMessage) { super(errorMessage); }
}

class IllegalBlockSizeException extends Exception{
	public IllegalBlockSizeException(String errorMessage) { super(errorMessage); }
}

class BadPaddingException extends Exception{
	public BadPaddingException(String errorMessage) { super(errorMessage); }
}
