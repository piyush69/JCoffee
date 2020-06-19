


class c17335375 {

    public static byte[] encrypt(String x) throws NoSuchAlgorithmException {
        MessageDigest d = null;
        MyHelperClass MessageDigest = new MyHelperClass();
        d =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
        d.reset();
        d.update(x.getBytes());
        return(byte[])(Object) d.digest();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
