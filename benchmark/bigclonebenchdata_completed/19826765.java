import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19826765 {

    private String xifraPassword() throws Throwable, Exception {
        MyHelperClass instance = new MyHelperClass();
        String password2 =(String)(Object) instance.getUsuaris().getPassword2();
        MessageDigest m = MessageDigest.getInstance("MD5");
        m.update(password2.getBytes(), 0, password2.length());
        password2 = new BigInteger(1, m.digest()).toString(16);
        return password2;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getPassword2(){ return null; }
	public MyHelperClass getUsuaris(){ return null; }}
