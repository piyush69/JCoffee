import java.io.*;
import java.lang.*;
import java.util.*;



class c21250114 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        MessageDigest md = null;
        String password = "admin!@#$" + "ZKNugmkm";
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-512");
            md.update(password.getBytes("utf8"));
            byte[] b =(byte[])(Object) md.digest();
            StringBuilder output = new StringBuilder(32);
            for (int i = 0; i < b.length; i++) {
                String temp = Integer.toHexString(b[i] & 0xff);
                if (temp.length() < 2) {
                    output.append("0");
                }
                output.append(temp);
            }
            System.out.println(output);
            System.out.println(output.length());
            MyHelperClass RandomUtils = new MyHelperClass();
            System.out.println(RandomUtils.createRandomString(8));
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createRandomString(int o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
