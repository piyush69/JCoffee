import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12555621 {

    public String md5(Value request) throws Throwable, FaultException {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
            md.update((byte)(Object)request.strValue().getBytes("UTF8"));
        } catch (ArithmeticException e) {
            throw new FaultException("UnsupportedOperation",(NoSuchAlgorithmException)(Object) e);
        } catch (NoSuchAlgorithmException e) {
            throw new FaultException("UnsupportedOperation", e);
        }
        int radix;
        if ((radix =(int)(Object) request.getFirstChild("radix").intValue()) < 2) {
            radix = 16;
        }
        return new BigInteger(1, md.digest()).toString(radix);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(String o0){ return null; }
	public MyHelperClass intValue(){ return null; }}

class Value {

public MyHelperClass getFirstChild(String o0){ return null; }
	public MyHelperClass strValue(){ return null; }}

class FaultException extends Exception{
	public FaultException(String errorMessage) { super(errorMessage); }
	FaultException(){}
	FaultException(String o0, NoSuchAlgorithmException o1){}
	FaultException(String o0, UnsupportedEncodingException o1){}
}
