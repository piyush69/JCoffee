
import java.io.UncheckedIOException;


class c11604443 {

    private void getRandomGUID(boolean secure) {
        MessageDigest md5 = null;
        StringBuffer sbValueBeforeMD5 = new StringBuffer(128);
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Error: " + e);
        }
        try {
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
            String valueBeforeMD5;// = new String();
            valueBeforeMD5 = sbValueBeforeMD5.toString();
//            MyHelperClass valueBeforeMD5 = new MyHelperClass();
            md5.update(valueBeforeMD5.getBytes());
            byte[] array =(byte[])(Object) md5.digest();
            StringBuffer sb = new StringBuffer(32);
            for (int j = 0; j < array.length; ++j) {
                MyHelperClass TWO_BYTES = new MyHelperClass();
                int b = array[j] & (byte)(Object)TWO_BYTES;
                MyHelperClass PAD_BELOW = new MyHelperClass();
                if (b < (int)(Object)PAD_BELOW) sb.append('0');
                sb.append(Integer.toHexString(b));
            }
            String valueAfterMD5;// = new String();
            valueAfterMD5 = sb.toString();
        } catch (Exception e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Error:" + e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass nextLong(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
