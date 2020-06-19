


class c12202663 {

    private static byte[] finalizeStringHash(String loginHash) throws NoSuchAlgorithmException {
        MessageDigest md5Hasher;
        MyHelperClass MessageDigest = new MyHelperClass();
        md5Hasher =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md5Hasher.update(loginHash.getBytes());
        MyHelperClass LOGIN_FINAL_SALT = new MyHelperClass();
        md5Hasher.update(LOGIN_FINAL_SALT);
        return(byte[])(Object) md5Hasher.digest();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
