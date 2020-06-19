


class c21276480 {

    public static String getUserPass(String user) throws NoSuchAlgorithmException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        digest.update(user.getBytes());
        byte[] hash =(byte[])(Object) digest.digest();
        System.out.println("Returning user pass:" + hash);
        return hash.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
