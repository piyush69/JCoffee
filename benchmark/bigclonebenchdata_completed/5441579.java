import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5441579 {
public static MyHelperClass toHexString(MyHelperClass o0){ return null; }
//public MyHelperClass toHexString(MyHelperClass o0){ return null; }

    public static String createPseudoUUID()  throws Throwable {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(new UID().toString().getBytes());
            try {
                String localHost = InetAddress.getLocalHost().toString();
                messageDigest.update(localHost.getBytes());
            } catch (UnknownHostException e) {
                throw new OXFException((String)(Object)e);
            }
            byte[] digestBytes = messageDigest.digest();
            StringBuffer sb = new StringBuffer();
            MyHelperClass NumberUtils = new MyHelperClass();
            sb.append(toHexString(NumberUtils.readIntBigEndian(digestBytes, 0)));
            sb.append('-');
//            MyHelperClass NumberUtils = new MyHelperClass();
            sb.append(toHexString(NumberUtils.readShortBigEndian(digestBytes, 4)));
            sb.append('-');
//            MyHelperClass NumberUtils = new MyHelperClass();
            sb.append(toHexString(NumberUtils.readShortBigEndian(digestBytes, 6)));
            sb.append('-');
//            MyHelperClass NumberUtils = new MyHelperClass();
            sb.append(toHexString(NumberUtils.readShortBigEndian(digestBytes, 8)));
            sb.append('-');
//            MyHelperClass NumberUtils = new MyHelperClass();
            sb.append(toHexString(NumberUtils.readShortBigEndian(digestBytes, 10)));
//            MyHelperClass NumberUtils = new MyHelperClass();
            sb.append(toHexString(NumberUtils.readIntBigEndian(digestBytes, 12)));
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new OXFException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass readShortBigEndian(byte[] o0, int o1){ return null; }
	public MyHelperClass readIntBigEndian(byte[] o0, int o1){ return null; }}

class UID {

}

class OXFException extends Exception{
	public OXFException(String errorMessage) { super(errorMessage); }
}
