
import java.io.UncheckedIOException;


class c19178250 {

    public static String createMD5(String str) {
        String sig = null;
        MyHelperClass sSalt = new MyHelperClass();
        String strSalt = str + sSalt;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.update(strSalt.getBytes(), 0, strSalt.length());
            byte byteData[] =(byte[])(Object) md5.digest();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }
            sig = sb.toString();
        } catch (UncheckedIOException e) {
            System.err.println("Can not use md5 algorithm");
        }
        return sig;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
