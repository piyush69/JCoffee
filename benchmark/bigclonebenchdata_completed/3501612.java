import java.io.*;
import java.lang.*;
import java.util.*;



class c3501612 {
public MyHelperClass convertToHex(byte[] o0){ return null; }

    char[] DigestCalcResponse(char[] HA1, String serverNonce, String nonceCount, String clientNonce, String qop, String method, String digestUri, boolean clientResponseFlag) throws SaslException {
        byte[] HA2;
        byte[] respHash;
        char[] HA2Hex;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            if (clientResponseFlag) md.update(method.getBytes("UTF-8"));
            md.update(":".getBytes("UTF-8"));
            md.update(digestUri.getBytes("UTF-8"));
            if ("auth-int".equals(qop)) {
                md.update(":".getBytes("UTF-8"));
                md.update("00000000000000000000000000000000".getBytes("UTF-8"));
            }
            HA2 =(byte[])(Object) md.digest();
            HA2Hex =(char[])(Object) convertToHex(HA2);
            md.update(new String(HA1).getBytes("UTF-8"));
            md.update(":".getBytes("UTF-8"));
            md.update(serverNonce.getBytes("UTF-8"));
            md.update(":".getBytes("UTF-8"));
            if (qop.length() > 0) {
                md.update(nonceCount.getBytes("UTF-8"));
                md.update(":".getBytes("UTF-8"));
                md.update(clientNonce.getBytes("UTF-8"));
                md.update(":".getBytes("UTF-8"));
                md.update(qop.getBytes("UTF-8"));
                md.update(":".getBytes("UTF-8"));
            }
            md.update(new String(HA2Hex).getBytes("UTF-8"));
            respHash =(byte[])(Object) md.digest();
        } catch (UncheckedIOException e) {
            throw new SaslException("No provider found for MD5 hash",(NoSuchAlgorithmException)(Object) e);
        } catch (UnsupportedEncodingException e) {
            throw new SaslException("UTF-8 encoding not supported by platform.", e);
        }
        return(char[])(Object) convertToHex(respHash);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class SaslException extends Exception{
	public SaslException(String errorMessage) { super(errorMessage); }
	SaslException(String o0, NoSuchAlgorithmException o1){}
	SaslException(String o0, UnsupportedEncodingException o1){}
	SaslException(){}
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
