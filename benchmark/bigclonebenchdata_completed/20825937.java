import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20825937 {
public MyHelperClass log;
	public MyHelperClass md5Hash;

    public void createMd5Hash()  throws Throwable {
        try {
            String vcardObject = (String)(Object)new ContactToVcard(TimeZone.getTimeZone("UTC"), "UTF-8").convert(this);
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(vcardObject.getBytes());
            this.md5Hash = (MyHelperClass)(Object)new BigInteger(m.digest()).toString();
            if ((boolean)(Object)log.isTraceEnabled()) {
                log.trace("Hash is:" + this.md5Hash);
            }
        } catch (ArithmeticException ex) {
            log.error("Error creating hash:" + ex.getMessage());
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            log.error("Error creating hash:" + noSuchAlgorithmException.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }
	public MyHelperClass isTraceEnabled(){ return null; }
	public MyHelperClass trace(String o0){ return null; }}

class ContactToVcard {

ContactToVcard(TimeZone o0, String o1){}
	ContactToVcard(){}
	public MyHelperClass convert(c20825937 o0){ return null; }}

class ConverterException extends Exception{
	public ConverterException(String errorMessage) { super(errorMessage); }
}
