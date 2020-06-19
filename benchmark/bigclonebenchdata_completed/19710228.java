import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c19710228 {
public MyHelperClass NULL;
public MyHelperClass Cipher;
	public MyHelperClass Logger;

    public void init(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes("UTF-8"), 0, password.length());
            byte[] rawKey = md.digest();
            SecretKeySpec skeySpec =(SecretKeySpec)(Object) NULL; //new SecretKeySpec();
            skeySpec = new SecretKeySpec(rawKey, "AES");
            IvParameterSpec ivSpec =(IvParameterSpec)(Object) NULL; //new IvParameterSpec();
            ivSpec = new IvParameterSpec(rawKey);
            MyHelperClass cipher = new MyHelperClass();
            cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        } catch (UnsupportedEncodingException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(AES.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UncheckedIOException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(AES.class.getName()).log(Level.SEVERE,(Object)(Object) null,(NoSuchAlgorithmException)(Object) ex);
        } catch (NoSuchAlgorithmException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(AES.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, Object o1, NoSuchAlgorithmException o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, NoSuchPaddingException o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, UnsupportedEncodingException o2){ return null; }}

class NoSuchPaddingException extends Exception{
	public NoSuchPaddingException(String errorMessage) { super(errorMessage); }
}

class SecretKeySpec {

SecretKeySpec(byte[] o0, String o1){}
	SecretKeySpec(){}}

class IvParameterSpec {

IvParameterSpec(byte[] o0){}
	IvParameterSpec(){}}

class AES {

}
