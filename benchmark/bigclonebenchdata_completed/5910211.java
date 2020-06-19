
import java.io.UncheckedIOException;


class c5910211 {

    private static String genRandomGUID(boolean secure) {
        String valueBeforeMD5 = "";
        String valueAfterMD5 = "";
        MessageDigest md5 = null;
        StringBuffer sbValueBeforeMD5 = new StringBuffer();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            System.out.println("Error: " + e);
            return valueBeforeMD5;
        }
        long time = System.currentTimeMillis();
        long rand = 0;
        if (secure) {
            MyHelperClass mySecureRand = new MyHelperClass();
            rand =(long)(Object) mySecureRand.nextLong();
        } else {
            MyHelperClass myRand = new MyHelperClass();
            rand =(long)(Object) myRand.nextLong();
        }
        MyHelperClass s_id = new MyHelperClass();
        sbValueBeforeMD5.append(s_id);
        sbValueBeforeMD5.append(":");
        sbValueBeforeMD5.append(Long.toString(time));
        sbValueBeforeMD5.append(":");
        sbValueBeforeMD5.append(Long.toString(rand));
        valueBeforeMD5 = sbValueBeforeMD5.toString();
        md5.update(valueBeforeMD5.getBytes());
        byte[] array =(byte[])(Object) md5.digest();
        String strTemp = "";
        for (int i = 0; i < array.length; i++) {
            strTemp = (Integer.toHexString(array[i] & 0XFF));
            if (strTemp.length() == 1) {
                valueAfterMD5 = valueAfterMD5 + "0" + strTemp;
            } else {
                valueAfterMD5 = valueAfterMD5 + strTemp;
            }
        }
        return valueAfterMD5.toUpperCase();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass nextLong(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
