import java.io.*;
import java.lang.*;
import java.util.*;



class c3888891 {

    public String encrypt(String password) {
        String encrypted_pass = "";
        ByteArrayOutputStream output = null;
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            md.update(password.getBytes("UTF-8"));
            byte byte_array[] =(byte[])(Object) md.digest();
            output = new ByteArrayOutputStream(byte_array.length);
            output.write(byte_array);
            encrypted_pass = output.toString("UTF-8");
            System.out.println("password: " + encrypted_pass);
        } catch (Exception e) {
            System.out.println("Exception thrown: " + e.getMessage());
        }
        return encrypted_pass;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}
