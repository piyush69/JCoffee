
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14356579 {

    public String getRandomGUID() {
        MessageDigest md5 = null;
        String valueBeforeMD5 = "";
        String retValue = "";
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            System.out.println("Error: " + e);
        }
        StringBuffer sbValueBeforeMD5 = new StringBuffer();
        try {
            MyHelperClass InetAddress = new MyHelperClass();
            InetAddress id =(InetAddress)(Object) InetAddress.getLocalHost();
            long time = System.currentTimeMillis();
            long rand = 0;
            MyHelperClass random = new MyHelperClass();
            rand =(long)(Object) random.nextLong();
            sbValueBeforeMD5.append(id.toString());
            sbValueBeforeMD5.append(Long.toString(time));
            sbValueBeforeMD5.append(Long.toString(rand));
            valueBeforeMD5 = sbValueBeforeMD5.toString();
            md5.update(valueBeforeMD5.getBytes());
            byte[] array =(byte[])(Object) md5.digest();
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < array.length; ++j) {
                int b = array[j] & 0xFF;
                if (b < 0x10) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(b));
            }
            retValue = sb.toString();
        } catch (UncheckedIOException e) {
            System.out.println("Error:" + e);
        }
        return retValue;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass nextLong(){ return null; }
	public MyHelperClass getLocalHost(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class InetAddress {

}

class UnknownHostException extends Exception{
	public UnknownHostException(String errorMessage) { super(errorMessage); }
}
