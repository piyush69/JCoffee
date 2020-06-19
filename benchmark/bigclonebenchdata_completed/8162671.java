


class c8162671 {

    public static String getMD5Hash(String hashthis) throws NoSuchAlgorithmException {
        byte[] key = "PATIENTISAUTHENTICATION".getBytes();
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md5.update(hashthis.getBytes());
        MyHelperClass HashUtility = new MyHelperClass();
        return new String((String)(Object)HashUtility.base64Encode(md5.digest(key)));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass base64Encode(MyHelperClass o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(byte[] o0){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
