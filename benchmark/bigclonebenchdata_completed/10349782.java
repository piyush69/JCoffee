


class c10349782 {

    public static byte[] encode(String origin, String algorithm) throws NoSuchAlgorithmException {
        String resultStr = null;
        resultStr = new String(origin);
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(algorithm);
        md.update(resultStr.getBytes());
        return(byte[])(Object) md.digest();
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
