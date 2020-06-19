import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10816827 {

    protected Object getMethodKey(String methodName, Object[] args)  throws Throwable {
        StringBuffer key = new StringBuffer(methodName.trim().replace(" ", ".")).append(".");
        for (Object o : args) {
            if (o != null) key.append(o.hashCode());
        }
        MyHelperClass LOGGER = new MyHelperClass();
        LOGGER.info("Generation key ->" + key.toString());
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.reset();
            MyHelperClass Charset = new MyHelperClass();
            messageDigest.update(key.toString().getBytes((String)(Object)Charset.forName("UTF8")));
            final byte[] resultByte = messageDigest.digest();
            String hex = null;
            for (int i = 0; i < resultByte.length; i++) {
                hex = Integer.toHexString(0xFF & resultByte[i]);
                if (hex.length() < 2) {
                    key.append("0");
                }
                key.append(hex);
            }
        } catch (NoSuchAlgorithmException e) {
            MyHelperClass StackTraceUtil = new MyHelperClass();
            LOGGER.severe("No hash generated for method key! " + StackTraceUtil.getStackTrace(e));
        }
//        MyHelperClass LOGGER = new MyHelperClass();
        LOGGER.info("Generation key ->" + key.toString());
        return new String(key);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getStackTrace(NoSuchAlgorithmException o0){ return null; }
	public MyHelperClass forName(String o0){ return null; }
	public MyHelperClass severe(String o0){ return null; }}
