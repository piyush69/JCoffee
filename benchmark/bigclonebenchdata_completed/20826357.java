


class c20826357 {
public MyHelperClass split(MyHelperClass o0, int o1){ return null; }

    public boolean verify(String digest, String password) throws NoSuchAlgorithmException {
        String alg = null;
        int size = 0;
        if (digest.regionMatches(true, 0, "{CRYPT}", 0, 7)) {
            digest = digest.substring(7);
            MyHelperClass UnixCrypt = new MyHelperClass();
            return(boolean)(Object) UnixCrypt.matches(digest, password);
        } else if (digest.regionMatches(true, 0, "{SHA}", 0, 5)) {
            digest = digest.substring(5);
            alg = "SHA-1";
            size = 20;
        } else if (digest.regionMatches(true, 0, "{SSHA}", 0, 6)) {
            digest = digest.substring(6);
            alg = "SHA-1";
            size = 20;
        } else if (digest.regionMatches(true, 0, "{MD5}", 0, 5)) {
            digest = digest.substring(5);
            alg = "MD5";
            size = 16;
        } else if (digest.regionMatches(true, 0, "{SMD5}", 0, 6)) {
            digest = digest.substring(6);
            alg = "MD5";
            size = 16;
        }
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest msgDigest =(MessageDigest)(Object) MessageDigest.getInstance(alg);
        MyHelperClass Base64 = new MyHelperClass();
        byte[][] hs =(byte[][])(Object) split(Base64.decode(digest.toCharArray()), size);
        byte[] hash = hs[0];
        byte[] salt = hs[1];
        msgDigest.reset();
        msgDigest.update(password.getBytes());
        msgDigest.update(salt);
        byte[] pwhash =(byte[])(Object) msgDigest.digest();
        return(boolean)(Object) msgDigest.isEqual(hash, pwhash);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass decode(char[] o0){ return null; }
	public MyHelperClass matches(String o0, String o1){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass isEqual(byte[] o0, byte[] o1){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
