import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c12829110 {
public static MyHelperClass encryptActiveDirectory(String o0){ return null; }
//public MyHelperClass encryptActiveDirectory(String o0){ return null; }

    public static String encrypt(String data) throws IOException, NoSuchAlgorithmException {
        MyHelperClass Configuration = new MyHelperClass();
        Properties props =(Properties)(Object) Configuration.getInstance().getProperties();
        String algorithm = props.getProperty("com.makeabyte.jhosting.server.persistence.security.algorithm");
        String encryptedData = data;
        boolean encrypt = Boolean.parseBoolean(props.getProperty("com.makeabyte.jhosting.server.persistence.security.encrypt"));
        if (encrypt) {
            if (algorithm.equalsIgnoreCase("UTF-16LE")) return(String)(Object) encryptActiveDirectory(data);
            MessageDigest md = java.security.MessageDigest.getInstance(algorithm);
            md.reset();
            md.update(data.getBytes());
            encryptedData = md.digest().toString();
        }
        return encryptedData;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getProperties(){ return null; }}
