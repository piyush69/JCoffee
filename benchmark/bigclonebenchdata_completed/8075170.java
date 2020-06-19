
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8075170 {

    public void newGuidSeed(boolean secure) {
        SecureRandom sr = new SecureRandom();
        long secureInitializer =(long)(Object) sr.nextLong();
        Random rand = new Random(secureInitializer);
        String host_ip = "";
        try {
            MyHelperClass InetAddress = new MyHelperClass();
            host_ip = InetAddress.getLocalHost().toString();
        } catch (UncheckedIOException err) {
            err.printStackTrace();
        }
        MessageDigest md5 = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException err) {
            err.printStackTrace();
        }
        try {
            long time = System.currentTimeMillis();
            long randNumber = 0;
            if (secure) {
                randNumber =(long)(Object) sr.nextLong();
            } else {
                randNumber =(long)(Object) rand.nextLong();
            }
            MyHelperClass sbBeforeMd5 = new MyHelperClass();
            sbBeforeMd5.append(host_ip);
//            MyHelperClass sbBeforeMd5 = new MyHelperClass();
            sbBeforeMd5.append(":");
//            MyHelperClass sbBeforeMd5 = new MyHelperClass();
            sbBeforeMd5.append(Long.toString(time));
//            MyHelperClass sbBeforeMd5 = new MyHelperClass();
            sbBeforeMd5.append(":");
//            MyHelperClass sbBeforeMd5 = new MyHelperClass();
            sbBeforeMd5.append(Long.toString(randNumber));
            String seed;// = new String();
            seed = sbBeforeMd5.toString();
//            MyHelperClass seed = new MyHelperClass();
            md5.update(seed.getBytes());
            byte[] array =(byte[])(Object) md5.digest();
            StringBuffer temp_sb = new StringBuffer();
            for (int i = 0; i < array.length; i++) {
                int b = array[i] & 0xFF;
                if (b < 0x10) temp_sb.append('0');
                temp_sb.append(Integer.toHexString(b));
            }
            String rawGUID;// = new String();
            rawGUID = temp_sb.toString();
        } catch (Exception err) {
            err.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass append(String o0){ return null; }
	public MyHelperClass getLocalHost(){ return null; }}

class SecureRandom {

public MyHelperClass nextLong(){ return null; }}

class Random {

Random(){}
	Random(long o0){}
	public MyHelperClass nextLong(){ return null; }}

class UnknownHostException extends Exception{
	public UnknownHostException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
