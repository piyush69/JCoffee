
import java.io.UncheckedIOException;


class c13682237 {

    private void generate(String salt) {
        MessageDigest md5 = null;
        StringBuffer sbValueBeforeMD5 = new StringBuffer();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("No MD5",(NoSuchAlgorithmException)(Object) e);
        }
        long time = System.currentTimeMillis();
        MyHelperClass random = new MyHelperClass();
        long rand =(long)(Object) random.nextLong();
        MyHelperClass systemId = new MyHelperClass();
        sbValueBeforeMD5.append(systemId);
        sbValueBeforeMD5.append(salt);
        sbValueBeforeMD5.append(Long.toString(time));
        sbValueBeforeMD5.append(Long.toString(rand));
        md5.update(sbValueBeforeMD5.toString().getBytes());
        byte[] array =(byte[])(Object) md5.digest();
        StringBuffer sb = new StringBuffer();
        int position = 0;
        for (int j = 0; j < array.length; ++j) {
            if (position == 4 || position == 6 || position == 8 || position == 10) {
                sb.append('-');
            }
            position++;
            int b = array[j] & 0xFF;
            if (b < 0x10) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(b).toUpperCase());
        }
        String guidString;// = new String();
        guidString = sb.toString().toUpperCase();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, NoSuchAlgorithmException o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass nextLong(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
