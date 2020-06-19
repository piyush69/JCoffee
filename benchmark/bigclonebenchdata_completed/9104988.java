import java.io.*;
import java.lang.*;
import java.util.*;



class c9104988 {

    public String getHashedPhoneId(Context aContext) {
        MyHelperClass hashedPhoneId = new MyHelperClass();
        if (hashedPhoneId == null) {
            MyHelperClass BuildInfo = new MyHelperClass();
            final String androidId =(String)(Object) BuildInfo.getAndroidID(aContext);
            if (androidId == null) {
//                MyHelperClass hashedPhoneId = new MyHelperClass();
                hashedPhoneId =(MyHelperClass)(Object) "EMULATOR";
            } else {
                try {
                    MyHelperClass MessageDigest = new MyHelperClass();
                    final MessageDigest messageDigest =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
                    messageDigest.update(androidId.getBytes());
                    messageDigest.update((byte[])(Object)aContext.getPackageName().getBytes());
                    final StringBuilder stringBuilder = new StringBuilder();
                    for (byte b :(byte[])(Object) (Object[])(Object)messageDigest.digest()) {
                        stringBuilder.append(String.format("%02X", b));
                    }
//                    MyHelperClass hashedPhoneId = new MyHelperClass();
                    hashedPhoneId =(MyHelperClass)(Object) stringBuilder.toString();
                } catch (Exception e) {
                    MyHelperClass Log = new MyHelperClass();
                    Log.e(LoggingExceptionHandler.class.getName(), "Unable to get phone id", e);
//                    MyHelperClass hashedPhoneId = new MyHelperClass();
                    hashedPhoneId =(MyHelperClass)(Object) "Not Available";
                }
            }
        }
//        MyHelperClass hashedPhoneId = new MyHelperClass();
        return (String)(Object)hashedPhoneId;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass e(String o0, String o1, Exception o2){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass getAndroidID(Context o0){ return null; }}

class Context {

public MyHelperClass getPackageName(){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class LoggingExceptionHandler {

}
