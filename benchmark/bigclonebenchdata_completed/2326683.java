import java.io.*;
import java.lang.*;
import java.util.*;



class c2326683 {

    public static void encrypt(File plain, File symKey, File ciphered, String algorithm) throws IOException, ClassNotFoundException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
        Key key = null;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(symKey));
            key = (Key) in.readObject();
        } catch (IOException ioe) {
            MyHelperClass KeyGenerator = new MyHelperClass();
            KeyGenerator generator =(KeyGenerator)(Object) KeyGenerator.getInstance(algorithm);
            key =(Key)(Object) generator.generateKey();
            ObjectOutputStream out = new ObjectOutputStream(new java.io.FileOutputStream(symKey));
            out.writeObject(key);
            out.close();
        }
        MyHelperClass Cipher = new MyHelperClass();
        Cipher cipher =(Cipher)(Object) Cipher.getInstance(algorithm);
//        MyHelperClass Cipher = new MyHelperClass();
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key.getEncoded(), algorithm));
        FileInputStream in = new FileInputStream(plain);
        CipherOutputStream out = new CipherOutputStream(new FileOutputStream(ciphered), cipher);
        byte[] buffer = new byte[4096];
        for (int read = in.read(buffer); read > -1; read = in.read(buffer)) {
            out.write(buffer, 0, read);
        }
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ENCRYPT_MODE;
public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class NoSuchPaddingException extends Exception{
	public NoSuchPaddingException(String errorMessage) { super(errorMessage); }
}

class InvalidKeyException extends Exception{
	public InvalidKeyException(String errorMessage) { super(errorMessage); }
}

class Key {

public MyHelperClass getEncoded(){ return null; }}

class KeyGenerator {

public MyHelperClass generateKey(){ return null; }}

class Cipher {

public MyHelperClass init(MyHelperClass o0, SecretKeySpec o1){ return null; }}

class CipherOutputStream {

CipherOutputStream(FileOutputStream o0, Cipher o1){}
	CipherOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class SecretKeySpec {

SecretKeySpec(MyHelperClass o0, String o1){}
	SecretKeySpec(){}}
