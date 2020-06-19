


class c14675463 {

    public static byte[] decrypt(String passphrase, byte[] data) throws Exception {
        byte[] dataTemp;
        try {
            MyHelperClass Security = new MyHelperClass();
            Security.addProvider((SunJCE)(Object)new com.sun.crypto.provider.SunJCE());
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(passphrase.getBytes());
            DESKeySpec key = new DESKeySpec(md.digest());
            SecretKeySpec DESKey = new SecretKeySpec(key.getKey(), "DES");
            MyHelperClass Cipher = new MyHelperClass();
            Cipher cipher =(Cipher)(Object) Cipher.getInstance("DES/ECB/PKCS5Padding");
//            MyHelperClass Cipher = new MyHelperClass();
            cipher.init(Cipher.DECRYPT_MODE, DESKey);
            dataTemp =(byte[])(Object) cipher.doFinal(data);
        } catch (Exception e) {
            throw e;
        }
        return dataTemp;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DECRYPT_MODE;
public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass addProvider(SunJCE o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class DESKeySpec {

DESKeySpec(MyHelperClass o0){}
	DESKeySpec(){}
	public MyHelperClass getKey(){ return null; }}

class SecretKeySpec {

SecretKeySpec(){}
	SecretKeySpec(MyHelperClass o0, String o1){}}

class Cipher {

public MyHelperClass doFinal(byte[] o0){ return null; }
	public MyHelperClass init(MyHelperClass o0, SecretKeySpec o1){ return null; }}

class SunJCE {

}
