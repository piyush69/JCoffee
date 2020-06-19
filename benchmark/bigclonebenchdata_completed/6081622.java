import java.io.*;
import java.lang.*;
import java.util.*;



class c6081622 {

    public String encryptStringWithKey(String to_be_encrypted, String aKey) {
        String encrypted_value = "";
        char xdigit[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        MessageDigest messageDigest;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            messageDigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException exc) {
            MyHelperClass globalErrorDictionary = new MyHelperClass();
            globalErrorDictionary.takeValueForKey(("Security package does not contain appropriate algorithm"), ("Security package does not contain appropriate algorithm"));
            MyHelperClass log = new MyHelperClass();
            log.error("Security package does not contain appropriate algorithm");
            return encrypted_value;
        }
        if (to_be_encrypted != null) {
            byte digest[];
            byte fudge_constant[];
            try {
                fudge_constant = ("X#@!").getBytes("UTF8");
            } catch (UnsupportedEncodingException uee) {
                fudge_constant = ("X#@!").getBytes();
            }
            MyHelperClass MSiteConfig = new MyHelperClass();
            byte fudgetoo_part[] = { (byte) xdigit[(int) ((int)(Object)MSiteConfig.myrand() % 16)], (byte) xdigit[(int) ((int)(Object)MSiteConfig.myrand() % 16)], (byte) xdigit[(int) ((int)(Object)MSiteConfig.myrand() % 16)], (byte) xdigit[(int) ((int)(Object)MSiteConfig.myrand() % 16)] };
            int i = 0;
            if (aKey != null) {
                try {
                    fudgetoo_part = aKey.getBytes("UTF8");
                } catch (UnsupportedEncodingException uee) {
                    fudgetoo_part = aKey.getBytes();
                }
            }
            messageDigest.update(fudge_constant);
            try {
                messageDigest.update(to_be_encrypted.getBytes("UTF8"));
            } catch (UnsupportedEncodingException uee) {
                messageDigest.update(to_be_encrypted.getBytes());
            }
            messageDigest.update(fudgetoo_part);
            digest =(byte[])(Object) messageDigest.digest();
            encrypted_value = new String(fudgetoo_part);
            for (i = 0; i < digest.length; i++) {
                int mashed;
                char temp[] = new char[2];
                if (digest[i] < 0) {
                    mashed = 127 + (-1 * digest[i]);
                } else {
                    mashed = digest[i];
                }
                temp[0] = xdigit[mashed / 16];
                temp[1] = xdigit[mashed % 16];
                encrypted_value = encrypted_value + (new String(temp));
            }
        }
        return encrypted_value;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass takeValueForKey(String o0, String o1){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass myrand(){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
