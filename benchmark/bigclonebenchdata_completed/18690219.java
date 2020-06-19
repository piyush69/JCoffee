import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18690219 {
public static MyHelperClass analyze(String o0, Iterator<String> o1, MessageDigest o2){ return null; }
	public static MyHelperClass getExceptionClass(String o0){ return null; }
//public MyHelperClass analyze(String o0, Iterator<String> o1, MessageDigest o2){ return null; }
//	public MyHelperClass getExceptionClass(String o0){ return null; }

    public static String analyze(List<String> stackLines)  throws Throwable {
        final MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
        final Iterator<String> iterator = stackLines.iterator();
        if (!iterator.hasNext()) {
            return null;
        }
        try {
            final String messageLine = iterator.next();
            final String exceptionClass =(String)(Object) getExceptionClass(messageLine);
            messageDigest.update(exceptionClass.getBytes("UTF-8"));
            analyze(exceptionClass, iterator, messageDigest);
            final byte[] bytes = messageDigest.digest();
            final BigInteger bigInt = new BigInteger(1, bytes);
            final String ret = bigInt.toString(36);
            return ret;
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
