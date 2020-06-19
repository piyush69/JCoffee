


class c4928350 {

    private static String getBase64(String text, String algorithm) throws NoSuchAlgorithmException {
        MyHelperClass AssertUtility = new MyHelperClass();
        AssertUtility.notNull(text);
//        MyHelperClass AssertUtility = new MyHelperClass();
        AssertUtility.notNullAndNotSpace(algorithm);
        String base64;
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(algorithm);
        md.update(text.getBytes());
        base64 =(String)(Object) (new BASE64Encoder().encode(md.digest()));
        return base64;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass notNullAndNotSpace(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass notNull(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(MyHelperClass o0){ return null; }}
