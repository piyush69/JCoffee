
import java.io.UncheckedIOException;


class c11049257 {
public static MyHelperClass _rand;
//public MyHelperClass _rand;

    public static String generate(boolean secure, boolean sep) throws UnknownHostException {
        MessageDigest messagedigest;
        StringBuilder stringbuffer = new StringBuilder();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            messagedigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException nosuchalgorithmexception) {
            throw new RuntimeException(nosuchalgorithmexception);
        }
        StringBuffer stringbuffer2;
        MyHelperClass InetAddress = new MyHelperClass();
        InetAddress inetaddress =(InetAddress)(Object) InetAddress.getLocalHost();
        long l = System.currentTimeMillis();
        long l1 = 0L;
        MyHelperClass _secureRand = new MyHelperClass();
        if (secure) l1 =(long)(Object) _secureRand.nextLong(); else l1 =(long)(Object) _rand.nextLong();
        stringbuffer.append(inetaddress.toString());
        stringbuffer.append(":");
        stringbuffer.append(Long.toString(l));
        stringbuffer.append(":");
        stringbuffer.append(Long.toString(l1));
        messagedigest.update(stringbuffer.toString().getBytes());
        byte abyte0[] =(byte[])(Object) messagedigest.digest();
        StringBuffer stringbuffer1 = new StringBuffer();
        for (int i = 0; i < abyte0.length; i++) {
            int j = abyte0[i] & 0xff;
            if (j < 16) stringbuffer1.append('0');
            stringbuffer1.append(Integer.toHexString(j));
        }
        String s = stringbuffer1.toString();
        stringbuffer2 = new StringBuffer();
        if (sep) {
            stringbuffer2.append(s.substring(0, 8));
            stringbuffer2.append("-");
            stringbuffer2.append(s.substring(8, 12));
            stringbuffer2.append("-");
            stringbuffer2.append(s.substring(12, 16));
            stringbuffer2.append("-");
            stringbuffer2.append(s.substring(16, 20));
            stringbuffer2.append("-");
            stringbuffer2.append(s.substring(20));
            return stringbuffer2.toString();
        } else {
            return s;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass nextLong(){ return null; }
	public MyHelperClass getLocalHost(){ return null; }}

class UnknownHostException extends Exception{
	public UnknownHostException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class InetAddress {

}
