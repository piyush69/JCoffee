


class c4235407 {

    protected static String hashPassword(String password, String salt) throws NoSuchAlgorithmException {
        String s = salt + password;
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md.update(s.getBytes());
        byte bs[] =(byte[])(Object) md.digest();
        MyHelperClass BASE64Encoder = new MyHelperClass();
        String s1 =(String)(Object) BASE64Encoder.encode(bs);
        return new StringBuffer(salt).append(':').append(s1).toString();
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

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
