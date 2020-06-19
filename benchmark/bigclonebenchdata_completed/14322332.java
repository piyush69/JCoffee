import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c14322332 {
public MyHelperClass log;

    protected byte[] mdDecode(String s, int type, byte[] salt) {
        try {
            MessageDigest md;
            StringBuffer hexString = new StringBuffer();
            if ((type == 5) && (salt != null)) {
                MyHelperClass SHA = new MyHelperClass();
                md = MessageDigest.getInstance((String)(Object)SHA);
                MyHelperClass SSHA = new MyHelperClass();
                hexString.append("{" + SSHA + "}");
            } else if (type == 4) {
                MyHelperClass SHA = new MyHelperClass();
                md = MessageDigest.getInstance((String)(Object)SHA);
//                MyHelperClass SHA = new MyHelperClass();
                hexString.append("{" + SHA + "}");
            } else if ((type == 3) && (salt != null)) {
                MyHelperClass MD5 = new MyHelperClass();
                md = MessageDigest.getInstance((String)(Object)MD5);
                MyHelperClass SMD5 = new MyHelperClass();
                hexString.append("{" + SMD5 + "}");
            } else if (type == 2) {
                MyHelperClass MD5 = new MyHelperClass();
                md = MessageDigest.getInstance((String)(Object)MD5);
//                MyHelperClass MD5 = new MyHelperClass();
                hexString.append("{" + MD5 + "}");
            } else {
                return (null);
            }
            md.reset();
            md.update(s.getBytes("UTF-8"));
            if (salt != null) {
                md.update(salt);
                byte[] buff = md.digest();
                byte[] new_buf = new byte[buff.length + salt.length];
                for (int x = 0; x < buff.length; x++) new_buf[x] = buff[x];
                for (int x = buff.length; x < new_buf.length; x++) new_buf[x] = salt[x - buff.length];
                MyHelperClass CBBase64 = new MyHelperClass();
                hexString.append(CBBase64.binaryToString(new_buf));
            } else {
                byte[] buff = md.digest();
                MyHelperClass CBBase64 = new MyHelperClass();
                hexString.append(CBBase64.binaryToString(buff));
            }
            return hexString.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.WARNING, "Unexpected error encoding password ", e);
            e.printStackTrace();
            return new byte[0];
        } catch (java.security.NoSuchAlgorithmException e) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.WARNING, "Unexpected error encoding password ", e);
            e.printStackTrace();
            return new byte[0];
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARNING;
public MyHelperClass binaryToString(byte[] o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, UnsupportedEncodingException o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, NoSuchAlgorithmException o2){ return null; }}
