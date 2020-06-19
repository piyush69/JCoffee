import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10277293 {

    byte[] calculateDigest(String value) {
        try {
            MessageDigest mg = MessageDigest.getInstance("SHA1");
            mg.update(value.getBytes());
            return mg.digest();
        } catch (Exception e) {
            MyHelperClass Bark = new MyHelperClass();
            throw(Throwable)(Object) Bark.unchecker(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass unchecker(Exception o0){ return null; }}
