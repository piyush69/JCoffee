


class c22776987 {
public MyHelperClass Encoding;

    public String hash(String plainTextPassword) {
        try {
            MyHelperClass digestAlgorithm = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance(digestAlgorithm);
            MyHelperClass saltPhrase = new MyHelperClass();
            if (saltPhrase != null) {
                MyHelperClass charset = new MyHelperClass();
                digest.update((byte[])(Object)saltPhrase.getBytes(charset));
                byte[] salt =(byte[])(Object) digest.digest();
                digest.reset();
//                MyHelperClass charset = new MyHelperClass();
                digest.update(plainTextPassword.getBytes((String)(Object)charset));
                digest.update(salt);
            } else {
                MyHelperClass charset = new MyHelperClass();
                digest.update(plainTextPassword.getBytes((String)(Object)charset));
            }
            byte[] rawHash =(byte[])(Object) digest.digest();
            MyHelperClass encoding = new MyHelperClass();
            if (encoding != null && encoding.equals(Encoding.base64)) {
                MyHelperClass Base64 = new MyHelperClass();
                return(String)(Object) Base64.encodeBytes(rawHash);
            } else {
                MyHelperClass Hex = new MyHelperClass();
                return new String((String)(Object)Hex.encodeHex(rawHash));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass base64;
public MyHelperClass getBytes(MyHelperClass o0){ return null; }
	public MyHelperClass encodeBytes(byte[] o0){ return null; }
	public MyHelperClass encodeHex(byte[] o0){ return null; }}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass reset(){ return null; }}
