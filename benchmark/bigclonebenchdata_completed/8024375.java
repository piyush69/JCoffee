
import java.io.UncheckedIOException;


class c8024375 {

    private void getRandomGUID(boolean secure) {
        MessageDigest md5 = null;
        StringBuffer sbValueBeforeMD5 = new StringBuffer();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            System.out.println("Error: " + e);
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
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < array.length; ++j) {
                int b = array[j] & 0xFF;
                if (b < 0x10) sb.append('0');
                sb.append(Integer.toHexString(b));
            }
            String valueAfterMD5;// = new String();
            valueAfterMD5 = sb.toString();
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass nextLong(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
