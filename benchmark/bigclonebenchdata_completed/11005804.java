import java.io.*;
import java.lang.*;
import java.util.*;



class c11005804 {

    public String kodetu(String testusoila) {
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        } catch (UncheckedIOException e) {
            MyHelperClass JOptionPane = new MyHelperClass();
            new MezuLeiho("Ez da zifraketa algoritmoa aurkitu", "Ados", "Zifraketa Arazoa", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        try {
            md.update(testusoila.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            MyHelperClass JOptionPane = new MyHelperClass();
            new MezuLeiho("Errorea kodetzerakoan", "Ados", "Kodeketa Errorea", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        byte raw[] =(byte[])(Object) md.digest();
        String hash =(String)(Object) (new BASE64Encoder()).encode(raw);
        return hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MezuLeiho {

MezuLeiho(){}
	MezuLeiho(String o0, String o1, String o2, MyHelperClass o3){}}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
