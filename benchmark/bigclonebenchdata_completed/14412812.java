


class c14412812 {

    public static String getMD5(String password) throws NoSuchAlgorithmException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] b =(byte[])(Object) md.digest();
        StringBuffer sb = new StringBuffer();
        for (byte aB : b) {
            sb.append((Integer.toHexString((aB & 0xFF) | 0x100)).substring(1, 3));
        }
        return sb.toString();
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
