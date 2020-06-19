
import java.io.UncheckedIOException;


class c17726029 {
public MyHelperClass CHAR_ZERO;

    private String getRandomGUID(final boolean secure) {
        MessageDigest md5 = null;
        final StringBuffer sbValueBeforeMD5 = new StringBuffer();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        }
        try {
            final long time = System.currentTimeMillis();
            final long rand;
            if (secure) {
                MyHelperClass mySecureRand = new MyHelperClass();
                rand =(long)(Object) mySecureRand.nextLong();
            } else {
                MyHelperClass myRand = new MyHelperClass();
                rand =(long)(Object) myRand.nextLong();
            }
            MyHelperClass id = new MyHelperClass();
            sbValueBeforeMD5.append(id);
            MyHelperClass SEMI_COLON = new MyHelperClass();
            sbValueBeforeMD5.append(SEMI_COLON);
            sbValueBeforeMD5.append(Long.toString(time));
//            MyHelperClass SEMI_COLON = new MyHelperClass();
            sbValueBeforeMD5.append(SEMI_COLON);
            sbValueBeforeMD5.append(Long.toString(rand));
            String valueBeforeMD5;// = new String();
            valueBeforeMD5 = sbValueBeforeMD5.toString();
//            MyHelperClass valueBeforeMD5 = new MyHelperClass();
            md5.update(valueBeforeMD5.getBytes());
            final byte[] array =(byte[])(Object) md5.digest();
            final StringBuffer sb = new StringBuffer();
            for (int j = 0; j < array.length; ++j) {
                MyHelperClass SHIFT_SPACE = new MyHelperClass();
                final int bufferIndex = array[j] & (byte)(Object)SHIFT_SPACE;
                MyHelperClass ZERO_TEST = new MyHelperClass();
                if ((int)(Object)ZERO_TEST > bufferIndex) sb.append(CHAR_ZERO);
                sb.append(Integer.toHexString(bufferIndex));
            }
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
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
