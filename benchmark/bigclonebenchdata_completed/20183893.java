


class c20183893 {
public MyHelperClass Cipher;
	public MyHelperClass KeyGenerator;
	public MyHelperClass base64encode(byte[] o0){ return null; }
	public MyHelperClass base64decode(String o0){ return null; }

//    @Override
    public String decryptString(String passphrase, String crypted) throws Exception {
        MessageDigest md;
        MyHelperClass MessageDigest = new MyHelperClass();
        md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md.update(passphrase.getBytes("UTF-8"));
        byte digest[] =(byte[])(Object) md.digest();
        String digestString =(String)(Object) base64encode(digest);
        System.out.println(digestString);
        SecureRandom sr = new SecureRandom(digestString.getBytes());
        KeyGenerator kGen =(KeyGenerator)(Object) KeyGenerator.getInstance("AES");
        kGen.init(128, sr);
        Key key =(Key)(Object) kGen.generateKey();
        Cipher cipher =(Cipher)(Object) Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] cryptString =(byte[])(Object) base64decode(crypted);
        byte[] bOut =(byte[])(Object) cipher.doFinal(cryptString);
        String outString = new String(bOut, "UTF-8");
        return outString;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DECRYPT_MODE;
public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class SecureRandom {

SecureRandom(){}
	SecureRandom(byte[] o0){}}

class KeyGenerator {

public MyHelperClass init(int o0, SecureRandom o1){ return null; }
	public MyHelperClass generateKey(){ return null; }}

class Key {

}

class Cipher {

public MyHelperClass init(MyHelperClass o0, Key o1){ return null; }
	public MyHelperClass doFinal(byte[] o0){ return null; }}
