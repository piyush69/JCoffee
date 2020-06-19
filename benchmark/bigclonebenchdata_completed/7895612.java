import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c7895612 {
public MyHelperClass logger;
	public MyHelperClass convert(byte[] o0){ return null; }

    public final String encrypt(String input) throws Exception {
        try {
            MyHelperClass algorithm = new MyHelperClass();
            MessageDigest messageDigest = (MessageDigest) MessageDigest.getInstance((String)(Object)algorithm).clone();
            messageDigest.reset();
            messageDigest.update(input.getBytes());
            String output =(String)(Object) convert(messageDigest.digest());
            return output;
        } catch (Throwable ex) {
            if ((boolean)(Object)logger.isDebugEnabled()) {
                logger.debug("Fatal Error while digesting input string", ex);
            }
        }
        return input;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0, Throwable o1){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }}
