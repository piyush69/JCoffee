


class c8908943 {

    public static String GetMD5SUM(String s) throws NoSuchAlgorithmException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest algorithm =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        algorithm.reset();
        algorithm.update(s.getBytes());
        byte messageDigest[] =(byte[])(Object) algorithm.digest();
        MyHelperClass Base64 = new MyHelperClass();
        String md5sum =(String)(Object) Base64.encode(messageDigest);
        return md5sum;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass encode(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
