


class c17921696 {

    private String generateStorageDir(String stringToBeHashed) throws NoSuchAlgorithmException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        digest.update(stringToBeHashed.getBytes());
        byte[] hashedKey =(byte[])(Object) digest.digest();
        MyHelperClass Util = new MyHelperClass();
        return(String)(Object) Util.encodeArrayToHexadecimalString(hashedKey);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass encodeArrayToHexadecimalString(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
