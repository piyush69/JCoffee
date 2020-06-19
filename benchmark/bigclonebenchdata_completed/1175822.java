import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1175822 {
public static MyHelperClass LoggerFactory;
//public MyHelperClass LoggerFactory;

    public static String novoMetodoDeCriptografarParaMD5QueNaoFoiUtilizadoAinda(String input)  throws Throwable {
        if (input == null) {
            return null;
        }
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(input.getBytes("UTF-8"));
            BigInteger hash = new BigInteger(1, digest.digest());
            String output = hash.toString(16);
            if (output.length() < 32) {
                int sizeDiff = 32 - output.length();
                do {
                    output = "0" + output;
                } while (--sizeDiff > 0);
            }
            return output;
        } catch (NoSuchAlgorithmException ns) {
            MyHelperClass Msg = new MyHelperClass();
            LoggerFactory.getLogger((UtilAdrs)(Object)UtilAdrs.class).error(Msg.EXCEPTION_MESSAGE, UtilAdrs.class.getSimpleName(), ns);
            return input;
        } catch (UnsupportedEncodingException e) {
            MyHelperClass Msg = new MyHelperClass();
            LoggerFactory.getLogger((UtilAdrs)(Object)UtilAdrs.class).error(Msg.EXCEPTION_MESSAGE, UtilAdrs.class.getSimpleName(), e);
            return input;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass EXCEPTION_MESSAGE;
public MyHelperClass error(MyHelperClass o0, String o1, UnsupportedEncodingException o2){ return null; }
	public MyHelperClass getLogger(UtilAdrs o0){ return null; }
	public MyHelperClass error(MyHelperClass o0, String o1, NoSuchAlgorithmException o2){ return null; }}

class UtilAdrs {

}
