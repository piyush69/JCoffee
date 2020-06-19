


class c21163359 {

    public static String getMD5(String s) throws NoSuchAlgorithmException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md5.reset();
        md5.update(s.getBytes());
        byte[] result =(byte[])(Object) md5.digest();
        StringBuilder hexString = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            hexString.append(String.format("%02x", 0xFF & result[i]));
        }
        return hexString.toString();
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
