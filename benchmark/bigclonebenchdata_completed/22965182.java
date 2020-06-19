


class c22965182 {

    private String crypt(String s) throws BaseException, NoSuchAlgorithmException {
        if (s != null && s.length() > 0) {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest algorithm =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            algorithm.reset();
            algorithm.update(s.getBytes());
            byte messageDigest[] =(byte[])(Object) algorithm.digest();
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < messageDigest.length; i++) {
                hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
            }
            return hexString.toString();
        } else {
            MyHelperClass ErrorCodes = new MyHelperClass();
            throw new BaseException((String)(Object)ErrorCodes.CODE_2100);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CODE_2100;
public MyHelperClass getInstance(String o0){ return null; }}

class BaseException extends Exception{
	public BaseException(String errorMessage) { super(errorMessage); }
}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
