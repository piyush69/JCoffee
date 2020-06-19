
import java.io.UncheckedIOException;


class c20834960 {

    private String getHash(String string) {
        MyHelperClass JamonMonitorLogger = new MyHelperClass();
        Monitor hashTime =(Monitor)(Object) JamonMonitorLogger.getTimeMonitor(Cache.class, "HashTime").start();
        MessageDigest md5 = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        md5.reset();
        md5.update(string.getBytes());
        byte[] result =(byte[])(Object) md5.digest();
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            hexString.append(Integer.toHexString(0xFF & result[i]));
        }
        String str = hexString.toString();
        hashTime.stop();
        return str;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getTimeMonitor(Class<Cache> o0, String o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass start(){ return null; }}

class Monitor {

public MyHelperClass stop(){ return null; }}

class Cache {

}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
