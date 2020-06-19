


class c20221124 {

    public String md5(String string) throws GeneralSecurityException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest algorithm =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        algorithm.reset();
        algorithm.update(string.getBytes());
        byte messageDigest[] =(byte[])(Object) algorithm.digest();
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < messageDigest.length; i++) {
            hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
        }
        return hexString.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class GeneralSecurityException extends Exception{
	public GeneralSecurityException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
