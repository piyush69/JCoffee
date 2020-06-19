
import java.io.UncheckedIOException;


class c10852631 {

    private void getRandomGUID(boolean secure) {
        MessageDigest md5 = null;
        final StringBuilder sbValueBeforeMD5 = new StringBuilder();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.fatal("", e);
            return;
        }
        try {
            final long time = System.currentTimeMillis();
            long rand = 0;
            if (secure) {
                MyHelperClass mySecureRand = new MyHelperClass();
                rand =(long)(Object) mySecureRand.nextLong();
            } else {
                MyHelperClass myRand = new MyHelperClass();
                rand =(long)(Object) myRand.nextLong();
            }
            MyHelperClass sId = new MyHelperClass();
            sbValueBeforeMD5.append(sId);
            sbValueBeforeMD5.append(":");
            sbValueBeforeMD5.append(Long.toString(time));
            sbValueBeforeMD5.append(":");
            sbValueBeforeMD5.append(Long.toString(rand));
            String valueBeforeMD5;// = new String();
            valueBeforeMD5 = sbValueBeforeMD5.toString();
//            MyHelperClass valueBeforeMD5 = new MyHelperClass();
            md5.update(valueBeforeMD5.getBytes());
            final byte[] array =(byte[])(Object) md5.digest();
            final StringBuilder sb = new StringBuilder();
            for (int j = 0; j < array.length; ++j) {
                final int b = array[j] & 0xFF;
                if (b < 0x10) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(b));
            }
            String valueAfterMD5;// = new String();
            valueAfterMD5 = sb.toString();
        } catch (Exception e) {
            MyHelperClass logger = new MyHelperClass();
            logger.fatal("", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass fatal(String o0, Exception o1){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass fatal(String o0, NoSuchAlgorithmException o1){ return null; }
	public MyHelperClass nextLong(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
