import java.io.*;
import java.lang.*;
import java.util.*;



class c10006171 {
public MyHelperClass strip(MyHelperClass o0){ return null; }
public MyHelperClass idpfMask;
	public MyHelperClass getPrimaryIdentifier(){ return null; }

    byte[] makeIDPFXORMask() {
        MyHelperClass idpfMask = new MyHelperClass();
        if (idpfMask == null) {
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                MessageDigest sha =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
                String temp =(String)(Object) strip(getPrimaryIdentifier());
                sha.update(temp.getBytes("UTF-8"), 0, temp.length());
                idpfMask = sha.digest();
            } catch (UncheckedIOException e) {
                System.err.println("No such Algorithm (really, did I misspell SHA-1?");
                System.err.println(e.toString());
                return null;
            } catch (IOException e) {
                System.err.println("IO Exception. check out mask.write...");
                System.err.println(e.toString());
                return null;
            }
        }
        return (byte[])(Object)idpfMask;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
