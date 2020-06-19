import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23021618 {
public MyHelperClass iterations;
	public MyHelperClass algorithm;
	public MyHelperClass Cipher;

    public boolean WriteFile(java.io.Serializable inObj, String fileName) throws Throwable, Exception {
        FileOutputStream out;
        try {
            SecretKey skey = null;
            AlgorithmParameterSpec aps;
            out = new FileOutputStream(fileName);
            MyHelperClass cipher = new MyHelperClass();
            cipher = Cipher.getInstance(algorithm);
            MyHelperClass filePasswd = new MyHelperClass();
            KeySpec kspec =(KeySpec)(Object) new PBEKeySpec(filePasswd.toCharArray());
            MyHelperClass algorithm = new MyHelperClass();
            SecretKeyFactory skf =(SecretKeyFactory)(Object) SecretKeyFactory.getInstance(algorithm);
            skey =(SecretKey)(Object) skf.generateSecret(kspec);
            MyHelperClass res = new MyHelperClass();
            MessageDigest md = MessageDigest.getInstance((String)(Object)res.getString("MD5"));
//            MyHelperClass filePasswd = new MyHelperClass();
            md.update((byte)(Object)filePasswd.getBytes());
            byte[] digest = md.digest();
            MyHelperClass salt = new MyHelperClass();
            System.arraycopy(digest, 0, salt, 0, 8);
//            MyHelperClass salt = new MyHelperClass();
            aps =(AlgorithmParameterSpec)(Object) new PBEParameterSpec(salt, iterations);
//            MyHelperClass salt = new MyHelperClass();
            out.write((int)(Object)salt);
            ObjectOutputStream s = new ObjectOutputStream(out);
            MyHelperClass Cipher = new MyHelperClass();
            cipher.init(Cipher.ENCRYPT_MODE, skey, aps);
//            MyHelperClass cipher = new MyHelperClass();
            SealedObject so = new SealedObject(inObj, cipher);
            s.writeObject(so);
            s.flush();
            out.close();
        } catch (Exception e) {
            MyHelperClass Log = new MyHelperClass();
            Log.out("fileName=" + fileName);
            MyHelperClass algorithm = new MyHelperClass();
            Log.out("algorithm=" + algorithm);
//            MyHelperClass Log = new MyHelperClass();
            Log.out(e);
            throw e;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ENCRYPT_MODE;
public MyHelperClass init(MyHelperClass o0, SecretKey o1, AlgorithmParameterSpec o2){ return null; }
	public MyHelperClass out(String o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass out(Exception o0){ return null; }
	public MyHelperClass toCharArray(){ return null; }}

class SecretKey {

}

class AlgorithmParameterSpec {

}

class KeySpec {

}

class PBEKeySpec {

PBEKeySpec(MyHelperClass o0){}
	PBEKeySpec(){}}

class SecretKeyFactory {

public MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass generateSecret(KeySpec o0){ return null; }}

class PBEParameterSpec {

PBEParameterSpec(MyHelperClass o0, MyHelperClass o1){}
	PBEParameterSpec(){}}

class SealedObject {

SealedObject(Serializable o0, MyHelperClass o1){}
	SealedObject(){}}
