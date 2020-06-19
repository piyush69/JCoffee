import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8250472 {

    private final String encryptPassword(final String password) throws Throwable, EncryptionExecption(Throwable)(Object) {
        if ((password == null) || (password.length() == 0)) {
            throw new NullPointerException();
        }
        try {
            final MessageDigest md = MessageDigest.getInstance("SHA");
            md.update((password).getBytes("UTF-8"));
            return new BASE64Encoder().encode(md.digest());
        } catch (NoSuchAlgorithmException e) {
            throw new EncryptionExecption(e);
        } catch (UnsupportedEncodingException e) {
            throw new EncryptionExecption(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class EncryptionExecption {

EncryptionExecption(NoSuchAlgorithmException o0){}
	EncryptionExecption(){}
	EncryptionExecption(UnsupportedEncodingException o0){}}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
