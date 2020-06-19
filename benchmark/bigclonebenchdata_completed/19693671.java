


class c19693671 {

    public static String hash(String password) {
        try {
            MyHelperClass digestAlgorithm = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance(digestAlgorithm);
            MyHelperClass charset = new MyHelperClass();
            digest.update(password.getBytes((String)(Object)charset));
            byte[] rawHash =(byte[])(Object) digest.digest();
            MyHelperClass Hex = new MyHelperClass();
            return new String((String)(Object)Hex.encodeHex(rawHash));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encodeHex(byte[] o0){ return null; }}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
