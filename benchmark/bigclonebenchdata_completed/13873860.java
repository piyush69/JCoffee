


class c13873860 {

    static byte[] genDigest(String pad, byte[] passwd) throws NoSuchAlgorithmException {
        MyHelperClass DIGEST_ALGORITHM = new MyHelperClass();
        MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance(DIGEST_ALGORITHM);
        digest.update(pad.getBytes());
        digest.update(passwd);
        return(byte[])(Object) digest.digest();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
