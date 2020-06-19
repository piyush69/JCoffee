
import java.io.UncheckedIOException;


class c18241505 {
public static MyHelperClass toHexString(MyHelperClass o0){ return null; }
//public MyHelperClass toHexString(MyHelperClass o0){ return null; }

    public static String generateToken(ClientInfo clientInfo) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            Random rand = new Random();
            String random = clientInfo.getIpAddress() + ":" + clientInfo.getPort() + ":" + rand.nextInt();
            md5.update(random.getBytes());
            String token =(String)(Object) toHexString(md5.digest((new Date()).toString().getBytes()));
            clientInfo.setToken(token);
            return token;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class ClientInfo {

public MyHelperClass setToken(String o0){ return null; }
	public MyHelperClass getIpAddress(){ return null; }
	public MyHelperClass getPort(){ return null; }}

class MessageDigest {

public MyHelperClass digest(byte[] o0){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class Random {

public MyHelperClass nextInt(){ return null; }}

class Date {

}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
