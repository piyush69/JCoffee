import java.io.*;
import java.lang.*;
import java.util.*;



class c7736983 {

        public boolean check(String credentials) throws IOException {
            if (credentials == null) return true;
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
                md.reset();
                MyHelperClass method = new MyHelperClass();
                md.update((byte)(Object)method.getBytes("ISO-8859-1"));
                md.update((byte) ':');
                MyHelperClass uri = new MyHelperClass();
                md.update((byte)(Object)uri.getBytes("ISO-8859-1"));
                byte[] ha2 =(byte[])(Object) md.digest();
                md.update(credentials.getBytes("ISO-8859-1"));
                md.update((byte) ':');
                MyHelperClass nonce = new MyHelperClass();
                md.update((byte)(Object)nonce.getBytes("ISO-8859-1"));
                md.update((byte) ':');
                MyHelperClass MessageDigester = new MyHelperClass();
                md.update((byte)(Object)MessageDigester.byteArrayToHex(ha2).getBytes("ISO-8859-1"));
                byte[] digest =(byte[])(Object) md.digest();
                MyHelperClass response = new MyHelperClass();
                return ((boolean)(Object)MessageDigester.byteArrayToHex(digest).equalsIgnoreCase(response));
            } catch (UncheckedIOException e) {
                throw new RuntimeException("MD5 not supported");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Encoding not supported");
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(String o0){ return null; }
	public MyHelperClass byteArrayToHex(byte[] o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass equalsIgnoreCase(MyHelperClass o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte o0){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass reset(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
