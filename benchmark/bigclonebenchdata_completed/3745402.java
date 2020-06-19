


class c3745402 {

    static Cipher createCipher(String passwd, int mode) throws Exception {
        PBEKeySpec keySpec = new PBEKeySpec(passwd.toCharArray());
        MyHelperClass SecretKeyFactory = new MyHelperClass();
        SecretKeyFactory keyFactory =(SecretKeyFactory)(Object) SecretKeyFactory.getInstance("PBEWithMD5AndDES");
        SecretKey key =(SecretKey)(Object) keyFactory.generateSecret(keySpec);
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md.update("input".getBytes());
        byte[] digest =(byte[])(Object) md.digest();
        byte[] salt = new byte[8];
        for (int i = 0; i < 8; ++i) salt[i] = digest[i];
        PBEParameterSpec paramSpec = new PBEParameterSpec(salt, 20);
        MyHelperClass Cipher = new MyHelperClass();
        Cipher cipher =(Cipher)(Object) Cipher.getInstance("PBEWithMD5AndDES");
        cipher.init(mode, key, paramSpec);
        return cipher;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class Cipher {

public MyHelperClass init(int o0, SecretKey o1, PBEParameterSpec o2){ return null; }}

class PBEKeySpec {

PBEKeySpec(char[] o0){}
	PBEKeySpec(){}}

class SecretKeyFactory {

public MyHelperClass generateSecret(PBEKeySpec o0){ return null; }}

class SecretKey {

}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class PBEParameterSpec {

PBEParameterSpec(byte[] o0, int o1){}
	PBEParameterSpec(){}}
