import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1092728 {
public MyHelperClass SSHA_PREFIX;
	public MyHelperClass SHA_PREFIX;
	public MyHelperClass combineHashAndSalt(byte[] o0, byte[] o1){ return null; }

    public String encodePassword(String rawPass, Object salt)  throws Throwable {
        MessageDigest sha;
        try {
            sha = MessageDigest.getInstance("SHA");
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new LdapDataAccessException("No SHA implementation available!");
        }
        sha.update(rawPass.getBytes());
        if (salt != null) {
            MyHelperClass Assert = new MyHelperClass();
            Assert.isInstanceOf((byte[])(Object)byte[].class, salt, "Salt value must be a byte array");
            sha.update((byte[]) salt);
        }
        byte[] hash =(byte[])(Object) combineHashAndSalt(sha.digest(), (byte[]) salt);
        return (salt == null ? SHA_PREFIX : SSHA_PREFIX) + new String((String)(Object)Base64.encodeBase64(hash));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isInstanceOf(byte[] o0, Object o1, String o2){ return null; }}

class LdapDataAccessException extends Exception{
	public LdapDataAccessException(String errorMessage) { super(errorMessage); }
}

class Base64 {

public static MyHelperClass encodeBase64(byte[] o0){ return null; }}
