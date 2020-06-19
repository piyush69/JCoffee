


class c14479581 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String password = "root";
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest messageDigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        messageDigest.update(password.getBytes());
        final byte[] digest =(byte[])(Object) messageDigest.digest();
        final StringBuilder buf = new StringBuilder(digest.length * 2);
        for (int j = 0; j < digest.length; j++) {
MyHelperClass[] HEX_DIGITS = new MyHelperClass[5];
            buf.append(HEX_DIGITS[(digest[j] >> 4) & 0x0f]);
//            MyHelperClass HEX_DIGITS = new MyHelperClass();
            buf.append(HEX_DIGITS[digest[j] & 0x0f]);
        }
        String pwd = buf.toString();
        System.out.println(pwd);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] HEX_DIGITS;
public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
