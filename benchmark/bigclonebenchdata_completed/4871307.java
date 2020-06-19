import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4871307 {

    private boolean authenticateWithServer(String user, String password)  throws Throwable {
        Object o;
        String response;
        byte[] dataKey;
        try {
            MyHelperClass objectIn = new MyHelperClass();
            o = objectIn.readObject();
            if (o instanceof String) {
                response = (String) o;
                MyHelperClass Debug = new MyHelperClass();
                Debug.netMsg("Connected to JFritz Server: " + response);
                if (!response.equals("JFRITZ SERVER 1.1")) {
//                    MyHelperClass Debug = new MyHelperClass();
                    Debug.netMsg("Unkown Server version, newer JFritz protocoll version?");
//                    MyHelperClass Debug = new MyHelperClass();
                    Debug.netMsg("Canceling login attempt!");
                }
                MyHelperClass objectOut = new MyHelperClass();
                objectOut.writeObject(user);
//                MyHelperClass objectOut = new MyHelperClass();
                objectOut.flush();
                MessageDigest md = MessageDigest.getInstance("MD5");
                md.update(password.getBytes());
                DESKeySpec desKeySpec = new DESKeySpec(md.digest());
                MyHelperClass SecretKeyFactory = new MyHelperClass();
                SecretKeyFactory keyFactory =(SecretKeyFactory)(Object) SecretKeyFactory.getInstance("DES");
                SecretKey secretKey =(SecretKey)(Object) keyFactory.generateSecret(desKeySpec);
                MyHelperClass Cipher = new MyHelperClass();
                Cipher desCipher =(Cipher)(Object) Cipher.getInstance("DES/ECB/PKCS5Padding");
//                MyHelperClass Cipher = new MyHelperClass();
                desCipher.init(Cipher.DECRYPT_MODE, secretKey);
//                MyHelperClass objectIn = new MyHelperClass();
                SealedObject sealedObject = (SealedObject)(SealedObject)(Object) objectIn.readObject();
                o = sealedObject.getObject(desCipher);
                if (o instanceof byte[]) {
                    dataKey = (byte[]) o;
                    desKeySpec = new DESKeySpec(dataKey);
                    secretKey =(SecretKey)(Object) keyFactory.generateSecret(desKeySpec);
                    MyHelperClass inCipher = new MyHelperClass();
                    inCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
                    MyHelperClass outCipher = new MyHelperClass();
                    outCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
//                    MyHelperClass Cipher = new MyHelperClass();
                    inCipher.init(Cipher.DECRYPT_MODE, secretKey);
//                    MyHelperClass Cipher = new MyHelperClass();
                    outCipher.init(Cipher.ENCRYPT_MODE, secretKey);
//                    MyHelperClass outCipher = new MyHelperClass();
                    SealedObject sealed_ok = new SealedObject("OK", outCipher);
//                    MyHelperClass objectOut = new MyHelperClass();
                    objectOut.writeObject(sealed_ok);
//                    MyHelperClass objectIn = new MyHelperClass();
                    SealedObject sealed_response = (SealedObject)(SealedObject)(Object) objectIn.readObject();
//                    MyHelperClass inCipher = new MyHelperClass();
                    o = sealed_response.getObject(inCipher);
                    if (o instanceof String) {
                        if (o.equals("OK")) {
                            return true;
                        } else {
//                            MyHelperClass Debug = new MyHelperClass();
                            Debug.netMsg("Server sent wrong string as response to authentication challenge!");
                        }
                    } else {
//                        MyHelperClass Debug = new MyHelperClass();
                        Debug.netMsg("Server sent wrong object as response to authentication challenge!");
                    }
                } else {
//                    MyHelperClass Debug = new MyHelperClass();
                    Debug.netMsg("Server sent wrong type for data key!");
                }
            }
        } catch (ArithmeticException e) {
            MyHelperClass Debug = new MyHelperClass();
            Debug.error("Server authentication response invalid!");
//            MyHelperClass Debug = new MyHelperClass();
            Debug.error(e.toString());
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            MyHelperClass Debug = new MyHelperClass();
            Debug.netMsg("MD5 Algorithm not present in this JVM!");
//            MyHelperClass Debug = new MyHelperClass();
            Debug.error(e.toString());
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            MyHelperClass Debug = new MyHelperClass();
            Debug.netMsg("Error generating cipher, problems with key spec?");
//            MyHelperClass Debug = new MyHelperClass();
            Debug.error(e.toString());
            e.printStackTrace();
        } catch (ArrayStoreException e) {
            MyHelperClass Debug = new MyHelperClass();
            Debug.netMsg("Error genertating cipher, problems with key?");
//            MyHelperClass Debug = new MyHelperClass();
            Debug.error(e.toString());
            e.printStackTrace();
        } catch (ClassCastException e) {
            MyHelperClass Debug = new MyHelperClass();
            Debug.netMsg("Error generating cipher, problems with padding?");
//            MyHelperClass Debug = new MyHelperClass();
            Debug.error(e.toString());
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            MyHelperClass Debug = new MyHelperClass();
            Debug.error("Server closed Stream unexpectedly!");
//            MyHelperClass Debug = new MyHelperClass();
            Debug.error(e.toString());
            e.printStackTrace();
        } catch (IllegalMonitorStateException e) {
            MyHelperClass Debug = new MyHelperClass();
            Debug.error("Read timeout while authenticating with server!");
//            MyHelperClass Debug = new MyHelperClass();
            Debug.error(e.toString());
            e.printStackTrace();
        } catch (IllegalStateException e) {
            MyHelperClass Debug = new MyHelperClass();
            Debug.error("Error reading response during authentication!");
//            MyHelperClass Debug = new MyHelperClass();
            Debug.error(e.toString());
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            MyHelperClass Debug = new MyHelperClass();
            Debug.error("Illegal block size exception!");
//            MyHelperClass Debug = new MyHelperClass();
            Debug.error(e.toString());
            e.printStackTrace();
        } catch (NegativeArraySizeException e) {
            MyHelperClass Debug = new MyHelperClass();
            Debug.error("Bad padding exception!");
//            MyHelperClass Debug = new MyHelperClass();
            Debug.error(e.toString());
            e.printStackTrace();
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DECRYPT_MODE;
	public MyHelperClass ENCRYPT_MODE;
public MyHelperClass init(MyHelperClass o0, SecretKey o1){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass readObject(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass netMsg(String o0){ return null; }
	public MyHelperClass writeObject(SealedObject o0){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass writeObject(String o0){ return null; }}

class DESKeySpec {

DESKeySpec(byte[] o0){}
	DESKeySpec(){}}

class SecretKeyFactory {

public MyHelperClass generateSecret(DESKeySpec o0){ return null; }}

class SecretKey {

}

class Cipher {

public MyHelperClass init(MyHelperClass o0, SecretKey o1){ return null; }}

class SealedObject {

SealedObject(String o0, MyHelperClass o1){}
	SealedObject(){}
	public MyHelperClass getObject(MyHelperClass o0){ return null; }
	public MyHelperClass getObject(Cipher o0){ return null; }}

class InvalidKeySpecException extends Exception{
	public InvalidKeySpecException(String errorMessage) { super(errorMessage); }
}

class NoSuchPaddingException extends Exception{
	public NoSuchPaddingException(String errorMessage) { super(errorMessage); }
}

class IllegalBlockSizeException extends Exception{
	public IllegalBlockSizeException(String errorMessage) { super(errorMessage); }
}

class BadPaddingException extends Exception{
	public BadPaddingException(String errorMessage) { super(errorMessage); }
}
