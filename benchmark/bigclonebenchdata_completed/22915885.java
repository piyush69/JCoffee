import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22915885 {

    public Login authenticateClient()  throws Throwable {
        Object o;
        String user, password;
        MyHelperClass ClientLoginsTableModel = new MyHelperClass();
        Vector<Login> clientLogins =(Vector<Login>)(Object) ClientLoginsTableModel.getClientLogins();
        Login login = null;
        try {
            MyHelperClass socket = new MyHelperClass();
            socket.setSoTimeout(25000);
            MyHelperClass objectOut = new MyHelperClass();
            objectOut.writeObject("JFRITZ SERVER 1.1");
//            MyHelperClass objectOut = new MyHelperClass();
            objectOut.flush();
            MyHelperClass objectIn = new MyHelperClass();
            o = objectIn.readObject();
            if (o instanceof String) {
                user = (String) o;
//                MyHelperClass objectOut = new MyHelperClass();
                objectOut.flush();
                for (Login l : clientLogins) {
                    if (l.getUser().equals(user)) {
                        login = l;
                        break;
                    }
                }
                if (login != null) {
                    MessageDigest md = MessageDigest.getInstance("MD5");
                    md.update((byte)(Object)login.getPassword().getBytes());
                    DESKeySpec desKeySpec = new DESKeySpec(md.digest());
                    MyHelperClass SecretKeyFactory = new MyHelperClass();
                    SecretKeyFactory keyFactory =(SecretKeyFactory)(Object) SecretKeyFactory.getInstance("DES");
                    SecretKey secretKey =(SecretKey)(Object) keyFactory.generateSecret(desKeySpec);
                    MyHelperClass Cipher = new MyHelperClass();
                    Cipher desCipher =(Cipher)(Object) Cipher.getInstance("DES/ECB/PKCS5Padding");
//                    MyHelperClass Cipher = new MyHelperClass();
                    desCipher.init(Cipher.ENCRYPT_MODE, secretKey);
                    byte[] dataKeySeed = new byte[32];
                    Random random = new Random();
                    random.nextBytes(dataKeySeed);
                    md.reset();
                    md.update(dataKeySeed);
                    dataKeySeed = md.digest();
                    SealedObject dataKeySeedSealed;
                    dataKeySeedSealed = new SealedObject(dataKeySeed, desCipher);
//                    MyHelperClass objectOut = new MyHelperClass();
                    objectOut.writeObject(dataKeySeedSealed);
//                    MyHelperClass objectOut = new MyHelperClass();
                    objectOut.flush();
                    desKeySpec = new DESKeySpec(dataKeySeed);
                    secretKey =(SecretKey)(Object) keyFactory.generateSecret(desKeySpec);
                    MyHelperClass inCipher = new MyHelperClass();
                    inCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
                    MyHelperClass outCipher = new MyHelperClass();
                    outCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
//                    MyHelperClass Cipher = new MyHelperClass();
                    inCipher.init(Cipher.DECRYPT_MODE, secretKey);
//                    MyHelperClass Cipher = new MyHelperClass();
                    outCipher.init(Cipher.ENCRYPT_MODE, secretKey);
//                    MyHelperClass objectIn = new MyHelperClass();
                    SealedObject sealedObject = (SealedObject)(SealedObject)(Object) objectIn.readObject();
//                    MyHelperClass inCipher = new MyHelperClass();
                    o = sealedObject.getObject(inCipher);
                    if (o instanceof String) {
                        String response = (String) o;
                        if (response.equals("OK")) {
//                            MyHelperClass outCipher = new MyHelperClass();
                            SealedObject ok_sealed = new SealedObject("OK", outCipher);
//                            MyHelperClass objectOut = new MyHelperClass();
                            objectOut.writeObject(ok_sealed);
                            return login;
                        } else {
                            MyHelperClass Debug = new MyHelperClass();
                            Debug.netMsg("Client sent false response to challenge!");
                        }
                    } else {
                        MyHelperClass Debug = new MyHelperClass();
                        Debug.netMsg("Client sent false object as response to challenge!");
                    }
                } else {
                    MyHelperClass Debug = new MyHelperClass();
                    Debug.netMsg("client sent unkown username: " + user);
                }
            }
        } catch (ArithmeticException e) {
            MyHelperClass Debug = new MyHelperClass();
            Debug.netMsg("Wrong blocksize for sealed object!");
//            MyHelperClass Debug = new MyHelperClass();
            Debug.error(e.toString());
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            MyHelperClass Debug = new MyHelperClass();
            Debug.netMsg("received unrecognized object from client!");
//            MyHelperClass Debug = new MyHelperClass();
            Debug.error(e.toString());
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            MyHelperClass Debug = new MyHelperClass();
            Debug.netMsg("MD5 Algorithm not present in this JVM!");
//            MyHelperClass Debug = new MyHelperClass();
            Debug.error(e.toString());
            e.printStackTrace();
        } catch (ArrayStoreException e) {
            MyHelperClass Debug = new MyHelperClass();
            Debug.netMsg("Error generating cipher, problems with key spec?");
//            MyHelperClass Debug = new MyHelperClass();
            Debug.error(e.toString());
            e.printStackTrace();
        } catch (ClassCastException e) {
            MyHelperClass Debug = new MyHelperClass();
            Debug.netMsg("Error genertating cipher, problems with key?");
//            MyHelperClass Debug = new MyHelperClass();
            Debug.error(e.toString());
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            MyHelperClass Debug = new MyHelperClass();
            Debug.netMsg("Error generating cipher, problems with padding?");
//            MyHelperClass Debug = new MyHelperClass();
            Debug.error(e.toString());
            e.printStackTrace();
        } catch (IllegalMonitorStateException e) {
            MyHelperClass Debug = new MyHelperClass();
            Debug.netMsg("Error authenticating client!");
//            MyHelperClass Debug = new MyHelperClass();
            Debug.error(e.toString());
            e.printStackTrace();
        } catch (IllegalStateException e) {
            MyHelperClass Debug = new MyHelperClass();
            Debug.netMsg("Bad padding exception!");
//            MyHelperClass Debug = new MyHelperClass();
            Debug.error(e.toString());
            e.printStackTrace();
        }
        return null;
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
	public MyHelperClass writeObject(String o0){ return null; }
	public MyHelperClass setSoTimeout(int o0){ return null; }
	public MyHelperClass getClientLogins(){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class Login {

public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getUser(){ return null; }}

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
	SealedObject(byte[] o0, Cipher o1){}
	public MyHelperClass getObject(MyHelperClass o0){ return null; }}

class IllegalBlockSizeException extends Exception{
	public IllegalBlockSizeException(String errorMessage) { super(errorMessage); }
}

class InvalidKeySpecException extends Exception{
	public InvalidKeySpecException(String errorMessage) { super(errorMessage); }
}

class NoSuchPaddingException extends Exception{
	public NoSuchPaddingException(String errorMessage) { super(errorMessage); }
}

class BadPaddingException extends Exception{
	public BadPaddingException(String errorMessage) { super(errorMessage); }
}
