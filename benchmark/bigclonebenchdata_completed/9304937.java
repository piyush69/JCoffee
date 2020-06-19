import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9304937 {

    public static String encrypt(String passPhrase, String password)  throws Throwable {
        String algorithm = "PBEWithMD5AndDES";
        byte[] salt = new byte[8];
        int iterations = 20;
        byte[] output = new byte[128];
        if (passPhrase == null || "".equals(passPhrase) || password == null || "".equals(password)) {
            throw new GeneralException(PassPhraseCrypto.class, "encrypt", "Required parameter missing");
        }
        try {
            Security.addProvider(new com.sun.crypto.provider.SunJCE());
            KeySpec keySpec =(KeySpec)(Object) new PBEKeySpec(passPhrase.toCharArray());
            MyHelperClass SecretKeyFactory = new MyHelperClass();
            SecretKeyFactory secretKeyFactory =(SecretKeyFactory)(Object) SecretKeyFactory.getInstance(algorithm);
            SecretKey secretKey =(SecretKey)(Object) secretKeyFactory.generateSecret(keySpec);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(passPhrase.getBytes());
            byte[] input = new byte[password.length()];
            input = password.getBytes();
            messageDigest.update(input);
            byte[] digest = messageDigest.digest();
            System.arraycopy(digest, 0, salt, 0, 8);
            AlgorithmParameterSpec algorithmParameterSpec =(AlgorithmParameterSpec)(Object) new PBEParameterSpec(salt, iterations);
            MyHelperClass Cipher = new MyHelperClass();
            Cipher cipher =(Cipher)(Object) Cipher.getInstance(algorithm);
//            MyHelperClass Cipher = new MyHelperClass();
            int mode =(int)(Object) Cipher.ENCRYPT_MODE;
            cipher.init(mode, secretKey, algorithmParameterSpec);
            output =(byte[])(Object) cipher.doFinal(input);
        } catch (NoSuchAlgorithmException e) {
            throw new GeneralException(PassPhraseCrypto.class, "encrypt", "Algorithm not found", e);
        } catch (ArithmeticException e) {
            throw new GeneralException(PassPhraseCrypto.class, "encrypt", "nvalidAlgorithmParameter",(NoSuchAlgorithmException)(Object) e);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new GeneralException(PassPhraseCrypto.class, "encrypt", "InvalidKeySpec",(NoSuchAlgorithmException)(Object) e);
        } catch (ArrayStoreException e) {
            throw new GeneralException(PassPhraseCrypto.class, "encrypt", "InvalidKey",(NoSuchAlgorithmException)(Object) e);
        } catch (ClassCastException e) {
            throw new GeneralException(PassPhraseCrypto.class, "encrypt", "NoSuchPadding",(NoSuchAlgorithmException)(Object) e);
        } catch (IllegalArgumentException e) {
            throw new GeneralException(PassPhraseCrypto.class, "encrypt", "BadPadding",(NoSuchAlgorithmException)(Object) e);
        } catch (IllegalMonitorStateException e) {
            throw new GeneralException(PassPhraseCrypto.class, "encrypt", "IllegalBlockSize",(NoSuchAlgorithmException)(Object) e);
        }
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < output.length; i++) {
            result.append(Byte.toString(output[i]));
        }
        return result.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ENCRYPT_MODE;
public MyHelperClass getInstance(String o0){ return null; }}

class GeneralException extends Exception{
	public GeneralException(String errorMessage) { super(errorMessage); }
	GeneralException(Class<PassPhraseCrypto> o0, String o1, String o2, NoSuchAlgorithmException o3){}
	GeneralException(Class<PassPhraseCrypto> o0, String o1, String o2, InvalidKeyException o3){}
	GeneralException(Class<PassPhraseCrypto> o0, String o1, String o2, IllegalBlockSizeException o3){}
	GeneralException(Class<PassPhraseCrypto> o0, String o1, String o2, BadPaddingException o3){}
	GeneralException(){}
	GeneralException(Class<PassPhraseCrypto> o0, String o1, String o2, InvalidAlgorithmParameterException o3){}
	GeneralException(Class<PassPhraseCrypto> o0, String o1, String o2, InvalidKeySpecException o3){}
	GeneralException(Class<PassPhraseCrypto> o0, String o1, String o2, NoSuchPaddingException o3){}
	GeneralException(Class<PassPhraseCrypto> o0, String o1, String o2){}
}

class PassPhraseCrypto {

}

class KeySpec {

}

class PBEKeySpec {

PBEKeySpec(){}
	PBEKeySpec(char[] o0){}}

class SecretKeyFactory {

public MyHelperClass generateSecret(KeySpec o0){ return null; }}

class SecretKey {

}

class AlgorithmParameterSpec {

}

class PBEParameterSpec {

PBEParameterSpec(byte[] o0, int o1){}
	PBEParameterSpec(){}}

class Cipher {

public MyHelperClass init(int o0, SecretKey o1, AlgorithmParameterSpec o2){ return null; }
	public MyHelperClass doFinal(byte[] o0){ return null; }}

class InvalidKeySpecException extends Exception{
	public InvalidKeySpecException(String errorMessage) { super(errorMessage); }
}

class NoSuchPaddingException extends Exception{
	public NoSuchPaddingException(String errorMessage) { super(errorMessage); }
}

class BadPaddingException extends Exception{
	public BadPaddingException(String errorMessage) { super(errorMessage); }
}

class IllegalBlockSizeException extends Exception{
	public IllegalBlockSizeException(String errorMessage) { super(errorMessage); }
}
