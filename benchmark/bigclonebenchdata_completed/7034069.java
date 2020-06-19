import java.io.*;
import java.lang.*;
import java.util.*;



class c7034069 {

    public static String getSHA1Hash(String stringToHash) {
        String result = "";
        MessageDigest md;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            md.update(stringToHash.getBytes("utf-8"));
            byte[] hash =(byte[])(Object) md.digest();
            StringBuffer hashString = new StringBuffer();
            for (int i = 0; i < hash.length; i++) {
                int halfByte = (hash[i] >>> 4) & 0x0F;
                int twoHalves = 0;
                do {
                    if ((0 <= halfByte) && (halfByte <= 9)) {
                        hashString.append((char) ('0' + halfByte));
                    } else {
                        hashString.append((char) ('a' + (halfByte - 10)));
                    }
                    halfByte = hash[i] & 0x0F;
                } while (twoHalves++ < 1);
            }
            result = hashString.toString();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
