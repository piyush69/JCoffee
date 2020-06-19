import java.io.*;
import java.lang.*;
import java.util.*;



class c17426486 {

    public String encrypt(String pwd) {
        MessageDigest md5 = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }
        try {
            md5.update(pwd.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            MyHelperClass JOptionPane = new MyHelperClass();
            JOptionPane.showMessageDialog(null, "That is not a valid encrpytion type");
        }
        byte raw[] =(byte[])(Object) md5.digest();
        String empty = "";
        String hash = "";
        for (byte b : raw) {
            String tmp = empty + Integer.toHexString(b & 0xff);
            if (tmp.length() == 1) {
                tmp = 0 + tmp;
            }
            hash += tmp;
        }
        return hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass showMessageDialog(Object o0, String o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
