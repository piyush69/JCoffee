import java.io.*;
import java.lang.*;
import java.util.*;



class c11121668 {
public MyHelperClass convertToHex(MyHelperClass o0){ return null; }

    public String computeMD5(String string) throws ServiceException {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("md5");
            digest.reset();
            MyHelperClass Invoker = new MyHelperClass();
            digest.update(string.getBytes((String)(Object)Invoker.ENCODING));
            return(String)(Object) convertToHex(digest.digest());
        } catch (UncheckedIOException exception) {
            String message = "Could not create properly the MD5 digest";
            MyHelperClass log = new MyHelperClass();
            log.error(message,(NoSuchAlgorithmException)(Object) exception);
            throw new ServiceException(message,(UnsupportedEncodingException)(Object) exception);
        } catch (UnsupportedEncodingException exception) {
            String message = "Could not encode properly the MD5 digest";
            MyHelperClass log = new MyHelperClass();
            log.error(message, exception);
            throw new ServiceException(message, exception);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ENCODING;
public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass error(String o0, NoSuchAlgorithmException o1){ return null; }
	public MyHelperClass error(String o0, UnsupportedEncodingException o1){ return null; }}

class ServiceException extends Exception{
	public ServiceException(String errorMessage) { super(errorMessage); }
	ServiceException(String o0, UnsupportedEncodingException o1){}
	ServiceException(String o0, NoSuchAlgorithmException o1){}
	ServiceException(){}
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass reset(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
