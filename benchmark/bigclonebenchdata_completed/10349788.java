


class c10349788 {

    public static boolean checkEncode(String origin, byte[] mDigest, String algorithm) throws NoSuchAlgorithmException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(algorithm);
        md.update(origin.getBytes());
//        MyHelperClass MessageDigest = new MyHelperClass();
        if ((boolean)(Object)MessageDigest.isEqual(mDigest, md.digest())) {
            return true;
        } else {
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass isEqual(byte[] o0, MyHelperClass o1){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
