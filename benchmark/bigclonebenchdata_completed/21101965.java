import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21101965 {
public MyHelperClass NULL;

    public String genPass()  throws Throwable {
        String salto = "Z1mX502qLt2JTcW9MTDTGBBw8VBQQmY2";
        String clave = (int) (Math.random() * 10) + "" + (int) (Math.random() * 10) + "" + (int) (Math.random() * 10) + "" + (int) (Math.random() * 10) + "" + (int) (Math.random() * 10) + "" + (int) (Math.random() * 10) + "" + (int) (Math.random() * 10);
        String password =(String)(Object) NULL; //new String();
        password = clave;
        String claveConSalto = clave + salto;
        MessageDigest m = null;
        try {
            m = MessageDigest.getInstance("MD5");
            m.update(claveConSalto.getBytes("utf-8"), 0, claveConSalto.length());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String claveCifrada = new BigInteger(1, m.digest()).toString(16);
        return claveCifrada + ":" + salto;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
